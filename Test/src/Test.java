import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char check = 'y';
        while(true){
            String word = sc.nextLine();
            System.out.println(vowel(word));
            System.out.println(Specific(word));
            System.out.println("y or n");
            check = sc.nextLine().charAt(0);
            if(check != 'y'){
                break;
            }
        }


    }
    public static int vowel(String n){
        int vowel = 0;
        for(int i=0; i<n.length(); i++){
            char letter = n.charAt(i);
            if(letter == 'a' || letter =='e' || letter == 'i' || letter == 'o' || letter == 'u'){
                vowel++;
            }
        }
        return vowel;
    }

    public static String Specific(String n) {
        String result = "";
        for (int i = 0; i < n.length(); i++){
            char letter = n.charAt(i);
            if (letter == 'a') {
                result += "#";
            } else {
                result += letter;
            }
        }
        return result;
    }
}
