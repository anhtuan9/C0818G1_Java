package person;

public class test {
    public static void main(String[] args) {
        Person a = new Person("tuan","hanoi");
        System.out.println(a.toString());
        Student b = new Student("java",18,22,"son","haiphong");
        System.out.println(b.toString());
        Staff c = new Staff("code Gym",5000000,"khanh","conhue");
        System.out.println(c.toString());
    }
}
