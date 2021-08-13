package LeetCodeProblems;

public class sumOfInputs {
    public static void main(String[] args) {
        int[] sumOfTwo = twoSum(new int[]{1, 2, 3, 4}, 5);
        printing(sumOfTwo);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void printing(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
