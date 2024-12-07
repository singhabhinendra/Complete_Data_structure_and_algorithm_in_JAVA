public class CountInversionsOfAnArray3 {
    static int inversionCount(int[] arr) {
        return countInv(arr, 0, arr.length - 1);
    }

    static int countAndMerge(int[] arr, int l, int m, int r) {
        int res = 0;
        int n1 = m - l + 1, n2 = r - m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        System.arraycopy(arr, l, left, 0, n1);
        System.arraycopy(arr, m + 1, right, 0, n2);
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                res += (n1 - i);
            }
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
        return res;
    }
    static int countInv(int[] arr, int l, int r) {
        int res = 0;
        if (l < r) {
            int m = l + (r - l) / 2;
            res += countInv(arr, l, m);
            res += countInv(arr, m + 1, r);
            res += countAndMerge(arr, l, m, r);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{ 2,4,1,3,5};
        System.out.println(inversionCount(arr));
    }
}
