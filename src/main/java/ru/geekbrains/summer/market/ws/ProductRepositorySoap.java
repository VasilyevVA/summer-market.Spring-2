package ru.geekbrains.summer.market.ws;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepositorySoap extends JpaRepository<ProductEntity, Long> {
    Optional<ProductEntity> findById(Long id);
}