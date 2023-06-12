package ra.Service;

import ra.Model.Student;

public class StudentService {
    private Student[] listStudent = new Student[100];

    private int size = 0;

    public void init() {
        Student s1 = new Student(1, "Huan", 12, "Nam", "Ninh Binh", "123");
        Student s2 = new Student(2, "Duy", 13, "Nam", "Ha Tinh", "465");
        Student s3 = new Student(3, "Binh", 14, "Nam", "Ha Noi", "789");
        listStudent[0] = s1;
        listStudent[1] = s2;
        listStudent[2] = s3;
    }

    public StudentService() {
        init();
        this.size = 3;
    }

    public Student[] getListStudent() {
        return listStudent;
    }

    public boolean create(Student student) {
        if (size > 100) {
            System.err.println("danh sách đã đầy, không thể thêm mới sản phẩm");
            return false;
        }
        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i] == null) {
                listStudent[i] = student;
                size++;
                break;
            }
        }
        return true;
    }

    public Student findById(int id) {
        for (Student p : listStudent) {
            if (p == null) {
                continue;
            }
            if (p.getMaHS() == id) {
                return p;
            }
        }
        return null;
    }

    public void update(Student student) {
        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i].getMaHS() == student.getMaHS()) {
                listStudent[i] = student;
                break;
            }
        }
    }

    public void delete(int id) {
        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i].getMaHS() == id) {
                listStudent[i] = null;
                size--;
                break;
            }
        }

    }

    public int getSize() {
        return this.size;
    }
}
