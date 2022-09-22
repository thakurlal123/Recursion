public class RecurtionsumofNnatural {
    public static void printsum(int num, int n, int sum){
    
        if(num==n){
            sum+=num;
            System.out.println(sum);
            return;
        }
      sum+=num;
        printsum(num+1,n,sum);

    }
    public static void main(String[] args) {
        int n=5;
        int num =1;
        int sum=0;
        printsum(num,n,sum);
    }
    
}
