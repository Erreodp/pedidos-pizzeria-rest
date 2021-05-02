package com.ma.pedidos.mapper;

import com.ma.pedidos.dto.DetallePedidoInputData;
import com.ma.pedidos.dto.input.PedidoInputData;
import com.ma.pedidos.dto.input.ProductoInputData;
import com.ma.pedidos.dto.output.ProductoOutputData;
import com.ma.pedidos.models.Pedido;
import com.ma.pedidos.models.Detalle;
import com.ma.pedidos.models.Producto;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

@Service
public class EntityMapperImpl implements EntityMapper{

    @Override
    public Producto convert(ProductoInputData input) {

        Producto producto = new Producto();
        producto.setId(UUID.randomUUID());
        producto.setNombre(input.getNombre());
        producto.setDescripcionCorta(input.getDescripcionCorta());
        producto.setDescripcionLarga(input.getDescripcionCorta());
        producto.setPrecioUnitario(input.getPrecioUnitario());
        return producto;
    }

    @Override
    public ProductoOutputData convert(Producto entity) {

        ProductoOutputData output = new ProductoOutputData();
        output.setProducto(entity.getId());
        output.setNombre(entity.getNombre());
        output.setDescripcionCorta(entity.getDescripcionCorta());
        output.setDescripcionLarga(entity.getDescripcionLarga());
        output.setPrecioUnitario(entity.getPrecioUnitario());
        return output;
    }

    @Override
    public Pedido convert(PedidoInputData input, boolean descuento, Double total) {

        Pedido pedido = new Pedido();
        pedido.setId(UUID.randomUUID());
        pedido.setFechaAlta(Date.valueOf(LocalDate.now()));
        pedido.setEmail(input.getEmail());
        pedido.setDireccion(input.getDireccion());
        pedido.setTelefono(input.getTelefono());
        pedido.setEstado("PENDIENTE");
        pedido.setAplicoDescuento(descuento);
        pedido.setMontoTotal(total);
        return pedido;
    }

    @Override
    public Detalle convert(DetallePedidoInputData input, UUID pedido, Double valorDetalle) {

        Detalle detalle = new Detalle();
        detalle.setId(UUID.randomUUID());
        detalle.setPedidoCabecera(pedido);
        detalle.setProducto(input.getProducto());
        detalle.setCantidad(input.getCantidad());
        detalle.setPrecioUnitario(valorDetalle);

        return detalle;
    }

}
