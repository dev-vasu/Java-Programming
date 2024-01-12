import java.util.*; 
class hello{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
    System.out.print("Enter first number- ");  
    int a= sc.nextInt();  
    System.out.print("Enter second number- ");  
    int b= sc.nextInt();  

    
        
        System.out.println("Sum= " + (a + b));
        System.out.println("Diff= "+(a - b));
        System.out.println("Division= "+(a / b));
        System.out.println("Multiplication= "+(a * b));
    }
}