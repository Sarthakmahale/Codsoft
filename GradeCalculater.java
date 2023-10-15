import java.util.Scanner;
public class GradeCalculater {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        System.out.println("***Follow the steps to calculate your grade***");
        System.out.println("***Fill Appropriate Information***");
        System.out.println("Enter no of subject-->");
        int Sub=x.nextInt();
        int M=Sub*100;
        int T_mark=0; //total marks

        for(int i=1;i<=Sub;i++){
            System.out.println("Enter mark obtained in sub "+i+" [Out of 100]:");
            int mark=x.nextInt();
            T_mark+=mark;
        }
        System.out.println("Total mark You obtained in exam is-->"+T_mark+" Out of "+M);
        
        double per=(double)T_mark/Sub; //formula for per. calculation
        System.out.println("Percentage you got in exam is-->"+per+"%");

        String grade;
        if(per>=90){
            grade="You pass with A+";
        }
        else if(per>=80){
            grade="You pass with A";
        }
        else if(per>=70){
            grade="You pass with B";
        }
        else if(per>=60){
            grade="You pass with C";
        }
        else if(per>=50){
            grade="You pass with D";
        }
        else{
            grade="You Fail in Exam";
        }

        System.out.println("Grade-->"+grade);
        x.close();
    }
}
