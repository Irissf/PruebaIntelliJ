import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello :D");

        Pruebas pruebas = new Pruebas();
        pruebas.LambdasPractice();
        pruebas.LambdasPracticeTwo();

        //Con objetos
        List<LambdaPractice> lista = new ArrayList<>();
        lista.add(new LambdaPractice(1,"Bitcoin","btc",61000f));
        lista.add(new LambdaPractice(2,"Ethereum","eth",4100f));
        lista.add(new LambdaPractice(3,"Cardano","ada",1.97f));

        lista.forEach(moneda -> System.out.println("moneda "+moneda.getMoneda()));
    }


}
