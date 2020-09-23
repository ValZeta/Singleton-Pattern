package singletonpatterndemo;
import java.util.Scanner;
public class PlanetDalam {
    String x [];
    Scanner scan = new Scanner(System.in);
    private static PlanetDalam instance = new PlanetDalam();   
    private PlanetDalam(){}   
    public static PlanetDalam getInstance(){
        return instance;
    }  
    public void inputpdalam(){
        System.out.print("Masukkan Banyak Data: ");
        int jumlah = scan.nextInt();
        x = new String [jumlah];
        for (int i=0; i<jumlah; i++){
            System.out.print("Masukkan Planet Dalam Ke - " + (i+1) + " : ");
            String pdalam = scan.next();
            x[i] = pdalam;
        }
    }
    public void outputpdalam(){
        try{
            for (int i = 0; i < x.length; i++) {
                System.out.println(x[i]);
            }
        }
        catch(Exception E){
            System.out.println("TIDAK ADA DATA");
        }
    }
}
