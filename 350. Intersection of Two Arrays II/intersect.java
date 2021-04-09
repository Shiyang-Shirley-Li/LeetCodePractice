/*
 * Tag: HashTable
 * Difficulty: Easy
 * Runtime: 1 ms, faster than 99.61% of Java online submissions for Intersection of Two Arrays II.
 * Memory Usage: 38.7 MB, less than 97.05% of Java online submissions for Intersection of Two Arrays II.
 */

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
		Arrays.sort(nums2);
		int nums1Len = nums1.length;
		int nums2Len = nums2.length;

		int count = nums1Len > nums2Len ? nums2Len : nums1Len;
		int[] intersection = new int[count];
		for (int c = 0; c < count; c++) {
			intersection[c] = -1;
		}

		int i = 0;
		int j = 0;
		int index = 0;
		while (i < nums1Len && j < nums2Len) {
			if (nums1[i] > nums2[j]) {
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				intersection[index] = nums1[i];
				i++;
				j++;
				index++;
			}
		}

		int k = intersection.length - 1;
		int numOfZeros = 0;
		while (k >= 0 && intersection[k] == -1) {
			numOfZeros += 1;
			k--;
		}
		int nonZeros = intersection.length - numOfZeros;
		int[] nonZeroIntersection = new int[nonZeros];
		for (int m = 0; m < nonZeros; m++) {
			nonZeroIntersection[m] = intersection[m];
		}
		return nonZeroIntersection;
    }
}

/*
 * Conclusion: 1. ternary operation
 *
 */
