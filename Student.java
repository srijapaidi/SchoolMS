package school.management.system;

public class Student {
     /*
     * access  modifiers
     * private-> private members are only accessible with in the class they are define
     * */
    private int id;
    private String name;
    private int grade;
    private int feePaid;
    private int feeTotal;

    /**
    * Constructor is same name as a class name used to intialize the objects
     *
     * to create a new student to intializing
     *
     * id-> id for the student - unique
     *
     * name -> name of the student
     *
     * grade -> grade of the student
    * */

    public Student(int id, String name, int grade){
        this.feePaid=0;
        this.feePaid=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;

    }
          //set is used to update the student grade
          // grade is new grade of the student

    /**
     * keep adding the fees to fees paid field
     *add the fees to the fees paid
     * @param grade  fees the fees that  student pays
     */
    public void setGrade( int grade){
        this.grade=grade;
    }

    public void payFees(int fees){
        feePaid+=fees;
        School.updateTotalMoneyEarned(feePaid);

    }

    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public int getFeePaid() {
        return feePaid;
    }

    public int getFeeTotal() {
        return feeTotal;
    }
    public  int remaingFees(){
        return feeTotal - feePaid;
    }

}
