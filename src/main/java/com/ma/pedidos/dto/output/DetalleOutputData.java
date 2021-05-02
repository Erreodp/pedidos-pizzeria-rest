package com.ma.pedidos.dto.output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DetalleOutputData {

    @JsonProperty("producto")
    private UUID producto;

    @JsonProperty("nombre")
    private String nombre;

    @JsonProperty("cantidad")
    private int cantidad;

    @JsonProperty("importe")
    private Double importe;

    public DetalleOutputData() {}

    public UUID getProducto() {
        return producto;
    }

    public void setProducto(UUID producto) {
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }
}
