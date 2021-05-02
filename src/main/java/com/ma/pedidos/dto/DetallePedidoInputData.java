package com.ma.pedidos.dto;

import java.util.UUID;

public class DetallePedidoInputData {

    private UUID producto;

    private Integer cantidad;

    public DetallePedidoInputData() {
    }

    public UUID getProducto() {
        return producto;
    }

    public void setProducto(UUID producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
