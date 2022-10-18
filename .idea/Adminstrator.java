
public class Adminstrator extends Employee {
    private String position;

    public Adminstrator() {
    }

    public Adminstrator(String name, long id, int age, String gender, String job, double salary, double bonus,
                        String position) {
        super(name, id, age, gender, job, salary, bonus);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public double newsalary()
    {
        return this.getsalary() + this.getBonus()*1.15;
    }

    @Override
    public String toString() {
        return super.toString() + "\n[position=" + ", newSalary="+ newsalary() +"]";
    }


}
