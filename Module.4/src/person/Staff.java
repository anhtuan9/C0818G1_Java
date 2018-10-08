package person;

public class Staff extends Person {
    String school;
    double pay;

    public Staff(String school, double pay, String name, String address) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }
    @Override
    public String toString(){
        return  "Staff" + "\n"
                +"name " + getName() + "\n"
                +"address " + getAddress() + "\n"
                +"school " + school
                +"pay " + pay;
    }
}
