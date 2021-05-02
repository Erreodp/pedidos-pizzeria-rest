package com.ma.pedidos.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pedido_detalle")
public class PedidoDetalle {

    @Id
    @Column(name = "pedido_detalle_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PEDIDO_DETALLE")
    @SequenceGenerator(name = "SEQ_PEDIDO_DETALLE", sequenceName = "SEQ_PEDIDO_DETALLE", initialValue = 1, allocationSize = 1)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pedido_cabecera_id", referencedColumnName = "pedido_cabecera_id")
    private PedidoCabecera pedidoCabecera;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "producto_id", referencedColumnName = "producto_id")
    private Set<Producto> productos;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "precio_unitario")
    private Double precioUnitario;

    public PedidoDetalle() {
        productos = new HashSet<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PedidoCabecera getPedidoCabecera() {
        return pedidoCabecera;
    }

    public void setPedidoCabecera(PedidoCabecera pedidoCabecera) {
        this.pedidoCabecera = pedidoCabecera;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
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
