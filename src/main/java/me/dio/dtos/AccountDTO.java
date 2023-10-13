package me.dio.dtos;

import java.math.BigDecimal;

public record AccountDTO(String number, String agency, BigDecimal balance, BigDecimal limit) {
}
