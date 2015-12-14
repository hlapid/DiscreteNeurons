/*********************************************************************
	Rhapsody	: 7.6.1
	Login		: hlapid
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Gen_Neuron
//!	Generated Date	: Tue, 8, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/Gen_Neuron.java
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
// Default/Gen_Neuron.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Gen_Neuron 
public class Gen_Neuron implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassGen_Neuron = new AnimClass("Default.Gen_Neuron",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected int CHSynDelay;		//## attribute CHSynDelay 
    
    protected double CHcoeff = 0.4;		//## attribute CHcoeff 
    
    protected ArrayList<String> CHsignalArrivalsList;		//## attribute CHsignalArrivalsList 
    
    protected double[] CHsynWeights;		//## attribute CHsynWeights 
    
    protected int EJSynDelay;		//## attribute EJSynDelay 
    
    protected double EJcoeff = 0.1;		//## attribute EJcoeff 
    
    protected ArrayList<String> EJsignalArrivalsList;		//## attribute EJsignalArrivalsList 
    
    protected double[] EJsynWeights;		//## attribute EJsynWeights 
    
    protected double activation;		//## attribute activation 
    
    protected int attribute_23;		//## attribute attribute_23 
    
    protected int decayTime;		//## attribute decayTime 
    
    protected String neuronName;		//## attribute neuronName 
    
    protected int neuronNumber;		//## attribute neuronNumber 
    
    protected String neuronType;		//## attribute neuronType 
    
    protected int[] propTimes;		//## attribute propTimes 
    
    protected ArrayList<String> signalArrivalsList;		//## attribute signalArrivalsList 
    
    protected int transTime;		//## attribute transTime 
    
    protected Manager itsManager;		//## link itsManager 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int GenNeuronSC=1;
    public static final int state_2=2;
    public static final int transmitTrig=3;
    public static final int noTransmission=4;
    public static final int state_1=5;
    public static final int state_0=6;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    protected int state_2_subState;		//## ignore 
    
    protected int state_2_active;		//## ignore 
    
    protected int state_1_subState;		//## ignore 
    
    protected int state_1_active;		//## ignore 
    
    
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
    
    //## auto_generated 
    public  Gen_Neuron(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassGen_Neuron.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public int getCHSynDelay() {
        return CHSynDelay;
    }
    
    //## auto_generated 
    public void setCHSynDelay(int p_CHSynDelay) {
        CHSynDelay = p_CHSynDelay;
    }
    
    //## auto_generated 
    public double getCHcoeff() {
        return CHcoeff;
    }
    
    //## auto_generated 
    public void setCHcoeff(double p_CHcoeff) {
        CHcoeff = p_CHcoeff;
    }
    
    //## auto_generated 
    public ArrayList<String> getCHsignalArrivalsList() {
        return CHsignalArrivalsList;
    }
    
    //## auto_generated 
    public void setCHsignalArrivalsList(ArrayList<String> p_CHsignalArrivalsList) {
        CHsignalArrivalsList = p_CHsignalArrivalsList;
    }
    
    //## auto_generated 
    public double getCHsynWeights(int i1) {
        return CHsynWeights[i1];
    }
    
    //## auto_generated 
    public void setCHsynWeights(int i1, double p_CHsynWeights) {
        CHsynWeights[i1] = p_CHsynWeights;
    }
    
    //## auto_generated 
    public int getEJSynDelay() {
        return EJSynDelay;
    }
    
    //## auto_generated 
    public void setEJSynDelay(int p_EJSynDelay) {
        EJSynDelay = p_EJSynDelay;
    }
    
    //## auto_generated 
    public double getEJcoeff() {
        return EJcoeff;
    }
    
    //## auto_generated 
    public void setEJcoeff(double p_EJcoeff) {
        EJcoeff = p_EJcoeff;
    }
    
    //## auto_generated 
    public ArrayList<String> getEJsignalArrivalsList() {
        return EJsignalArrivalsList;
    }
    
    //## auto_generated 
    public void setEJsignalArrivalsList(ArrayList<String> p_EJsignalArrivalsList) {
        EJsignalArrivalsList = p_EJsignalArrivalsList;
    }
    
    //## auto_generated 
    public double getEJsynWeights(int i1) {
        return EJsynWeights[i1];
    }
    
    //## auto_generated 
    public void setEJsynWeights(int i1, double p_EJsynWeights) {
        EJsynWeights[i1] = p_EJsynWeights;
    }
    
    //## auto_generated 
    public double getActivation() {
        return activation;
    }
    
    //## auto_generated 
    public void setActivation(double p_activation) {
        activation = p_activation;
    }
    
    //## auto_generated 
    public int getAttribute_23() {
        return attribute_23;
    }
    
    //## auto_generated 
    public void setAttribute_23(int p_attribute_23) {
        attribute_23 = p_attribute_23;
    }
    
    //## auto_generated 
    public int getDecayTime() {
        return decayTime;
    }
    
    //## auto_generated 
    public void setDecayTime(int p_decayTime) {
        decayTime = p_decayTime;
    }
    
    //## auto_generated 
    public String getNeuronName() {
        return neuronName;
    }
    
    //## auto_generated 
    public void setNeuronName(String p_neuronName) {
        neuronName = p_neuronName;
    }
    
    //## auto_generated 
    public int getNeuronNumber() {
        return neuronNumber;
    }
    
    //## auto_generated 
    public void setNeuronNumber(int p_neuronNumber) {
        neuronNumber = p_neuronNumber;
    }
    
    //## auto_generated 
    public String getNeuronType() {
        return neuronType;
    }
    
    //## auto_generated 
    public void setNeuronType(String p_neuronType) {
        neuronType = p_neuronType;
    }
    
    //## auto_generated 
    public int getPropTimes(int i1) {
        return propTimes[i1];
    }
    
    //## auto_generated 
    public void setPropTimes(int i1, int p_propTimes) {
        propTimes[i1] = p_propTimes;
    }
    
    //## auto_generated 
    public ArrayList<String> getSignalArrivalsList() {
        return signalArrivalsList;
    }
    
    //## auto_generated 
    public void setSignalArrivalsList(ArrayList<String> p_signalArrivalsList) {
        signalArrivalsList = p_signalArrivalsList;
    }
    
    //## auto_generated 
    public int getTransTime() {
        return transTime;
    }
    
    //## auto_generated 
    public void setTransTime(int p_transTime) {
        transTime = p_transTime;
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
                itsManager._removeItsGen_Neuron(this);
            }
        __setItsManager(p_Manager);
    }
    
    //## auto_generated 
    public void setItsManager(Manager p_Manager) {
        if(p_Manager != null)
            {
                p_Manager._addItsGen_Neuron(this);
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
            if(state_1_subState == state_0)
                {
                    state_0_add(animStates);
                }
        }
        
        //## statechart_method 
        public int state_1_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
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
            res = state_1_takeEvent(id);
            return res;
        }
        
        //## statechart_method 
        public void state_0Enter() {
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
            if(state_1_subState == state_0)
                {
                    state_0_exit();
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
        public void state_2Exit() {
        }
        
        //## statechart_method 
        public void GenNeuronSC_entDef() {
            GenNeuronSC_enter();
            state_1_entDef();
            state_2_entDef();
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
            return Gen_Neuron.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassGen_Neuron; 
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
        
        msg.add("propTimes", propTimes);
        msg.add("EJsynWeights", EJsynWeights);
        msg.add("decayTime", decayTime);
        msg.add("signalArrivalsList", signalArrivalsList);
        msg.add("transTime", transTime);
        msg.add("activation", activation);
        msg.add("neuronName", neuronName);
        msg.add("neuronType", neuronType);
        msg.add("CHsynWeights", CHsynWeights);
        msg.add("EJSynDelay", EJSynDelay);
        msg.add("CHSynDelay", CHSynDelay);
        msg.add("CHsignalArrivalsList", CHsignalArrivalsList);
        msg.add("EJsignalArrivalsList", EJsignalArrivalsList);
        msg.add("attribute_23", attribute_23);
        msg.add("neuronNumber", neuronNumber);
        msg.add("EJcoeff", EJcoeff);
        msg.add("CHcoeff", CHcoeff);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsManager", false, true, itsManager);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Gen_Neuron.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Gen_Neuron.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Gen_Neuron.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Gen_Neuron.java
*********************************************************************/

