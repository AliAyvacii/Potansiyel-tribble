package Project;

import java.util.Scanner;

public class Proje {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("sayı giriniz :");
        int s1=tara.nextInt();
        String binary="";
        if (s1 ==0){
            binary="0";
        }
        while(s1 > 0){
            int mod =s1 % 2;
            binary=mod+binary;
            s1=s1/2;
        }
        System.out.println("sayının binary hali :"+binary);
    }
}
