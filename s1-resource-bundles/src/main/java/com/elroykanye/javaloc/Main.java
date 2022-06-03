package com.elroykanye.javaloc;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main (String[] args) {
        Locale.setDefault(Locale.FRENCH);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("greetings", Locale.getDefault());

        System.out.println(resourceBundle.getString("morning_greeting"));

        Locale.setDefault(Locale.GERMAN);
        System.out.println(resourceBundle.getString("greeting"));
    }
}
