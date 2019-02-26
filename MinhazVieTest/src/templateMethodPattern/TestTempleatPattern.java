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
public class TestTempleatPattern {
    public static void main(String[] args) {
        DataProcess ef = new ExcelFile();
        ef.readProcessSave();
//        ef.readData();
//        ef.processData();
//        ef.saveData();
        
        DataProcess tf = new TextFile();
        tf.readProcessSave();
//        tf.readData();
//        tf.processData();
//        tf.saveData();
                
        
    }
}
