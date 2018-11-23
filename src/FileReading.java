import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) throws Exception{

        File file =  new File("C:\\Users\\chino\\Desktop\\HelloWorld.txt");

        Scanner input =new Scanner(file);
        while(input.hasNextLine()){
            System.out.println(input.nextLine());
        }

        //////////////////2. Reading multiple files///////////////
        System.out.println("2. Reading multiple files");
        File CS235 = new File("C:\\Users\\chino\\Desktop\\CS235.txt");
        File CS135 = new File("C:\\Users\\chino\\Desktop\\CS135.txt");

        Scanner twoThreeFive =new Scanner(CS235);
        Scanner oneThreeFive =new Scanner(CS135);

        while(twoThreeFive.hasNextLine()&&oneThreeFive.hasNextLine()){
            System.out.println(twoThreeFive.nextLine());
            System.out.println(oneThreeFive.nextLine());

        }

        //////////////////3. Storing a Student/////////////////
        System.out.println("3. Storing a Student");
        Student student = new Student("Chris Brown", "A", 4.0);
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter name: ");
        String stuName = reader.nextLine();
        System.out.println("Enter grade: ");
        String stuGrade = reader.nextLine();
        System.out.println("Enter gpa: ");
        double stuGpa = reader.nextDouble();
        String gpaString = stuGpa+"";

        File name = new File("C:\\Users\\chino\\Desktop\\names.txt");
        FileWriter nameWriter = new FileWriter(name);
        nameWriter.write(stuName);
        nameWriter.close();

        File grade = new File("C:\\Users\\chino\\Desktop\\grades.txt");
        FileWriter gradeWriter = new FileWriter(grade);
        gradeWriter.write(stuGrade);
        gradeWriter.close();

        File gpa = new File("C:\\Users\\chino\\Desktop\\gpas.txt");
        FileWriter gpaWriter = new FileWriter(gpa);
        gpaWriter.write(gpaString);
        gpaWriter.close();

        //////////////////4. Student Revisited/////////////////
        System.out.println("4. Student Revisited");
        String[] nameList = new String[10];
        String[] gradeList = new String[10];
        double[] gpaList = new double[10];

        File namesFile = new File("C:\\Users\\chino\\Desktop\\names.txt");
        Scanner namesReader = new Scanner(namesFile);
        int namesCount=0;
        while(namesReader.hasNextLine()){
            nameList[namesCount] = namesReader.nextLine();
            namesCount++;
        }

        File gradesFile = new File("C:\\Users\\chino\\Desktop\\grades.txt");
        Scanner gradesReader = new Scanner(gradesFile);
        int gradesCount=0;
        while(gradesReader.hasNextLine()){
            gradeList[gradesCount] = gradesReader.nextLine();
            gradesCount++;
        }


        File gpasFile = new File("C:\\Users\\chino\\Desktop\\gpas.txt");
        Scanner gpasReader = new Scanner(gpasFile);
        int gpasCount=0;
        //double gpa = 0;
        while(gpasReader.hasNextLine()&&gpasCount<10){
            String x = gpasReader.nextLine();
            double y = Double.parseDouble(x);
            gpaList[gpasCount]=y;
            gpasCount++;


        }


        Student[] studentsArr = new Student[10];
        for(int x = 0; x<10; x++){
            studentsArr[x] = new Student(nameList[x],gradeList[x],gpaList[x]);
            System.out.println(studentsArr[x].toString());
        }

        //////////////////5. There has to be a better way/////////////////
        File allForOne = new File("C:\\Users\\chino\\Desktop\\students.csv");
        Scanner oneForall = new Scanner(allForOne);
        Student[] newStuList = new Student[10];
        int newStuCount = 0;
        while(oneForall.hasNextLine()){
            String content = oneForall.nextLine();
            String[] cutIt = content.split(",");
            newStuList[newStuCount]= new Student(cutIt[0],cutIt[1],Double.parseDouble(cutIt[2]));
            System.out.println(newStuList[newStuCount].toString());
        }



    }

    public void getInfo(Student[] students){
        for(int i = 0; i<students.length;i++){
            System.out.println(students[i].toString());
        }

    }


}
