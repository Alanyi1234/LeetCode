import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[]args){
        int [] a = {1,1,1,2,2,2,3,3,5};
        System.out.println(removeDuplicates(a) + "this is the one");
//        System.out.println(removeDuplicates(a) + "This is final");
        for(int i =0; i<a.length; i++){
            System.out.println(a[i]);
        }
        //removeDuplicates(a);
    }
    //without hashMap
    public static int removeDuplicates(int[] a) {
        System.out.println(a.length);
       if(a.length==0){
           return 0;
        }
        int position =0;
       for (int i=1; position <a.length-1; i++){

           System.out.println("hello"+ i + "    " + position);
           if(a[i]!= a[position]){
               position +=1;
               a[position]=a[i];
           }
       }
       return position;
    }

    //With Hashmap
    public static int remove(int[]a){
        HashMap<Integer, Boolean> test= new HashMap();
        int count =0;
        if(test.get(0)== null){
            test.put(a[0], true);
            System.out.println("inside first");
            count +=1;
        }

        for (int i =1; i<a.length; i++){
            System.out.println("hello" + i);
            if(!test.containsKey(a[i]) ){
                test.put(a[i], true);
                a[count]=a[i];
                count +=1;
            }
        }
        return count;
    }
}
