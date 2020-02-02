/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polymorphism;

/**
 *
 * @author RANADEEP
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A obj= new A();
        obj.show();
        obj.show(5); // Overloading
    }
    
}
class A
{
    public void show()
    {
        System.out.println("Hello World");
    }
    public void show(int a)//Method Overloading
    {
        System.out.println("Overloading");
    }
}
