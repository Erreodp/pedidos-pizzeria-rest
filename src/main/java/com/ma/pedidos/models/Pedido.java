package com.ma.pedidos.models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.UUID;

@Entity
@Table(name = "pedidos_cabecera")
public class Pedido {

    @Id
    @Column(name = "id")
    private UUID id;

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
    private String estado;

    public Pedido() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
