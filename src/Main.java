import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
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
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
