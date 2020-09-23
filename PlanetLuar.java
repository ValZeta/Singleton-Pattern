package singletonpatterndemo;
import java.util.Scanner;
public class PlanetLuar {
    String x [];
    Scanner scan = new Scanner(System.in);
    private static PlanetLuar instance = new PlanetLuar();   
    private PlanetLuar(){}   
    public static PlanetLuar getInstance(){
        return instance;
    }  
    public void inputpluar(){
        System.out.print("Masukkan Banyak Data: ");
        int jumlah = scan.nextInt();
        x = new String [jumlah];
        for (int i=0; i<jumlah; i++){
            System.out.print("Masukkan Planet Luar Ke - " + (i+1) + " : ");
            String pluar = scan.next();
            x[i] = pluar;
        }
    }
    public void outputpluar(){
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
