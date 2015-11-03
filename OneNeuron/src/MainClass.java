import java.util.Scanner;

/**
 * Created by markindi on 03.11.2015.
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите вектор весов в виде {a;b;c}");
        String respond = scan.nextLine();
        String[] raw = respond.replaceAll("[{, ,}]", "").split(";");
        int[] w = new int[raw.length];
        for (int i = 0; i < raw.length; i++)
            w[i] = Integer.parseInt(raw[i]);
        System.out.print("Введите величину сдвига\nn = ");
        int b = scan.nextInt();
        Neuron a = new Neuron(w,b);
        int[]p;
        scan.nextLine();

        while (!respond.contains("stop")) {
            System.out.println("Введите входной вектор в виде {a;b;c} либо stop для выхода");
            if (respond.contains("stop"))
                break;
            respond = scan.nextLine();
            raw = respond.replaceAll("[{, ,}]", "").split(";");
            p = new int[raw.length];
            for (int i = 0; i < p.length; i++)
                p[i] = Integer.parseInt(raw[i]);
            System.out.println(a.hardlim(p));
        }


    }
}
