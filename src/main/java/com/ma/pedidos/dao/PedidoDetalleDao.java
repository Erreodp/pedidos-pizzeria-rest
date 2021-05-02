package com.ma.pedidos.dao;

import com.ma.pedidos.models.PedidoDetalle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoDetalleDao extends JpaRepository<PedidoDetalle, Long> {
}
