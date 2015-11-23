package school;

public class Student {
    private String name;
    private String secondName;

    public Student() {
    }

    public Student(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "student: " + getName()+" "+getSecondName();
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        if (student.getName() == )
    }
}
