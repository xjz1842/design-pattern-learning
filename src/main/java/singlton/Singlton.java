package singlton;

/**
 * 饿汉模式
 */
public class Singlton {

   private static Singlton  instance = new Singlton();

   private Singlton(){

   }

   public static Singlton getInstance(){
       return instance;
   }

}
