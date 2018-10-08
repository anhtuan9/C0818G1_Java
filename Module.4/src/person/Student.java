package person;

public class Student extends Person {
    String program;
    double fee;
    int year;
    public Student(String program, double fee, int year,String name , String address){
        super(name, address);
        this.program = program;
        this.fee= fee;
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public int getYear() {
        return year;
    }

    public String getProgram() {
        return program;
    }
    @Override
    public String toString(){
        return  "student" + "\n"
                +"name " + getName() + "\n"
                +"address " + getAddress() + "\n"
                +"program " + program + "\n"
                +"fee " + fee
                +"year " + year;
    }
}
