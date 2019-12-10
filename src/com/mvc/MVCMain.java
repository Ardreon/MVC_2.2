package com.mvc;

import com.mvc.controller.CalculateController;
import com.mvc.model.CalculateModel;
import com.mvc.view.CalculateView;

public class MVCMain {
    public static void main(String[] args) {
        CalculateView view = new CalculateView();
        CalculateModel model = new CalculateModel();
        CalculateController controller = new CalculateController(model, view);
        controller.calculate();
    }
}
