package lesson18;

import java.util.Scanner;

public class My181Project {
    public static void main(String[] args) {
        int x = readNumber ();
        int y = readNumber ();
        int max = findMax(x,y);
        System.out.println("Наибольшее число:" + max);
    }
    public static int readNumber (){
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите число: ");
        int imput = sc.nextInt();
        return imput;
    }
    public static int findMax(int a,int b){
        int maximum;
        if (a > b) {
            maximum = a;
        } else {
            maximum = b;
        } return maximum;
    }
}
