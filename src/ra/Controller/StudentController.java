package ra.Controller;

import ra.Model.Student;
import ra.Service.StudentService;

public class StudentController {
    private StudentService studentService = new StudentService();


    public Student[] getAll() {
        return studentService.getListStudent();
    }

    public boolean create(Student p) {
        return studentService.create(p);
    }

    public Student findById(int id) {
        return studentService.findById(id);
    }

    public void update(Student p) {
        studentService.update(p);
    }

    public void delete(int id) {
        studentService.delete(id);

    }

    public int getSize() {
        return studentService.getSize();
    }


}
