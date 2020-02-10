package week1;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti anul ");
        int a = Integer.parseInt(scanner.nextLine());
        if(a%100==0 && a%4==0) {
            System.out.println("An bisect");
        } else if(a%4==0){
                System.out.println("An bisect");
            } else
            System.out.println("An nu e bisect");
        }
    }
