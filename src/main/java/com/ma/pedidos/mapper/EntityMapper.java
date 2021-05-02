package com.ma.pedidos.mapper;

import com.ma.pedidos.dto.DetallePedidoInputData;
import com.ma.pedidos.dto.input.PedidoInputData;
import com.ma.pedidos.dto.input.ProductoInputData;
import com.ma.pedidos.dto.output.ProductoOutputData;
import com.ma.pedidos.models.Pedido;
import com.ma.pedidos.models.Detalle;
import com.ma.pedidos.models.Producto;

import java.util.UUID;

public interface EntityMapper {

    Producto convert(ProductoInputData input);

    ProductoOutputData convert (Producto entity);

    Pedido convert(PedidoInputData input, boolean descuento, Double total);

    Detalle convert(DetallePedidoInputData input, UUID pedido, Double valorDetalle);

}
