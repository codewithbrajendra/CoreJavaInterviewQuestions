package JD_Birla.JD_BirlaCoding;

import java.util.*;

public class IterateMapContainingListOfString_8 {

    public static void main(String[] args) {
        System.out.println("Que2: How to iterate a Map containing a List of String in Java 8 ?");
        Map<String, List<String>> listOfAnimals = new HashMap<>();

        // List #1: Creating list of Animals in Mammals Category
        List<String> listOfMammals = Arrays.asList("Cat", "Dog", "Monkey", "Cow");
        // Adding listOfMammals into Mammal's Category
        listOfAnimals.put("Mammals", listOfMammals);

        // List #2: Creating list of Animals in Birds Category
        List<String> listOfBirds = Arrays.asList("Crow", "Parrot", "Peacock", "Flamingo");
        // Adding listOfMammals into Bird's Category
        listOfAnimals.put("Birds", listOfBirds);

        // List #3: Creating list of Animals in Reptiles Category
        List<String> listOfReptiles = Arrays.asList("Lizard", "Turtle", "Crocodile", "Python");
        // Adding listOfMammals into Reptile's Category
        listOfAnimals.put("Reptiles", listOfReptiles);

        listOfAnimals.forEach((k,v) -> System.out.println(k + v));

    }
}
