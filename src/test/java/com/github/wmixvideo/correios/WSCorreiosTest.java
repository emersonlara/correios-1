package com.github.wmixvideo.correios;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class WSCorreiosTest {

    private final WSCorreios WS = new WSCorreios("USUARIO", "SENHA");

    @Test
    public void consultaObjeto() throws Exception {
        Assert.assertNotNull(WS.consultaObjeto("PJ907948743BR"));
    }

    @Test
    public void consultaObjetos() throws Exception {
        Assert.assertNotNull(WS.consultaObjetos(Arrays.asList("PJ907948743BR", "PJ907948743BR")));
    }
}