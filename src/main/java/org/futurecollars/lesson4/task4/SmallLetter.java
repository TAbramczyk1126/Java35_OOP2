package org.futurecollars.lesson4.task4;

public class SmallLetter implements TextFormatter {

    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
