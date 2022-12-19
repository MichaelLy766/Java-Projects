import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        //creatinn array of randoms numbers 1 to 100 
        int[] numbers = new int[100];
        Random rand = new Random();
        System.out.println("Unsorted Array");
        System.out.println("_______________________");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1; 
            System.out.println(numbers[i]);
        }
    
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp; 
                }
            }
        }

        //print out sourted array
        System.out.println("sorted Array");
        System.out.println("_______________________");
        int perline = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%7d", numbers[i]);
            if (++perline == 8) {
                System.out.println();
                perline = 0;
            }
        }
    }
}