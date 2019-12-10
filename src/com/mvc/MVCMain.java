package com.mvc;

import com.mvc.controller.CalculateController;
import com.mvc.model.CalculateModel;
import com.mvc.view.CalculateView;
import java.util.Arrays;

public class MVCMain {
    public static void main(String[] args) {
    CalculateController[] array = new CalculateController[5];

        CalculateView view = new CalculateView();
        CalculateModel model = new CalculateModel();
        array[0] = new CalculateController(model, view);
        array[1] = new CalculateController(model,view);
        array[2] = new CalculateController(model, view);
        array[3] = new CalculateController(model, view);
        array[4] = new CalculateController(model, view);

        array[0].calculate();
        array[1].calculate();
    }
}
