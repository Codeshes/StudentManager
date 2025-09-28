// Encapsulation
class Student {
    private int ID;
    private String name;
    private String course;
    private int age;
    private int gradeLevel;

    // Constructors
    public Student(int ID, String name, String course, int age, int gradeLevel) {
        this.ID = ID;
        this.name = name;
        this.course = course;
        this.age = age;
        this.gradeLevel = gradeLevel;
    }
    // Getters
    public int getID() { return ID; }
    public String getName() { return name; }
    public String getCourse() { return course; }
    public int getAge() { return age; }
    public int getGradeLevel() { return gradeLevel; }

    public String toString() {
        return " Student Name: " + name + " | Student ID: " + ID + " | COURSE: " + course + " | AGE: " + age + " | GRADE-LEVEL: " + gradeLevel ;
    }
}