package Java_week2;


class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Khyathika", 92.5);

        s1.displayInfo();
    }
}
