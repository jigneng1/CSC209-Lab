public class quicksort {
    public static void main(String[] args) {
        int[] data = {69,200,44,1000,3,256,400,500};

        printAll(data);

        quickSort(data,0, data.length-1);
        printAll(data);

    }
    public static void quickSort(int[]  a ,int first,int last){
        if(first >= last){ //anchor
            return;
        }
        int pivot = first ,lower=first+1,upper = last;
        while(lower <= upper){
            while(lower <= last && a[lower] < a[pivot]){//search for bigger than pivot
                lower++;
            }
            while(upper > first && a[upper] > a[pivot]){ // search for smaller than pivot
                upper--;
            }
            if(lower < upper) { // lower has not pass upper then swap
                int temp = a[lower];
                a[lower] = a[upper];
                a[upper] = temp;

                lower++;
                upper--;
            }
        }
        int temp = a[pivot]; //swap pivot to upper
        a[pivot] = a[upper];
        a[upper] = temp;

        quickSort(a,first,upper-1);
        quickSort(a,upper+1,last);


    }
    public static void printAll(int[] a){
        for(int s : a){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
