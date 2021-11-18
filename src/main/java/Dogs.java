public class Dogs extends Animal{
    private static int counter;

    Dogs(String name, int maxRun, int maxSwim) {
        super("Dog", name, maxRun, maxSwim);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
