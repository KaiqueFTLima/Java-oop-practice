package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        list.add("Kaique");
        list.add("Lesk");
        list.add("Argos");
        list.add("Andre");
        list.add(2, "Daniel");

        System.out.println(list.size());

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("----------------");

        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'D');

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("----------------");

        System.out.println("Index of Daniel: " + list.indexOf("Daniel"));
        System.out.println("Index of Lucas: " + list.indexOf("Lucas"));

        System.out.println("----------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result){
            System.out.println(x);
        }

        System.out.println("----------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

        sc.close();
    }
}
