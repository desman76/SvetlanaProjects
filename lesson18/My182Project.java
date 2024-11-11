package lesson18;

import java.util.Scanner;

public class My182Project {
    public static void main(String[] args) {
        double x = readNumber ();
        double y = readNumber ();
        double max = findMax(x,y);
        System.out.println("Наибольшее число:" + max);
    }
    public static double readNumber (){
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите дробное число: ");
        double imput = sc.nextDouble();
        return imput;
    }
    public static double findMax(double a,double b){
        double maximum;
        if (a > b) {
            maximum = a;
        } else {
            maximum = b;
        } return maximum;
    }
}
