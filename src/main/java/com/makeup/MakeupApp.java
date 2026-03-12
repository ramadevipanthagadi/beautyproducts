package com.makeup;

public class MakeupApp {

    public static void main(String[] args) {

        String[] products = {
            "Lipstick",
            "Foundation",
            "Eyeliner",
            "Mascara",
            "Blush"
        };

        System.out.println("Makeup Products Available:");

        for(String product : products) {
            System.out.println(product);
        }
    }
}
