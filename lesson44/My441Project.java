package lesson44;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class My441Project {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            number.add(rand.nextInt(100));
        }
        number.sort(new NumberComparator());
        System.out.println(number);
    }
}

class NumberComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        boolean o1IsEven = o1 % 2==0;
        boolean o2IsEven = o2 % 2==0;
        if (o1IsEven && o2IsEven) {
            return o1-o2;
        } else if (o1IsEven && !o2IsEven){
            return -1;
        } else if (o2IsEven && !o1IsEven){
        return 1;
        } else if (!o1IsEven && !o2IsEven){
            return o2-o1;
        }
        return 0;
    }
}