public class Main {
    public static void main(String[] args) {
        linkedList list1 = new linkedList();
        list1.addToHead("Scott",100.00,10,"pink");
        list1.addToHead("Scoot",300,37,"Blue");
        list1.printAll();
        list1.deleteFromHead();
        list1.printAll();
    }
}
