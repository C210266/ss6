package ra.Model;

public class Student {
    int maHS;
    String studentNam;
    int age;
    String gen;
    String address;
    String phone;

    public Student() {

    }

    public Student(int maHS, String studentNam, int age, String gen, String address, String phone) {
        this.maHS = maHS;
        this.studentNam = studentNam;
        this.age = age;
        this.gen = gen;
        this.address = address;
        this.phone = phone;
    }

    public void displayData() {
        System.out.println("maHS: " + maHS);
        System.out.println("studentNam: " + studentNam);
        System.out.println("age: " + age);
        System.out.println("gen: " + gen);
        System.out.println("address: " + address);
        System.out.println("phone: " + phone);


    }

    public int getMaHS() {
        return maHS;
    }

    public void setMaHS(int maHS) {
        this.maHS = maHS;
    }

    public String getStudentNam() {
        return studentNam;
    }

    public void setStudentNam(String studentNam) {
        this.studentNam = studentNam;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "maHS=" + maHS +
                ", studentNam='" + studentNam + '\'' +
                ", age=" + age +
                ", gen='" + gen + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
