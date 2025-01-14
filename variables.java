public class variables{
    // Instance variable
    int a = 10;
    int b = 20;
    
    // Static variable
    static int c = 30;
    static int d = 40;
    
    public static void main(String[] args){
        // Local variable
        int e = 50;
        int f = 60;
        
        System.out.println("Local variable e: " + e);
        System.out.println("Local variable f: " + f);
        
        variables obj = new variables();
        System.out.println("Instance variable a: " + obj.a);
        System.out.println("Instance variable b: " + obj.b);
        
        System.out.println("Static variable c: " + c);
        System.out.println("Static variable d: " + d);

        String s="LPU";
        System.out.println("University Name: "+s);
    }
    
}
