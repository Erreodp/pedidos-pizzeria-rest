package com.ma.pedidos.manager;

import com.ma.pedidos.dto.input.PedidoInputData;
import com.ma.pedidos.dto.output.PedidoOutputData;

import java.util.Date;
import java.util.List;

public interface PedidoManager {

    PedidoOutputData altaPedido(PedidoInputData input) throws Exception;

    List<PedidoOutputData> listarPedidosPorFecha(Date fecha);
}
