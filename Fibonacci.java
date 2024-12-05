class Fibonacci{
    public static int fibo(int n)
    {
        for(int i = 0; i < 10;i++){
        System.out.print(fibo(i)+" ");
        if(n<=1)
        {
            return n;
        }
        else
        {
            return fibo(n-1)+fibo(n-2);

        }
        }

        return n;
    }
    
    public static void main(String args[]){
        fibo(10);
    }
}