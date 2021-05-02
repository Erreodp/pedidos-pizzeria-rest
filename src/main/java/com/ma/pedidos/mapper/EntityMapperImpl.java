package com.ma.pedidos.mapper;

import com.ma.pedidos.dto.input.ProductoInputData;
import com.ma.pedidos.dto.output.PedidoOutputData;
import com.ma.pedidos.dto.output.ProductoOutputData;
import com.ma.pedidos.models.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityMapperImpl implements EntityMapper{

    @Override
    public Producto convert(ProductoInputData input) {

        Producto producto = new Producto();
        producto.setNombre(input.getNombre());
        producto.setDescripcionCorta(input.getDescripcionCorta());
        producto.setDescripcionLarga(input.getDescripcionCorta());
        producto.setPrecioUnitario(input.getPrecioUnitario());
        return producto;
    }

    @Override
    public ProductoOutputData convert(Producto entity) {

        ProductoOutputData output = new ProductoOutputData();
        output.setNombre(entity.getNombre());
        output.setDescripcionCorta(entity.getDescripcionCorta());
        output.setDescripcionLarga(entity.getDescripcionLarga());
        output.setPrecioUnitario(entity.getPrecioUnitario());
        return output;
    }

}
