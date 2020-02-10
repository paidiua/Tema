package week1;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("User: ");
        String a = scanner.nextLine().toLowerCase();
        System.out.println("Pass: ");
        String b = scanner.nextLine();

/*        Username	Password
        alex	mightyducks
        emily	cat*/
        if (a.equalsIgnoreCase("alex") || a.equalsIgnoreCase("emily")) {
            if (a.equalsIgnoreCase("alex") && b.equals("mightyducks")) {
                System.out.println("You are logged in!");
            } else if (a.equalsIgnoreCase("emily") && b.equals("cat")) {
                    System.out.println("You are logged in!");
                } else
                System.out.println("User or pass invalid");
            } else {
            System.out.println("User or pass invalid");}
        }
    }
