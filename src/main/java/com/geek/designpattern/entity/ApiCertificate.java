package com.geek.designpattern.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: carl
 * @date: 2025.02.11
 */
@Entity
@Getter
@Setter
@Table(name = "api_certificate")
public class ApiCertificate {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "appid")
    private String appid;

    @Column(name = "password")
    private String password;
}
