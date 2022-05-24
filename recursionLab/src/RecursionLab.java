public class RecursionLab {
    public static int factorial(int n ){
        if(n==0) return 1;
        return n*factorial(n-1);
    }

    public static int exponential(int a, int b){
        if(b==0){
            return 1;
        }
        return a*exponential(a,b-1);
    }
    public static int division(int divided, int divisor){
/*
        20/6 => 20-6-6-6 => 3
        normal case
        int count ;
        for(count=0; divided>=divisor;count++){
            divided-=divisor;
        }
        return count;
*/
        if(divided<divisor)
            return 0;
        return division(divided-divisor,divisor)+1;
    }
    public static void printNto1(int n){
        if(n>0){
            System.out.print(n+" ");
            printNto1(n-1);
        }
    }
    public static void print1ToN(int n){
        if(n>0){
            print1ToN(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(exponential(2,2));
        System.out.println(division(18,6));
        printNto1(10);
        System.out.println();
        print1ToN(10);
    }
}