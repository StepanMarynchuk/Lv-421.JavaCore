package com.HW4_1;

 public enum HTTPErrors {
    error400 ("Bad request error"),
    error401 ("Unauthorized error"),
    error402 ("Payment Required error"),
    error403 ("Forbidden error");

    private final String errorType;

    private HTTPErrors(String s) {
        errorType = s;
    }

     public HTTPErrors errorType() {
         if (this == HTTPErrors.error400) return error400;
         if (this == HTTPErrors.error401) return error401;
         if (this == HTTPErrors.error402) return error402;
         return HTTPErrors.error403;
     }

     @Override
     public String toString() {
         return errorType;
     }
 }
