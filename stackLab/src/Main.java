public class Main {
    public static void main(String[] args) {
        ourStack stl = new ourStack(4);
        stl.push(50); stl.push(93);
        System.out.println(stl.topElement());
        stl.push(34);
        System.out.println((stl.isEmpty())+" "+stl.isFull());
        stl.push(55);
        System.out.println(stl.isEmpty()+" "+stl.isFull());
        stl.push(97);
        System.out.println(stl.pop());
        System.out.println(stl.topElement());
        Bignumber n1 = new Bignumber("523");
        Bignumber n2 = n1.add(new Bignumber("6789"));
        System.out.println(n2.toString());
//        Bignumber n3 = new Bignumber("99999999999999999999999999999999999999999999999999999");
//        Bignumber n4 = new Bignumber("1");
//        System.out.println(n3.add(n4).toString());
    }
}
