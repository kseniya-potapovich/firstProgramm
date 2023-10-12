import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //int num = scanner.nextInt();
       /*if (num >=9 && num <=11){
            System.out.println("fall");
        } else if (num>=3 && num <=5) {
            System.out.println("spring");
        } else if(num >= 6 && num <= 8){
            System.out.println("summer");
        } else System.out.println("winter");*/

        /*String result = switch (num){
            case 1, 2, 12 -> "winter";
            case 3, 4, 5 -> "spring";
            case 6, 7, 8 -> "summer";
            case 9, 10, 11 -> "fall";
            default -> "You wrote wrang num";
        };
        System.out.println(result);*/

        /*int n = 1;
        while (n <= 25) {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
            n++;
        }*/
            /*for (int i = 2; i <= 20; i += 2) {
                if(i>10) {System.out.println(i);}
            }*/
       /* for (int i = 1; i <= num + 200; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Hello Git!");*/

        /*int[] r = new int[5];
        for (int i = 0; i < 5; i++) {
            r[i] = (int) (Math.random() * 100);
            System.out.println(r[i] + "^2 = " + (int) (Math.pow(r[i], 2)));
        }*/
        Scanner scanner = new Scanner(System.in);
        /*String[] array = new String[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/
        //----------------------
        /** Array */
       /* String[] fruits = new String[4];
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = scanner.nextLine();
        }
        System.out.println(fruits[1] + " " + fruits[3]);
        System.out.println(fruits.length);
        fruits[2] = "banana";
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }*/

        int size = scanner.nextInt();
        double[] masDouble = new double[size];
        for (int i = 0; i < size; i++) {
            masDouble[i] = Math.random() * 100;
            System.out.println(masDouble[i]);
        }
        for (int i = 1; i < size; i += 2) {
            masDouble[i] = masDouble[i] * masDouble[i];
        }
        System.out.println("-----------------------");
        for (int i = 0; i < size; i++) {
            System.out.println(masDouble[i]);
        }
        System.out.println("----------------------");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(masDouble[i]);
        }
    }
}
