package com.splitngo.backend.dtos;

public record UserDTO(
        Integer id,
        String lastName,
        String firstName,
        String mail) {
}