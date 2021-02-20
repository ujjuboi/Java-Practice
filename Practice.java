public class Practice {

    Practice(){
        System.out.println("In default constructor.");
    }

    Practice(int b){
        System.out.println("In parametrized constructor."); //Constructor Overloading
    }
    
    public void exceptHandle(int a, int b) throws ArithmeticException{
        System.out.println("Frist is Exception Handling:");
        int c = a/b;
        System.out.println("Exception suppressed using throws keyword.");
    }
    public static void main (String args[]){
        System.out.print("Welcome, lets work.");
        Practice obj = new Practice(); //calls default constructor
        Practice objp = new Practice(5); // calls parametrized constructor
        obj.exceptHandle(5, 0); //calls exceptHandle; should not stop
        System.out.print("Good Bye");
    }    
}