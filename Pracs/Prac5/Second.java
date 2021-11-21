package Pracs.Prac5;

import java.util.Scanner;

public class Second {
    public static void F1Tn(int i, int i1){
        System.out.print(i + " ");
        if(i != i1){
            i++;
            F1Tn(i, i1);
        }
        else {
            return;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        F1Tn(1, i);
    }
}