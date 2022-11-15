package Projects;

import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {

        Scanner tara=new Scanner(System.in);
        System.out.println("s1 :");
        int s1= tara.nextInt();
        System.out.println("s2 :");
        int s2=tara.nextInt();

        int ekok =ekokBul(s1,s2);
        System.out.println("ekok :"+ekok);


    }
    private static int ekokBul(int s1,int s2){
        int ekok =(s1 * s2)/ebobBul(s1,s2);
        return ekok;


    }

    private static int ebobBul(int s1, int s2) {

        int ebob=1;
        int kontrol =2;

        while(kontrol <= s1 && kontrol <= s2){
            if(s1% kontrol ==0 && s2 % kontrol ==0){
                ebob = kontrol;
            }
            kontrol++;
        }
        if (ebob==1){
            System.out.println(s1+" ve " + s2+ "aralarında asaldır");
        }else {
            System.out.println(s1+ " ve " + s2+ " sayılarının en büyük ortak böleni "+ebob);
        }
        return ebob;






    }



}
