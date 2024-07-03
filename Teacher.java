package school.management.system;

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private  int salarEarned;


    /**
     * create new teacher Object
     *
     * @param id -> id for the Teacher
     *
     * @param name-> name of the Teacher
     * @param salary -> salary of the Teacher
     */

    public Teacher(int id, String name,int salary,int salarEarned){

        this.id=id;
        this.name= name;
        this.salary=salary;
        this.salarEarned=0;
    }

    /**
     *
     * @return the id
     */

    public int getId(){
        return id;

    }

    /**
     *
     * @return the name of the teacher
     */

    public String getName(){
        return  name;

    }

    /**
     *
     * @return the salary of the student
     */

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void reciveSalary(int salary){
        salarEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }
}
