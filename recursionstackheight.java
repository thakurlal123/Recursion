

public class recursionstackheight {
   
     public static int  calcpower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
         int xpowernm1 =calcpower(x,n-1);
         int xpower= x*xpowernm1;
         return xpower;

     }
    
    public static void main(String[] args) {
      
        int n=5;int x=2; 
        int ans = calcpower(x,n);
        System.out.println(ans);
    
}
}