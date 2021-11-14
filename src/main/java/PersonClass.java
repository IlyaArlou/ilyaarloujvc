import java.util.Arrays;

public class PersonClass {
    public static void main(String[] args) {
        Person[] Persons = {
                new Person("Ilya A. S.", "Salesman", "ilya@mail.com", "+375445776180", 60_000, 30),
                new Person("Kristina A. A.", "Teacher", "kristina@mail.com", "+375297955347", 110_000, 39),
                new Person("Denis I. B.", "Plumber", "denis@mail.com", "+375335632973", 140_000, 40),
                new Person("Aleksey G. I.", "Builder", "aleksey@mail.com", "+375296747933", 80_000, 61),
                new Person("Diana O. G.", "Doctor", "diana@mail.com", "+375445617343", 100_000, 43),
        };
        for (Person person : Arrays.asList(Persons)) {
            if (person.getAge() > 40) person.print();
        }
    }
}
