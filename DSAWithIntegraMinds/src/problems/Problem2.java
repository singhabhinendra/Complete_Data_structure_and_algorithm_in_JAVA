/*                      Problem statement
Given two integer arrays arr1 and arr2, and the integer d ,return the
distance between the two arrays.
The Distance value is defined as the number of elements arr[i] such that there
is not any element arr2[j] where arr1[i] - arr2[j] <= d .

Example 1:

Input : arr1 = [4,5,8] , arr2 = [10,9,1,8] ,d =2
 3
 4 5 8
 4
 10 9 18
 2
 Output:2
 Explanation:
 For arr[0] =4 ,we have:
 |4-10| = 6 > d=2
 |4-9| = 5 > d=2
 |4-1| = 3> d=2x
 |4-8| = 4 > d=2
 For arr[1] =5,we have:
 |5-10| = 5 > d=2
 |5-9| = 4 > d=2
 |5-1| = 4 > d=2
 |5-8| = 3 > d=2
 For arr[2] =5,we have:
 |8-10| = 2<=d=2
 |8-9| = 1 <= d=2
 |8-1| = 7 > d=2
 |8-8| = 0 < d=2

 Example -02:
 Input : arr1=[1,4,2,3] , arr2 =[4,3,6,10,20,30], d=3
 1 4 2 3
 6
 4 3 6 10 20 30
 3
 Output:
 2

 Example- 03:
 Input : arr1 = [2,1,100,3] , arr2 =[-5,2,10,-3,7],d=6
 4
 2 1 100 3
 5
 -5 -2 10 -3 7
 6
 Output:1


 Constraints:
 1- 1<=arr.length,arr2.length <=500
 2- -1000<= arr[i],arr[j] <=1000
 3- 0<=d<=100

*/

package problems;
import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();

    }




}
