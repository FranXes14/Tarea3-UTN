import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

        Calculadora calc = new Calculadora();

        @Test
        public void test1() {
            // 1
            Assertions.assertEquals(240 , calc.multiplicar(80,3)); // espera 240
        }


        @Test
        public void test2() {
           // 2
           double sum = calc.sumar(150, 180);
           Assertions.assertEquals(110 , calc.dividir(sum ,3)); // espera 110
        }

        @Test
        public void test3() {
          // 3
          double res = calc.restar(90, 50);
          Assertions.assertNotEquals(605 ,calc.multiplicar(res ,15));
        }

        @Test
        public void test4() {
          //4
          double sum2 = calc.sumar(70, 40);
          Assertions.assertNotEquals(2750 ,calc.multiplicar(sum2 ,25));
        }
}



