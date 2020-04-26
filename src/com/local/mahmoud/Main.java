package com.local.mahmoud;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Map<Integer, Location> locations = new HashMap<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<String, Integer> existsMap = new HashMap<>();
        locations.put(0, new Location(0, "leave", existsMap));
        //add exist locations...
        existsMap.put("W", 2);
        existsMap.put("E", 3);
        existsMap.put("S", 4);
        existsMap.put("N", 5);
        locations.put(1, new Location(1, "read before", existsMap));

        existsMap = new HashMap<>();
        existsMap.put("N", 5);
        locations.put(2, new Location(2, "hill", existsMap));

        existsMap = new HashMap<>();
        existsMap.put("W", 1);
        locations.put(3, new Location(3, "building", existsMap));

        existsMap = new HashMap<>();
        existsMap.put("N", 1);
        existsMap.put("W", 2);
        locations.put(4, new Location(4, "valley", existsMap));

        existsMap = new HashMap<>();
        existsMap.put("S", 1);
        existsMap.put("W", 2);
        locations.put(5, new Location(5, "forest", existsMap));

        HashMap<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("END", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");


        System.out.println("\t\tProgram Started...");
        int location = 1;
        while (true) {

            System.out.println(locations.get(location).getDescription());
            existsMap.remove("S");
            if (location == 0) {
                System.out.println("bye dear !");
                break;
            }
            Map<String, Integer> existsCopy = locations.get(location).getExist();
            // running over the hasmap ...
            System.out.println("Avaialble values: ");
            for (String key : existsCopy.keySet()) {
                System.out.print(key + ",");
            }
            System.out.println();

            String directions = scanner.nextLine().toUpperCase();

            if (directions.length() > 1) {
                String[] elements = directions.split(" ");
                for (String latter : elements) {
                    if (vocabulary.containsKey(latter)) {
                        directions = vocabulary.get(latter);
                        break;
                    }
                }
            }
            if (existsCopy.containsKey(directions)) {
                location = existsCopy.get(directions);
            } else {
                System.out.println("we cannot take you to this path!");
            }

        }
//        String[] dataHolder = " hellow this is me man ! .".split(" ");
//        for(String s : dataHolder){
//            System.out.println("String# " + s + ".");
//        }
    }
}
