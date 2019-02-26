/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateMethodPattern;

/**
 *
 * @author User
 */
public class TextFile extends DataProcess{
    

    @Override
    public void readData() {
        System.out.println("Data read from TextFile");
    }

    @Override
    public void processData() {
       System.out.println("Data process from TextFile");
    }

   
    
    
}
