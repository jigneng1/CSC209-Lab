public class Sorting
{
    public static void main(String[] args) {
        int[] data = {40,55,12,500,300,29,46,88,79,92,30,56,1000,49};
        int[] data2 = data.clone();
        int[] data3 = data.clone();
        System.out.println("Selection Sort");
        print(data);selectionSort(data);print(data); // data selection sorting
        System.out.println("-------------------------------------------");
        System.out.println("Insertion Sort");
        print(data2);insertionSort(data2);print(data2); // data insertion sorting
        System.out.println("-------------------------------------------");
        System.out.println("Bubble Sort");
        print(data3);bubbleSort(data3);print(data3);
        System.out.println("--------------------------------------------");
    }

    public static void selectionSort(int[] a){
        for(int i=0; i<a.length-1; i++){
            int min = i;
            for(int j=i+1; j<a.length; j++) {
                if (a[j] < a[min]) { // find smallest in array
                    min = j; //keep index
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }

    public static void insertionSort(int[] a){
        for(int i=1; i<a.length; i++){
            int insertingItem = a[i];
            int j;
            for(j=i-1; j>=0 && a[j]>insertingItem; j--){ //move backward and stop it when found smaller
                a[j+1] = a[j];
            }
            a[j+1] = insertingItem;
        }
    }

    public static void bubbleSort(int[] a){
        for(int i=0; i<a.length; i++){
            for(int j=a.length-1; j>i; j--){
                if(a[j] < a[j-1]){ //check swap
                    int temp = a[j-1]; //swap
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void print(int[] a){
        for(int s : a){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
