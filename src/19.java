public class SampleClass {
    private int count = 0;

    public void incrementCounter() {
        if (count < 10) {
            count++;
        }
    }

    public static void main(String[] args) {
        new SampleClass().incrementCounter();
    }
}
