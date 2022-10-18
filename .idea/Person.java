import java.util.Scanner;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Person {
    private String name;
    private long id;
    private int age;
    private String gender;

    Scanner input = new Scanner(System.in);
    public Person() {

    }
    public Person(String name, long id, int age, String gender) {
        super();
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        while (true) {
            if (age > 0) {
                this.age = age;
                break;
            }
            else
            {
                System.out.println("Enter Age Grater than 0");
                age= input.nextInt();
            }
        }


    }
    public String getgender() {
        return gender;
    }
    public void setgender(String gender) {
        while (true) {
            if (gender.equals("male") || gender.equals("female")) {
                this.gender = gender;
                break;
            }
            else
            {
                System.out.println("Write male or female with Small Letters We Don't Support gays or lesbians We're Muslims");
                gender = input.next();
            }
        }

    }
    @Override
    public String toString() {
        return "[name=" + name + ", id=" + id + ", age=" + age + ", gender=" + gender + "]";
    }



}
