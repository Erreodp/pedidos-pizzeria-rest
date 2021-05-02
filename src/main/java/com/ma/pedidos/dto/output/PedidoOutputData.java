package com.ma.pedidos.dto.output;

import com.ma.pedidos.dto.PedidoDetalleInputOutputDto;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class PedidoOutputData {

    private Date fecha;

    private String direccion;

    private String email;

    private String telefono;

    private Time horario;

    private List<PedidoDetalleInputOutputDto> detalle;

    private Double total;

    private Boolean descuento;

    private String estado;

    public PedidoOutputData() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public List<PedidoDetalleInputOutputDto> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<PedidoDetalleInputOutputDto> detalle) {
        this.detalle = detalle;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getDescuento() {
        return descuento;
    }

    public void setDescuento(Boolean descuento) {
        this.descuento = descuento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}