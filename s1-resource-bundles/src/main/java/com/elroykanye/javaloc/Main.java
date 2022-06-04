package com.elroykanye.javaloc;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main (String[] args) {

        Locale.setDefault(Locale.GERMAN);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("greetings", Locale.getDefault());

        System.out.println(resourceBundle.getString("morning_greeting"));
        System.out.println(resourceBundle.getString("afternoon_greeting"));
        System.out.println(NumberFormat.getInstance().format(300000));

    }
}

