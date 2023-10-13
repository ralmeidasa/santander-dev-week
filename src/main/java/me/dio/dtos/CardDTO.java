package me.dio.dtos;

import java.math.BigDecimal;

public record CardDTO(String number, BigDecimal limit) {
}