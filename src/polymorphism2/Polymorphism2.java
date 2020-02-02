/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polymorphism2;

/**
 *
 * @author RANADEEP
 */
public class Polymorphism2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        B obj= new B();
        obj.show();
        
    }
    
}
class A  //Method Overriding
{
    public void show()
    {
        System.out.println("Hello World in A");
    }
   
    
}
class B extends A
{
    public void show()
    {
        System.out.println("Hello World in B");
    }
    
}
