package com.mathieupauly.jaxwshello;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Service;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class WsHelloTest {

    private static Endpoint publish;

    @BeforeClass
    public static void startServer() {
        publish = Endpoint.publish("http://localhost:9999/ws/hello", new WsHelloImpl());
    }

    @AfterClass
    public static void stopServer() {
        publish.stop();
    }

    @Test
    public void client() throws Exception {
        final URL descriptionLocation = new URL("http://localhost:9999/ws/hello?wsdl");
        final QName serviceName = new QName("http://jaxwshello.mathieupauly.com/", "WsHelloImplService");
        final Service service = Service.create(descriptionLocation, serviceName);
        final WsHello client = service.getPort(WsHello.class);

        assertEquals("Hello world!", client.getMessage());
    }
}


