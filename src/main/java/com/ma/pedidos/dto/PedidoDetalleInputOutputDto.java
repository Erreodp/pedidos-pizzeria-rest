package com.ma.pedidos.dto;

public class PedidoDetalleInputOutputDto {

    private String producto;

    private Integer cantidad;

    public PedidoDetalleInputOutputDto() {
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
