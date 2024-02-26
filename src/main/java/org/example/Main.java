package org.example;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> userMap = new HashMap<>();
        userMap.put("Persona","The genre of Persona is RPG. Persona has 5 series out.");
        userMap.put("Smash bro", "The genre of Smash bro is action. Smash bro has 6 series out.");
        userMap.put("Danganronpa","The genre of Danganronpa is action. Danganronpa has 3 series out.");
        userMap.put("Final Fantasy","The genre of Final Fantasy is RPG. Final Fantasy has 16 series out.");

        System.out.println(userMap.get("Persona"));
        System.out.println(userMap.get("Smash bro"));
        System.out.println(userMap.get("Danganronpa"));
        System.out.println(userMap.get("Final Fantasy"));
        System.out.println(userMap.get("Dragon Quest"));
    }
}