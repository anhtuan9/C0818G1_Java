package person;

public class Person {
    private String name , address;
    public Person(){
        this.name = "null";
        this.address= "null";
    }
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String setAddress(String address){
        return this.address = address;
    }
    public String toString(){
        return "name " + name + "\n"
                +"address " + address + "\n";
    }
}
