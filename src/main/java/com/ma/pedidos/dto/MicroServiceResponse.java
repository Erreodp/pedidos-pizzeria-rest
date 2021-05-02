package com.ma.pedidos.dto;

import java.util.List;

public class MicroServiceResponse {


    private MetaDTO meta;

    private Object data;

    private List<ErrorDTO> errors;

    public MetaDTO getMeta() {
        return meta;
    }

    public void setMeta(MetaDTO meta) {
        this.meta = meta;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public List<ErrorDTO> getErrors() {
        return errors;
    }

    public void setErrors(List<ErrorDTO> errors) {
        this.errors = errors;
    }

}
