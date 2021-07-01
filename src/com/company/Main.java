package com.company;

public class Main {

    public static void main(String[] args) {
        Shelter Romashka = new Shelter("Romashka",
                "Lermantova 18");

        Dog Meka = new Dog("Meka", "Овчарка",
                Color.BLACK, Romashka);

        Dog Aktosh = new Dog("Aktosh", "Бродяга",
                Color.BROWN, Romashka,
                new String[]{"Сидеть", "Лежать", "Кусать"});

        Dog Sharik = new Dog("Sharik", "Бродяга",
                Color.WHITE, Romashka,
                new String[]{"Сидеть", "Лежать", "Кусать"});

        System.out.println("_______________");
        System.out.println(Aktosh.getInfo());
        Aktosh.makeVoice("Гув гув", 1);
        Aktosh.makeVoice("Гуф Гуф");
        Aktosh.makeVoice("Гуф Гуф","SSSSS");
        System.out.println("_______________");
        System.out.println(Sharik.getInfo());
        Sharik.makeVoice("tars tars", 3);
        System.out.println("_______________");
    }
}
