public class Neuron {
    public int[] input;
    private int[] w;
    private int b = 0;

    public void configure(int[] w, int shift) {
        this.w = w;
        this.b = shift;
    }

    public int sum() {
        int result = 0;
        for (int i = 0; i < input.length; i++)
            result += w[i] * input[i];
        return result;
    }

    public int hardlim() {
        if (sum() + b > 0)
            return 1;
        else return 0;
    }
}
