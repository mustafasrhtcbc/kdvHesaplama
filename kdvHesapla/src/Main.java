package kdvHesapla.src;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {

        double tutar,kdvOran=0,sonuc;
        Scanner imp=new Scanner(System.in);
        System.out.print("Hesaplamak İstenilen Tutarı Giriniz: ");
        tutar=imp.nextDouble();
        if(tutar>=0 && tutar<=1000){kdvOran=0.18;}
        if(tutar>1000){kdvOran=0.08;}
        sonuc= kdvOran*tutar;
        System.out.println("KDV'li tutar: "+(sonuc+tutar));
        System.out.println("KDV oranınız: "+ kdvOran);
        System.out.println("Girdiğiniz Tutar: "+tutar);
        imp.close();



        

    }
}
