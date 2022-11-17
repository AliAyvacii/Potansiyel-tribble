package Projects;

public class Proje {
    public static void main(String[] args) {

        String kartTurleri[] = {"kupa", "maça", "karo", "sinek"};
        String kartNumara[] = {"as", "2", "3", "4", "5", "6", "7", "8", "9","10", "j", "q", "k"};

        int deste[] = new int[52];

        desteOlustur(deste);
        diziKaristir(deste);
        desteGoster(deste,kartTurleri,kartNumara);
    }

    private static void diziKaristir(int[] deste) {
        for(int i =0;i< deste.length;i++){
            int rastgeleSayi=(int)Math.random() * deste.length;
            int gecici=deste[i];
            deste[i]=deste[rastgeleSayi];
            deste[rastgeleSayi]=gecici;


        }
    }

    private static void desteGoster(int[] deste, String[] kartTurleri, String[] kartNumara) {
        for (int i =0;i<4;i++){
            String kartTuru=kartTurleri[deste[i]/13];
            String kartNumaralari=kartNumara[deste[i]%13];

            System.out.println(kartTuru + " " + kartNumaralari);

        }
    }


    private static void desteOlustur(int[] deste) {
        for (int i =0;i<deste.length;i++){

            deste[i]=i;
        }

    }

}
