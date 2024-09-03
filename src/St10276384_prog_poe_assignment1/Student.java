
package St10276384_prog_poe_assignment1;
//----------------------------------------------------------Start of code----------------------------//

// Student class
public class Student {
    private String id;
    private String name;
    private int age;
    private String email;
    private String course;
// Constructor for Student class
    public Student(String id, String name, int age, String email, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }
// toString method to return the student id, name, age, email and course
    @Override
    public String toString() {
        return "STUDENT ID: " + id + "\nSTUDENT NAME: " + name + "\nSTUDENT AGE: " + age +
                "\nSTUDENT EMAIL: " + email + "\nSTUDENT COURSE: " + course + "\n";
    }
}

//----------------------------------------------------------End of code----------------------------//