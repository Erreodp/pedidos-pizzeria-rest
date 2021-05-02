package com.ma.pedidos.mapper;

import com.ma.pedidos.dto.input.ProductoInputData;
import com.ma.pedidos.dto.output.PedidoOutputData;
import com.ma.pedidos.dto.output.ProductoOutputData;
import com.ma.pedidos.models.Producto;

import java.util.List;

public interface EntityMapper {

    Producto convert(ProductoInputData input);

    ProductoOutputData convert (Producto entity);

}
