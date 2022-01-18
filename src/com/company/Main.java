package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
                int n = Integer.valueOf(scanner.nextLine());
                int a =1;
                int ans = 1;
                while (a<=n){
                   ans=ans*a;
                   a++;
                }
               if (n==0){
                   ans=1;
               }
                System.out.println(ans);
    }
}
