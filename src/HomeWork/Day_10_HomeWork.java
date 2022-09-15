package HomeWork;

import java.util.Scanner;

public class Day_10_HomeWork {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen motelimizi tanımak için 1-2-3 bir kat numarası giriniz ve oda adı seçin : ");
        System.out.println("1.kat: Resepsiyon-Güvenlik-Oda Hizmetleri\n2.kat: Yemekhane-Dinlenme Salonu-Room1-Room2\n3.kat: Room3-Room4-Room5-Room6 ");

        int kat = sc.nextInt();
        sc.nextLine();
        String secim=sc.nextLine();

        switch (kat) {
            case 1:
                switch (secim) {
                    case "Resepsiyon":
                        System.out.println("Tüm işlemleriniz için bekleriz");
                        break;

                    case "Güvenlik":
                        System.out.println("Profesyonel bir hizmettir");
                        break;

                    case "Oda Hizmetleri":
                        System.out.println("Temizlik ve taşıma için 101 dahili hattan arayabilirsiniz ");
                        break;
                    default:
                        System.out.println("Bu katta böyle bir birim yoktur");

                }
                break;
            case 2:


                switch (secim) {
                    case "Yemekhane":
                        System.out.println("Kahvaltı :08-11\nÖğle Yemeği :12-15\nAkşam Yemeği :8-21");
                        break;
                    case "Dinlenme Salonu":
                        System.out.println("24 saat çay servisi ile hizmetinizdedir");
                        break;
                    case "Room1":
                        System.out.println("Ekonomik oda");
                        break;
                    case "Room2":
                        System.out.println("Ekonomik oda");
                        break;
                    default:
                        System.out.println("Bu katta böyle bir oda yoktur.");


                }
                break;

            case 3:

                switch (secim){
                    case "Room3":
                        System.out.println("Standart oda");
                        break;
                    case "Room4":
                        System.out.println("Standart oda");
                        break;
                    case "Room5":
                        System.out.println("Özel oda");
                        break;
                    case "Room6":
                        System.out.println("Özel oda");
                        break;
                    default:
                        System.out.println("Bu katta böyle bir birim yoktur.");

                }break;
            default:
                System.out.println("Otelimiz 3 katlıdır.");

        }

    }

}
