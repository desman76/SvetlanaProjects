package lesson45;

import java.util.Comparator;
import java.util.PriorityQueue;

public class My451Project {
    public static void main(String[] args) {
        PriorityQueue<Customer> queue = new PriorityQueue<>(new CustomerComparator());
        queue.add (new Customer ("user1", 4));
        queue.add (new Customer ("user2", 2));
        queue.add (new Customer ("user3", 10));
        while (!queue.isEmpty()) {
            System.out.println (queue.poll());
        }
    }
}
class Customer {
    String fullname;
    int loaltyPoints;
    public Customer(String fullname, int loaltyPoints) {
        this.fullname = fullname;
        this.loaltyPoints = loaltyPoints;
    }
    @Override
    public String toString() {
        return "Customer{" + "fullname= ' " + fullname + '\'' + ", loaltyPoints=" + loaltyPoints + '}';
    }
}

class CustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return c1.loaltyPoints - c2.loaltyPoints;
    }
}