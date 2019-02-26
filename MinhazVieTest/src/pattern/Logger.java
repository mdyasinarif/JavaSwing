
package pattern;


public class Logger {
   private static Logger logger;

    public Logger() {
    }
   public static Logger getInstance(){
       if (logger == null) {
           logger = new Logger();
       }
   return logger;
   }
   public static void display(){
       System.out.println("This is Logger");
   }
}
