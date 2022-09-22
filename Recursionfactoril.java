public class Recursionfactoril {
    public static void factorial(int n, int fact){
        if(n==1){
            System.out.println(fact);
            return;
        }
        fact*=n;
        factorial( n-1, fact);
    }
    public static void main(String[] args) {
        int n=5;
        int fact=1;
        factorial(n,fact);
    }
    
}
