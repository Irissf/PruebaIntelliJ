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

   public void LambdasPracticeTwo(){
      List<Integer> list = new ArrayList<>();
      list.add(10);
      list.add(5);
      list.add(18);
      list.add(21);
      list.add(42);
      list.add(12);

      /*
      * Esto es más interesante, primero hacemos un filtrado y luego a ese resultado
      * le hacemos un foreach para imprimirlo, en las dos operaciones le mandamos una expresión lambda
      * Método Stream => que nos permite acceder a filter, sorted, map...etc
      * */
      list.stream().filter(edad -> edad >= 18).forEach(mayores -> System.out.println("Edades: "+mayores));
   }

}
