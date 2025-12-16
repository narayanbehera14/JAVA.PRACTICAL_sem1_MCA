class Student {
    int rollNumber;
    String name;
    float marks;

    void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNumber = 1;
        s1.name = "Narayan";
        s1.marks = 88.5f;
        s1.display();
    }
}
