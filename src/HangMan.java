import java.util.Scanner;

public class HangMan {

    public static void main(String args[]){

        System.out.println("Enter the Word : ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int length = word.length();
        char[] word_char = new char[length];

        for(int i=0;i<length;i++){
            word_char[i] = word.charAt(i);
        }

//        for(Object obj : word_char){
//            System.out.print(obj + " ");
//        }

    }

}
