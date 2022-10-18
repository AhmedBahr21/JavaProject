
public class Worker extends Employee  {
    private int noFloor;
    public Worker() {
    }


    public Worker(String name, long id, int age, String gender, String job, double salary, double bonus, int noFloor) {
        super(name, id, age, gender, job, salary, bonus);
        this.noFloor = noFloor;
    }


    public int getNoFloor() {
        return noFloor;
    }
    public void setNoFloor(int noFloor) {
        while (true) {
            if (noFloor >= 0) {
                this.noFloor = noFloor;
                break;
            }
            else{
                System.out.println("Enter Number of Floor Grater than or Equal 0");
                noFloor = input.nextInt();
            }
        }
    }


    @Override
    public double newsalary()
    {
        return this.getsalary() + this.getBonus()*1.1;
    }


    @Override
    public String toString() {
        return super.toString()+"\n[noFloor=" + noFloor + ", newSalary="+ newsalary() +"]";
    }



}
