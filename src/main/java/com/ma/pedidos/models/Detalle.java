package com.ma.pedidos.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "pedido_detalle")
public class Detalle {

    @Id
    @Column(name = "id")
    private UUID id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pedido_cabecera_id", referencedColumnName = "id")
    private UUID pedidoCabecera;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "producto_id", referencedColumnName = "id")
    private UUID producto;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "precio_unitario")
    private Double precioUnitario;

    public Detalle() {}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getPedidoCabecera() {
        return pedidoCabecera;
    }

    public void setPedidoCabecera(UUID pedidoCabecera) {
        this.pedidoCabecera = pedidoCabecera;
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

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
