public class DollarLinkedList {
    Node head;

    public void add(int day, double price) {
        Node newNode = new Node(day, price);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current.next != null) {
            System.out.print("Day " + current.day + " | Dollar Price " + current.price);
            current = current.next;
        }
    }

    public void findMaxIncrease() {
        Node current = head;
        Node next = current.next;

        double maxIncrease = 0;
        while (next != null) {
            double increase = next.price - current.price;

            if (increase > maxIncrease) {
                maxIncrease = increase;
            }
            current = next;
            next = current.next;
        }
        System.out.println("Maximum increase: " + maxIncrease);
    }
}
