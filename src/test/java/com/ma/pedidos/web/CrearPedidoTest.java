package com.ma.pedidos.web;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CrearPedidoTest {

    @LocalServerPort
    private int port;
    private static final String url = "http://localhost";


}
