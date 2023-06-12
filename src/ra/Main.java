package ra;

import ra.Config.Config;
import ra.Controller.StudentController;
import ra.Model.Fan;
import ra.Model.StopWatch;
import ra.Model.Student;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static StudentController studentController = new StudentController();

    public static void main(String[] args) {
//        Bai 6
//        Employee emp1 = new Employee(1, "Huan so xo", 36, "Nam", 4_3);
//        Employee emp2 = new Employee(2, "Linh", 40, "Nam", 4_1);
//        Employee emp3 = new Employee(3, "Binh lo2", 12, "Nam", 4_2);
//        Employee emp4 = new Employee(4, "Duy nen", 33, "Nam", 4_3);
//        Employee emp5 = new Employee(5, "Huy Ielts", 44, "Nam", 4_4);
//
//        int salary1 = emp1.calSalary();
//        emp1.displayData();
//        System.out.println(salary1);


//        Bai5
//        int choice;
//        while (true) {
//            System.out.println("=================MENU=================");
//            System.out.println("1. Hiển thị toàn bộ hoc sinh");
//            System.out.println("2. Thêm mới hoc sinh");
//            System.out.println("3. Cập nhập thông tin hoc sinh");
//            System.out.println("4. Xóa hoc sinh");
//            System.out.println("5. Thoát");
//            System.out.println("Hãy nhập vào lựa chọn của bạn");
//            choice = Config.scanner().nextInt();
//            switch (choice) {
//                case 1:
//                    displayListStudent();
//                    break;
//                case 2:
//                    createNewStudent();
//                    break;
//                case 3:
//                    updateStudent();
//                    break;
//                case 4:
//                    deleteStudent();
//                    break;
//                case 5 :
//                    System.exit(0);
//            }
//        }

//        Bai4
//        Fan fan1 = new Fan(3,true,10,"yellow");
//        System.out.println(fan1);

//        Bai3
        int[] array = generateRandomArray(100000);

        // Đo thời gian thực thi của thuật toán sắp xếp chọn
        long startTime = System.currentTimeMillis();
        selectionSort(array);
        long endTime = System.currentTimeMillis();

        // In ra thời gian thực thi
        System.out.println("Thời gian thực thi: " + (endTime - startTime) + "ms");
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    // Phương thức tạo mảng gồm n số nguyên ngẫu nhiên
    public static int[] generateRandomArray(int n) {
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public static void displayListStudent() {
        if (studentController.getSize() == 0) {
            System.err.println("Danh sách hoc sinh trống");
            return;
        }
        Student[] list = studentController.getAll();
        System.out.println("Danh sách hoc sinh");
        for (Student p : list) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }

    public static void createNewStudent() {
        Student newStudent = new Student();
        int id = getNewId();
        newStudent.setMaHS(id);
        System.out.println("Id " + id);
        System.out.println("Nhập vào tên :");
        newStudent.setStudentNam(Config.scanner().nextLine());
        System.out.println("Nhập vào tuoi");
        newStudent.setAge(Config.scanner().nextInt());
        System.out.println("Nhập vào gen");
        newStudent.setGen(Config.scanner().nextLine());
        System.out.println("Nhập vào address");
        newStudent.setAddress(Config.scanner().nextLine());
        System.out.println("Nhập vào phone");
        newStudent.setPhone(Config.scanner().nextLine());

        boolean check = studentController.create(newStudent);
        if (check) {
            System.out.println("Thêm mới thành công");
        }

    }

    public static void updateStudent() {
//        Student[] list = studentController.getAll();
//        System.out.println("Nhập vị tri product mà bạn muốn cập nhật");
//        int index = Config.scanner().nextInt();
//        Student student = studentController.findById(index);
//        if (student == null) {
//            System.err.println("student chưa co ");
//
//        } else {
//            System.out.println("Nhập thành phần mà bạn muốn sua");
//
//            System.out.println("1 . Thay doi ten");
//            System.out.println("2 . Thay doi tuoi");
//            System.out.println("3 . Thay doi gen");
//            System.out.println("4 . Thay doi address");
//            System.out.println("5 . Thay doi phone");
//            int choice = Config.scanner().nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("1 . Nhap ten");
//                    student.setStudentNam(Config.scanner().nextLine());
//                    break;
//                case 2:
//                    System.out.println("Nhập vào tuoi");
//                    student.setAge(Config.scanner().nextInt());
//                    break;
//                case 3:
//                    System.out.println("1 . Nhap gen");
//                    student.setGen(Config.scanner().nextLine());
//                    break;
//                case 4:
//                    System.out.println("1 . Nhap address");
//                    student.setAddress(Config.scanner().nextLine());
//                    break;
//                case 5:
//                    System.out.println("1 . Nhap phone");
//                    student.setPhone(Config.scanner().nextLine());
//                    break;
//            }
//            System.out.println("Thay doi thanh cong");
//        }


        System.out.println("Nhap vao id cua san pham can sua");
        int id = Config.scanner().nextInt();
        Student student = studentController.findById(id);
        if(student != null){
            System.out.println("Id = " + student.getMaHS());
            System.out.println("Nhap vao ten moi : ten cu la " + student.getStudentNam() );

        }
    }

    public static void deleteStudent() {
        System.out.println("Nhap vi tri ban muon xoa");
        int index = Config.scanner().nextInt();
        studentController.delete(index);
    }

    public static int getNewId() {
        Student[] list = studentController.getAll();
        int Idmax = 0;
        for (Student p : list) {
            if (p == null) {
                continue;
            }
            if (Idmax < p.getMaHS()) {
                Idmax = p.getMaHS();
            }
        }
        return Idmax + 1;
    }

}
