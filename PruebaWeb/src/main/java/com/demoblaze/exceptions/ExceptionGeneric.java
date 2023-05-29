package com.demoblaze.exceptions;

public class ExceptionGeneric extends AssertionError{

    public ExceptionGeneric(String msm, Throwable reason){
        super(msm,reason);
    }


}
