/*********************************************************************
	Rhapsody	: 7.6.1
	Login		: hlapid
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Gen_MN
//!	Generated Date	: Tue, 8, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/Gen_MN.java
*********************************************************************/

package Default;

//## auto_generated
import java.util.*;
//## dependency util 
import java.util.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/Gen_MN.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Gen_MN 
public class Gen_MN extends Gen_Neuron implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassGen_MN = new AnimClass("Default.Gen_MN",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected ArrayList<Gen_IN> itsGen_IN = itsGen_IN = new ArrayList<Gen_IN>();		//## link itsGen_IN 
    
    protected ArrayList<Gen_MN> itsGen_MN = itsGen_MN = new ArrayList<Gen_MN>();		//## link itsGen_MN 
    
    protected ArrayList<Gen_MN> itsGen_MN_1 = itsGen_MN_1 = new ArrayList<Gen_MN>();		//## link itsGen_MN_1 
    
    protected Gen_Neuron itsGen_Neuron;		//## link itsGen_Neuron 
    
    protected ArrayList<Gen_SN> itsGen_SN = itsGen_SN = new ArrayList<Gen_SN>();		//## link itsGen_SN 
    
    protected Manager itsManager;		//## link itsManager 
    
    //#[ ignore 
    public static final int state_point_5=7;
    public static final int state_full_one=8;
    public static final int cond_state=9;
    //#]
    
    //## statechart_method 
    public RiJThread getThread() {
        return reactive.getThread();
    }
    
    //## statechart_method 
    public void schedTimeout(long delay, long tmID, RiJStateReactive reactive) {
        getThread().schedTimeout(delay, tmID, reactive);
    }
    
    //## statechart_method 
    public void unschedTimeout(long tmID, RiJStateReactive reactive) {
        getThread().unschedTimeout(tmID, reactive);
    }
    
    //## statechart_method 
    public boolean isIn(int state) {
        return reactive.isIn(state);
    }
    
    //## statechart_method 
    public boolean isCompleted(int state) {
        return reactive.isCompleted(state);
    }
    
    //## statechart_method 
    public RiJEventConsumer getEventConsumer() {
        return (RiJEventConsumer)reactive;
    }
    
    //## statechart_method 
    public void gen(RiJEvent event) {
        reactive._gen(event);
    }
    
    //## statechart_method 
    public void queueEvent(RiJEvent event) {
        reactive.queueEvent(event);
    }
    
    //## statechart_method 
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    // Constructors
    
    //## operation Gen_MN() 
    public  Gen_MN(RiJThread p_thread) {
        super(p_thread);
        try {
            animInstance().notifyConstructorEntered(animClassGen_MN.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        //#[ operation Gen_MN() 
        startBehavior();
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation addCHlist() 
    public void addCHlist() {
        try {
            animInstance().notifyMethodEntered("addCHlist",
               new ArgData[] {
               });
        
        //#[ operation addCHlist() 
        String temp_str;
        int dest_neuron_number;
        
        // go through all the interneurons I'm connected to:
        for (int i = 0; i < itsGen_IN.size(); i++) {  
        	dest_neuron_number = itsGen_IN.get(i).getNeuronNumber();
        	if (CHsynWeights[dest_neuron_number-1] != 0) {
        		//add command string to list. the format is: arrivalTime, targetNeuron, type
        		//target neuron is NOT between 1,...,60 but it's the index in itsGen_IN array - easier this way, saves double checking...
        		temp_str = Integer.toString(itsManager.getClockTime() + getPropTimes(dest_neuron_number-1) + getCHSynDelay()) + "," + Integer.toString(i) + ",IN";
        		CHsignalArrivalsList.add(temp_str);
        	}		
        }
        
        // go through all the sensoryneurons I'm connected to:
        for (int i = 0; i < itsGen_SN.size(); i++) {  
        	dest_neuron_number = itsGen_SN.get(i).getNeuronNumber();
        	if (CHsynWeights[dest_neuron_number-1] != 0) {
        		//add command string to list. the format is: arrivalTime, targetNeuron, type
        		//target neuron is NOT between 1,...,60 but it's the index in itsGen_SN array - easier this way, saves double checking...
        		temp_str = Integer.toString(itsManager.getClockTime() + getPropTimes(dest_neuron_number-1) + getCHSynDelay()) + "," + Integer.toString(i) + ",SN";
        		CHsignalArrivalsList.add(temp_str);
        	}		
        }
        
        // go through all the motorneurons I'm connected to:
        for (int i = 0; i < itsGen_MN.size(); i++) {  
        	dest_neuron_number = itsGen_MN.get(i).getNeuronNumber();
        	if (CHsynWeights[dest_neuron_number-1] != 0) {
        		//add command string to list. the format is: arrivalTime, targetNeuron, type
        		//target neuron is NOT between 1,...,60 but it's the index in itsGen_MN array - easier this way, saves double checking...
        		temp_str = Integer.toString(itsManager.getClockTime() + getPropTimes(dest_neuron_number-1) + getCHSynDelay()) + "," + Integer.toString(i) + ",MN";
        		CHsignalArrivalsList.add(temp_str);
        	}		
        }  
                              
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation addEJlist() 
    public void addEJlist() {
        try {
            animInstance().notifyMethodEntered("addEJlist",
               new ArgData[] {
               });
        
        //#[ operation addEJlist() 
        String temp_str;
        int dest_neuron_number;
        
        // go through all the interneurons I'm connected to:
        for (int i = 0; i < itsGen_IN.size(); i++) {  
        	dest_neuron_number = itsGen_IN.get(i).getNeuronNumber();
        	if (EJsynWeights[dest_neuron_number-1] != 0) {
        		//add command string to list. the format is: arrivalTime, targetNeuron, type
        		//target neuron is NOT between 1,...,60 but it's the index in itsGen_IN array - easier this way, saves double checking...
        		temp_str = Integer.toString(itsManager.getClockTime() + getPropTimes(dest_neuron_number-1) + getEJSynDelay()) + "," + Integer.toString(i) + ",IN";
        		EJsignalArrivalsList.add(temp_str);
        	}		
        }
        
        // go through all the sensoryneurons I'm connected to:
        for (int i = 0; i < itsGen_SN.size(); i++) {  
        	dest_neuron_number = itsGen_SN.get(i).getNeuronNumber();
        	if (EJsynWeights[dest_neuron_number-1] != 0) {
        		//add command string to list. the format is: arrivalTime, targetNeuron, type
        		//target neuron is NOT between 1,...,60 but it's the index in itsGen_SN array - easier this way, saves double checking...
        		temp_str = Integer.toString(itsManager.getClockTime() + getPropTimes(dest_neuron_number-1) + getEJSynDelay()) + "," + Integer.toString(i) + ",SN";
        		EJsignalArrivalsList.add(temp_str);
        	}		
        }
        
        // go through all the motorneurons I'm connected to:
        for (int i = 0; i < itsGen_MN.size(); i++) {  
        	dest_neuron_number = itsGen_MN.get(i).getNeuronNumber();
        	if (EJsynWeights[dest_neuron_number-1] != 0) {
        		//add command string to list. the format is: arrivalTime, targetNeuron, type
        		//target neuron is NOT between 1,...,60 but it's the index in itsGen_MN array - easier this way, saves double checking...
        		temp_str = Integer.toString(itsManager.getClockTime() + getPropTimes(dest_neuron_number-1) + getEJSynDelay()) + "," + Integer.toString(i) + ",MN";
        		EJsignalArrivalsList.add(temp_str);
        	}		
        }                
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendCHtrigs() 
    public void sendCHtrigs() {
        try {
            animInstance().notifyMethodEntered("sendCHtrigs",
               new ArgData[] {
               });
        
        //#[ operation sendCHtrigs() 
        int currTime = itsManager.getClockTime();
        Iterator it = CHsignalArrivalsList.iterator();
        
        while (it.hasNext())
        {
        	String str = (String)it.next();
        	String[] parsed = str.split(",");
        	int sendTime = Integer.parseInt(parsed[0]);
        	int destNeuron = Integer.parseInt(parsed[1]);
        	String neuronType = parsed[2];
        	double targetActivation;
        	                                                                               
        	if (sendTime <= currTime)
        	{
        		it.remove();         // very important - delete the current command!
        		if (neuronType.equals("MN")){
        			targetActivation = itsGen_MN.get(destNeuron).getActivation() + getCHcoeff() * getCHsynWeights(itsGen_MN.get(destNeuron).getNeuronNumber()-1) * getActivation();
        			if (targetActivation > 1) {targetActivation = 1;}
        			if (targetActivation < -1) {targetActivation = -1;}
        			itsGen_MN.get(destNeuron).setActivation(targetActivation);  
        			itsGen_MN.get(destNeuron).gen(new evTrig());
        			itsManager.cmdFileP.println("Time: " +itsManager.getClockTime() + ": "+ getNeuronName() + " triggers " + itsGen_MN.get(destNeuron).getNeuronName());
        		}
        		if (neuronType.equals("IN")){
        			targetActivation = itsGen_IN.get(destNeuron).getActivation() + getCHcoeff() * getCHsynWeights(itsGen_IN.get(destNeuron).getNeuronNumber()-1) * getActivation();
        			if (targetActivation > 1) {targetActivation = 1;}
        			if (targetActivation < -1) {targetActivation = -1;}
        			itsGen_IN.get(destNeuron).setActivation(targetActivation);
        			itsGen_IN.get(destNeuron).gen(new evTrig());
        			itsManager.cmdFileP.println("Time: " +itsManager.getClockTime() + ": "+ getNeuronName() + " triggers " + itsGen_IN.get(destNeuron).getNeuronName());
        		}
        		if (neuronType.equals("SN")){
        			targetActivation = itsGen_SN.get(destNeuron).getActivation() + getCHcoeff() * getCHsynWeights(itsGen_SN.get(destNeuron).getNeuronNumber()-1) * getActivation();
        			if (targetActivation > 1) {targetActivation = 1;}
        			if (targetActivation < -1) {targetActivation = -1;}
        			itsGen_SN.get(destNeuron).setActivation(targetActivation);        
        			itsGen_SN.get(destNeuron).gen(new evTrig());
        			itsManager.cmdFileP.println("Time: " +itsManager.getClockTime() + ": "+ getNeuronName() + " triggers " + itsGen_SN.get(destNeuron).getNeuronName());
        		}
        	}
        		
        }
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendEJtrigs() 
    public void sendEJtrigs() {
        try {
            animInstance().notifyMethodEntered("sendEJtrigs",
               new ArgData[] {
               });
        
        //#[ operation sendEJtrigs() 
        int currTime = itsManager.getClockTime();
        Iterator it = EJsignalArrivalsList.iterator();
        
        while (it.hasNext())
        {
        	String str = (String)it.next();
        	String[] parsed = str.split(",");
        	int sendTime = Integer.parseInt(parsed[0]);
        	int destNeuron = Integer.parseInt(parsed[1]);
        	String neuronType = parsed[2];
        	double targetActivation;
        	
        	if (sendTime <= currTime)
        	{
        		it.remove();         // very important - delete the current command!
        		if (neuronType.equals("MN")){
        			targetActivation = itsGen_MN.get(destNeuron).getActivation() + getEJcoeff() * getEJsynWeights(itsGen_MN.get(destNeuron).getNeuronNumber()-1) * getActivation();
        			if (targetActivation > 1) {targetActivation = 1;}
        			if (targetActivation < -1) {targetActivation = -1;}
        			itsGen_MN.get(destNeuron).setActivation(targetActivation);
        			itsGen_MN.get(destNeuron).gen(new evTrig());
        			itsManager.cmdFileP.println("Time: " +itsManager.getClockTime() + ": "+ getNeuronName() + " EJ-triggers " + itsGen_MN.get(destNeuron).getNeuronName());
        		}
        		if (neuronType.equals("IN")){
        			targetActivation = itsGen_IN.get(destNeuron).getActivation() + getEJcoeff() * getEJsynWeights(itsGen_IN.get(destNeuron).getNeuronNumber()-1) * getActivation();
        			if (targetActivation > 1) {targetActivation = 1;}
        			if (targetActivation < -1) {targetActivation = -1;}
        			itsGen_IN.get(destNeuron).setActivation(targetActivation);     
        			itsGen_IN.get(destNeuron).gen(new evTrig());
        			itsManager.cmdFileP.println("Time: " +itsManager.getClockTime() + ": "+ getNeuronName() + " EJ-triggers " + itsGen_IN.get(destNeuron).getNeuronName());
        		}
        		if (neuronType.equals("SN")){
        			targetActivation = itsGen_SN.get(destNeuron).getActivation() + getEJcoeff() * getEJsynWeights(itsGen_SN.get(destNeuron).getNeuronNumber()-1) * getActivation();
        			if (targetActivation > 1) {targetActivation = 1;}
        			if (targetActivation < -1) {targetActivation = -1;}
        			itsGen_SN.get(destNeuron).setActivation(targetActivation);         
        			itsGen_SN.get(destNeuron).gen(new evTrig());
        			itsManager.cmdFileP.println("Time: " +itsManager.getClockTime() + ": "+ getNeuronName() + " EJ-triggers " + itsGen_SN.get(destNeuron).getNeuronName());
        		}
        	}
        		
        }
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public ListIterator<Gen_IN> getItsGen_IN() {
        ListIterator<Gen_IN> iter = itsGen_IN.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsGen_IN(Gen_IN p_Gen_IN) {
        if(p_Gen_IN != null)
            {
                animInstance().notifyRelationAdded("itsGen_IN", p_Gen_IN);
            }
        else
            {
                animInstance().notifyRelationCleared("itsGen_IN");
            }
        itsGen_IN.add(0, p_Gen_IN);
    }
    
    //## auto_generated 
    public void addItsGen_IN(Gen_IN p_Gen_IN) {
        if(p_Gen_IN != null)
            {
                p_Gen_IN._addItsGen_MN(this);
            }
        _addItsGen_IN(p_Gen_IN);
    }
    
    //## auto_generated 
    public void _removeItsGen_IN(Gen_IN p_Gen_IN) {
        animInstance().notifyRelationRemoved("itsGen_IN", p_Gen_IN);
        itsGen_IN.remove(p_Gen_IN);
    }
    
    //## auto_generated 
    public void removeItsGen_IN(Gen_IN p_Gen_IN) {
        if(p_Gen_IN != null)
            {
                p_Gen_IN._removeItsGen_MN(this);
            }
        _removeItsGen_IN(p_Gen_IN);
    }
    
    //## auto_generated 
    public void _clearItsGen_IN() {
        animInstance().notifyRelationCleared("itsGen_IN");
        itsGen_IN.clear();
    }
    
    //## auto_generated 
    public void clearItsGen_IN() {
        ListIterator<Gen_IN> iter = itsGen_IN.listIterator();
        while (iter.hasNext()){
            Gen_IN current = itsGen_IN.get(iter.nextIndex());
            if(current != null)
                {
                    current._removeItsGen_MN(this);
                }
            iter.next();
        }
        _clearItsGen_IN();
    }
    
    //## auto_generated 
    public ListIterator<Gen_MN> getItsGen_MN() {
        ListIterator<Gen_MN> iter = itsGen_MN.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsGen_MN(Gen_MN p_Gen_MN) {
        if(p_Gen_MN != null)
            {
                animInstance().notifyRelationAdded("itsGen_MN", p_Gen_MN);
            }
        else
            {
                animInstance().notifyRelationCleared("itsGen_MN");
            }
        itsGen_MN.add(0, p_Gen_MN);
    }
    
    //## auto_generated 
    public void addItsGen_MN(Gen_MN p_Gen_MN) {
        if(p_Gen_MN != null)
            {
                p_Gen_MN._addItsGen_MN_1(this);
            }
        _addItsGen_MN(p_Gen_MN);
    }
    
    //## auto_generated 
    public void _removeItsGen_MN(Gen_MN p_Gen_MN) {
        animInstance().notifyRelationRemoved("itsGen_MN", p_Gen_MN);
        itsGen_MN.remove(p_Gen_MN);
    }
    
    //## auto_generated 
    public void removeItsGen_MN(Gen_MN p_Gen_MN) {
        if(p_Gen_MN != null)
            {
                p_Gen_MN._removeItsGen_MN_1(this);
            }
        _removeItsGen_MN(p_Gen_MN);
    }
    
    //## auto_generated 
    public void _clearItsGen_MN() {
        animInstance().notifyRelationCleared("itsGen_MN");
        itsGen_MN.clear();
    }
    
    //## auto_generated 
    public void clearItsGen_MN() {
        ListIterator<Gen_MN> iter = itsGen_MN.listIterator();
        while (iter.hasNext()){
            Gen_MN current = itsGen_MN.get(iter.nextIndex());
            if(current != null)
                {
                    current._removeItsGen_MN_1(this);
                }
            iter.next();
        }
        _clearItsGen_MN();
    }
    
    //## auto_generated 
    public ListIterator<Gen_MN> getItsGen_MN_1() {
        ListIterator<Gen_MN> iter = itsGen_MN_1.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsGen_MN_1(Gen_MN p_Gen_MN) {
        if(p_Gen_MN != null)
            {
                animInstance().notifyRelationAdded("itsGen_MN_1", p_Gen_MN);
            }
        else
            {
                animInstance().notifyRelationCleared("itsGen_MN_1");
            }
        itsGen_MN_1.add(0, p_Gen_MN);
    }
    
    //## auto_generated 
    public void addItsGen_MN_1(Gen_MN p_Gen_MN) {
        if(p_Gen_MN != null)
            {
                p_Gen_MN._addItsGen_MN(this);
            }
        _addItsGen_MN_1(p_Gen_MN);
    }
    
    //## auto_generated 
    public void _removeItsGen_MN_1(Gen_MN p_Gen_MN) {
        animInstance().notifyRelationRemoved("itsGen_MN_1", p_Gen_MN);
        itsGen_MN_1.remove(p_Gen_MN);
    }
    
    //## auto_generated 
    public void removeItsGen_MN_1(Gen_MN p_Gen_MN) {
        if(p_Gen_MN != null)
            {
                p_Gen_MN._removeItsGen_MN(this);
            }
        _removeItsGen_MN_1(p_Gen_MN);
    }
    
    //## auto_generated 
    public void _clearItsGen_MN_1() {
        animInstance().notifyRelationCleared("itsGen_MN_1");
        itsGen_MN_1.clear();
    }
    
    //## auto_generated 
    public void clearItsGen_MN_1() {
        ListIterator<Gen_MN> iter = itsGen_MN_1.listIterator();
        while (iter.hasNext()){
            Gen_MN current = itsGen_MN_1.get(iter.nextIndex());
            if(current != null)
                {
                    current._removeItsGen_MN(this);
                }
            iter.next();
        }
        _clearItsGen_MN_1();
    }
    
    //## auto_generated 
    public Gen_Neuron getItsGen_Neuron() {
        return itsGen_Neuron;
    }
    
    //## auto_generated 
    public void setItsGen_Neuron(Gen_Neuron p_Gen_Neuron) {
        itsGen_Neuron = p_Gen_Neuron;
        if(p_Gen_Neuron != null)
            {
                animInstance().notifyRelationAdded("itsGen_Neuron", p_Gen_Neuron);
            }
        else
            {
                animInstance().notifyRelationCleared("itsGen_Neuron");
            }
    }
    
    //## auto_generated 
    public ListIterator<Gen_SN> getItsGen_SN() {
        ListIterator<Gen_SN> iter = itsGen_SN.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsGen_SN(Gen_SN p_Gen_SN) {
        if(p_Gen_SN != null)
            {
                animInstance().notifyRelationAdded("itsGen_SN", p_Gen_SN);
            }
        else
            {
                animInstance().notifyRelationCleared("itsGen_SN");
            }
        itsGen_SN.add(0, p_Gen_SN);
    }
    
    //## auto_generated 
    public void addItsGen_SN(Gen_SN p_Gen_SN) {
        if(p_Gen_SN != null)
            {
                p_Gen_SN._addItsGen_MN(this);
            }
        _addItsGen_SN(p_Gen_SN);
    }
    
    //## auto_generated 
    public void _removeItsGen_SN(Gen_SN p_Gen_SN) {
        animInstance().notifyRelationRemoved("itsGen_SN", p_Gen_SN);
        itsGen_SN.remove(p_Gen_SN);
    }
    
    //## auto_generated 
    public void removeItsGen_SN(Gen_SN p_Gen_SN) {
        if(p_Gen_SN != null)
            {
                p_Gen_SN._removeItsGen_MN(this);
            }
        _removeItsGen_SN(p_Gen_SN);
    }
    
    //## auto_generated 
    public void _clearItsGen_SN() {
        animInstance().notifyRelationCleared("itsGen_SN");
        itsGen_SN.clear();
    }
    
    //## auto_generated 
    public void clearItsGen_SN() {
        ListIterator<Gen_SN> iter = itsGen_SN.listIterator();
        while (iter.hasNext()){
            Gen_SN current = itsGen_SN.get(iter.nextIndex());
            if(current != null)
                {
                    current._removeItsGen_MN(this);
                }
            iter.next();
        }
        _clearItsGen_SN();
    }
    
    //## auto_generated 
    public Manager getItsManager() {
        return itsManager;
    }
    
    //## auto_generated 
    public void __setItsManager(Manager p_Manager) {
        itsManager = p_Manager;
        if(p_Manager != null)
            {
                animInstance().notifyRelationAdded("itsManager", p_Manager);
            }
        else
            {
                animInstance().notifyRelationCleared("itsManager");
            }
    }
    
    //## auto_generated 
    public void _setItsManager(Manager p_Manager) {
        if(itsManager != null)
            {
                itsManager._removeItsGen_MN(this);
            }
        __setItsManager(p_Manager);
    }
    
    //## auto_generated 
    public void setItsManager(Manager p_Manager) {
        if(p_Manager != null)
            {
                p_Manager._addItsGen_MN(this);
            }
        _setItsManager(p_Manager);
    }
    
    //## auto_generated 
    public void _clearItsManager() {
        animInstance().notifyRelationCleared("itsManager");
        itsManager = null;
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = false;
        done = reactive.startBehavior();
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive implements AnimatedReactive {
        
        // Default constructor 
        public Reactive() {
            this(RiJMainThread.instance());
        }
        
        
        // Constructors
        
        public  Reactive(RiJThread p_thread) {
            super(p_thread);
            initStatechart();
        }
        
        //## statechart_method 
        public boolean isIn(int state) {
            if(state_1 == state)
                {
                    return isIn(GenNeuronSC);
                }
            if(state_1_subState == state)
                {
                    return true;
                }
            if(state_2 == state)
                {
                    return isIn(GenNeuronSC);
                }
            if(state_2_subState == state)
                {
                    return true;
                }
            if(rootState_subState == state)
                {
                    return true;
                }
            return false;
        }
        
        //## statechart_method 
        public boolean isCompleted(int state) {
            return true;
        }
        
        //## statechart_method 
        public void rootState_add(AnimStates animStates) {
            animStates.add("ROOT");
            if(rootState_subState == GenNeuronSC)
                {
                    GenNeuronSC_add(animStates);
                }
        }
        
        //## statechart_method 
        public void rootState_entDef() {
            {
                rootState_enter();
                rootStateEntDef();
            }
        }
        
        //## statechart_method 
        public int rootState_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(rootState_active == GenNeuronSC)
                {
                    res = GenNeuronSC_dispatchEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void GenNeuronSC_add(AnimStates animStates) {
            animStates.add("ROOT.GenNeuronSC");
            state_1_add(animStates);
            state_2_add(animStates);
        }
        
        //## statechart_method 
        public int GenNeuronSC_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(state_1_dispatchEvent(id) >= 0)
                {
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                    if(!isIn(GenNeuronSC))
                        {
                            return res;
                        }
                }
            if(state_2_dispatchEvent(id) >= 0)
                {
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                    if(!isIn(GenNeuronSC))
                        {
                            return res;
                        }
                }
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = GenNeuronSC_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_2_add(AnimStates animStates) {
            animStates.add("ROOT.GenNeuronSC.state_2");
            switch (state_2_subState) {
                case noTransmission:
                {
                    noTransmission_add(animStates);
                }
                break;
                case transmitTrig:
                {
                    transmitTrig_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public int state_2_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (state_2_active) {
                case noTransmission:
                {
                    res = noTransmission_takeEvent(id);
                }
                break;
                case transmitTrig:
                {
                    res = transmitTrig_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void transmitTrig_add(AnimStates animStates) {
            animStates.add("ROOT.GenNeuronSC.state_2.transmitTrig");
        }
        
        //## statechart_method 
        public void noTransmission_add(AnimStates animStates) {
            animStates.add("ROOT.GenNeuronSC.state_2.noTransmission");
        }
        
        //## statechart_method 
        public void state_1_add(AnimStates animStates) {
            animStates.add("ROOT.GenNeuronSC.state_1");
            switch (state_1_subState) {
                case state_0:
                {
                    state_0_add(animStates);
                }
                break;
                case cond_state:
                {
                    cond_state_add(animStates);
                }
                break;
                case state_point_5:
                {
                    state_point_5_add(animStates);
                }
                break;
                case state_full_one:
                {
                    state_full_one_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public int state_1_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (state_1_active) {
                case state_0:
                {
                    res = state_0_takeEvent(id);
                }
                break;
                case cond_state:
                {
                    res = cond_state_takeEvent(id);
                }
                break;
                case state_point_5:
                {
                    res = state_point_5_takeEvent(id);
                }
                break;
                case state_full_one:
                {
                    res = state_full_one_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void state_point_5_add(AnimStates animStates) {
            animStates.add("ROOT.GenNeuronSC.state_1.state_point_5");
        }
        
        //## statechart_method 
        public void state_full_one_add(AnimStates animStates) {
            animStates.add("ROOT.GenNeuronSC.state_1.state_full_one");
        }
        
        //## statechart_method 
        public void state_0_add(AnimStates animStates) {
            animStates.add("ROOT.GenNeuronSC.state_1.state_0");
        }
        
        //## statechart_method 
        public void cond_state_add(AnimStates animStates) {
            animStates.add("ROOT.GenNeuronSC.state_1.cond_state");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
            state_2_subState = RiJNonState;
            state_2_active = RiJNonState;
            state_1_subState = RiJNonState;
            state_1_active = RiJNonState;
        }
        
        //## statechart_method 
        public int cond_state_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = cond_stateTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_1_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_point_5Exit() {
            //#[ state ROOT.GenNeuronSC.state_1.state_point_5.(Exit) 
            setActivation(0);
            //#]
        }
        
        //## statechart_method 
        public int transmitTrig_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evNoMoreTrigs.evNoMoreTrigs_Default_id))
                {
                    res = transmitTrigTakeevNoMoreTrigs();
                }
            else if(event.isTypeOf(evTick.evTick_Default_id))
                {
                    res = transmitTrigTakeevTick();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_2_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_2Enter() {
        }
        
        //## statechart_method 
        public void state_1Enter() {
        }
        
        //## statechart_method 
        public int state_0_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evTrig.evTrig_Default_id))
                {
                    res = state_0TakeevTrig();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_1_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_0Enter() {
        }
        
        //## statechart_method 
        public int state_full_oneTakeevTick() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 11 
            if(getTransTime() < itsManager.getClockTime())
                {
                    animInstance().notifyTransitionStarted("11");
                    state_full_one_exit();
                    state_0_entDef();
                    animInstance().notifyTransitionEnded("11");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void state_point_5Enter() {
            //#[ state ROOT.GenNeuronSC.state_1.state_point_5.(Entry) 
            setTransTime(itsManager.getClockTime() + getDecayTime());
            addEJlist();
            gen(new evSendTrig());
            //#]
        }
        
        //## statechart_method 
        public void noTransmission_entDef() {
            noTransmission_enter();
        }
        
        //## statechart_method 
        public void state_2_exit() {
            switch (state_2_subState) {
                case noTransmission:
                {
                    noTransmission_exit();
                }
                break;
                case transmitTrig:
                {
                    transmitTrig_exit();
                }
                break;
                default:
                    break;
            }
            state_2_subState = RiJNonState;
            state_2Exit();
            animInstance().notifyStateExited("ROOT.GenNeuronSC.state_2");
        }
        
        //## statechart_method 
        public void cond_state_entDef() {
            cond_state_enter();
        }
        
        //## statechart_method 
        public int state_0TakeevTrig() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            state_0_exit();
            cond_state_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_full_one_enter() {
            animInstance().notifyStateEntered("ROOT.GenNeuronSC.state_1.state_full_one");
            state_1_subState = state_full_one;
            state_1_active = state_full_one;
            state_full_oneEnter();
        }
        
        //## statechart_method 
        public void state_point_5_entDef() {
            state_point_5_enter();
        }
        
        //## statechart_method 
        public void state_1_exit() {
            switch (state_1_subState) {
                case state_0:
                {
                    state_0_exit();
                }
                break;
                case cond_state:
                {
                    cond_state_exit();
                }
                break;
                case state_point_5:
                {
                    state_point_5_exit();
                }
                break;
                case state_full_one:
                {
                    state_full_one_exit();
                }
                break;
                default:
                    break;
            }
            state_1_subState = RiJNonState;
            state_1Exit();
            animInstance().notifyStateExited("ROOT.GenNeuronSC.state_1");
        }
        
        //## statechart_method 
        public void state_1_entDef() {
            state_1_enter();
            state_1EntDef();
        }
        
        //## statechart_method 
        public int transmitTrigTakeevTick() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 4 
            if(!(CHsignalArrivalsList.isEmpty() && EJsignalArrivalsList.isEmpty()))
                {
                    animInstance().notifyTransitionStarted("4");
                    //#[ transition 4 
                    sendEJtrigs();
                    sendCHtrigs();
                    //#]
                    animInstance().notifyTransitionEnded("4");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    //## transition 5 
                    if(CHsignalArrivalsList.isEmpty() && EJsignalArrivalsList.isEmpty())
                        {
                            animInstance().notifyTransitionStarted("5");
                            //#[ transition 5 
                            gen(new evNoMoreTrigs());
                            //#]
                            animInstance().notifyTransitionEnded("5");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public void state_0_exit() {
            state_0Exit();
            animInstance().notifyStateExited("ROOT.GenNeuronSC.state_1.state_0");
        }
        
        //## statechart_method 
        public void state_full_oneEnter() {
            //#[ state ROOT.GenNeuronSC.state_1.state_full_one.(Entry) 
            setTransTime(itsManager.getClockTime() + getDecayTime());
            addEJlist();
            addCHlist();
            gen(new evSendTrig());
            //#]
        }
        
        //## statechart_method 
        public void state_point_5_exit() {
            state_point_5Exit();
            animInstance().notifyStateExited("ROOT.GenNeuronSC.state_1.state_point_5");
        }
        
        //## statechart_method 
        public void transmitTrig_entDef() {
            transmitTrig_enter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void state_0Exit() {
        }
        
        //## statechart_method 
        public void state_full_one_entDef() {
            state_full_one_enter();
        }
        
        //## statechart_method 
        public int state_point_5_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evTrig.evTrig_Default_id))
                {
                    res = state_point_5TakeevTrig();
                }
            else if(event.isTypeOf(evTick.evTick_Default_id))
                {
                    res = state_point_5TakeevTick();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_1_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_point_5_enter() {
            animInstance().notifyStateEntered("ROOT.GenNeuronSC.state_1.state_point_5");
            state_1_subState = state_point_5;
            state_1_active = state_point_5;
            state_point_5Enter();
        }
        
        //## statechart_method 
        public void state_1Exit() {
        }
        
        //## statechart_method 
        public void noTransmission_enter() {
            animInstance().notifyStateEntered("ROOT.GenNeuronSC.state_2.noTransmission");
            state_2_subState = noTransmission;
            state_2_active = noTransmission;
            noTransmissionEnter();
        }
        
        //## statechart_method 
        public void transmitTrigEnter() {
        }
        
        //## statechart_method 
        public int state_2_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void rootState_enter() {
            animInstance().notifyStateEntered("ROOT");
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void state_full_one_exit() {
            state_full_oneExit();
            animInstance().notifyStateExited("ROOT.GenNeuronSC.state_1.state_full_one");
        }
        
        //## statechart_method 
        public void state_2Exit() {
        }
        
        //## statechart_method 
        public void GenNeuronSC_entDef() {
            GenNeuronSC_enter();
            state_1_entDef();
            state_2_entDef();
        }
        
        //## statechart_method 
        public int state_point_5TakeevTrig() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("9");
            state_point_5_exit();
            cond_state_entDef();
            animInstance().notifyTransitionEnded("9");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void noTransmissionEnter() {
        }
        
        //## statechart_method 
        public void state_2_entDef() {
            state_2_enter();
            state_2EntDef();
        }
        
        //## statechart_method 
        public void GenNeuronSCExit() {
        }
        
        //## statechart_method 
        public void state_0_enter() {
            animInstance().notifyStateEntered("ROOT.GenNeuronSC.state_1.state_0");
            state_1_subState = state_0;
            state_1_active = state_0;
            state_0Enter();
        }
        
        //## statechart_method 
        public int state_point_5TakeevTick() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 8 
            if(getTransTime() < itsManager.getClockTime())
                {
                    animInstance().notifyTransitionStarted("8");
                    state_point_5_exit();
                    state_0_entDef();
                    animInstance().notifyTransitionEnded("8");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void transmitTrig_exit() {
            transmitTrigExit();
            animInstance().notifyStateExited("ROOT.GenNeuronSC.state_2.transmitTrig");
        }
        
        //## statechart_method 
        public void transmitTrig_enter() {
            animInstance().notifyStateEntered("ROOT.GenNeuronSC.state_2.transmitTrig");
            state_2_subState = transmitTrig;
            state_2_active = transmitTrig;
            transmitTrigEnter();
        }
        
        //## statechart_method 
        public int GenNeuronSC_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void GenNeuronSCEnter() {
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            GenNeuronSC_entDef();
        }
        
        //## statechart_method 
        public void state_1_enter() {
            animInstance().notifyStateEntered("ROOT.GenNeuronSC.state_1");
            state_1Enter();
        }
        
        //## statechart_method 
        public int transmitTrigTakeevNoMoreTrigs() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            transmitTrig_exit();
            noTransmission_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int cond_stateTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 7 
            if((getActivation() > 0.25) && (getActivation() < 0.75))
                {
                    animInstance().notifyTransitionStarted("7");
                    cond_state_exit();
                    state_point_5_entDef();
                    animInstance().notifyTransitionEnded("7");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    //## transition 10 
                    if(getActivation() >= 0.75)
                        {
                            animInstance().notifyTransitionStarted("10");
                            cond_state_exit();
                            state_full_one_entDef();
                            animInstance().notifyTransitionEnded("10");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                    else
                        {
                            //## transition 12 
                            if((getActivation() < 0.25))
                                {
                                    animInstance().notifyTransitionStarted("12");
                                    cond_state_exit();
                                    state_0_entDef();
                                    animInstance().notifyTransitionEnded("12");
                                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                }
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public void cond_stateEnter() {
        }
        
        //## statechart_method 
        public int state_1_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void noTransmission_exit() {
            noTransmissionExit();
            animInstance().notifyStateExited("ROOT.GenNeuronSC.state_2.noTransmission");
        }
        
        //## statechart_method 
        public void state_2_enter() {
            animInstance().notifyStateEntered("ROOT.GenNeuronSC.state_2");
            state_2Enter();
        }
        
        //## statechart_method 
        public void GenNeuronSC_enter() {
            animInstance().notifyStateEntered("ROOT.GenNeuronSC");
            rootState_subState = GenNeuronSC;
            rootState_active = GenNeuronSC;
            GenNeuronSCEnter();
        }
        
        //## statechart_method 
        public void noTransmissionExit() {
        }
        
        //## statechart_method 
        public void transmitTrigExit() {
        }
        
        //## statechart_method 
        public void GenNeuronSC_exit() {
            state_1_exit();
            state_2_exit();
            GenNeuronSCExit();
            animInstance().notifyStateExited("ROOT.GenNeuronSC");
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void state_0_entDef() {
            state_0_enter();
        }
        
        //## statechart_method 
        public void state_full_oneExit() {
            //#[ state ROOT.GenNeuronSC.state_1.state_full_one.(Exit) 
            setActivation(0);
            //#]
        }
        
        //## statechart_method 
        public void state_1EntDef() {
            animInstance().notifyTransitionStarted("0");
            state_0_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public int noTransmission_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evSendTrig.evSendTrig_Default_id))
                {
                    res = noTransmissionTakeevSendTrig();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_2_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void cond_state_exit() {
            popNullConfig();
            cond_stateExit();
            animInstance().notifyStateExited("ROOT.GenNeuronSC.state_1.cond_state");
        }
        
        //## statechart_method 
        public void cond_stateExit() {
        }
        
        //## statechart_method 
        public void cond_state_enter() {
            animInstance().notifyStateEntered("ROOT.GenNeuronSC.state_1.cond_state");
            pushNullConfig();
            state_1_subState = cond_state;
            state_1_active = cond_state;
            cond_stateEnter();
        }
        
        //## statechart_method 
        public int state_full_one_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evTick.evTick_Default_id))
                {
                    res = state_full_oneTakeevTick();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_1_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int noTransmissionTakeevSendTrig() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            noTransmission_exit();
            transmitTrig_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_2EntDef() {
            animInstance().notifyTransitionStarted("2");
            //#[ transition 2 
            //signalArrivalsList = new ArrayList<String>();
            CHsignalArrivalsList = new ArrayList<String>();
            EJsignalArrivalsList = new ArrayList<String>();
            //#]
            noTransmission_entDef();
            animInstance().notifyTransitionEnded("2");
        }
        
        /**  methods added just for design level debugging instrumentation */
        public boolean startBehavior() {
            try {
              animInstance().notifyBehavioralMethodEntered("startBehavior",
                  new ArgData[] {
                   });
              return super.startBehavior();
            }
            finally {
              animInstance().notifyMethodExit();
            }
        }
        public int takeEvent(RiJEvent event) { 
            try { 
              //animInstance().notifyTakeEvent(new AnimEvent(event));
              animInstance().notifyBehavioralMethodEntered("takeEvent",
                  new ArgData[] { new ArgData(RiJEvent.class, "event", event.toString())
                   });
              return super.takeEvent(event); 
            }
            finally { 
              animInstance().notifyMethodExit();
            }
        }
        /**  see com.ibm.rational.rhapsody.animation.AnimatedReactive interface */
        public AnimInstance animInstance() { 
            return Gen_MN.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassGen_MN; 
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
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
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimInstance animInstance() {
        if (animate == null) 
            animate = new Animate(); 
        return animate; 
    } 
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addAttributes(AnimAttributes msg) {
        super.addAttributes(msg);
        
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        super.addRelations(msg);
        
        msg.add("itsGen_SN", false, false, itsGen_SN);
        msg.add("itsGen_IN", false, false, itsGen_IN);
        msg.add("itsGen_MN", false, false, itsGen_MN);
        msg.add("itsGen_MN_1", false, false, itsGen_MN_1);
        msg.add("itsGen_Neuron", false, true, itsGen_Neuron);
        msg.add("itsManager", false, true, itsManager);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Gen_MN.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Gen_MN.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Gen_MN.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Gen_MN.java
*********************************************************************/

