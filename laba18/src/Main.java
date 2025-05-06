import java.util.Arrays;

interface Sorter{
    boolean apply(int a, int b);
}
public class Main {
    public static void main(String[] args) {
        int[] nums = {1,4,2,3,5,8,6,9,7,10};
        Sorter descendingSort=(a,b)-> a<b;
        Sorter ascendingSort=(a,b)-> a>b;
        System.out.println(Arrays.toString(sort(nums,descendingSort)));
        System.out.println(Arrays.toString(sort(nums,ascendingSort)));
    }

    public static int[] sort(int[] nums, Sorter sorter) {
        int len=nums.length;
        boolean swap;
        int temp;
        for (int i = 0; i < len-1; i++) {
            swap=false;
            for (int j = 0; j < len-i-1; j++) {
                if (sorter.apply(nums[j],nums[j+1])){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
}