public class Marathon {
    public static void main(String[] args){

    Animal[] animals = {
        new Cat("Tom"),
        new Cat("Simba"),
        new Dogs("Barbos", 500, 10),
        new Dogs("Tyzik", 500, 10),
};

        for (Animal a : animals) {
        a.run(100);
        a.swim(5);
        a.run(250);
        a.swim(10);

    }
}
}
