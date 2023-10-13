package me.dio.domain.model;

import jakarta.persistence.*;
import lombok.*;
import me.dio.dtos.UserDTO;

import java.util.List;

@Entity(name= "tb_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;

    public User(UserDTO data){
        this.name = data.name();
        this.account = data.account();
        this.card = data.card();
        this.features = data.features();
        this.news = data.news();
    }
}
