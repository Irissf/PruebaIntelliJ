import java.util.ArrayList;
import java.util.List;

public class Pruebas {

   public void LambdasPractice(){
      List<String> list_names = new ArrayList<>();
      list_names.add("España");
      list_names.add("Italia");
      list_names.add("Grecia");
      list_names.add("Portugal");

      //Por ejemplo para mostrar los nombres usamos un foreach y una lambda
      list_names.forEach(country -> System.out.println(country));
   }

}
