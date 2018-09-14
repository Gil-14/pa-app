package pa.app;

import java.util.logging.Logger;

import calculadora.Calc;
  
  
public class App 
{
	private static final Logger logger = Logger.getLogger( App.class.getName() );
	
    public static void main( String[] args )
    {
    	Calc c = new Calc();
    	
        logger.info( "Teste" );
        logger.info("Soma 1+2 = " + c.somar(1,2));
        logger.info("Subtracção 5-1 = " + c.subtrair(5,1));
        logger.info("Multiplicação 2*8 = " + c.multiplicar(2,8));
        logger.info("Divisão 20/2 = " + c.dividir(20, 2));
    }
	
	// String concatenation method example
	String concat(String s1, String s2) {
		return s1+s2;
	}
}
