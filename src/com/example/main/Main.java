package com.example.main;

import com.example.mvc.controller.ControllerImpl;

public class Main {
    public static void main(String[] args) {
        ControllerImpl controller = new ControllerImpl("C:\\Users\\yurash\\OneDrive\\Документы\\2600-3.txt");
        controller.showMostCommonWord();
    }
}
