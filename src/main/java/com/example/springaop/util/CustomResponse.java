package com.example.springaop.util;

import java.util.Collection;

public class CustomResponse<E> {

    private int code;

    private String message;

    private Collection<E> responseList;

    public CustomResponse(Collection<E> response, CustomStatus customStatus) {
        this.code = customStatus.getCode();
        this.message = customStatus.getMessage();
        this.responseList = response;
    }
}
