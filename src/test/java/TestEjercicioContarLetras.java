import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEjercicioContarLetras {

@Test
    public void Test1(){

        String prueba="Holaaa!";
        String resultadoEsperado="{a=3, !=1, h=1, l=1, o=1}";
        String resultado= EjercicioContarLetras.contarRepeticiones(prueba);
        Assertions.assertEquals(resultadoEsperado,resultado);
        System.out.println("Test1 realizado");
    }
    public void Test2(){
        String prueba=null;
        String resultadoEsperado=null;
        String resultado= EjercicioContarLetras.contarRepeticiones(prueba);
        Assertions.assertEquals(resultadoEsperado,resultado);
        System.out.println("Test2 realizado");

    }


}
