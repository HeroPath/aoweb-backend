package com.gianca1994.aowebbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JwtRequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
}
