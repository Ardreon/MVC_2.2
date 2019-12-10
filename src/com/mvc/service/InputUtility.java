package com.mvc.service;

import  com.mvc.view.CalculateView;

import java.util.Scanner;

public class InputUtility {
    private static Scanner titl = new Scanner(System.in);
    public static String inputTitleValueWithScanner(CalculateView view){
        view.printMessage(view.INPUT_STRING_TITLE);
        while(!titl.hasNext()){
            view.printMessage(view.WRONG_INPUT_DATA + view.INPUT_STRING_TITLE);
            titl.next();
        }
        return titl.nextLine();
    }

    private static Scanner autho = new Scanner(System.in);
    public static String inputAuthorValueWithScanner(CalculateView view){
        view.printMessage(view.INPUT_STRING_AUTHOR);
        while(!autho.hasNext()){
            view.printMessage(view.WRONG_INPUT_DATA + view.INPUT_STRING_AUTHOR);
            autho.next();
        }
        return autho.nextLine();
    }

    private static Scanner publ = new Scanner(System.in);
    public static String inputPublishing_HouseValueWithScanner(CalculateView view){
        view.printMessage(view.INPUT_STRING_PUBLISHING_HOUSE);
        while(!publ.hasNext()){
            view.printMessage(view.WRONG_INPUT_DATA + view.INPUT_STRING_PUBLISHING_HOUSE);
            publ.next();
        }
        return publ.nextLine();
    }

    private static Scanner yea = new Scanner(System.in);
    public static int inputYearValueWithScanner(CalculateView view){
        view.printMessage(view.INPUT_INT_YEAR);
        while(!yea.hasNext()){
            view.printMessage(view.WRONG_INPUT_DATA + view.INPUT_INT_YEAR);
            yea.next();
        }
        return yea.nextInt();
    }

     private static Scanner pages = new Scanner(System.in);
    public static int inputPagesValueWithScanner(CalculateView view){
        view.printMessage(view.INPUT_INT_NUMBER_OF_PAGES);
        while(!pages.hasNext()){
            view.printMessage(view.WRONG_INPUT_DATA + view.INPUT_INT_NUMBER_OF_PAGES);
            pages.next();
        }
        return pages.nextInt();
    }

     private static Scanner pric = new Scanner(System.in);
    public static int inputPriceValueWithScanner(CalculateView view){
        view.printMessage(view.INPUT_INT_PRICE);
        while(!pric.hasNext()){
            view.printMessage(view.WRONG_INPUT_DATA + view.INPUT_INT_PRICE);
            pric.next();
        }
        return pric.nextInt();
    }

}
