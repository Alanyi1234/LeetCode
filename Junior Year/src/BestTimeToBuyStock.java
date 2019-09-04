public class BestTimeToBuyStock {
    public static void main(String[]args){
    int []a = {7,1,5,3,6,4};
    int []b = {1,2,3,4,5};
    System.out.println(buy(a));
    }
    public static int buy(int[]prices){
        int current = 0;
        int total=0;
        int temp =0;
        for(int i =1; i <prices.length; i++){
            System.out.println("this is i" + i);
            if(prices[i]<prices[i+1]){
                System.out.println("?" + i);
                temp =Math.abs(prices[current]-prices[i]);
            }
           else if (prices[current] < prices[i] && prices[i]>prices[i-1]){
                System.out.println(total);
              total += Math.abs(prices[current]-prices[i]);
              temp =0;

            }
            else{
                System.out.println(current + "This is current"+ i + "this is i");
                current =i;
                System.out.println(current);
            }
            total +=temp;

        }
        return total;
    }

}
