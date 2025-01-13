package lesson48;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class My481Project {
    static HashMap<String, ArrayList<Double>> hashmap=new HashMap<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Введите имя: ");
           String name=sc.nextLine();
           System.out.print("Введите оценку: ");
           double grade= sc.nextDouble();
           sc.nextLine();
           addGrade (name, grade);
           display();
        }
    }
    static void addGrade(String name, double grade){
        if(!hashmap.containsKey(name)){
            hashmap.put(name, new ArrayList<>());
        }
        hashmap.get(name).add(grade);
    }
    static void display(){
        for (Map.Entry<String, ArrayList<Double>> entry:hashmap.entrySet()){
            double mean = 0;
            for (double value: entry.getValue()){
                mean += value;
            }
            mean /= entry.getValue().size();
            System.out.println(entry.getKey() + " : " + mean);
        }
    }
}
