package com.ma.pedidos.manager.impl;

import com.ma.pedidos.dao.ProductosDao;
import com.ma.pedidos.dto.input.ProductoInputData;
import com.ma.pedidos.dto.output.ProductoOutputData;
import com.ma.pedidos.manager.ProductoManager;
import com.ma.pedidos.mapper.EntityMapper;
import com.ma.pedidos.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoManagerImpl implements ProductoManager {

    @Autowired
    private ProductosDao productosDao;

    @Autowired
    private EntityMapper entityMapper;

    @Override
    public void create(ProductoInputData input) throws Exception {

        Producto producto = productosDao.findByNombre(input.getNombre());

        if (producto != null)
            throw new Exception("El producto ya existe en la base de datos");

        productosDao.save(entityMapper.convert(input));
    }

    @Override
    public void modify(ProductoInputData input) throws Exception {

        validateProducto(input.getId());

        productosDao.saveAndFlush(entityMapper.convert(input));
    }

    @Override
    public List<ProductoOutputData> listProducts() throws Exception {

        List<ProductoOutputData> response = new ArrayList<>();
        List<Producto> productos = productosDao.findAll();

        if (productos.isEmpty()) {
            throw new Exception("No hay productos registrados en la base de datos");
        }

        productos.stream().map(p -> response.add(entityMapper.convert(p)));
        return response;
    }

    @Override
    public void delete(Long id) throws Exception {

        Producto producto = validateProducto(id);
        productosDao.delete(producto);
    }

    private Producto validateProducto(Long id) throws Exception {

        Producto producto = productosDao.getOne(id);

        if (producto == null)
            throw new Exception("El producto que esta tratando de modificar no existe en la base de datos");

        return producto;
    }
}
