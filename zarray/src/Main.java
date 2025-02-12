import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] A={1,2,3,4,5};
        int[] B={2,3,4,5,6,7};
        int[] C={1,2,3,4};
        int[] D={2,3,4,5,6};
        int[] AB=Sum(A,B);
        int[] CD=Sum(C,D);
        int[] Z=Division(AB,CD);
        System.out.println(Arrays.toString(Z));
        }

    public static int[] Sum(int [] A, int [] B) {
        int[] AB=new int[A.length*B.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                AB[(i*B.length)+j]=A[i]+B[j];
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
    }
