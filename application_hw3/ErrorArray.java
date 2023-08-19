package Seminar3.application_hw3;

public class ErrorArray extends RuntimeException{
    public ErrorArray(String message){
        System.out.println(message);
    }
}