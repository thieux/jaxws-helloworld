package com.mathieupauly.jaxwshello;

import javax.jws.WebService;

/**
 * This class must be public:
 *
 * <code>ServerSOAPFaultException: Client received SOAP Fault from server:
 * Class sun.reflect.misc.Trampoline can not access a member of class
 * com.mathieupauly.jaxwshello.WsHelloImpl with modifiers "public"
 * </code>
 *
 * endpointInterface must name an existing interface:
 *
 * <code>RuntimeModelerException: class: null.WsHello could not be found</code>
 *
 * WsHelloImpl implements WsHello is optional.
 */
@WebService(endpointInterface = "com.mathieupauly.jaxwshello.WsHello")
public class WsHelloImpl implements WsHello {
    @Override
    public String getMessage() {
        return "Hello world!";
    }
}
