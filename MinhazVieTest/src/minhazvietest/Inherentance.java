/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhazvietest;

class Prent{
 int pi ,pj;

 void showPiPj(){
     System.out.println("pi+pj : "+pi+" "+pj);
 }
}
class Child extends Prent{
int pk;
void showpk(){
    System.out.println("pk"+pk);
}

}
public class Inherentance {
    public static void main(String[] args) {
        Prent p = new Prent();
        Prent p1 = new Child();
        Child c = new Child();
        //Child c = (Child) new Prent();
        p.pi = 10;
        p.pj = 20;
       
        
        c.pi = 1;
        c.pj = 2;
        c.pk = 3;
        
        p1.pi = 101;
        p1.pj = 102;
        
        
     p.showPiPj();
     c.showPiPj();
     p1.showPiPj();
     
     
        
       
    }
}
