package com.ma.pedidos.controller;

import com.ma.pedidos.dto.MicroServiceResponse;
import com.ma.pedidos.dto.input.PedidoInputData;
import com.ma.pedidos.dto.output.PedidoOutputData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("")
@RestController
public class PedidosController {


    @PostMapping
    public ResponseEntity<MicroServiceResponse> postProducto(@RequestBody PedidoOutputData producto){
        return null;
    }

    @GetMapping
    public ResponseEntity<MicroServiceResponse> readProducto(){
        return null;
    }

    @PutMapping
    public ResponseEntity<MicroServiceResponse> putProducto(){
        return null;
    }

    @DeleteMapping
    public ResponseEntity<MicroServiceResponse> deleteProducto(@PathVariable Long idProducto){
        return null;
    }

    @PostMapping
    public ResponseEntity<MicroServiceResponse> postPedido(@RequestBody PedidoInputData pedido){
        return null;
    }

    @GetMapping
    public ResponseEntity<MicroServiceResponse> listPedidos(){
        return null;
    }

}
