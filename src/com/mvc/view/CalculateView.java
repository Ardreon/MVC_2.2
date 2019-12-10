package com.mvc.view;

import com.mvc.model.CalculateModel;

import com.mvc.model.CalculateModel;

public class CalculateView{
    public  static final  String INPUT_STRING_TITLE = "Enter title of the book:  ";
    public  static final  String INPUT_STRING_AUTHOR = "Enter author of the book:  ";
    public  static final  String INPUT_STRING_PUBLISHING_HOUSE = "Enter publishing house of the book:  ";
    public  static final  String INPUT_INT_YEAR = "Enter year of issue of the book:  ";
    public  static final  String INPUT_INT_NUMBER_OF_PAGES = "Enter the number of pages in the the book:  ";
    public  static final  String INPUT_INT_PRICE = "Enter the price of the book:  ";

    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";

    public static final String INFORMATION = "Overall information:  ";


    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndResult(String message, Object... obj){
        for (Object z : obj)
              {
                  System.out.println(message + z);
        }

    }

}
