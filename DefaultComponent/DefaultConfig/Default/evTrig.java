/*********************************************************************
	Rhapsody	: 7.6.1
	Login		: hlapid
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: evTrig
//!	Generated Date	: Tue, 24, Nov 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/evTrig.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/evTrig.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event evTrig() 
public class evTrig extends RiJEvent implements AnimatedEvent {
    
    public static final int evTrig_Default_id = 18621;		//## ignore 
    
    
    // Constructors
    
    public  evTrig() {
        lId = evTrig_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evTrig_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.evTrig");
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
          String s="evTrig(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/evTrig.java
*********************************************************************/

