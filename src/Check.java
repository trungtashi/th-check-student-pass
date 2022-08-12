import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter number of student need check: " );
            size = scanner.nextByte();
            if (size > 30){
                System.out.println("more than the number of students");
            }
        }while (size > 30);
        int[] score = new int[size];
        inputScore(score);
        System.out.println("Number of student passed: " + checkPas(score));
    }
    public static int[] inputScore(int[] arr){
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Enter point position of student: " + (i + 1));
            arr[i] = scanner1.nextByte();
        }
        return arr;
    }
    public static int checkPas(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5){
                count++;
            }
        }
        return count;
    }
}
