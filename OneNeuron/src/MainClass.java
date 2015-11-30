import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Введите вектор весов в виде {a; b; c}");
        Scanner scan = new Scanner(System.in);
        String respond = scan.nextLine();
        String[] parsed = respond.replaceAll("[{,}, ]", "").split(";");
        int[] w = new int[parsed.length];
        for (int i = 0; i < parsed.length; i++)
            w[i] = Integer.parseInt(parsed[i]);
        System.out.println("Введите величину сдвига");
        int shift = scan.nextInt();
        Neuron n = new Neuron();
        n.configure(w, shift);
        respond = "";
        scan.nextLine();
        while (!respond.equals("stop")) {
            System.out.println("Введите входной вектор из " + w.length + " элементов");
            respond = scan.nextLine();
            if (respond.equals("stop"))
                break;
            parsed = respond.replaceAll("[{,}, ]", "").split(";");
            int[] p = new int[parsed.length];
            for (int i = 0; i < parsed.length; i++)
                p[i] = Integer.parseInt(parsed[i]);
            n.input = p;
            System.out.println(n.hardlim());
        }

    }
}
