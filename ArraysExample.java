import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {

        int[] myNumbers = new int[5];
        Scanner reader = new Scanner(System.in);

        for(int index = 0; index < myNumbers.length; index++){
            System.out.println("Enter numer " + (index + 1));
        }
  
    }
}