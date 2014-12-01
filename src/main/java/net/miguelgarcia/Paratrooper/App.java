package net.miguelgarcia.Paratrooper;

import acm.program.GraphicsProgram;

/**
 * Hello world!
 *
 */
public class App extends GraphicsProgram
{
    private static final int AMPLADAPANTALLA = 1280;
    private static final int ALÇADAPANTALLA = 720;
    
    public final void run()
    {
    	setSize(AMPLADAPANTALLA, ALÇADAPANTALLA);
    	Joc joc = new Joc(this);
    	joc.start();
    }
    /**
    *
    * @return amplada.
    */
   public final int getAmplada() {
       return AMPLADAPANTALLA;
   }
   /**
    *
    * @return alçada.
    */
   public final int getAlçada() {
       return ALÇADAPANTALLA;
   }
}
