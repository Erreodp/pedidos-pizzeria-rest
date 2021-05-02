package com.ma.pedidos.manager;

import com.ma.pedidos.dto.input.ProductoInputData;
import com.ma.pedidos.dto.output.ProductoOutputData;

import java.util.List;
import java.util.UUID;

public interface ProductoManager {

    void create(ProductoInputData input) throws Exception;

    void modify(ProductoInputData input) throws Exception;

    List<ProductoOutputData> listProducts() throws Exception;

    void delete(UUID id) throws Exception;

}
