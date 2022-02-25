package Lesson4;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
            point1();
            point2();
        }

        private static void point1 () {
            Map<String, Integer> hm = new HashMap<>();
            String[] words = {"Bus", "House", "Lemon",
                    "Cat", "Temperature", "Eagle",
                    "Dog", "Cat", "Java",
                    "Mushroom", "Garden", "Coffee",
                    "Dog", "Hello", "World",
                    "School", "Java", "Lemon"
            };

            for (int i = 0; i < words.length; i++) {
                if (hm.containsKey(words[i]))
                    hm.put(words[i], hm.get(words[i]) + 1);
                else
                    hm.put(words[i], 1);
            }
            System.out.println(hm);
        }

        private static void point2 () {
            Directory directory = new Directory();

            directory.add("Ivanov", "Vadim","");
            directory.add("Petrov", "Igor","89165544678");
            directory.add("Sidorov", "Dmitriy","89103455432");
            directory.add("Krikunov", "Petr","89156336446");
            directory.add("Ivanov", "Stanislav","89857775342");
            directory.add("Hatov", "Timur","89855567891");
            directory.add("Bobkov", "Vladimir","89164215566");
            directory.add("Petrov", "Sergey","89156068365");

            System.out.println(directory.get("Ivanov"));
            System.out.println(directory.get("Petrov"));
            System.out.println(directory.get("Bobkov"));
        }
    }

    class Directory {
        private Map<String, List<String>> directory_hm = new HashMap<>();
        private List<String> phone_number_list;

        public void add(String surname, String firstname, String phoneNumber) {
            if (directory_hm.containsKey(surname)) {
                phone_number_list = directory_hm.get(surname);
                phone_number_list.add(phoneNumber);
                directory_hm.put(surname, phone_number_list);
            } else {
                phone_number_list = new ArrayList<>();
                phone_number_list.add(String.valueOf(phoneNumber));
                directory_hm.put(surname, phone_number_list);
            }
        }

        public List<String> get(String surname) {
            return directory_hm.get(surname);
        }
    }
