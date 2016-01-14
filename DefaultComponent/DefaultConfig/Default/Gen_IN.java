/*********************************************************************
	Rhapsody	: 7.6.1
	Login		: hlapid
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Gen_IN
//!	Generated Date	: Tue, 12, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Default/Gen_IN.java
*********************************************************************/

package Default;

//## auto_generated
import java.util.*;
//## dependency util 
import java.util.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;

//----------------------------------------------------------------------------
// Default/Gen_IN.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Gen_IN 
public class Gen_IN extends Gen_Neuron {
    
    public Reactive reactive;		//## ignore 
    
    protected ArrayList<Gen_IN> itsGen_IN = itsGen_IN = new ArrayList<Gen_IN>();		//## link itsGen_IN 
    
    protected ArrayList<Gen_IN> itsGen_IN_1 = itsGen_IN_1 = new ArrayList<Gen_IN>();		//## link itsGen_IN_1 
    
    protected ArrayList<Gen_MN> itsGen_MN = itsGen_MN = new ArrayList<Gen_MN>();		//## link itsGen_MN 
    
    protected Gen_Neuron itsGen_Neuron;		//## link itsGen_Neuron 
    
    protected ArrayList<Gen_SN> itsGen_SN = itsGen_SN = new ArrayList<Gen_SN>();		//## link itsGen_SN 
    
    protected Manager itsManager;		//## link itsManager 
    
    //#[ ignore 
    public static final int state_two_EJ=9;
    public static final int state_three_EJ=10;
    public static final int state_one_EJ=11;
    public static final int state_minus=12;
    public static final int state_five_Chem=13;
    public static final int cond_state=14;
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
    
    //## operation Gen_IN() 
    public  Gen_IN(RiJThread p_thread) {
        super(p_thread);
        reactive = new Reactive(p_thread);
        //#[ operation Gen_IN() 
        startBehavior();
        //#]
    }
    
    //## operation addCHlist() 
    public void addCHlist() {
        //#[ operation addCHlist() 
        String temp_str;
        int dest_neuron_number;
        
        // go through all the interneurons I'm connected to:
        for (int i = 0; i < itsGen_IN.size(); i++) {  
        	dest_neuron_number = itsGen_IN.get(i).getNeuronNumber();
        	if (CHsynWeights[dest_neuron_number-1] != 0) {
        		//add command string to list. the format is: arrivalTime, targetNeuron, type, currentActivity
        		//target neuron is NOT between 1,...,60 but it's the index in itsGen_IN array - easier this way, saves double checking...
        		temp_str = Integer.toString(itsManager.getClockTime() + getPropTimes(dest_neuron_number-1) + getCHSynDelay()) + "," + Integer.toString(i) + ",IN," + Double.toString(getActivation());
        		CHsignalArrivalsList.add(temp_str);
        	}		
        }
        
        // go through all the sensoryneurons I'm connected to:
        for (int i = 0; i < itsGen_SN.size(); i++) {  
        	dest_neuron_number = itsGen_SN.get(i).getNeuronNumber();
        	if (CHsynWeights[dest_neuron_number-1] != 0) {
        		//add command string to list. the format is: arrivalTime, targetNeuron, type, currentActivity
        		//target neuron is NOT between 1,...,60 but it's the index in itsGen_SN array - easier this way, saves double checking...
        		temp_str = Integer.toString(itsManager.getClockTime() + getPropTimes(dest_neuron_number-1) + getCHSynDelay()) + "," + Integer.toString(i) + ",SN,"  + Double.toString(getActivation());
        		CHsignalArrivalsList.add(temp_str);
        	}		
        }
        
        // go through all the motorneurons I'm connected to:
        for (int i = 0; i < itsGen_MN.size(); i++) {  
        	dest_neuron_number = itsGen_MN.get(i).getNeuronNumber();
        	if (CHsynWeights[dest_neuron_number-1] != 0) {
        		//add command string to list. the format is: arrivalTime, targetNeuron, type, currentActivity
        		//target neuron is NOT between 1,...,60 but it's the index in itsGen_MN array - easier this way, saves double checking...
        		temp_str = Integer.toString(itsManager.getClockTime() + getPropTimes(dest_neuron_number-1) + getCHSynDelay()) + "," + Integer.toString(i) + ",MN,"  + Double.toString(getActivation());
        		CHsignalArrivalsList.add(temp_str);
        	}		
        }  
                              
        //#]
    }
    
    //## operation addEJlist() 
    public void addEJlist() {
        //#[ operation addEJlist() 
        String temp_str;
        int dest_neuron_number;
        
        // go through all the interneurons I'm connected to:
        for (int i = 0; i < itsGen_IN.size(); i++) {  
        	dest_neuron_number = itsGen_IN.get(i).getNeuronNumber();
        	if (EJsynWeights[dest_neuron_number-1] != 0) {
        		//add command string to list. the format is: arrivalTime, targetNeuron, type
        		//target neuron is NOT between 1,...,60 but it's the index in itsGen_IN array - easier this way, saves double checking...
        		temp_str = Integer.toString(itsManager.getClockTime() + getPropTimes(dest_neuron_number-1) + getEJSynDelay()) + "," + Integer.toString(i) + ",IN," + Double.toString(getActivation());
        		EJsignalArrivalsList.add(temp_str);
        	}		
        }
        
        // go through all the sensoryneurons I'm connected to:
        for (int i = 0; i < itsGen_SN.size(); i++) {  
        	dest_neuron_number = itsGen_SN.get(i).getNeuronNumber();
        	if (EJsynWeights[dest_neuron_number-1] != 0) {
        		//add command string to list. the format is: arrivalTime, targetNeuron, type
        		//target neuron is NOT between 1,...,60 but it's the index in itsGen_SN array - easier this way, saves double checking...
        		temp_str = Integer.toString(itsManager.getClockTime() + getPropTimes(dest_neuron_number-1) + getEJSynDelay()) + "," + Integer.toString(i) + ",SN," + Double.toString(getActivation());
        		EJsignalArrivalsList.add(temp_str);
        	}		
        }
        
        // go through all the motorneurons I'm connected to:
        for (int i = 0; i < itsGen_MN.size(); i++) {  
        	dest_neuron_number = itsGen_MN.get(i).getNeuronNumber();
        	if (EJsynWeights[dest_neuron_number-1] != 0) {
        		//add command string to list. the format is: arrivalTime, targetNeuron, type
        		//target neuron is NOT between 1,...,60 but it's the index in itsGen_MN array - easier this way, saves double checking...
        		temp_str = Integer.toString(itsManager.getClockTime() + getPropTimes(dest_neuron_number-1) + getEJSynDelay()) + "," + Integer.toString(i) + ",MN," + Double.toString(getActivation());
        		EJsignalArrivalsList.add(temp_str);
        	}		
        }                
        //#]
    }
    
    //## operation sendCHtrigs() 
    public void sendCHtrigs() {
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
        	double originalActivation = Double.parseDouble(parsed[3]);
        	double targetActivation;
        	                                                                               
        	if (sendTime <= currTime)
        	{
        		it.remove();         // very important - delete the current command!
        		if (neuronType.equals("MN")){
        			targetActivation = itsGen_MN.get(destNeuron).getActivation() + getCHcoeff() * getCHsynWeights(itsGen_MN.get(destNeuron).getNeuronNumber()-1) * originalActivation;
        			if (targetActivation > 1) {targetActivation = 1;}
        			if (targetActivation < -1) {targetActivation = -1;}
        			itsGen_MN.get(destNeuron).setActivation(targetActivation);  
        			itsGen_MN.get(destNeuron).gen(new evTrig());
        			itsManager.cmdFileP.println("Time: " +itsManager.getClockTime() + ": "+ getNeuronName() + " triggers " + itsGen_MN.get(destNeuron).getNeuronName());
        		}
        		if (neuronType.equals("IN")){
        			targetActivation = itsGen_IN.get(destNeuron).getActivation() + getCHcoeff() * getCHsynWeights(itsGen_IN.get(destNeuron).getNeuronNumber()-1) * originalActivation;
        			if (targetActivation > 1) {targetActivation = 1;}
        			if (targetActivation < -1) {targetActivation = -1;}
        			itsGen_IN.get(destNeuron).setActivation(targetActivation);          
        			itsGen_IN.get(destNeuron).gen(new evTrig());
        			itsManager.cmdFileP.println("Time: " +itsManager.getClockTime() + ": "+ getNeuronName() + " triggers " + itsGen_IN.get(destNeuron).getNeuronName());
        		}
        		if (neuronType.equals("SN")){
        			targetActivation = itsGen_SN.get(destNeuron).getActivation() + getCHcoeff() * getCHsynWeights(itsGen_SN.get(destNeuron).getNeuronNumber()-1) * originalActivation;
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
    
    //## operation sendEJtrigs() 
    public void sendEJtrigs() {
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
        	double originalActivation = Double.parseDouble(parsed[3]);
        	double targetActivation;
        	
        	if (sendTime <= currTime)
        	{
        		it.remove();         // very important - delete the current command!
        		if (neuronType.equals("MN")){
        			targetActivation = itsGen_MN.get(destNeuron).getActivation() + getEJcoeff() * getEJsynWeights(itsGen_MN.get(destNeuron).getNeuronNumber()-1) * originalActivation;
        			if (targetActivation > 1) {targetActivation = 1;}
        			if (targetActivation < -1) {targetActivation = -1;}
        			itsGen_MN.get(destNeuron).setActivation(targetActivation); 
        			itsGen_MN.get(destNeuron).gen(new evTrig()); 
        			itsManager.cmdFileP.println("Time: " +itsManager.getClockTime() + ": "+ getNeuronName() + " EJ-triggers " + itsGen_MN.get(destNeuron).getNeuronName());
        		}
        		if (neuronType.equals("IN")){
        			targetActivation = itsGen_IN.get(destNeuron).getActivation() + getEJcoeff() * getEJsynWeights(itsGen_IN.get(destNeuron).getNeuronNumber()-1) * originalActivation;
        			if (targetActivation > 1) {targetActivation = 1;}
        			if (targetActivation < -1) {targetActivation = -1;}
        			itsGen_IN.get(destNeuron).setActivation(targetActivation); 
        			itsGen_IN.get(destNeuron).gen(new evTrig());
        			itsManager.cmdFileP.println("Time: " +itsManager.getClockTime() + ": "+ getNeuronName() + " EJ-triggers " + itsGen_IN.get(destNeuron).getNeuronName());
        			
        		}
        		if (neuronType.equals("SN")){
        			targetActivation = itsGen_SN.get(destNeuron).getActivation() + getEJcoeff() * getEJsynWeights(itsGen_SN.get(destNeuron).getNeuronNumber()-1) * originalActivation;
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
    
    //## auto_generated 
    public ListIterator<Gen_IN> getItsGen_IN() {
        ListIterator<Gen_IN> iter = itsGen_IN.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsGen_IN(Gen_IN p_Gen_IN) {
        itsGen_IN.add(0, p_Gen_IN);
    }
    
    //## auto_generated 
    public void addItsGen_IN(Gen_IN p_Gen_IN) {
        if(p_Gen_IN != null)
            {
                p_Gen_IN._addItsGen_IN_1(this);
            }
        _addItsGen_IN(p_Gen_IN);
    }
    
    //## auto_generated 
    public void _removeItsGen_IN(Gen_IN p_Gen_IN) {
        itsGen_IN.remove(p_Gen_IN);
    }
    
    //## auto_generated 
    public void removeItsGen_IN(Gen_IN p_Gen_IN) {
        if(p_Gen_IN != null)
            {
                p_Gen_IN._removeItsGen_IN_1(this);
            }
        _removeItsGen_IN(p_Gen_IN);
    }
    
    //## auto_generated 
    public void _clearItsGen_IN() {
        itsGen_IN.clear();
    }
    
    //## auto_generated 
    public void clearItsGen_IN() {
        ListIterator<Gen_IN> iter = itsGen_IN.listIterator();
        while (iter.hasNext()){
            Gen_IN current = itsGen_IN.get(iter.nextIndex());
            if(current != null)
                {
                    current._removeItsGen_IN_1(this);
                }
            iter.next();
        }
        _clearItsGen_IN();
    }
    
    //## auto_generated 
    public ListIterator<Gen_IN> getItsGen_IN_1() {
        ListIterator<Gen_IN> iter = itsGen_IN_1.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsGen_IN_1(Gen_IN p_Gen_IN) {
        itsGen_IN_1.add(0, p_Gen_IN);
    }
    
    //## auto_generated 
    public void addItsGen_IN_1(Gen_IN p_Gen_IN) {
        if(p_Gen_IN != null)
            {
                p_Gen_IN._addItsGen_IN(this);
            }
        _addItsGen_IN_1(p_Gen_IN);
    }
    
    //## auto_generated 
    public void _removeItsGen_IN_1(Gen_IN p_Gen_IN) {
        itsGen_IN_1.remove(p_Gen_IN);
    }
    
    //## auto_generated 
    public void removeItsGen_IN_1(Gen_IN p_Gen_IN) {
        if(p_Gen_IN != null)
            {
                p_Gen_IN._removeItsGen_IN(this);
            }
        _removeItsGen_IN_1(p_Gen_IN);
    }
    
    //## auto_generated 
    public void _clearItsGen_IN_1() {
        itsGen_IN_1.clear();
    }
    
    //## auto_generated 
    public void clearItsGen_IN_1() {
        ListIterator<Gen_IN> iter = itsGen_IN_1.listIterator();
        while (iter.hasNext()){
            Gen_IN current = itsGen_IN_1.get(iter.nextIndex());
            if(current != null)
                {
                    current._removeItsGen_IN(this);
                }
            iter.next();
        }
        _clearItsGen_IN_1();
    }
    
    //## auto_generated 
    public ListIterator<Gen_MN> getItsGen_MN() {
        ListIterator<Gen_MN> iter = itsGen_MN.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsGen_MN(Gen_MN p_Gen_MN) {
        itsGen_MN.add(0, p_Gen_MN);
    }
    
    //## auto_generated 
    public void addItsGen_MN(Gen_MN p_Gen_MN) {
        if(p_Gen_MN != null)
            {
                p_Gen_MN._addItsGen_IN(this);
            }
        _addItsGen_MN(p_Gen_MN);
    }
    
    //## auto_generated 
    public void _removeItsGen_MN(Gen_MN p_Gen_MN) {
        itsGen_MN.remove(p_Gen_MN);
    }
    
    //## auto_generated 
    public void removeItsGen_MN(Gen_MN p_Gen_MN) {
        if(p_Gen_MN != null)
            {
                p_Gen_MN._removeItsGen_IN(this);
            }
        _removeItsGen_MN(p_Gen_MN);
    }
    
    //## auto_generated 
    public void _clearItsGen_MN() {
        itsGen_MN.clear();
    }
    
    //## auto_generated 
    public void clearItsGen_MN() {
        ListIterator<Gen_MN> iter = itsGen_MN.listIterator();
        while (iter.hasNext()){
            Gen_MN current = itsGen_MN.get(iter.nextIndex());
            if(current != null)
                {
                    current._removeItsGen_IN(this);
                }
            iter.next();
        }
        _clearItsGen_MN();
    }
    
    //## auto_generated 
    public Gen_Neuron getItsGen_Neuron() {
        return itsGen_Neuron;
    }
    
    //## auto_generated 
    public void setItsGen_Neuron(Gen_Neuron p_Gen_Neuron) {
        itsGen_Neuron = p_Gen_Neuron;
    }
    
    //## auto_generated 
    public ListIterator<Gen_SN> getItsGen_SN() {
        ListIterator<Gen_SN> iter = itsGen_SN.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsGen_SN(Gen_SN p_Gen_SN) {
        itsGen_SN.add(0, p_Gen_SN);
    }
    
    //## auto_generated 
    public void addItsGen_SN(Gen_SN p_Gen_SN) {
        if(p_Gen_SN != null)
            {
                p_Gen_SN._addItsGen_IN(this);
            }
        _addItsGen_SN(p_Gen_SN);
    }
    
    //## auto_generated 
    public void _removeItsGen_SN(Gen_SN p_Gen_SN) {
        itsGen_SN.remove(p_Gen_SN);
    }
    
    //## auto_generated 
    public void removeItsGen_SN(Gen_SN p_Gen_SN) {
        if(p_Gen_SN != null)
            {
                p_Gen_SN._removeItsGen_IN(this);
            }
        _removeItsGen_SN(p_Gen_SN);
    }
    
    //## auto_generated 
    public void _clearItsGen_SN() {
        itsGen_SN.clear();
    }
    
    //## auto_generated 
    public void clearItsGen_SN() {
        ListIterator<Gen_SN> iter = itsGen_SN.listIterator();
        while (iter.hasNext()){
            Gen_SN current = itsGen_SN.get(iter.nextIndex());
            if(current != null)
                {
                    current._removeItsGen_IN(this);
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
    }
    
    //## auto_generated 
    public void _setItsManager(Manager p_Manager) {
        if(itsManager != null)
            {
                itsManager._removeItsGen_IN(this);
            }
        __setItsManager(p_Manager);
    }
    
    //## auto_generated 
    public void setItsManager(Manager p_Manager) {
        if(p_Manager != null)
            {
                p_Manager._addItsGen_IN(this);
            }
        _setItsManager(p_Manager);
    }
    
    //## auto_generated 
    public void _clearItsManager() {
        itsManager = null;
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = false;
        done = reactive.startBehavior();
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive {
        
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
            if(state_9 == state)
                {
                    return isIn(GenNeuronSC);
                }
            if(state_9_subState == state)
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
            if(state_9_dispatchEvent(id) >= 0)
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
        public int state_9_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(state_9_active == state_10)
                {
                    res = state_10_takeEvent(id);
                }
            return res;
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
        public int state_1_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (state_1_active) {
                case state_0:
                {
                    res = state_0_takeEvent(id);
                }
                break;
                case state_one_EJ:
                {
                    res = state_one_EJ_takeEvent(id);
                }
                break;
                case cond_state:
                {
                    res = cond_state_takeEvent(id);
                }
                break;
                case state_five_Chem:
                {
                    res = state_five_Chem_takeEvent(id);
                }
                break;
                case state_two_EJ:
                {
                    res = state_two_EJ_takeEvent(id);
                }
                break;
                case state_three_EJ:
                {
                    res = state_three_EJ_takeEvent(id);
                }
                break;
                case state_minus:
                {
                    res = state_minus_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
            state_9_subState = RiJNonState;
            state_9_active = RiJNonState;
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
        public int state_one_EJTakeevTick() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 10 
            if(getTransTime() < itsManager.getClockTime())
                {
                    state_one_EJ_exit();
                    state_0_entDef();
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int state_two_EJTakeevTick() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 20 
            if(getTransTime() < itsManager.getClockTime())
                {
                    state_two_EJ_exit();
                    state_0_entDef();
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
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
        public int state_10TakeevTick() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //#[ transition 7 
            setActivation(getActivation() * getLeakyCoeff());
            //#]
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_10_entDef() {
            state_10_enter();
        }
        
        //## statechart_method 
        public int state_five_Chem_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evTick.evTick_Default_id))
                {
                    res = state_five_ChemTakeevTick();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_1_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int state_minusTakeevTrig() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            state_minus_exit();
            cond_state_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_minus_exit() {
            state_minusExit();
        }
        
        //## statechart_method 
        public void state_two_EJExit() {
        }
        
        //## statechart_method 
        public void state_1Enter() {
        }
        
        //## statechart_method 
        public void state_10_enter() {
            state_9_subState = state_10;
            state_9_active = state_10;
            state_10Enter();
        }
        
        //## statechart_method 
        public void state_9_enter() {
            state_9Enter();
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
            //#[ state ROOT.GenNeuronSC.state_1.state_0.(Entry) 
            setActivation(0);
            //#]
        }
        
        //## statechart_method 
        public int state_minusTakeevTick() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 23 
            if(getTransTime() < itsManager.getClockTime())
                {
                    state_minus_exit();
                    state_0_entDef();
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void state_9_entDef() {
            state_9_enter();
            state_9EntDef();
        }
        
        //## statechart_method 
        public void state_one_EJEnter() {
            //#[ state ROOT.GenNeuronSC.state_1.state_one_EJ.(Entry) 
            setTransTime(itsManager.getClockTime() + getDecayTime());
            addEJlist();
            gen(new evSendTrig());
            //#]
        }
        
        //## statechart_method 
        public void state_two_EJEnter() {
            //#[ state ROOT.GenNeuronSC.state_1.state_two_EJ.(Entry) 
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
        }
        
        //## statechart_method 
        public int state_9_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void cond_state_entDef() {
            cond_state_enter();
        }
        
        //## statechart_method 
        public int state_0TakeevTrig() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            state_0_exit();
            cond_state_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int state_five_ChemTakeevTick() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 12 
            if(getTransTime() < itsManager.getClockTime())
                {
                    state_five_Chem_exit();
                    state_0_entDef();
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void state_1_exit() {
            switch (state_1_subState) {
                case state_0:
                {
                    state_0_exit();
                }
                break;
                case state_one_EJ:
                {
                    state_one_EJ_exit();
                }
                break;
                case cond_state:
                {
                    cond_state_exit();
                }
                break;
                case state_five_Chem:
                {
                    state_five_Chem_exit();
                }
                break;
                case state_two_EJ:
                {
                    state_two_EJ_exit();
                }
                break;
                case state_three_EJ:
                {
                    state_three_EJ_exit();
                }
                break;
                case state_minus:
                {
                    state_minus_exit();
                }
                break;
                default:
                    break;
            }
            state_1_subState = RiJNonState;
            state_1Exit();
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
                    //#[ transition 4 
                    sendEJtrigs();
                    sendCHtrigs();
                    //#]
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    //## transition 5 
                    if(CHsignalArrivalsList.isEmpty() && EJsignalArrivalsList.isEmpty())
                        {
                            //#[ transition 5 
                            gen(new evNoMoreTrigs());
                            //#]
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public void state_9EntDef() {
            state_10_entDef();
        }
        
        //## statechart_method 
        public void state_0_exit() {
            state_0Exit();
        }
        
        //## statechart_method 
        public void state_two_EJ_enter() {
            state_1_subState = state_two_EJ;
            state_1_active = state_two_EJ;
            state_two_EJEnter();
        }
        
        //## statechart_method 
        public void state_one_EJ_exit() {
            state_one_EJExit();
        }
        
        //## statechart_method 
        public void state_three_EJEnter() {
            //#[ state ROOT.GenNeuronSC.state_1.state_three_EJ.(Entry) 
            setTransTime(itsManager.getClockTime() + getDecayTime());
            addEJlist();
            gen(new evSendTrig());
            //#]
        }
        
        //## statechart_method 
        public void state_two_EJ_exit() {
            state_two_EJExit();
        }
        
        //## statechart_method 
        public void transmitTrig_entDef() {
            transmitTrig_enter();
        }
        
        //## statechart_method 
        public void state_10Exit() {
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
        public void state_five_ChemEnter() {
            //#[ state ROOT.GenNeuronSC.state_1.state_five_Chem.(Entry) 
            setTransTime(itsManager.getClockTime() + getDecayTime());
            addEJlist();
            addCHlist();
            gen(new evSendTrig());
            
            //#]
        }
        
        //## statechart_method 
        public void state_five_Chem_entDef() {
            state_five_Chem_enter();
        }
        
        //## statechart_method 
        public void state_1Exit() {
        }
        
        //## statechart_method 
        public void noTransmission_enter() {
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
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void state_minusExit() {
        }
        
        //## statechart_method 
        public void state_three_EJ_exit() {
            state_three_EJExit();
        }
        
        //## statechart_method 
        public void state_2Exit() {
        }
        
        //## statechart_method 
        public void state_9Enter() {
        }
        
        //## statechart_method 
        public void GenNeuronSC_entDef() {
            GenNeuronSC_enter();
            state_1_entDef();
            state_2_entDef();
            state_9_entDef();
        }
        
        //## statechart_method 
        public void state_five_Chem_exit() {
            state_five_ChemExit();
        }
        
        //## statechart_method 
        public void state_five_ChemExit() {
            //#[ state ROOT.GenNeuronSC.state_1.state_five_Chem.(Exit) 
            setActivation(0);
            //#]
        }
        
        //## statechart_method 
        public void state_three_EJExit() {
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
        public void state_10Enter() {
        }
        
        //## statechart_method 
        public void GenNeuronSCExit() {
        }
        
        //## statechart_method 
        public void state_0_enter() {
            state_1_subState = state_0;
            state_1_active = state_0;
            state_0Enter();
        }
        
        //## statechart_method 
        public void state_minus_entDef() {
            state_minus_enter();
        }
        
        //## statechart_method 
        public void transmitTrig_exit() {
            transmitTrigExit();
        }
        
        //## statechart_method 
        public void transmitTrig_enter() {
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
        public void state_three_EJ_enter() {
            state_1_subState = state_three_EJ;
            state_1_active = state_three_EJ;
            state_three_EJEnter();
        }
        
        //## statechart_method 
        public void state_1_enter() {
            state_1Enter();
        }
        
        //## statechart_method 
        public int transmitTrigTakeevNoMoreTrigs() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            transmitTrig_exit();
            noTransmission_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_9_exit() {
            if(state_9_subState == state_10)
                {
                    state_10_exit();
                }
            state_9_subState = RiJNonState;
            state_9Exit();
        }
        
        //## statechart_method 
        public int cond_stateTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 8 
            if((getActivation() >= 0.25) && (getActivation() < 0.42))
                {
                    cond_state_exit();
                    state_one_EJ_entDef();
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    //## transition 9 
                    if((getActivation() >= 0.75))
                        {
                            cond_state_exit();
                            state_five_Chem_entDef();
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                    else
                        {
                            //## transition 14 
                            if((getActivation() < 0.20))
                                {
                                    cond_state_exit();
                                    state_0_entDef();
                                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                }
                            else
                                {
                                    //## transition 15 
                                    if((getActivation() >= 0.42) && (getActivation() < 0.59))
                                        {
                                            cond_state_exit();
                                            state_two_EJ_entDef();
                                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                        }
                                    else
                                        {
                                            //## transition 16 
                                            if((getActivation() >= 0.59) && (getActivation() < 0.75))
                                                {
                                                    cond_state_exit();
                                                    state_three_EJ_entDef();
                                                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                                }
                                            else
                                                {
                                                    //## transition 21 
                                                    if(getActivation() < 0)
                                                        {
                                                            cond_state_exit();
                                                            state_minus_entDef();
                                                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                                        }
                                                }
                                        }
                                }
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public void cond_stateEnter() {
        }
        
        //## statechart_method 
        public int state_one_EJ_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evTrig.evTrig_Default_id))
                {
                    res = state_one_EJTakeevTrig();
                }
            else if(event.isTypeOf(evTick.evTick_Default_id))
                {
                    res = state_one_EJTakeevTick();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_1_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int state_three_EJ_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evTrig.evTrig_Default_id))
                {
                    res = state_three_EJTakeevTrig();
                }
            else if(event.isTypeOf(evTick.evTick_Default_id))
                {
                    res = state_three_EJTakeevTick();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_1_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_two_EJ_entDef() {
            state_two_EJ_enter();
        }
        
        //## statechart_method 
        public int state_1_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void noTransmission_exit() {
            noTransmissionExit();
        }
        
        //## statechart_method 
        public void state_2_enter() {
            state_2Enter();
        }
        
        //## statechart_method 
        public int state_10_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evTick.evTick_Default_id))
                {
                    res = state_10TakeevTick();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_9_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_10_exit() {
            state_10Exit();
        }
        
        //## statechart_method 
        public void GenNeuronSC_enter() {
            rootState_subState = GenNeuronSC;
            rootState_active = GenNeuronSC;
            GenNeuronSCEnter();
        }
        
        //## statechart_method 
        public void state_one_EJ_enter() {
            state_1_subState = state_one_EJ;
            state_1_active = state_one_EJ;
            state_one_EJEnter();
        }
        
        //## statechart_method 
        public void state_one_EJ_entDef() {
            state_one_EJ_enter();
        }
        
        //## statechart_method 
        public void state_three_EJ_entDef() {
            state_three_EJ_enter();
        }
        
        //## statechart_method 
        public int state_two_EJ_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evTrig.evTrig_Default_id))
                {
                    res = state_two_EJTakeevTrig();
                }
            else if(event.isTypeOf(evTick.evTick_Default_id))
                {
                    res = state_two_EJTakeevTick();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_1_takeEvent(id);
                }
            return res;
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
            state_9_exit();
            GenNeuronSCExit();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void state_0_entDef() {
            state_0_enter();
        }
        
        //## statechart_method 
        public void state_five_Chem_enter() {
            state_1_subState = state_five_Chem;
            state_1_active = state_five_Chem;
            state_five_ChemEnter();
        }
        
        //## statechart_method 
        public void state_minusEnter() {
            //#[ state ROOT.GenNeuronSC.state_1.state_minus.(Entry) 
            setTransTime(itsManager.getClockTime() + getDecayTime());
            //#]
        }
        
        //## statechart_method 
        public void state_one_EJExit() {
        }
        
        //## statechart_method 
        public int state_three_EJTakeevTrig() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            state_three_EJ_exit();
            cond_state_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_1EntDef() {
            state_0_entDef();
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
        }
        
        //## statechart_method 
        public void cond_stateExit() {
        }
        
        //## statechart_method 
        public void cond_state_enter() {
            pushNullConfig();
            state_1_subState = cond_state;
            state_1_active = cond_state;
            cond_stateEnter();
        }
        
        //## statechart_method 
        public int state_minus_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evTrig.evTrig_Default_id))
                {
                    res = state_minusTakeevTrig();
                }
            else if(event.isTypeOf(evTick.evTick_Default_id))
                {
                    res = state_minusTakeevTick();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_1_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_minus_enter() {
            state_1_subState = state_minus;
            state_1_active = state_minus;
            state_minusEnter();
        }
        
        //## statechart_method 
        public int state_one_EJTakeevTrig() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            state_one_EJ_exit();
            cond_state_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int state_three_EJTakeevTick() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 19 
            if(getTransTime() < itsManager.getClockTime())
                {
                    state_three_EJ_exit();
                    state_0_entDef();
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int state_two_EJTakeevTrig() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            state_two_EJ_exit();
            cond_state_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int noTransmissionTakeevSendTrig() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            noTransmission_exit();
            transmitTrig_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_2EntDef() {
            //#[ transition 2 
            //signalArrivalsList = new ArrayList<String>();
            CHsignalArrivalsList = new ArrayList<String>();
            EJsignalArrivalsList = new ArrayList<String>();
            //#]
            noTransmission_entDef();
        }
        
        //## statechart_method 
        public void state_9Exit() {
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Gen_IN.java
*********************************************************************/

