package com.blogapplication.BlogApplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    private String resourceName;
    private String fieldName;

    public String getResourceName() {
        return resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Long getFieldValue() {
        return fieldValue;
    }

    private Long fieldValue;
    public ResourceNotFoundException(String resourceName,String fieldName,Long fieldvalue){
        super(String.format("%s not found with %s: '%s'",resourceName,fieldName,fieldvalue));
        this.resourceName=resourceName;
        this.fieldName=fieldName;
        this.fieldValue=fieldvalue;
    }



}
