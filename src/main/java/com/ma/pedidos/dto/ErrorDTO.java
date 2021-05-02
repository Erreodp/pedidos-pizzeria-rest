package com.ma.pedidos.dto;

public class ErrorDTO {

    private String code;

    private String detail;

    public ErrorDTO() {
        super();
    }

    public ErrorDTO(String code, String detail) {
        this.code = code;
        this.detail = detail;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

}
