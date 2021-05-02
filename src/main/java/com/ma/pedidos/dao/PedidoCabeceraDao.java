package com.ma.pedidos.dao;

import com.ma.pedidos.models.PedidoCabecera;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoCabeceraDao extends JpaRepository<PedidoCabecera, Long> {
}
