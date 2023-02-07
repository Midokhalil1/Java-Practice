import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {

        int[] myNumbers = new int[5];
        Scanner reader = new Scanner(System.in);

        for(int index = 0; index < myNumbers.length; index++){
            System.out.println("Enter numer " + (index + 1));
            myNumbers[index] = reader.nextInt();
        }

        for( int index = myNumbers.length -1; index >= 0; index--){
        System.out.println(myNumbers[index] + " ");
        }
  
    }
}