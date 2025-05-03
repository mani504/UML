
class Teacher{
    private String name;

    public Teacher(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void teaching(Student student) {
        System.out.println(name + " is Teaching " + student.getName());
    }

}

class Student{
    String name;

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}




public class Association {

    public static void main(String[] args) {
        Teacher UKLal = new Teacher("U.K Lal");
        Student manish = new Student("Manish");
        UKLal.teaching(manish);
    }
}
