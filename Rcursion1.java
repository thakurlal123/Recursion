public class  Rcursion1 {
   
    public static void printnum(int n){
        if(n==0){       //base case or condition case
            return;
        }
        System.out.println(n);
        printnum(n-1);      //resurtion
    }
    public static void main(String[] args) {
        int n=5;
        printnum(n);
    }
    
}
