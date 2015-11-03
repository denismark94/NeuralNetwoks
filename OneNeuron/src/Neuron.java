/**
 * Created by markindi on 03.11.2015.
 */
public class Neuron {
    public int[] w;
    public int b;

    public Neuron(int[] w, int b) {
        this.w = w;
        this.b = b;
    }

    public int sum(int[] p) {
        int sum = 0;
        for (int i = 0; i < w.length; i++)
            sum += w[i] * p[i];
        for (int i = w.length; i < p.length; i++)
            sum += p[i];
        return sum;
    }

    public int hardlim(int[]p) {
        if (sum(p)+ b >= 0)
            return 1;
        else return 0;
    }
}
