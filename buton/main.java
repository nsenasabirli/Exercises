package buton;


public class main {
    public static void main(String[] args) {
        String internetSubeButonu = "Internet subesi";
        double dolarDun = 8.20;
        double dolarBugun = 8.20;
        int vade = 36;
        boolean asagi = false;
        boolean yukari = true;


        System.out.println(internetSubeButonu);

        if (dolarBugun < dolarDun) {
            System.out.println("asagi yonlu ok");
            // true olursa çalışır
        }
        else if(dolarBugun > dolarDun) {
            System.out.println("yukarı yonlu ok");
        }
        else {
            System.out.println("esittir");
        }

        String kredi1 = "Hızlı kredi";
        String kredi2 = "mutlu emekci kredisi";
        String kredi3 = "konut kredisi";

        System.out.println(kredi1);

        String[] krediler = {
                "hızlı kredi",
                "mutlu emekli kredisi",
                "konut kredisi",
        };
        //foreach
        for(String kredi : krediler) {
            System.out.println(kredi);

        }

        for(int i = 0; i<krediler.length; i++){
            System.out.println(krediler[i]);
        }

        int[] sayilar1 = {1,2,3,4,5};
        int[] sayilar2 = {10,20,30,40};
        sayilar1 = sayilar2;
        sayilar2[0] = 100;
        System.out.println(sayilar1[0]);

        String sehir1 = "ankara";
        String sehir2 = "istanbul";
        sehir1 = sehir2;
        sehir2 = "izmir";
        System.out.println(sehir1);


    }
}
