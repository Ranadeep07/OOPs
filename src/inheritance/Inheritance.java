/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance;

/**
 *
 * @author RANADEEP
 */
public class Inheritance {

    
    public static void main(String[] args) {
        AddSubMulDiv obj1=new AddSubMulDiv();
        obj1.a=7;
        obj1.b=6;
        obj1.add();
        System.out.println(obj1.result);
        obj1.addsub();
        System.out.println(obj1.result);
        obj1.asm();
        System.out.println(obj1.result);
        obj1.asmd();
        System.out.println(obj1.result);
            
        
    }
    
}
class Add  
{
     int a,b,result;
   public void add()
   {
       result=a+b;
   }
   
}
class AddSub extends Add //Single Level Inheritance
{
    public void addsub()
    {
        result=a-b;
    }
}
class AddSubMul extends AddSub //Multi Level Inheritance
{
    public void asm()
    {
        result=a*b;
    }
}
class AddSubMulDiv extends AddSubMul//Multi Level Inheritance
{
    public void asmd()
    {
        result=a/b;
    }
}