package com.mathieupauly.jaxwshello;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WsHello {
    @WebMethod
    String getMessage();
}
