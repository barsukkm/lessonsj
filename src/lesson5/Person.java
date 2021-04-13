package lesson5;

public class Person {
    private String name;
    private String post;
    private String email;
    private String phone;
    private int wages;
    private int age;

    public Person(String name, String post, String email, String phone, int wages, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.wages = wages;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
