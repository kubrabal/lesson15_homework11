package com.github.kubrabal;

public class Main {
    public static void main(String[] args) {
        SimpleSingleton singleton = SimpleSingleton.getInstance();
        singleton.showMessage();

        SimpleBuilder builder = new SimpleBuilder.Builder()
                .setName("name")
                .setType("type")
                .build();
        builder.showMessage();
    }
}