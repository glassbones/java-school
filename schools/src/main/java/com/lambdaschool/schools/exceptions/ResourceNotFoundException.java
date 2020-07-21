package com.lambdaschool.schools.exceptions;

// any class that extends RuntimeException can be thrown
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message){

        super("Error from Lambda School Application: " + message);

    }

}
