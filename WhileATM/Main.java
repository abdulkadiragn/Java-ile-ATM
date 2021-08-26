package WhileATM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        int bakiye = 500;
        

        System.out.println("İşleminizi rakam olarak seçiniz..\n1-Bakiye Öğrenme\n2-Para Çekme\n3-Para Yatırma\n4-Çıkış");

        while(true){
            System.out.println("İşlem seçiniz");
            String islem = a.nextLine();

            if(islem.equals("4")){
                System.out.println("programdan çıkılıyor");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Güncel bakiyeniz : "+bakiye);
            }
            else if(islem.equals("2")){
                System.out.print("Bakiyeniz :"+bakiye+"\nÇekmek istediginiz tutarı giriniz :");
                int tutar = a.nextInt();
                a.nextLine();

                if(bakiye - tutar < 0){
                    System.out.println("bakiyeniz çekmek istediğiniz tutardan daha azdır.");
                }
                else{
                    bakiye = bakiye - tutar;
                    System.out.println("Güncel bakiyeniz :"+bakiye);
                }
            }
            else if(islem.equals("3")){
                 System.out.println("Yatırmak istediginiz tutarı giriniz :");
                 int tutar = a.nextInt();
                 a.nextLine();

                 bakiye = bakiye + tutar;
                 System.out.println("yeni bakiyeniz :"+bakiye);
            }
            else{
                System.out.println("Geçersiz işlem seçtiniz");
            }
        }
    }
}
