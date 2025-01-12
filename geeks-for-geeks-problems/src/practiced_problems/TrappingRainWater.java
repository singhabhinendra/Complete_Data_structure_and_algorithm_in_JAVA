package practiced_problems;

import java.util.Stack;

public class TrappingRainWater {
    public int maxWater(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int res = 0;

        for (int i = 0; i < arr.length; i++) {


            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {

                int pop_height = arr[st.pop()];

                if (st.isEmpty())
                    break;


                int distance = i - st.peek() - 1;


                int water = Math.min(arr[st.peek()], arr[i]);


                water -= pop_height;

                res += distance * water;
            }
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args){
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        System.out.println(trappingRainWater.maxWater(new int[]{3,0,1,0,4,0,2}));
    }
}
