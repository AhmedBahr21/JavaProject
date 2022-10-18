
public class Instructor extends Employee  {

    private String subject;

    public Instructor() {

    }

    public Instructor(String name, long id, int age, String gender, String job, double salary, double bonus,
                      String subject) {
        super(name, id, age, gender, job, salary, bonus);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public double newsalary()
    {
        return this.getsalary() + this.getBonus()*1.2;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n[subject=" + subject + ", newSalary="+ newsalary() +"]";
    }

}
