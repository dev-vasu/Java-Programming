    //skydive problem age should be between 18 and 60
    import java.util.*; 
    class Skydive{
    public static void main(String args[]){
        Scanner S1= new Scanner(System.in);    
    System.out.print("Enter Age- ");  
    int age= S1.nextInt();  
    
        if(age >=18 && age <= 60){
            System.out.println("Yes you can skydive ");

        }
        
        else{
        System.out.println("You are not eligible ");
    }        
}    
}
