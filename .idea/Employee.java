
public abstract class Employee extends Person {
    private String job;
    private double salary;
    private double bonus;
    public Employee() {

    }


    public Employee(String name, long id, int age, String gender, String job, double salary,double bonus) {
        super(name, id, age, gender);
        this.job = job;
        this.salary = salary;
        this.bonus = bonus;
    }


    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }

    public void setsalary(double salary) {
        while(true) {
            if (salary > 0) {
                this.salary = salary;
                break;
            }
            else{
                System.out.println("Enter the Salary Grater than 0");
                salary = input.nextDouble();
            }
        }
    }
    public double getsalary() {
        return salary;
    }


    public double getBonus() {
        return bonus;
    }


    public void setBonus(double bonus) {
        while(true) {
            if(bonus >= 0) {
                this.bonus = bonus;
                break;
            }
            else{
                System.out.println("Enter Bonus Grater than or Equal 0");
                bonus = input.nextDouble();
            }
        }
    }


    public abstract double newsalary();


    @Override
    public String toString() {
        return super.toString()+ "\n[job=" + job + ", salary=" + salary + ", bonus=" + bonus + "]";
    }




}
