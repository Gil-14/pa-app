package pa.app;

import java.util.logging.Logger;
  
  
public class App 
{
	private static final Logger logger = Logger.getLogger( App.class.getName() );
	
    public static void main( String[] args )
    {
		
        logger.info( "Teste" );
    }
	
	// String concatenation method example
	String concat(String s1, String s2) {
		return s1+s2;
	}
}
