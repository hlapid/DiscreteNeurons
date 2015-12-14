/*********************************************************************
	Rhapsody	: 7.6.1
	Login		: hlapid
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: evExternalTrig
//!	Generated Date	: Tue, 24, Nov 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/evExternalTrig.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/evExternalTrig.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event evExternalTrig() 
public class evExternalTrig extends RiJEvent implements AnimatedEvent {
    
    public static final int evExternalTrig_Default_id = 18616;		//## ignore 
    
    
    // Constructors
    
    public  evExternalTrig() {
        lId = evExternalTrig_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evExternalTrig_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.evExternalTrig");
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public Object getFieldValue(java.lang.reflect.Field f, Object userInstance) { 
         Object obj = null;
         try {
             obj = f.get(userInstance);
         } catch(Exception e) {
              java.lang.System.err.println("Exception: getting Field value: " + e);
              e.printStackTrace();
         }
         return obj;
    }
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public void addAttributes(AnimAttributes msg) {      
    }
    public String toString() {
          String s="evExternalTrig(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/evExternalTrig.java
*********************************************************************/

