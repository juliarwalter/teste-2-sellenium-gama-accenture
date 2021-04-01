package io.cucumber.juliarwalter;

import io.cucumber.java.pt.*;
import io.cucumber.juliarwalter.services.Comando;

public class Compartilhado {
    @Dado("que clico em Pedidos")
    public void pedidos() {
        Comando.seletorQueryCss("a[href='/pedidos']").click();
    }
}