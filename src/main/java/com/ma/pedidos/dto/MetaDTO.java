package com.ma.pedidos.dto;

public class MetaDTO {

    private String method;

    private String operation;

    public MetaDTO(String method, String operation) {
        this.method = method;
        this.operation = operation;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

}
