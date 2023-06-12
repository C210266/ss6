package ra.Model;

public class Employee {
    int employeeId;
    String employeeName;
    int age;
    String gen;
    int rate;
    int saraly;

    public Employee() {

    }

    public Employee(int employeeId, String employeeName, int age, String gen, int rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
    }

    public void displayData() {
        System.out.println("employeeId: " + employeeId);
        System.out.println("employeeName: " + employeeName);
        System.out.println("age: " + age);
        System.out.println("gen: " + gen);
        System.out.println("rate: " + rate);


    }

    public int calSalary() {
        System.out.println("saraly: " + saraly);
        saraly = rate * 1_300_000;
        return saraly;
    }
}
