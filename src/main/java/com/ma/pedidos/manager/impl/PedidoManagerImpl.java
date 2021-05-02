package com.ma.pedidos.manager.impl;

import com.ma.pedidos.dto.DetallePedidoInputData;
import com.ma.pedidos.mapper.EntityMapper;
import com.ma.pedidos.models.Detalle;
import com.ma.pedidos.models.Pedido;
import com.ma.pedidos.models.Producto;
import com.ma.pedidos.repository.PedidoRepository;
import com.ma.pedidos.repository.DetalleRepository;
import com.ma.pedidos.dto.input.PedidoInputData;
import com.ma.pedidos.dto.output.PedidoOutputData;
import com.ma.pedidos.manager.PedidoManager;
import com.ma.pedidos.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidoManagerImpl implements PedidoManager {

    @Autowired
    private DetalleRepository detalleRepository;

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProductosRepository productosRepository;

    @Autowired
    private EntityMapper entityMapper;

    @Override
    public PedidoOutputData altaPedido(PedidoInputData input) throws Exception {

        validateInput(input);

        Boolean descuento = aplicaDescuento(input.getDetalle());
        Double total = calcularTotal(input.getDetalle());

        Pedido pedido = entityMapper.convert(input, descuento, total);
        pedidoRepository.save(pedido);

        List<Detalle> detalles = new ArrayList<>();
        input.getDetalle().forEach(detalle -> detalles.add(entityMapper.convert(detalle, pedido.getId(), calcularValorDetalle(detalle))));
        detalleRepository.saveAll(detalles);

        return null;
    }

    @Override
    public List<PedidoOutputData> listarPedidosPorFecha(Date fecha) {
        return null;
    }

    private void validateInput(PedidoInputData input) throws Exception {

        for (DetallePedidoInputData dpi : input.getDetalle()) {
            Producto p = productosRepository.getOne(dpi.getProducto());

            if (p == null)
                throw new Exception(" ");

            if (dpi.getCantidad() == null || dpi.getCantidad() <= 0)
                throw new Exception(" ");

        }

        if (input.getDireccion() == null)
            throw new Exception(" ");

        if (input.getEmail() == null)
            throw new Exception(" ");

        if (input.getTelefono() == null)
            throw new Exception(" ");

    }

    private Boolean aplicaDescuento(List<DetallePedidoInputData> detalle) {

        if (detalle.size() >= 3)
            return true;
        else
            return false;
    }

    private Double calcularTotal(List<DetallePedidoInputData> detalle) {

        double total = 0.00;
        for (DetallePedidoInputData dpi : detalle) {
            total = total + calcularValorDetalle(dpi);
        }
        return total;
    }

    private Double calcularValorDetalle(DetallePedidoInputData input) {

        Producto p = productosRepository.getOne(input.getProducto());
        return p.getPrecioUnitario() * input.getCantidad();
    }
}
