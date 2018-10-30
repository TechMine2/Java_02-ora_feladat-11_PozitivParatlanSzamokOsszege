package javaapp_02_pozitivparatlanszamokosszege;

import java.util.Scanner;

public class JavaApp_02_PozitivParatlanSzamokOsszege {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int osszeg=0;
        int i = 1;
        do {
            osszeg+=i;
            /*String s;
            s= String.format("Páratlan szám: %d - összeg: %d", i, osszeg);
            System.out.println(s);*/
            i+=2;
            
        } while (i < N);
        
        System.out.println(osszeg);
    }
    
}
