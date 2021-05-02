package com.ma.pedidos.dao;

import com.ma.pedidos.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface ProductosDao extends JpaRepository<Producto, Long> {

    Producto findByNombre(@Param("nombre") String nombre);
}
