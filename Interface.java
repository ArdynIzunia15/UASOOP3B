import java.util.Scanner;

interface Animal {
    public void fly();
}

class Elang implements Animal {
    public void fly() {
        System.out.println("[INFO] Elang terbang di udara mengintai mangsa");
    }
}

class BurungGagak implements Animal {
    public void fly() {
        System.out.println("[INFO] Gagak terbang dan berkoak");
    }
}

class BurungHantu implements Animal {
    public void fly() {
        System.out.println("[INFO] Burung hantu bertengger dan bersuara Huuu hu hu hu");
    }
}

class PesawatJet implements Animal {
    public void fly() {
        System.out.println("[INFO] Pesawat berada dalam posisi take off");
    }
}

class Helikopter implements Animal {
    public void fly() {
        System.out.println("[INFO] Helikopter terbang mengitari gedung.");
    }
}

public class Interface {
    static Elang elang = new Elang();
    static BurungGagak burungGagak = new BurungGagak();
    static BurungHantu burungHantu = new BurungHantu();
    static PesawatJet pesawatJet = new PesawatJet();
    static Helikopter helikopter = new Helikopter();

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {

        clearScreen();
        System.out.print("1. Elang\n2. Burung Gagak\n3. Burung Hantu\n4. Pesawat Jet\n5. Helikopter\n>> ");
        Scanner input = new Scanner(System.in);
        String option = input.nextLine();
        switch (option) {
            case "1":
                elang.fly();
                break;
            case "2":
                burungGagak.fly();
                break;
            case "3":
                burungHantu.fly();
                break;
            case "4":
                pesawatJet.fly();
                break;
            case "5":
                helikopter.fly();
                break;
            default:
                System.out.println("[INGPO] Salah input :)");
                System.exit(0);
        }
        input.close();
    }
}