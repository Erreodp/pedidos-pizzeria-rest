package com.ma.pedidos.repository;

import com.ma.pedidos.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface ProductosRepository extends JpaRepository<Producto, UUID> {

    Producto findByNombre(@Param("nombre") String nombre);
}
