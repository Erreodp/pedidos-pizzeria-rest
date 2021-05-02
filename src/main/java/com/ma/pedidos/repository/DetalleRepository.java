package com.ma.pedidos.repository;

import com.ma.pedidos.models.Detalle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DetalleRepository extends JpaRepository<Detalle, UUID> {
}
