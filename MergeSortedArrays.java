import java.util.*;
public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Index for nums1
        int j = n - 1; // Index for nums2
        int k = m + n - 1; // Index for merged array (nums1)

        // Compare elements from the end and merge in non-decreasing order
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        // Example 1
        Scanner sc = new Scanner(System.in);
        int nums1 = sc.nextInt();
        int m = sc.nextInt();
        int nums2 = sc.nextInt();
        int n = sc.nextInt();

        merge(nums1, m, nums2, n);

        // Output: [1, 2, 2, 3, 5, 6]
        System.out.print("Merged Array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Example 2
        int[] nums3 = {1};
        int m2 = 1;
        int[] nums4 = {};
        int n2 = 0;

        merge(nums3, m2, nums4, n2);

        // Output: [1]
        System.out.print("Merged Array: ");
        for (int num : nums3) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
