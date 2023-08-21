/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */

import junit.framework.TestCase;
import org.example.Calculadora;
import org.junit.jupiter.api.*;

/**
 *
 * @author garci
 */

@DisplayName("Calculadora Tests")
public class TestCalculadora extends TestCase {
    private Calculadora c;
    
    
    @BeforeEach
    protected void setUp(){
        c = new Calculadora(1,2);
        
    }
    
    @AfterEach
    protected void tearDown(){
        c = null;
    }
    
    @Test
    @DisplayName("Suma de numeros")
    public void test_suma(){
        //suma basica
        double r1 = c.suma();
        assertEquals(3,r1);    
        // verificar que la suma de numeros negativos no sea nulo
        double r2 = c.suma(-2.5,-3.4);
        assertNotNull(r2);
        // suma de numeros positivos
        double resultado = c.suma(2.1, 5.6);
        assertTrue(resultado==7.7);
        
        
    }
    
    @Test
    @DisplayName("Resta de numeros")
    public void test_resta(){
        //resta basica
        double r1 = c.resta();
        assertFalse(r1==3);
        assertTrue(r1==-1);
        //resta de numeros negativos
        double r2 = c.resta(-6.9,-3.0);
        assertEquals(-3.9,r2);
        //resta de numeros positivos
        double r3 = c.resta(6.9,3.0);
        assertNotNull(r3);
        assertEquals(3.9,r3);
        
        
    }
    
    
    
}
