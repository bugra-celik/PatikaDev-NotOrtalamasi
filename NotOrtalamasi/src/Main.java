import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fiz,kim,tur,tar,muz;
        double ort;

        System.out.println("---Aşağıdaki derslerin notlarını giriniz---");
        System.out.print("Matematik:");
        mat = input.nextInt();
        System.out.print("Kimya:");
        kim = input.nextInt();
        System.out.print("Fizik:");
        fiz = input.nextInt();
        System.out.print("Türkçe:");
        tur = input.nextInt();
        System.out.print("Tarih:");
        tar = input.nextInt();
        System.out.print("Müzik:");
        muz = input.nextInt();
        ort =((mat+fiz+kim+tur+tar+muz)/6);
        System.out.println("Derslerin ortalaması=" +ort);
        boolean sonuc = ort > 60;
        String str = (sonuc)? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);

    }
}