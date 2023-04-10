package Introduction_to_Java;
public class Main  {
    public static void main(String[] args) {
       double[] a = {1,2,3,4,5,6,7,8,9};
       int cound = 0, num =0;
       for (int i = 0; i<a.length; i++){
           if(a[i] >0 ){
               cound++;
               num += a[i];
           }
       }
        double agv = num / cound;
        System.out.println(agv);


    }
}