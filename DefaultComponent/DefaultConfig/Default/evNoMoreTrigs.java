/*********************************************************************
	Rhapsody	: 7.6.1
	Login		: hlapid
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: evNoMoreTrigs
//!	Generated Date	: Tue, 24, Nov 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/evNoMoreTrigs.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/evNoMoreTrigs.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event evNoMoreTrigs() 
public class evNoMoreTrigs extends RiJEvent implements AnimatedEvent {
    
    public static final int evNoMoreTrigs_Default_id = 18620;		//## ignore 
    
    
    // Constructors
    
    public  evNoMoreTrigs() {
        lId = evNoMoreTrigs_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evNoMoreTrigs_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.evNoMoreTrigs");
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
          String s="evNoMoreTrigs(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/evNoMoreTrigs.java
*********************************************************************/

