package com.ma.pedidos.repository;

import com.ma.pedidos.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

public interface PedidoRepository extends JpaRepository<Pedido, UUID> {

    List<Pedido> findAllByFechaAlta(Date fecha);

}
