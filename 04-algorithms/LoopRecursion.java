public class LoopRecursion {
    static void print(int n){
        if(n == 0){
            return;
        }
        System.out.println("Value of n: " + n);
        print(n-1);
    }
    public static void main(String[] args){
        print(10);
    }
    
}
