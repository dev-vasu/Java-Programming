import java.util.*; 
class calc{
    public static void main(String args[]){
        Scanner S1= new Scanner(System.in);    
    System.out.print("Enter first number- ");  
    int a= S1.nextInt();  
    System.out.print("Enter second number- ");  
    int b= S1.nextInt(); 
    

    
        
        System.out.println("Sum= " + (a + b));
        System.out.println("Diff= "+(a - b));
        System.out.println("Division= "+(a / b));
        System.out.println("Multiplication= "+(a * b));
        System.out.println("Remainder=" + (a%b));
    }
}