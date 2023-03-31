public class app {
    public static double hesapla(double evBedeli, double kiraBedeli) {
        return evBedeli / kiraBedeli;

    }

    public static void main(String[] args) throws Exception{
        double aySayisi =  hesapla(1000000,5000);
    System.out.println(aySayisi + " ayda ev kendini öder");
    if(aySayisi>211) {
        System.out.println("Bu ev çok pahalı");
    }
    else {
        System.out.println("Bu ev ucuz, alınabilir");
    }

    }
}
