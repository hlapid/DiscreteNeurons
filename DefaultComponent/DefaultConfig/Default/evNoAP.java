/*********************************************************************
	Rhapsody	: 7.6.1
	Login		: hlapid
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: evNoAP
//!	Generated Date	: Tue, 24, Nov 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/evNoAP.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/evNoAP.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event evNoAP() 
public class evNoAP extends RiJEvent implements AnimatedEvent {
    
    public static final int evNoAP_Default_id = 18618;		//## ignore 
    
    
    // Constructors
    
    public  evNoAP() {
        lId = evNoAP_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evNoAP_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.evNoAP");
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
          String s="evNoAP(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/evNoAP.java
*********************************************************************/

