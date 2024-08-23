
package br.edu.ifsul.actividad_testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class arrayEqualsTest {
    private int n[] = {5, 6, 8};
    private arrayEquals equals;
    
    public arrayEqualsTest() {
        equals = new arrayEquals ();
    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        equals.setNumeros(n);
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    @Test
    public void NumerosTest() {
        System.out.println("Array Numeros");
        int[] numeros = equals.getNumeros();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Vector con numeros...:" + numeros[i]);
        }
       
        assertArrayEquals(numeros, n);
       
    }

    
}
