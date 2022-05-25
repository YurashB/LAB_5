package com.example.mvc.controller;

import com.example.mvc.bussines_logic.FileProcessor;
import com.example.mvc.bussines_logic.Word;
import com.example.mvc.validator.Validator;
import com.example.mvc.view.View;

public class ControllerImpl implements Controller {
    private final String fileName;

    public ControllerImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void showMostCommonWord() {
        if (!Validator.isFileExist(fileName)) {
            View view = new View();
            view.printError();
        } else {
            FileProcessor fileProcessor = new FileProcessor(fileName);
            Word mostCommonWord = fileProcessor.getMostCommonWord();

            View view = new View();
            view.printInfo(mostCommonWord.getValue(), mostCommonWord.getAmount());
        }
    }
}
