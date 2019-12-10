package com.mvc.controller;

import com.mvc.model.CalculateModel;
import com.mvc.view.CalculateView;
import com.mvc.service.InputUtility;

public class CalculateController {

    private CalculateModel model;
    private CalculateView view;

    public CalculateController(CalculateModel model, CalculateView view){
       this.model = model;
       this.view = view;
    }

    public  void calculate(){

       model.setTitle(InputUtility.inputTitleValueWithScanner(view));
       model.setAuthor(InputUtility.inputAuthorValueWithScanner(view));
       model.setPublishing_house(InputUtility.inputPublishing_HouseValueWithScanner(view));
       model.setYear(InputUtility.inputYearValueWithScanner(view));
       model.setNumber_of_pages(InputUtility.inputPagesValueWithScanner(view));
       model.setPrice(InputUtility.inputPriceValueWithScanner(view));

       view.printMessageAndResult(model.getTitle() + " " + model.getAuthor(), model.getPublishing_house(), model.getYear(), model.getNumber_of_pages(), model.getPrice());

    }

}
