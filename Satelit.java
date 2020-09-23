package singletonpatterndemo;
import java.util.Scanner;
public class Satelit {
    String x [];
    Scanner scan = new Scanner(System.in);
    public static Satelit instance = new Satelit();
    public Satelit(){ }
    public static Satelit getInstance(){
        return instance;
    } 
    public void inputsatelit(){
        System.out.print("Masukkan Banyak Data: ");
        int jumlah = scan.nextInt();
        x = new String [jumlah];
        for (int i=0; i<jumlah; i++){
            System.out.print("Masukkan Satelit Ke - " + (i+1) + " : ");
            String sat = scan.next();
            x[i] = sat;
        }
    }
    public void outputsatelit(){
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
