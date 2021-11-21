package Pracs.Prac5;

import java.util.Scanner;

public class First {
    public static void Tri(int i, int i1){
        if(i == 0){
            return;
        }
        i1++;
        for(int i2 = i1; i2>0; i2--){
            System.out.print(i1 + " ");;
            i--;
            if(i==0) {
                return;
            }
        }
        Tri(i, i1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Tri(i, 0);
    }
}