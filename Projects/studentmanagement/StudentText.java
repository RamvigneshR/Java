package studentmanagement;

import java.util.*;

public class StudentText {

    public static void main(String[] args) {
        
        ArrayList<Student> list = new ArrayList<Student>();

        while(true)
        {
            System.out.println("\nWelcome to Student Management System");
            System.out.println("1.Add Student Details");
            System.out.println("2.Delete Student Details");
            System.out.println("3.Modify Student Details");
            System.out.println("4.View Student Details");
            System.out.println("5.Exit");

            System.out.println("Enter your choice:");

            Scanner in = new Scanner(System.in);
            int option = in.nextInt();

            switch(option)
            {
                case 1:
                    System.out.println("Add Student details:");
                    addStudent(list);
                    break;
                case 2:
                    System.out.println("Delete Student details:");
                    delStudent(list);
                    break;
                case 3:
                    System.out.println("Modify Student details:");
                    modStudent(list);
                    break;
                case 4:
                    System.out.println("view Student details:");
                    viewStudent(list);
                    break;
                case 5:
                    System.out.println("Thank you for using our service");
                    System.exit(0);
            }
        }
    }

    static void addStudent(ArrayList<Student>list)
    {
        Scanner in = new Scanner(System.in);
        String id;
        while(true)
        {
            System.out.println("Enter student ID:");
            id=in.nextLine();

            boolean flag = isUsed(list,id);
            if(flag==false)
            {
                break;
            }
            else
            {
                System.out.println("Duplicate Student ID");
            }
        }
        System.out.println("Enter name:");
        String name = in.nextLine();

        System.out.println("Enter age:");
        String age = in.nextLine();

        System.out.println("Enter address:");
        String address = in.nextLine();

        Student s1 = new Student();
        s1.setid(id);
        s1.setname(name);
        s1.setage(age);
        s1.setaddress(address);

        list.add(s1);
        System.out.println("Successfully added");
    }

    public static void delStudent(ArrayList<Student>list)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student ID to be deleted:");
        String id = in.nextLine();
        int index = -1;
        for(int i=0;i<list.size();i++)
        {
            Student s = list.get(i);
            if(s.getid()==id)
            {
                index = i;
                break;
            }
        }
        if(index==-1)
        {
            System.out.println("No information exist");
        }
        else
        {
            list.remove(index);
            System.out.println("Successfully deleted");
        }
    }

    public static void modStudent(ArrayList<Student>list)
    {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter Student ID to modify:");
        String id = in.nextLine();
        System.out.println("Enter name to be modified:");
        String name = in.nextLine();
        System.out.println("Enter age to be modified:");
        String age = in.nextLine();
        System.out.println("Enter address to be modied:");
        String address = in.nextLine();

        Student s = new Student();
        s.setname(name);
        s.setage(age);
        s.setaddress(address);
        s.setid(id);

        int index = -1;
        for(int i=0;i<list.size();i++)
        {
            Student student = list.get(i);
            if(student.getid()==id)
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
            System.out.println("Student information does not exsist");
        }
        else
        {
            list.set(index,s);
            System.out.println("Modified successfully");        
        }
    }

    public static void viewStudent(ArrayList<Student>list)
    {
        if(list.size()==0)
        {
            System.out.println("No information recorded till now");
            return;
        }
        System.out.println("\nID\tName\tAge\tAddress\t");

        for(int i=0;i<list.size();i++)
        {
            Student s = list.get(i);
            System.out.println(s.getid()+"\t"+s.getname()+"\t"+s.getage()+"\t"+s.getaddress());
        }
    }

    public static boolean isUsed(ArrayList<Student> list, String id) 
    {
        boolean flag=false;
        for(int i=0;i<list.size();i++)
        {
            Student student = list.get(i);
            if(student.getid()==id)
            {
                flag=true;
                break;
            }
        }
        return flag;
    }
}