package java.practiceTest;
import java.util.*;

class Properties {
    int studentId;
    String studentName;
    static String college = "Nandha";
    HashMap<String, Integer> marks = new HashMap<>();

    public Properties(int studentId, String studentName, HashMap<String, Integer> marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    void printStudentInfo() {
        System.out.println("------ Student Info ------");
        System.out.println("Id: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("College: " + college);

        for (String subject : marks.keySet()) {
            System.out.println(subject + ": " + marks.get(subject));
        }
    }

    void checkStudentPassOrFail() {
        for (int sMark : marks.values()) {
            if (sMark <= 50) {
                System.out.println("Fail");
                return;
            }
        }
        System.out.println("Pass");
    }

    void getStudentPercentage() {
        double total = 0;
        for (int sMark : marks.values()) {
            total += sMark;
        }
        double percentage = total / marks.size();
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        
        HashMap<String, Integer> marks = new HashMap<>();
        
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter subject name: ");
            String subject = sc.nextLine();
            System.out.print("Enter mark for " + subject + ": ");
            int mark = sc.nextInt();
            sc.nextLine(); // consume newline
            marks.put(subject, mark);
        }
        
        Properties student = new Properties(id, name, marks);
        student.printStudentInfo();
        student.checkStudentPassOrFail();
        student.getStudentPercentage();

        sc.close();
    }
}

