import java.util.Scanner;

public class HangMan {

    int length;

    public static void main(String args[]){

        System.out.println("Enter the Word : ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int length = word.length();
        char[] word_char = new char[length];
        char[] word_dash = new char[length];

        for(int i=0;i<length;i++){
            word_char[i] = word.charAt(i);
        }

        for(int i=0;i<length;i++){
            word_dash[i] = '-';
        }

//        for(Object obj : word_char){
//            System.out.print(obj + " ");
//        }

//        System.out.println(user_guess);

        int k = length;

        while(k!=0){
            System.out.println("\nGuess the Word : ");
            String guess = scanner.next();
            char user_guess = guess.charAt(0);
            for(int i=0;i<length;i++){
                if(user_guess == word_char[i]){
                    word_dash[i] = user_guess;
                    k--;
                }
            }
            for(int i=0;i<length;i++){
                System.out.print(word_dash[i] + " ");
            }
        }
        System.out.println("\nCongrats! You won.");
    }

}
