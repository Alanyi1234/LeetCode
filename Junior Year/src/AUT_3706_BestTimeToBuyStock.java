//Say you have an array for which the ith element is the price of a given stock on day i.
//
//If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
//
//Note that you cannot sell a stock before you buy one.
//EXAMPLE:
//Input: [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//             Not 7-1 = 6, as selling price needs to be larger than buying price.

public class AUT_3706_BestTimeToBuyStock {
  public static void main(String[]args){
    int []a = {7,1,5,3,6,4};  //5
    int []b = {1,2,3,4,5};  //4
    int []c = {9,3,1}; //0
   // System.out.println(buy(a));
    System.out.println(buyAndSell(c));
  }
  //Find max profit up to certain point in the array

  //Logic is to find the greatest possible buy at the current spot in the array...O(n) linear space.
  public static int buyAndSell(int []prices){
    int tempSmallest = Integer.MAX_VALUE;
    int currentMax=0;
    for(int i =0; i < prices.length; i++){
      if (prices[i] <tempSmallest){
        tempSmallest= prices[i];
      }
      else{
        currentMax= currentMax> prices[i]-tempSmallest ? currentMax : prices[i]-tempSmallest;
      }
    }
    return currentMax;
  }

}