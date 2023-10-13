package me.dio.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import me.dio.dtos.CardDTO;
import me.dio.dtos.UserDTO;

import java.math.BigDecimal;

@Entity(name="tb_card")
@Getter
@Setter
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(name = "available_limit", precision = 13, scale = 2)
    private BigDecimal limit;

}
