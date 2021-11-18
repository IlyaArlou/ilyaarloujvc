public class Cat extends Animal{
    private static final int CAT_MAX_RUN = 200;
    private static int counter;

    public Cat(String name) {
        super("Cat", name, CAT_MAX_RUN, 0);
        counter++;
    }

    @Override
    public boolean swim(int distance) {
        System.out.println(getName() + " can't swim!");
        return false;
    }

    public static int getCounter() {
        return counter;
    }
}
