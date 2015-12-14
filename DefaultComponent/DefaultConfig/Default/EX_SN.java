/*********************************************************************
	Rhapsody	: 7.6.1
	Login		: hlapid
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: EX_SN
//!	Generated Date	: Thu, 26, Nov 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/EX_SN.java
*********************************************************************/

package Default;

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
// Default/EX_SN.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class EX_SN 
public class EX_SN extends Gen_SN implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassEX_SN = new AnimClass("Default.EX_SN",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected EX_IN itsEX_IN;		//## link itsEX_IN 
    
    protected Gen_Neuron itsGen_Neuron;		//## link itsGen_Neuron 
    
    protected Manager itsManager_1;		//## link itsManager_1 
    
    
    
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
    
    //## operation EX_SN() 
    public  EX_SN(RiJThread p_thread) {
        super(p_thread);
        try {
            animInstance().notifyConstructorEntered(animClassEX_SN.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        //#[ operation EX_SN() 
        setActivation(0);  
        //setThreshold(1);
        //setting PropTimes: {sn = 0, in = 1, mn = 2}
        setPropTimes(0, 0);
        setPropTimes(1, 5);
        setPropTimes(2, 0);
        
        //setting SynWeights: {sn = 0, in = 1, mn = 2}
        setSynWeights(0, 0);
        setSynWeights(1, 0.8);
        setSynWeights(2, 0);
        
        startBehavior();
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public EX_IN getItsEX_IN() {
        return itsEX_IN;
    }
    
    //## auto_generated 
    public void __setItsEX_IN(EX_IN p_EX_IN) {
        itsEX_IN = p_EX_IN;
        if(p_EX_IN != null)
            {
                animInstance().notifyRelationAdded("itsEX_IN", p_EX_IN);
            }
        else
            {
                animInstance().notifyRelationCleared("itsEX_IN");
            }
    }
    
    //## auto_generated 
    public void _setItsEX_IN(EX_IN p_EX_IN) {
        if(itsEX_IN != null)
            {
                itsEX_IN.__setItsEX_SN(null);
            }
        __setItsEX_IN(p_EX_IN);
    }
    
    //## auto_generated 
    public void setItsEX_IN(EX_IN p_EX_IN) {
        if(p_EX_IN != null)
            {
                p_EX_IN._setItsEX_SN(this);
            }
        _setItsEX_IN(p_EX_IN);
    }
    
    //## auto_generated 
    public void _clearItsEX_IN() {
        animInstance().notifyRelationCleared("itsEX_IN");
        itsEX_IN = null;
    }
    
    //## auto_generated 
    public Gen_Neuron getItsGen_Neuron() {
        return itsGen_Neuron;
    }
    
    //## auto_generated 
    public void __setItsGen_Neuron(Gen_Neuron p_Gen_Neuron) {
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
    public void _setItsGen_Neuron(Gen_Neuron p_Gen_Neuron) {
        if(itsGen_Neuron != null)
            {
                itsGen_Neuron.__setItsEX_SN(null);
            }
        __setItsGen_Neuron(p_Gen_Neuron);
    }
    
    //## auto_generated 
    public void setItsGen_Neuron(Gen_Neuron p_Gen_Neuron) {
        if(p_Gen_Neuron != null)
            {
                p_Gen_Neuron._setItsEX_SN(this);
            }
        _setItsGen_Neuron(p_Gen_Neuron);
    }
    
    //## auto_generated 
    public void _clearItsGen_Neuron() {
        animInstance().notifyRelationCleared("itsGen_Neuron");
        itsGen_Neuron = null;
    }
    
    //## auto_generated 
    public Manager getItsManager_1() {
        return itsManager_1;
    }
    
    //## auto_generated 
    public void __setItsManager_1(Manager p_Manager) {
        itsManager_1 = p_Manager;
        if(p_Manager != null)
            {
                animInstance().notifyRelationAdded("itsManager_1", p_Manager);
            }
        else
            {
                animInstance().notifyRelationCleared("itsManager_1");
            }
    }
    
    //## auto_generated 
    public void _setItsManager_1(Manager p_Manager) {
        if(itsManager_1 != null)
            {
                itsManager_1.__setItsEX_SN(null);
            }
        __setItsManager_1(p_Manager);
    }
    
    //## auto_generated 
    public void setItsManager_1(Manager p_Manager) {
        if(p_Manager != null)
            {
                p_Manager._setItsEX_SN(this);
            }
        _setItsManager_1(p_Manager);
    }
    
    //## auto_generated 
    public void _clearItsManager_1() {
        animInstance().notifyRelationCleared("itsManager_1");
        itsManager_1 = null;
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
                case state_1_state_1:
                {
                    state_1_state_1_add(animStates);
                }
                break;
                case state_1_full:
                {
                    state_1_full_add(animStates);
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
                case state_1_state_1:
                {
                    res = state_1_state_1_takeEvent(id);
                }
                break;
                case state_1_full:
                {
                    res = state_1_full_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void state_1_full_add(AnimStates animStates) {
            animStates.add("ROOT.GenNeuronSC.state_1.state_1_full");
        }
        
        //## statechart_method 
        public void state_1_state_1_add(AnimStates animStates) {
            animStates.add("ROOT.GenNeuronSC.state_1.state_1");
        }
        
        //## statechart_method 
        public void state_0_add(AnimStates animStates) {
            animStates.add("ROOT.GenNeuronSC.state_1.state_0");
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
        public void state_1_state_1_exit() {
            state_1_state_1Exit();
            animInstance().notifyStateExited("ROOT.GenNeuronSC.state_1.state_1");
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
            if(event.isTypeOf(evExternalTrig.evExternalTrig_Default_id))
                {
                    res = state_0TakeevExternalTrig();
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
        public void state_1_state_1Exit() {
        }
        
        //## statechart_method 
        public void state_1_fullEnter() {
            //#[ state ROOT.GenNeuronSC.state_1.state_1_full.(Entry) 
            setActivation(1);
            gen(new evSendTrig());
            
            itsManager.outputFileP.println("sensory neuron sending trig");
            setTransTime(itsManager.getClockTime() + getDecayTime());
            //#]
        }
        
        //## statechart_method 
        public void state_1_full_entDef() {
            state_1_full_enter();
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
        public void state_1_exit() {
            switch (state_1_subState) {
                case state_0:
                {
                    state_0_exit();
                }
                break;
                case state_1_state_1:
                {
                    state_1_state_1_exit();
                }
                break;
                case state_1_full:
                {
                    state_1_full_exit();
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
            if(getTransTime() <=  itsManager.getClockTime() && !signalArrivalsList.isEmpty())
                {
                    animInstance().notifyTransitionStarted("4");
                    //#[ transition 4 
                    
                    int currTime = itsManager.getClockTime();
                    Iterator it = signalArrivalsList.iterator();
                    
                    while (it.hasNext())
                    {
                    	String str = (String)it.next();
                    	String[] parsed = str.split(",");
                    	int sendTime = Integer.parseInt(parsed[0]);
                    	int destNeuron = Integer.parseInt(parsed[1]);
                    	
                    	if (sendTime == currTime)
                    	{
                    		it.remove();         // very important - delete the current command!
                    		// 0 = sn, 1 = in, 2 = mn
                    		if (destNeuron == 0) {
                    			itsEX_SN.setActivation(itsEX_SN.getActivation() + getSynWeights(destNeuron));
                    			itsEX_SN.gen(new evTrig());
                    			itsManager.outputFileP.println("(**) Triggering SN\n");
                    		}
                    		if (destNeuron == 2) {
                    			itsEX_MN.setActivation(itsEX_MN.getActivation() + getSynWeights(destNeuron));
                    			itsEX_MN.gen(new evTrig());
                    			itsManager.outputFileP.println("(**) Triggering MN\n");
                    		}
                    		if (destNeuron == 1) {
                    			itsEX_IN.setActivation(itsEX_IN.getActivation() + getSynWeights(destNeuron));
                    			itsEX_IN.gen(new evTrig());
                    			itsManager.outputFileP.println("(**) Triggering IN\n");
                    		}
                    	}
                    		
                    }
                    //#]
                    animInstance().notifyTransitionEnded("4");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    //## transition 5 
                    if(signalArrivalsList.isEmpty())
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
        public int state_1_fullTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 7 
            if(getTransTime() < itsManager.getClockTime())
                {
                    animInstance().notifyTransitionStarted("7");
                    state_1_full_exit();
                    //#[ transition 7 
                    setActivation(0);
                    //#]
                    state_0_entDef();
                    animInstance().notifyTransitionEnded("7");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void state_1_state_1_enter() {
            animInstance().notifyStateEntered("ROOT.GenNeuronSC.state_1.state_1");
            state_1_subState = state_1_state_1;
            state_1_active = state_1_state_1;
            state_1_state_1Enter();
        }
        
        //## statechart_method 
        public void state_1_full_exit() {
            popNullConfig();
            state_1_fullExit();
            animInstance().notifyStateExited("ROOT.GenNeuronSC.state_1.state_1_full");
        }
        
        //## statechart_method 
        public void state_1_full_enter() {
            animInstance().notifyStateEntered("ROOT.GenNeuronSC.state_1.state_1_full");
            pushNullConfig();
            state_1_subState = state_1_full;
            state_1_active = state_1_full;
            state_1_fullEnter();
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
        public int state_1_full_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = state_1_fullTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_1_takeEvent(id);
                }
            return res;
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
            //#[ state ROOT.GenNeuronSC.state_2.transmitTrig.(Entry) 
            //itsManager.outputFileP.println("Neuron " + name + " is at transmitting");
            itsManager.outputFileP.println("transmitting");
            
            	                                            // Make a list of times in which I need to transmit, and the target neurons.
            
            int len = synWeights.length;
            String str;
            
            for (int i = 0; i < len; i++) 
            {
            	if (!(getSynWeights(i) == 0))
            	{  
            		// if I have a connection to the i'th neuron...
            		// every string in signalArrivalList is built as follows:   "int1,int2"
            		// in which int1 = the time in which the signal should be sent
            		// and int2 = the target neuron
            		str = Integer.toString(getTransTime() + getPropTimes(i)) + "," + Integer.toString(i);
            		signalArrivalsList.add(str);
            	}
            }
            //#]
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
        public int state_0TakeevExternalTrig() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            state_0_exit();
            state_1_full_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
        public void state_1_state_1_entDef() {
            state_1_state_1_enter();
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
        public void state_1_fullExit() {
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
        public void state_1_state_1Enter() {
            //#[ state ROOT.GenNeuronSC.state_1.state_1.(Entry) 
            // debugging state only! Won't compile without this for some reason...
            //#]
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
        public int state_1_state_1_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            res = state_1_takeEvent(id);
            return res;
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
            signalArrivalsList = new ArrayList<String>();
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
            return EX_SN.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassEX_SN; 
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
        
        msg.add("itsManager_1", false, true, itsManager_1);
        msg.add("itsEX_IN", false, true, itsEX_IN);
        msg.add("itsGen_Neuron", false, true, itsGen_Neuron);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(EX_SN.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            EX_SN.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            EX_SN.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/EX_SN.java
*********************************************************************/

