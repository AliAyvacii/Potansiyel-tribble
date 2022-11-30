import java.util.Scanner;

public class smallCode {
    public static void main(String[] args) {
        //java kullanıcıdan alınan 3 sayının büyük Olanını Yazdıran Program
        Scanner tara=new Scanner(System.in);
        System.out.print("1.sayı :");
        int s1= tara.nextInt();
        System.out.print("2.sayı :");
        int s2= tara.nextInt();
        System.out.print("3.sayı :");
        int s3= tara.nextInt();

        if (s1>=s2 && s1>=s3){
            System.out.println(s1+" büyüktür");
        } else if (s2>=s1 && s2>=s1) {
            System.out.println(s2+" büyüktür");
        }else {
            System.out.println(s3+"büyüktür");
        }
    }
}
