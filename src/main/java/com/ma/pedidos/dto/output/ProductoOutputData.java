package com.ma.pedidos.dto.output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductoOutputData {

    @JsonProperty("producto")
    private UUID producto;

    @JsonProperty("nombre")
    private String nombre;

    @JsonProperty("descripcion_corta")
    private String descripcionCorta;

    @JsonProperty("descripcion_larga")
    private String descripcionLarga;

    @JsonProperty("precio_unitario")
    private Double precioUnitario;

    public ProductoOutputData() {
    }

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

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    public String getDescripcionLarga() {
        return descripcionLarga;
    }

    public void setDescripcionLarga(String descripcionLarga) {
        this.descripcionLarga = descripcionLarga;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

}
