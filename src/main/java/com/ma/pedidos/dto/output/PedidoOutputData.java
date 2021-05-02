package com.ma.pedidos.dto.output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PedidoOutputData {

    @JsonProperty("fecha")
    private Date fecha;

    @JsonProperty("direccion")
    private String direccion;

    @JsonProperty("email")
    private String email;

    @JsonProperty("telefono")
    private String telefono;

    @JsonProperty("horario")
    private Time horario;

    @JsonProperty("detalle")
    private List<DetalleOutputData> detalle;

    @JsonProperty("total")
    private Double total;

    @JsonProperty("descuento")
    private Boolean descuento;

    @JsonProperty("estado")
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

    public List<DetalleOutputData> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetalleOutputData> detalle) {
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