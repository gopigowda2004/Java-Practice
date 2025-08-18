public class BuyandSellStock {
 public static void main(int[] prices) {
    int MinValue=Integer.MIN_VALUE;
    int MaxProfit=0;
    
    for(int price:prices){
        if(price<MinValue){
            MinValue=price;
        }else{
        int profit=price-MinValue;
        if(profit>MaxProfit){
        MaxProfit=profit;
        }
    }
}
   return MaxProfit;

}
}
