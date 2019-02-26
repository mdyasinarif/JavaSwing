
package templateMethodPattern;


public abstract class DataProcess {
     public void  readProcessSave(){
        readData();
        processData();
        saveData();
    }
  public abstract void readData();
  public abstract void processData();
  public void saveData() {
         System.out.println("Data save To Database");   
    }
}
