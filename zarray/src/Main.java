import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите границы и шаг для A");
        double[] A=ArrayForming(scan);
        System.out.println("Введите границы и шаг для B");
        double[] B=ArrayForming(scan);
        System.out.println("Введите границы и шаг для C");
        double[] C=ArrayForming(scan);
        System.out.println("Введите границы и шаг для D");
        double[] D=ArrayForming(scan);
        System.out.println("Введите границы и шаг для X");
        double[] X=ArrayForming(scan);
        double[] AB=Sum(A,B,X);
        double[] CD=Sum(C,D,X);
        double[] Z=Division(AB,CD);
        System.out.println(Arrays.toString(Z));
        System.out.println(Arrays.toString(Search(Z,X)));
        }

    public static double[] Sum(double [] A, double [] B,double[] X) {
        A=Multiplication(A,X);
        double[] AB=new double[A.length*B.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                AB[(i*B.length)+j]=A[i]+B[j];
            }
        }
        return AB;
    }

    public static double[] Multiplication(double[] A, double[] B) {
        double[] AB=new double[A.length*B.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                AB[(i*B.length)+j]=A[i]*B[j];
            }
        }
        return AB;
    }
    public static double[] Division(double[] A, double [] B) {
        double[] AB=new double[A.length*B.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                AB[(i*B.length)+j]=A[i]/B[j];
            }
        }
        return AB;
    }

    public static double[] Search(double[] A, double[]B) {
        double[] AB = new double[A.length*B.length];
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[j] == B[i]) {
                    AB[j]=A[j];
                }
            }
        }
        return Arrays.stream(AB).filter(x -> x != 0).toArray();
    }

    public static double[] ArrayForming(Scanner scan) {
        System.out.println("Введите А:");
        double start=scan.nextDouble();
        System.out.println("Введите B:");
        double end=scan.nextDouble();
        System.out.println("Введите шаг:");
        int step=scan.nextInt();
        int length= (int) (Math.abs(end-start)/step);
        double[] A=new double[length+1];
        for (int i = 0; start <=end ; i++) {
            A[i]=step;
            start+=step;
        }
        return A;
        //A.toArray(double[] A);
    }
    }
