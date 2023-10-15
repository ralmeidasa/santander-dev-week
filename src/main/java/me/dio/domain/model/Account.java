package me.dio.domain.model;

import jakarta.persistence.*;
import lombok.*;
import me.dio.dtos.AccountDTO;
import me.dio.dtos.UserDTO;

import java.math.BigDecimal;

@Entity(name="tb_account")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column(precision = 13, scale = 2)
    private BigDecimal balance;

    @Column(name = "additional_limit", precision = 13, scale = 2)
    private BigDecimal limit;

}