import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestaCodigoMorse {
    
    private Morse morse;
    
    @Before
    public void inicializa(){
        morse = new Morse();
    }
    
    @Test
    public void testaSubstituirCaracteresEspeciais(){
        morse.setMensagem("Tiago");
        assertEquals("- ** *- --* ---",morse.codifica());
    }
    
    @Test
    public void testaSubstituirCaracteresInvalidos(){
        morse.setMensagem("SOS");
        assertEquals("*** --- ***",morse.codifica());
    }
    
}
