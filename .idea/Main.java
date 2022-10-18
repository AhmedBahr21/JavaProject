import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        ArrayList<Student> Studentlist = new ArrayList<>();
        ArrayList<Worker> Workerlist = new ArrayList<>();
        ArrayList<Instructor> Instructorlist = new ArrayList<>();
        ArrayList<Adminstrator> Adminstratorlist = new ArrayList<>();
        ArrayList<Technicians> Technicianslist = new ArrayList<>();
        while (true) {
            System.out.println(
                    "For Student Type 1\n    Worker type 2\n    Instructor type 3\n    Administrator type 4\n    Technicians type 5");
            int x = input.nextInt();

            if (x == 1) {
                while (true) {
                    System.out.println("For Adding type 1\n    Deleting type 2\n    Displaying type 3");
                    int y = input.nextInt();
                    if (y == 1) {
                        Student s = new Student();
                        System.out.print("Name = ");
                        s.setName(input.next());
                        System.out.print("Age = ");
                        s.setAge(input.nextInt());
                        System.out.print("Id = ");
                        s.setId(input.nextLong());
                        System.out.print("Gender = ");
                        s.setgender(input.next());
                        System.out.print("Gpa = ");
                        s.setGpa(input.nextDouble());
                        System.out.print("Level = ");
                        s.setLevel(input.nextInt());
                        System.out.print("Sectin = ");
                        s.setSection(input.next());
                        Studentlist.add(s);
                    } else if (y == 2) {
                        System.out.println("Enter Student Id");
                        long id = input.nextLong();
                        int index = -1;
                        for (int i = 0; i < Studentlist.size(); i++) {
                            if (id == Studentlist.get(i).getId())
                                index = i;
                        }
                        if (index == -1)
                            System.out.println("Id Not Found");
                        else {
                            Studentlist.remove(index);
                            System.out.println("Done");

                        }
                    } else if (y == 3) {
                        System.out.println("Enter Student Id");
                        long id = input.nextLong();
                        int index = -1;
                        for (int i = 0; i < Studentlist.size(); i++) {
                            if (id == Studentlist.get(i).getId())
                                index = i;
                        }
                        if (index == -1)
                            System.out.println("Id Not Found");
                        else
                            System.out.println(Studentlist.get(index).toString());

                    } else if (y < 1 || y > 3)
                        System.out.println("Invalid Choise");
                    System.out.println(
                            "\n\nAre you Continue or Stop For Student? \nFor Continue type 1\n    Stop type 0");
                    int a = input.nextInt();
                    if (a == 0)
                        break;

                }
            } else if (x < 1 || x > 5)
                System.out.println("Invalid Choise");
            else if (x == 2) {

                while (true) {
                    System.out.println("For Adding type 1\n    Deleting type 2\n    Displaying type 3");
                    int y = input.nextInt();
                    if (y == 1) {
                        Worker w = new Worker();
                        System.out.print("Name = ");
                        w.setName(input.next());
                        System.out.print("Age = ");
                        w.setAge(input.nextInt());
                        System.out.print("Id = ");
                        w.setId(input.nextLong());
                        System.out.print("Gender = ");
                        w.setgender(input.next());
                        System.out.print("Job = ");
                        w.setJob(input.next());
                        System.out.print("Number of Floor = ");
                        w.setNoFloor(input.nextInt());
                        System.out.print("Salary = ");
                        w.setsalary(input.nextDouble());
                        System.out.print("Bonus = ");
                        w.setBonus(input.nextDouble());
                        Workerlist.add(w);
                    } else if (y == 2) {
                        System.out.println("Enter Worker Id");
                        long id = input.nextLong();
                        int index = -1;
                        for (int i = 0; i < Workerlist.size(); i++) {
                            if (id == Workerlist.get(i).getId())
                                index = i;
                        }
                        if (index == -1)
                            System.out.println("Id Not Found");
                        else {
                            Workerlist.remove(index);
                            System.out.println("Done");

                        }
                    } else if (y == 3) {
                        System.out.println("Enter Worker Id");
                        long id = input.nextLong();
                        int index = -1;
                        for (int i = 0; i < Workerlist.size(); i++) {
                            if (id == Workerlist.get(i).getId())
                                index = i;
                        }
                        if (index == -1)
                            System.out.println("Id Not Found");
                        else
                            System.out.println(Workerlist.get(index).toString());
                    } else if (y < 1 || y > 3)
                        System.out.println("Invalid Choise");
                    System.out.println("\n\nAre you Continue or Stop For Worker? \nFor Continue type 1\n    Stop type 0");
                    int a = input.nextInt();
                    if (a == 0)
                        break;
                }


            }
            else if (x==3) {
                while (true) {
                    System.out.println("For Adding type 1\n    Deleting type 2\n    Displaying type 3");
                    int y = input.nextInt();
                    if (y == 1) {
                        Instructor i = new Instructor();
                        System.out.print("Name = ");
                        i.setName(input.next());
                        System.out.print("Age = ");
                        i.setAge(input.nextInt());
                        System.out.print("Id = ");
                        i.setId(input.nextLong());
                        System.out.print("Gender = ");
                        i.setgender(input.next());
                        System.out.print("Job = ");
                        i.setJob(input.next());
                        System.out.print("Subject = ");
                        i.setSubject(input.next());
                        System.out.print("Salary = ");
                        i.setsalary(input.nextDouble());
                        System.out.print("Bonus = ");
                        i.setBonus(input.nextDouble());
                        Instructorlist.add(i);
                    } else if (y == 2) {
                        System.out.println("Enter Instructor Id");
                        long id = input.nextLong();
                        int index = -1;
                        for (int i = 0; i < Instructorlist.size(); i++) {
                            if (id == Instructorlist.get(i).getId())
                                index = i;
                        }
                        if (index == -1)
                            System.out.println("Id Not Found");
                        else {
                            Instructorlist.remove(index);
                            System.out.println("Done");

                        }
                    } else if (y == 3) {
                        System.out.println("Enter Instructor Id");
                        long id = input.nextLong();
                        int index = -1;
                        for (int i = 0; i < Instructorlist.size(); i++) {
                            if (id == Instructorlist.get(i).getId())
                                index = i;
                        }
                        if (index == -1)
                            System.out.println("Id Not Found");
                        else
                            System.out.println(Instructorlist.get(index).toString());
                    } else if (y < 1 || y > 3)
                        System.out.println("Invalid Choise");
                    System.out
                            .println("\n\nAre you Continue or Stop For Instructor? \nFor Continue type 1\n    Stop type 0");
                    int a = input.nextInt();
                    if (a == 0)
                        break;
                }



            }
            else if (x==4) {
                while (true) {
                    System.out.println("For Adding type 1\n    Deleting type 2\n    Displaying type 3");
                    int y = input.nextInt();
                    if (y == 1) {
                        Adminstrator a = new Adminstrator();
                        System.out.print("Name = ");
                        a.setName(input.next());
                        System.out.print("Age = ");
                        a.setAge(input.nextInt());
                        System.out.print("Id = ");
                        a.setId(input.nextLong());
                        System.out.print("Gender = ");
                        a.setgender(input.next());
                        System.out.print("Job = ");
                        a.setJob(input.next());
                        System.out.print("Position = ");
                        a.setPosition(input.next());
                        System.out.print("Salary = ");
                        a.setsalary(input.nextDouble());
                        System.out.print("Bonus = ");
                        a.setBonus(input.nextDouble());
                        Adminstratorlist.add(a);
                    } else if (y == 2) {
                        System.out.println("Enter Adminstrator Id");
                        long id = input.nextLong();
                        int index = -1;
                        for (int i = 0; i < Adminstratorlist.size(); i++) {
                            if (id == Adminstratorlist.get(i).getId())
                                index = i;
                        }
                        if (index == -1)
                            System.out.println("Id Not Found");
                        else {
                            Adminstratorlist.remove(index);
                            System.out.println("Done");

                        }
                    } else if (y == 3) {
                        System.out.println("Enter Adminstrator Id");
                        long id = input.nextLong();
                        int index = -1;
                        for (int i = 0; i < Adminstratorlist.size(); i++) {
                            if (id == Adminstratorlist.get(i).getId())
                                index = i;
                        }
                        if (index == -1)
                            System.out.println("Id Not Found");
                        else
                            System.out.println(Adminstratorlist.get(index).toString());
                    } else if (y < 1 || y > 3)
                        System.out.println("Invalid Choise");
                    System.out
                            .println("\n\nAre you Continue or Stop For Adminstrator? \nFor Continue type 1\n    Stop type 0");
                    int a = input.nextInt();
                    if (a == 0)
                        break;
                }
            }


            else if (x==5) {
                while (true) {
                    System.out.println("For Adding type 1\n    Deleting type 2\n    Displaying type 3");
                    int y = input.nextInt();
                    if (y == 1) {
                        Technicians t = new Technicians();
                        System.out.print("Name = ");
                        t.setName(input.next());
                        System.out.print("Age = ");
                        t.setAge(input.nextInt());
                        System.out.print("Id = ");
                        t.setId(input.nextLong());
                        System.out.print("Gender = ");
                        t.setgender(input.next());
                        System.out.print("Job = ");
                        t.setJob(input.next());
                        System.out.print("Number of Lab = ");
                        t.setNoLabs(input.nextInt());
                        System.out.print("Salary = ");
                        t.setsalary(input.nextDouble());
                        System.out.print("Bonus = ");
                        t.setBonus(input.nextDouble());
                        Technicianslist.add(t);
                    } else if (y == 2) {
                        System.out.println("Enter Technicians Id");
                        long id = input.nextLong();
                        int index = -1;
                        for (int i = 0; i < Technicianslist.size(); i++) {
                            if (id == Technicianslist.get(i).getId())
                                index = i;
                        }
                        if (index == -1)
                            System.out.println("Id Not Found");
                        else {
                            Technicianslist.remove(index);
                            System.out.println("Done");

                        }
                    } else if (y == 3) {
                        System.out.println("Enter Technicians Id");
                        long id = input.nextLong();
                        int index = -1;
                        for (int i = 0; i < Technicianslist.size(); i++) {
                            if (id == Technicianslist.get(i).getId())
                                index = i;
                        }
                        if (index == -1)
                            System.out.println("Id Not Found");
                        else
                            System.out.println(Technicianslist.get(index).toString());
                    } else if (y < 1 || y > 3)
                        System.out.println("Invalid Choise");
                    System.out
                            .println("\n\nAre you Continue or Stop For Technicians? \nFor Continue type 1\n    Stop type 0");
                    int a = input.nextInt();
                    if (a == 0)
                        break;
                }
            }

            System.out.println("\n\nAre you Continue or Stop the Program? \nfor continue type 1\n    Stop type 0");
            int b = input.nextInt();
            if (b == 0) {

                FileWriter file = new FileWriter("E:\\ Students.txt");
                FileWriter file2 = new FileWriter("E:\\ Workers.txt");
                FileWriter file3 = new FileWriter("E:\\ Instructor.txt");
                FileWriter file4 = new FileWriter("E:\\ Adminstrator.txt");
                FileWriter file5 = new FileWriter("E:\\ Technicians.txt");

                    for (int j = 0; j < Studentlist.size(); j++) {
                        file.write("Student "+ (j+1) + "\n");
                        file.write(Studentlist.get(j).toString());
                        file.write("\n-----------------------------------------");
                    }
                    file.close();
                    for (int j = 0; j < Workerlist.size(); j++) {
                        file2.write("Workers " + (j + 1)+ "\n");
                        file2.write(Workerlist.get(j).toString());
                        file2.write("\n-----------------------------------------");
                    }
                    file2.close();
                    for (int j = 0; j < Instructorlist.size(); j++) {
                        file3.write("Instructor " + (j + 1)+ "\n");
                        file3.write(Instructorlist.get(j).toString());
                        file3.write("\n-----------------------------------------");
                    }
                    file3.close();
                    for (int j = 0; j < Adminstratorlist.size(); j++) {
                        file4.write("Adminstrator " + (j + 1)+ "\n");
                        file4.write(Adminstratorlist.get(j).toString());
                        file4.write("\n-----------------------------------------");
                    }
                    file4.close();
                    for (int j = 0; j < Technicianslist.size(); j++) {
                        file5.write("Technicians " + (j + 1)+ "\n");
                        file5.write(Technicianslist.get(j).toString());
                        file5.write("-----------------------------------------");
                    }
                    file5.close();
                System.out.println("All Details Stored in file in Partition E ");
                break;
            }
        }

    }
}
