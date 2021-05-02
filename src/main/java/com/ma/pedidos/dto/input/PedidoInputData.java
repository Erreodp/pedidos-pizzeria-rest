package com.ma.pedidos.dto.input;

import com.ma.pedidos.dto.PedidoDetalleInputOutputDto;

import java.sql.Time;
import java.util.List;

public class PedidoInputData {

    private String direccion;

    private String email;

    private String telefono;

    private Time horario;

    private List<PedidoDetalleInputOutputDto> detalle;

    public PedidoInputData() {
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
}
