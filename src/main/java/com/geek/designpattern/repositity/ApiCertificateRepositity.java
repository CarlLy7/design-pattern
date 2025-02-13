package com.geek.designpattern.repositity;

import com.geek.designpattern.entity.ApiCertificate;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: carl
 * @date: 2025.02.11
 */
public interface ApiCertificateRepositity extends JpaRepository<ApiCertificate,Integer> {
}
