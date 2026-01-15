package LW_05.Q2;

public class UniversityManagementSystem {

    public static void main(String[] args) {

        Department seDept = new Department("Software Engineering");

        Degree csDegree = new Degree("Computer Science", 66);

        Course oop = new Course("Object-Oriented Programming", "Mandatory", 66);

        Lecturer lecturer1 = new Lecturer("Dr. Perara", "Senior Lecturer", seDept);
        seDept.addLecturer(lecturer1);
        seDept.appointDepartmentHead(lecturer1);

        lecturer1.addCourse(oop);
        oop.addLecturerInCharge(lecturer1);
        oop.addDegreeBelongsTo(csDegree);
        csDegree.offerCourse(oop);

        Student student1 = new Student("Kamala", "CS/2022/059", "Year 2");
        student1.registerDegree(csDegree);
        student1.enrollCourse(oop);

        System.out.println("\n--- Lecturer Info ---");
        lecturer1.displayInfo();

        System.out.println("\n--- Student Info ---");
        student1.displayInfo();

        System.out.println("\n--- Department Info ---");
        seDept.displayInfo();
        seDept.displayDepartmentHeadInfo();

        System.out.println("\n--- Course Info ---");
        oop.displayInfo();

        System.out.println("\n--- Degree Info ---");
        csDegree.displayInfo();
    }
}

