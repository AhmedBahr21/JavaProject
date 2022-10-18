
public class Technicians extends Employee {
    private int noLabs;

    public Technicians() {
    }

    public Technicians(String name, long id, int age, String gender, String job, double salary, double bonus,
                       int noLabs) {
        super(name, id, age, gender, job, salary, bonus);
        this.noLabs = noLabs;
    }

    public int getNoLabs() {
        return noLabs;
    }

    public void setNoLabs(int noLabs) {
        while(true) {
           if (noLabs > 0) {
               this.noLabs = noLabs;
               break;
           }
           else {
               System.out.println("Enter number of Labs Grater than or Equal 1");
               noLabs = input.nextInt();
           }
        }
    }

    @Override
    public double newsalary()
    {
        return this.getsalary() + this.getBonus()*1.12;
    }

    @Override
    public String toString() {
        return super.toString()+"\n[noLabs=" + ", newSalary="+ newsalary() +"]";
    }


}
