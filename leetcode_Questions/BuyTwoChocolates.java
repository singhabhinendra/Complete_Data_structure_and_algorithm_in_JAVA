public class BuyTwoChocolates {
        public int buyChoco(int[] prices, int money) {
            int min1=Integer.MAX_VALUE;
            int min2=Integer.MAX_VALUE;
            int index=0;
            for(int i=0;i<prices.length;i++){
                if(min1>prices[i]){
                    min2=min1;
                    min1=prices[i];
                }
                else{
                    min2=Math.min(min2,prices[i]);

                }

            }
            if(min1+min2<=money)
                return money-(min1+min2);
            return money;
        }

        public static void main(String[] args) {
            BuyTwoChocolates buychocolates =new BuyTwoChocolates();
            System.out.println(buychocolates.buyChoco(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 10));
        }
    }

