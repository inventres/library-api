package com.LibraryProject.utils;

public enum Error_Messages {
    ERROR_1("Cannot be null or small than zero ID column."),
    ERROR_2("");


    private final String error_msg;
    Error_Messages(String s) {
        this.error_msg = s;
    }

    public String getErrorMessage(){
        return error_msg;
    }

}
