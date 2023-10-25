package Algorithm;
import java.util.*;
public class TotalAverage {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[][] marks = new int[3][3];
    for(int i=0;i<3;i++){
        System.out.println("Enter marks for student "+(i+1));
        for(int j=0;j<3;j++){
            marks[i][j]=sc.nextInt();
        }
    }

    for(int i=0;i<3;i++){
        int total=0;
        for(int j=0;j<3;j++){
            total+=marks[i][j];
        }
        double avg = (double)(total/3.0);
        System.out.println("Student "+(i+1) + " total - "+total+" average - "+avg);
    }

    for(int i=0;i<3;i++){
        int total =0;
        for(int j=0;j<3;j++){
            total+=marks[j][i];
        }
        double avg =(double)(total/3.0);
        System.out.println("Subject " + (char)('A' + i) + " - Total: " + total + ", Average: " + avg);
    }
}
}