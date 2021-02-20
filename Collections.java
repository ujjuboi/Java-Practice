
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

class Container<T extends Number>{
    T var;
    public void setvalue(T var){
        this.var = var;
    }

    public T getvalue(T var){
        return var;
    }
}

class Collections
{
    public static void main(String args[]){

        Container<Number> obj = new Container<>();
        System.out.print("Set value of obj: ");
        Scanner s = new Scanner(System.in);
        int variable = 0;
        try{
            variable = s.nextInt();   
            s.nextLine();
        }

        catch(Exception e){
            System.out.print("\nPlease enter an number: ");
            variable = s.nextInt();
            s.nextLine();
            obj.setvalue(variable);
        }

        finally{
            System.out.println("\nValue of variable is: " + (obj.getvalue(variable)));
            System.out.println("This was for Generics and exception handling. Now comes array list: ");
            Collection<Object> arraylist = new ArrayList<>();
            String vari = "something";
            while (true){
                System.out.print("Enter object in arraylist, when you are done type 'done': ");
                vari = s.next();
                s.nextLine();
                if(vari.equals("done")){
                    break;
                }
                try{
                    double doubvari = Double.parseDouble(vari);
                    arraylist.add(doubvari);
                }
                catch(Exception e){
                    arraylist.add(vari);
                }
            }
            //enhanced for loop:
            System.out.println("Enhanced for loop:");
            for (Object i : arraylist){
                System.out.println(i);
            }
            s.close();
            arraylist.clear();
        }
    }
}