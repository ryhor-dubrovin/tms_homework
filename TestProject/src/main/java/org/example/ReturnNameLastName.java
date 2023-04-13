package org.example;

public class ReturnNameLastName {

    public static String returner(int num) {

        boolean cond3 = num % 3 == 0;
        boolean cond5 = num % 5 == 0;

        if (cond3 && cond5) {
            return "Ryhor Dub";
        } else if (cond3) {
            return "Ryhor";
        } else if (cond5) {
            return  "Dub";
        } else {
            return "Ошибка";
        }
    }
}
