
public class Student extends Person {
    private double gpa;
    private int level;
    private String section;


    public Student(String name, long id, int age, String gender, double gpa, int level, String section) {
        super(name, id, age, gender);
        this.gpa = gpa;
        this.level = level;
        this.section = section;
    }
    public Student() {
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        while (true) {
            if (gpa >= 0 && gpa <=4) {
                this.gpa = gpa;
                break;
            }
            else {
                System.out.println("Enter Gpa from 0 to 4");
                gpa = input.nextDouble();
            }
        }
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        while (true) {
            if (level >0 && level <=4) {
                this.level = level;
                break;
            }
            else {
                System.out.println("Enter the Level from 1 to 4");
                level = input.nextInt();
            }
        }
    }
    public String getSection() {
        return section;
    }
    public void setSection(String section) {
        this.section = section;
    }
    @Override
    public String toString() {
        return super.toString() +"\n[gpa=" + gpa + ", level=" + level + ", section=" + section + "]";
    }


}
