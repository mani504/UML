import java.util.ArrayList;
import java.util.List;

class Professor{
    private String name;

    public Professor(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department{
    private String name;
    private List<Professor> professors;

    public Department(String name, List<Professor> professors){
        this.name = name;
        this.professors = professors;
    }


    public void showProfessors(){
        for(Professor professor : professors){
            System.out.println(professor.getName());
        }
    }

}


public class Aggregation {

    public static void main(String[] args) {
        Professor p1 = new Professor("Gyan Agarwal");
        Professor p2 = new Professor("Evs wali Ma'am");

        List<Professor> professors = new ArrayList<>();
        professors.add(p1);
        professors.add(p2);


        Department department = new Department("Chemistry", professors);

        department.showProfessors();
    }
}
