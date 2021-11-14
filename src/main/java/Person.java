public class Person {
    public String name;
    public String position;
    public String mail;
    public String phone;
    public int salary;
    public int age;

    public Person(String name, String position, String mail, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.printf("Person %s, pos: %s, email: %s, phone: %s, salary: %d, age: %d\n", this.name, this.position, this.mail, this.phone, this.salary, this.age);
    }



    public int getAge() {
        return this.age;
    }
}
