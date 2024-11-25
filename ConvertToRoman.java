package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import modelo.NumeroRomano;

public class TestarNumeroRomano {
	
	private NumeroRomano nr;

	@Before
	public void setUp() throws Exception {
			
			nr=new NumeroRomano();
			
	}
		
	
   @Test
	public void test1( ) {
	    assertEquals("I",nr.onvertToRoman5(1));
	   
	}
   @Test
    public void test2( ) {
	    assertEquals("IV",nr.onvertToRoman5(4));

   
    }
   @Test
    public void test3( ) {
	    assertEquals("IX",nr.onvertToRoman5(9));

    }
   @Test
    public void test4( ) {
	    assertEquals("XL",nr.onvertToRoman5(40));

   }
   @Test
    public void test5( ) {
	    assertEquals("XC",nr.onvertToRoman5(90));

   }
   @Test
    public void test6( ) {
	    assertEquals("CD",nr.onvertToRoman5(400));
   
   }
   @Test
    public void test7( ) {
	    assertEquals("CM",nr.onvertToRoman5(900));
   
   }
   @Test
    public void test8( ) {
	    assertEquals("MMMCMXCIX",nr.onvertToRoman5(3999));

   }
   @Test(expected=IllegalArgumentException.class)
  //exemplo de numero fora do intervalo:IV\u0305 =4000
   
    public void testOutFaixa( ) {
	   nr.onvertToRoman5(4000);
    }
}
