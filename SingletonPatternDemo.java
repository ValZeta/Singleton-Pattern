package singletonpatterndemo;
import java.util.Scanner;
public class SingletonPatternDemo {    
    public static void main(String[] args) {
        for(String b = "y"; b.equals("y") || b.equals("Y");){
            Satelit object = Satelit.getInstance();
            PlanetLuar object2 = PlanetLuar.getInstance();
            PlanetDalam object3 = PlanetDalam.getInstance();
            System.out.println("====Pendataan Objek Tata Surya====");
            System.out.println("==================================");
            System.out.println("1. Satelit");
            System.out.println("2. Planet Luar");
            System.out.println("3. Planet Dalam");
            System.out.println("4. Tampilkan Data");
            System.out.println("==================================");
            Scanner scan = new Scanner(System.in);
            System.out.print("Masukkan Pilihan: ");
            int pil = scan.nextInt();
            switch (pil){
                case 1:
                    System.out.println("Satelit");
                    object.inputsatelit();
                    break;
                case 2:
                    System.out.println("Planet Luar");
                    object2.inputpluar();
                    break;
                case 3:
                    System.out.println("Planet Dalam");
                    object3.inputpdalam();
                    break;
                case 4:
                    System.out.println("==========SEMUA DATA===========");
                    System.out.println("===============================");
                    System.out.println("1. Satelit");
                    object.outputsatelit();
                    System.out.println("===============================");
                    System.out.println("2. Planet Luar");
                    object2.outputpluar();
                    System.out.println("===============================");
                    System.out.println("3. Planet Dalam");
                    object3.outputpdalam();
                    break;
                default:
                    System.out.println("MENU TIDAK TERSEDIA");
                    break;
            }
            System.out.println("===============================");
            System.out.print("Mengulang? (Y/N): ");
            b = scan.next();
        }
    }
}
