package lesson43;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import static jdk.internal.vm.vector.VectorSupport.insert;

public class My431Project {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        long arrayInsertTime = getInsertTimes(arrayList);
        long linkedInsertTime = getInsertTimes(linkedList);
        System.out.println("ArrayList ms: " + arrayInsertTime);
        System.out.println("LinkedList ms: " + linkedInsertTime);
    }

    public static long getInsertTimes(List list) {
        Date startTime = new Date();
        insert(list);
        Date endTime = new Date();
        return endTime.getTime() - startTime.getTime();
    }

    public static void insert(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add(0, new Object());
        }
    }
}
