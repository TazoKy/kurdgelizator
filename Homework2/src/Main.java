
import java.util.*;
import edu.ISU.Student;
import edu.University;

public class Main {
    public static void main(String[] args) {
        University univ1 = new University("the Ilia State University");
        University univ2 = new University("MIT");

        univ1.addAStudent("Giogi", 87.0);
        univ1.addAStudent("Mariam", 93.2);
        univ1.addAStudent("Peter", 65.2);
        univ1.addAStudent("Saba", 73.4);
        univ1.addAStudent("Xman", 57.3);
        System.out.println("---------------------------------");
        univ1.getStudentInfo();

        univ2.addAStudent("John", 97.2);
        univ2.addAStudent("Grace", 88.3);
        univ2.addAStudent("Sam", 67.1);
        System.out.println("---------------------------------");
        univ2.getStudentInfo();

        System.out.println("\n\n");
        univ1.removeStudent(2);
        univ1.removeStudent(2);
        System.out.println("----------------Update-----------------");
        univ1.getStudentInfo();



    }
}