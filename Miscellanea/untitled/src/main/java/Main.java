import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String cuisinePreference = scanner.next();
        int years = scanner.nextInt();
        System.out.println("The form for " + firstName + " is completed. We will contact you if we need a chef who cooks " + cuisinePreference + " dishes and has " + years + " years of experience.");
    }
}