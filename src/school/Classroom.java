package school;


import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private List <Student> students;

    public Classroom() {

        students = new ArrayList<>();
        enter(new Student("Dmytro Tkachenko","Tkachenko"));
        enter(new Student("Pavlo Gusko","Gusko"));
        enter(new Student("Olena Tixo","Tixo"));

    }

    private void enter(Student student){
        students.add(student);
    }

    public void leave(){
        for (int i = students.size() - 1; i >= 0; i--) {
            students.remove(i);
        }

    }

    public void getStudentCount(){
        System.out.println("Count of students: "+students.size());
    }

    public boolean isPresent(String name, String secondName){

        boolean result = false;
        Student student;
        for (int i = 0; i < students.size() - 1 ; i++) {
            student = students.get(i);
            if (student.getName().toUpperCase().equals(name.toUpperCase()) &&
                student.getSecondName().toUpperCase().equals(secondName.toUpperCase())){
                result = true;
            }
        }

        return result;
    }

    public void printStudentInfo(){

        for (int i = 0; i < students.size() - 1; i++) {
            Student student = students.get(i);
            System.out.println(student.getName());
        }
    }

    public String getStudents(int idx){

        try {
            return students.get(idx).getName();
        }catch (IndexOutOfBoundsException e){
            return "no found student with idx "+idx+ " at the list";
        }

    }


}
