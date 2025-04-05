package com.example.lab1_gtics_20251_20212624.controller;

import com.example.lab1_gtics_20251_20212624.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LabController {

    Pedido pedido;

    @GetMapping(value="/tomarPedido")
    public String tomarPedido() {
        return "pedidoForm";
    }
    @GetMapping(value="/resumenPedido")
    public String resumenPedido() {
        return "resumenPedido";
    }
    @GetMapping(value="/califica")
    public String califica() {
        return "califica";
    }
    @PostMapping(value="/tomarPedido/guardar")
    public String guardarPedido(Pedido pedidoRecibido) {
        this.pedido = pedidoRecibido;
        System.out.println("Pedido recibido: " + pedidoRecibido.getNombreCliente());
        return "redirect:/resumenPedido";
    }

    private double calcularTotal(int cantidad, int exta) {
        double total = 0;
        double precioBase = 15.20;
        double precioExtra = 3.50;
        total=cantidad*precioBase+exta*precioExtra;
        return total;
    }


}
