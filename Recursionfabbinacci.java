public class Recursionfabbinacci {
    public static void fabbonacci(int n,int a,int b){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c);
        fabbonacci( n-1,b,c);
    }
    public static void main(String[] args) {
        int a=0;int b=1;int n=5;
        System.out.print(a);
        System.out.print(b);
        fabbonacci(n,a,b);

    }
}
