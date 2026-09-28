public class Main {
    public static void main(String[] args) {
        DollarLinkedList list = new DollarLinkedList();

        System.out.println("List created");

       list.add(1, 231750);
       list.add(2, 234600);
       list.add(3, 233000);
       list.add(4, 235200);
       list.add(5, 236000);

       list.display();
       list.findMaxIncrease();

    }
}
