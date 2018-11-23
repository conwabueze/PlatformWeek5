import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //////////////////1.Students///////////////////
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[3];

        for(int i = 0; i<students.length; i++){
            System.out.println("Enter Student #" + (i+1) + " name");
            String name = input.nextLine();
            System.out.println("Enter Student #" + (i+1) + " grade");
            String grade =input.nextLine();
            System.out.println("Enter Student #" + (i+1) + " gpa");
            double gpa = input.nextDouble();
            students[i]= new Student(name,grade,gpa);
            input.nextLine();
        }

        for(int i = 0; i<students.length; i++){
            System.out.println(students[i].toString());
        }


        /////////////////3.Now were talking//////////////////
        System.out.println("How many student do you have my friend?");
        int studentAmount =input.nextInt();
        input.nextLine();
        Student[] customList = new Student[studentAmount];
        for(int i = 0; i<customList.length; i++){
            System.out.println("Enter Student #" + (i+1) + " name");
            String name = input.nextLine();
            System.out.println("Enter Student #" + (i+1) + " grade");
            String grade =input.nextLine();
            System.out.println("Enter Student #" + (i+1) + " gpa");
            double gpa = input.nextDouble();
            students[i]= new Student(name,grade,gpa);
            input.nextLine();
        }

        for(int i = 0; i<customList.length; i++){
            System.out.println(students[i].toString());
        }

        ///////////////4. Pythagorean Theorum//////////////////
        Student one = new Student("Booker","A", 2.2);

        System.out.println(one.theorum(23,3));
        System.out.println(one.theorum(2,5));
        System.out.println(one.theorum(111,567));

        ////////////////5. Area Calulator///////////////
        System.out.println("What object would you like the area of");
        String getArea = input.nextLine().toLowerCase();

        switch (getArea){
            case "circle":
                System.out.println("Enter radius of circle");
                System.out.println(area_circle(input.nextDouble())); break;
            case "rectangle":
                System.out.println("Enter length");
                double length = input.nextDouble();
                System.out.println("Enter width");
                double width = input.nextDouble();
                System.out.println(area_rectangle(length,width)); break;
            case "square":
                System.out.println("Enter side");
                System.out.println(area_square(input.nextDouble())); break;
            case "triangle":
                System.out.println("Enter base");
                double base = input.nextDouble();
                System.out.println("Enter height");
                double height = input.nextDouble();
                System.out.println(area_triangle(base,height));break;
            default:
                System.out.println("Wrong input!!!!"); break;
        }


        ///////////////6. Divisible by...//////////////////
        for(int i=1; i<=20;i++){
            if(isDivisibleBy3(i)&&isEven(i))
                System.out.println(i + " <=");
            else if (isDivisibleBy3(i))
                System.out.println(i + " =");
            else if(isEven(i))
                System.out.println(i + " <");
            else
                System.out.println(i);
        }

    }
    ////////////////5. Area Calulator Methods///////////////

    public static double area_circle(double radius){
        return Math.PI *Math.pow(radius,2);
    }

    public static double area_rectangle(double length, double width){
        return length*width;
    }

    public static double area_square(double side){
        return side*2;
    }

    public static double area_triangle(double base,double height){
        return 0.5 * base *height;
    }

    ///////////////6. Divisible by... Method//////////////////
    public static boolean isEven(int n){
        return n%2==0;
    }

    public static boolean isDivisibleBy3(int n){
        return n%3==0;
    }


}
