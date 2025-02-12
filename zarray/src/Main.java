import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] A={1,2,3,4,5};
        int[] B={2,3,4,5,6,7};
        int[] C={1,2,3,4};
        int[] D={2,3,4,5,6};
        int[] X={1,2,3,4};
        int[] AB=Sum(A,B,X);
        int[] CD=Sum(C,D,X);
        int[] Z=Division(AB,CD);
        System.out.println(Arrays.toString(Z));
        System.out.println(Arrays.toString(Search(Z,X)));
        }

    public static int[] Sum(int [] A, int [] B,int[] X) {
        A=Multiplication(A,X);
        int[] AB=new int[A.length*B.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                AB[(i*B.length)+j]=A[i]+B[j];
            }
        }
        return AB;
    }

    public static int[] Multiplication(int[] A, int[] B) {
        int[] AB=new int[A.length*B.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                AB[(i*B.length)+j]=A[i]*B[j];
            }
        }
        return AB;
    }
    public static int[] Division(int[] A, int [] B) {
        int[] AB=new int[A.length*B.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                AB[(i*B.length)+j]=A[i]/B[j];
            }
        }
        return AB;
    }

    public static int[] Search(int[] A, int[]B) {
        int[] AB = new int[9600];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9600; j++) {
                if (A[j] == B[i]) {
                    AB[j]=A[j];
                }
            }
        }
        return Arrays.stream(AB).filter(x -> x != 0).toArray();
    }
    }
