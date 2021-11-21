package Pracs.Prac5;

import java.util.Scanner;

public class Third {
    public static void FATB(int i, int i1){
        System.out.print(i + " ");
        if(i != i1 & i < i1){
            i++;
            FATB(i, i1);
        }
        if(i != i1 & i > i1){
            i--;
            FATB(i, i1);
        }
        else {
            return;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        int i1 = scan1.nextInt();
        FATB(i, i1);
    }
}