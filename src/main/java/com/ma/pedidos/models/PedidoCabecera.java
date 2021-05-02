package com.ma.pedidos.models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "pedidos_cabecera")
public class PedidoCabecera {

    @Id
    @Column(name = "pedido_cabecera_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PEDIDO_CABECERA")
    @SequenceGenerator(name = "SEQ_PEDIDO_CABECERA", sequenceName = "SEQ_PEDIDO_CABECERA", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "email")
    private String email;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "horario")
    private Time horario;

    @Column(name = "fecha_alta")
    private Date fechaAlta;

    @Column(name = "monto_total")
    private Double montoTotal;

    @Column(name = "aplico_descuento")
    private Boolean aplicoDescuento;

    @Column(name = "estado")
    //TODO make enum of status
    private String estado;

    public PedidoCabecera() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Boolean getAplicoDescuento() {
        return aplicoDescuento;
    }

    public void setAplicoDescuento(Boolean aplicoDescuento) {
        this.aplicoDescuento = aplicoDescuento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
