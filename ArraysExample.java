public class ArraysExample {
    public static void main(String[] args) {
        int[] myNumbers = {10, 20, 30, 40, 50, 60, 70} ;

        myNumbers[0] = 145;
        myNumbers[5] = 120;

     
        
        for(int index = 0; index < myNumbers.length; index++){
            System.out.print(myNumbers[index] + " ");
        }
    }
}