package com.example.mvc.view;

public class View {
    public void printInfo(String word, int amount) {
        System.out.println("Найчастіше вживане слово");
        System.out.println("Слово: " + word);
        System.out.println("Кількість: " + amount);
    }

    public void printError() {
        System.out.println("Упс, даного файлу або не існує або з ним щось не так");
    }
}
