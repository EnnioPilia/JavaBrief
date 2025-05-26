import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Bonjour {
    public static void main(String[] args){
        System.out.println("hello wolrd");
    }
}

 class NombresPairs {
 public static void main(String[] args) {
    for(int i = 1; i <= 20; i++)
        if(i % 2 == 0){
         System.out.println(i);
        }
    }
}


 class multiplicator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Entrez votre nombre : ");
    int number = scanner.nextInt();
        for(int i = 1; i <= 10; i++){
           System.out.println(number + " x " + i + " = " + (number * i));
        }
        scanner.close();
    }
}

 class Calculatrice {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
    System.out.print("Entrez le premier nombre : ");
        int a = scanner.nextInt();
    System.out.print("Entrez le deuxieme nombre : ");
        int b = scanner.nextInt();

    System.out.println(a + b);
    System.out.println(a - b );
    System.out.println(a * b);
    System.out.println(a / b);

      scanner.close();
    }
}





 class MemoryLeakSimulator {
    private static List<byte[]> memoryLeakList = new ArrayList<>();

    public static void main(String[] args) {
        simulateMemoryLeak();
    }

    public static void simulateMemoryLeak() {
        for (int i = 0; i < 1000; i++) {
            byte[] block = new byte[1024 * 1024]; // 1 MB
            memoryLeakList.add(block); // La référence est conservée => fuite mémoire
            System.out.println("Allocated " + (i + 1) + " MB");

            try {
                Thread.sleep(100); // Petite pause pour observer le comportement
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


 class NoLeakSimulator {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            byte[] block = new byte[1024 * 1024]; // 1 MB
            // Pas de stockage => aucune référence conservée
            System.out.println("Allocated " + (i + 1) + " MB");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

