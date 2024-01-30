package org.futurecollars.lesson4.task4;

public class CapitalLetter implements TextFormatter {

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
