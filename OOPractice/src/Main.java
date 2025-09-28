import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Studentmanager manager = new Studentmanager();

        int choice;

        do {
            System.out.println("1. Add Student");
            System.out.println("2. Display Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Remove Student by ID");
            System.out.println("5. Search Student");
            System.out.println("6. EXIT");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter student ID");
                    int ID = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter student name");
                    String name = sc.nextLine();
                    System.out.println("Enter student Course");
                    String course = sc.nextLine();
                    System.out.println("Enter student age");
                    int age = sc.nextInt();
                    System.out.println("Enter student Grade level");
                    int gradeLevel = sc.nextInt();
                    manager.addStudent(new Student(ID, name, course, age, gradeLevel));
                    break;
                case 2:
                    manager.displayStudent();
                    System.out.println("=============================");
                    break;
                case 3:
                    manager.displayStudent();
                    System.out.println("Enter an number to remove the student");
                    int indexNumber = sc.nextInt() - 1;
                    sc.nextLine();
                    manager.removeStudent(indexNumber);
                    break;
                case 4:
                    manager.displayStudent();
                    System.out.println("Enter an student ID to remove");
                    int studentId = sc.nextInt();
                    sc.nextLine();
                    manager.removeStudentById(studentId);
                    break;
                case 5:
                    System.out.print("Search Student: ");
                    String searchByKeyword = sc.nextLine();
                    manager.searchByName(searchByKeyword);
                    break;
                case 6:
                    System.out.print("Exiting");
                    for (int i = 0; i < 6; i++) {
                        System.out.println(".");
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            System.exit(2);
                        }
                    }
            }
        } while (choice != 6);

    }
}