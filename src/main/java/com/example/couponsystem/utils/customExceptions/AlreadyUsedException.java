package com.example.couponsystem.utils.customExceptions;

public class AlreadyUsedException extends Exception
{
    public AlreadyUsedException(String errorMessage)
    {
        super("*Error* This " + errorMessage + " is already used!");
    }
}
