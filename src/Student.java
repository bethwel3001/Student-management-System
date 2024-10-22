public class Student {

//    Fields (Attributes)

    private String name;
    private int id;
    private double grade;


//    This is a constructor that initializes a new Student object.
//    It takes three parameters (name, id, and grade) and assigns them to the instance variables.

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }


//    Getter and Setter Methods
//    getter
    public String getName() {
        return name;
    }

//    setter
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    //    setter
    public void setId(int id) {
        this.id = id;
    }

    public double getGrade() {
        return grade;
    }
    //    setter
    public void setGrade(double grade) {
        this.grade = grade;
    }

//    Overriding toString Method
//    This method is overridden from the Object class.
//    It provides a string representation of the Student object,
//    making it easier to display the object's state (ID, name, and grade) when printed or logged.
    @Override
    public String toString(){
        return "Student [ID: "+ id + ", Name: " + name + ", Grade: " + grade + "]";
    }
}