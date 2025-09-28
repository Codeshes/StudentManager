import java.util.ArrayList;

class Studentmanager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added Successfully");
    }

    public void displayStudent() {
        if (students.isEmpty()) {
            System.out.println("There are no students stored");
        } else {
            System.out.println("\n======== Student List ========");
            for (int i = 0; i < students.size(); i++) {
                Student s = students.get(i);
                System.out.println((i + 1) + ". " + s);
            }
        }
    }

    public void removeStudent(int index) {
        if (index >= 0 && index < students.size()) {
            students.remove(index);
            System.out.println("Student remove Succesfully: " + index);
        } else {
            System.out.println("There are no student to remove.");
        }
    }

    public void removeStudentById(int id) {
        boolean removed = students.removeIf(student -> student.getID() == id);
        if (removed) {
            System.out.println("Student removed ID: " + id + " Successfully");
        } else {
            System.out.println("Student ID is not found " + id);
        }
    }

    public void searchByName(String keyword) {
        boolean isFound = false;
        for (Student s : students) {
            if (s.getName().contains(keyword)) {
                System.out.println("Found: " + s);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Student not found: " + keyword);
        }
    }
}