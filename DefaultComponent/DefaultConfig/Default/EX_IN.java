/*********************************************************************
	Rhapsody	: 7.6.1
	Login		: hlapid
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: EX_IN
//!	Generated Date	: Thu, 26, Nov 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/EX_IN.java
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
// Default/EX_IN.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class EX_IN 
public class EX_IN extends Gen_IN implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassEX_IN = new AnimClass("Default.EX_IN",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected EX_MN itsEX_MN;		//## link itsEX_MN 
    
    protected EX_SN itsEX_SN;		//## link itsEX_SN 
    
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
    
    //## operation EX_IN() 
    public  EX_IN(RiJThread p_thread) {
        super(p_thread);
        try {
            animInstance().notifyConstructorEntered(animClassEX_IN.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        //#[ operation EX_IN() 
        setActivation(0);  
        //setThreshold(1);
        //setting PropTimes: {sn = 0, in = 1, mn = 2}
        setPropTimes(0, 0);
        setPropTimes(1, 0);
        setPropTimes(2, 5);
        
        //setting SynWeights: {sn = 0, in = 1, mn = 2}
        setSynWeights(0, 0);
        setSynWeights(1, 0);
        setSynWeights(2, 0.8);
        
        startBehavior();
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public EX_MN getItsEX_MN() {
        return itsEX_MN;
    }
    
    //## auto_generated 
    public void __setItsEX_MN(EX_MN p_EX_MN) {
        itsEX_MN = p_EX_MN;
        if(p_EX_MN != null)
            {
                animInstance().notifyRelationAdded("itsEX_MN", p_EX_MN);
            }
        else
            {
                animInstance().notifyRelationCleared("itsEX_MN");
            }
    }
    
    //## auto_generated 
    public void _setItsEX_MN(EX_MN p_EX_MN) {
        if(itsEX_MN != null)
            {
                itsEX_MN.__setItsEX_IN(null);
            }
        __setItsEX_MN(p_EX_MN);
    }
    
    //## auto_generated 
    public void setItsEX_MN(EX_MN p_EX_MN) {
        if(p_EX_MN != null)
            {
                p_EX_MN._setItsEX_IN(this);
            }
        _setItsEX_MN(p_EX_MN);
    }
    
    //## auto_generated 
    public void _clearItsEX_MN() {
        animInstance().notifyRelationCleared("itsEX_MN");
        itsEX_MN = null;
    }
    
    //## auto_generated 
    public EX_SN getItsEX_SN() {
        return itsEX_SN;
    }
    
    //## auto_generated 
    public void __setItsEX_SN(EX_SN p_EX_SN) {
        itsEX_SN = p_EX_SN;
        if(p_EX_SN != null)
            {
                animInstance().notifyRelationAdded("itsEX_SN", p_EX_SN);
            }
        else
            {
                animInstance().notifyRelationCleared("itsEX_SN");
            }
    }
    
    //## auto_generated 
    public void _setItsEX_SN(EX_SN p_EX_SN) {
        if(itsEX_SN != null)
            {
                itsEX_SN.__setItsEX_IN(null);
            }
        __setItsEX_SN(p_EX_SN);
    }
    
    //## auto_generated 
    public void setItsEX_SN(EX_SN p_EX_SN) {
        if(p_EX_SN != null)
            {
                p_EX_SN._setItsEX_IN(this);
            }
        _setItsEX_SN(p_EX_SN);
    }
    
    //## auto_generated 
    public void _clearItsEX_SN() {
        animInstance().notifyRelationCleared("itsEX_SN");
        itsEX_SN = null;
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
                itsGen_Neuron.__setItsEX_IN(null);
            }
        __setItsGen_Neuron(p_Gen_Neuron);
    }
    
    //## auto_generated 
    public void setItsGen_Neuron(Gen_Neuron p_Gen_Neuron) {
        if(p_Gen_Neuron != null)
            {
                p_Gen_Neuron._setItsEX_IN(this);
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
                itsManager_1.__setItsEX_IN(null);
            }
        __setItsManager_1(p_Manager);
    }
    
    //## auto_generated 
    public void setItsManager_1(Manager p_Manager) {
        if(p_Manager != null)
            {
                p_Manager._setItsEX_IN(this);
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
                case state_one_EJ:
                {
                    state_one_EJ_add(animStates);
                }
                break;
                case cond_state:
                {
                    cond_state_add(animStates);
                }
                break;
                case state_five_Chem:
                {
                    state_five_Chem_add(animStates);
                }
                break;
                case state_1_state_1:
                {
                    state_1_state_1_add(animStates);
                }
                break;
                case state_two_EJ:
                {
                    state_two_EJ_add(animStates);
                }
                break;
                case state_three_EJ:
                {
                    state_three_EJ_add(animStates);
                }
                break;
                case state_four_EJ:
                {
                    state_four_EJ_add(animStates);
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
                case state_1_state_1:
                {
                    res = state_1_state_1_takeEvent(id);
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
                case state_four_EJ:
                {
                    res = state_four_EJ_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void state_two_EJ_add(AnimStates animStates) {
            animStates.add("ROOT.GenNeuronSC.state_1.state_two_EJ");
        }
        
        //## statechart_method 
        public void state_three_EJ_add(AnimStates animStates) {
            animStates.add("ROOT.GenNeuronSC.state_1.state_three_EJ");
        }
        
        //## statechart_method 
        public void state_one_EJ_add(AnimStates animStates) {
            animStates.add("ROOT.GenNeuronSC.state_1.state_one_EJ");
        }
        
        //## statechart_method 
        public void state_four_EJ_add(AnimStates animStates) {
            animStates.add("ROOT.GenNeuronSC.state_1.state_four_EJ");
        }
        
        //## statechart_method 
        public void state_five_Chem_add(AnimStates animStates) {
            animStates.add("ROOT.GenNeuronSC.state_1.state_five_Chem");
        }
        
        //## statechart_method 
        public void state_1_state_1_add(AnimStates animStates) {
            animStates.add("ROOT.GenNeuronSC.state_1.state_1");
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
        public void state_1_state_1_exit() {
            state_1_state_1Exit();
            animInstance().notifyStateExited("ROOT.GenNeuronSC.state_1.state_1");
        }
        
        //## statechart_method 
        public int state_one_EJTakeevTick() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 8 
            if(getTransTime() < itsManager.getClockTime())
                {
                    animInstance().notifyTransitionStarted("8");
                    state_one_EJ_exit();
                    state_0_entDef();
                    animInstance().notifyTransitionEnded("8");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int state_two_EJTakeevTick() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 21 
            if(getTransTime() < itsManager.getClockTime())
                {
                    animInstance().notifyTransitionStarted("21");
                    state_two_EJ_exit();
                    state_0_entDef();
                    animInstance().notifyTransitionEnded("21");
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
        public void state_two_EJExit() {
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
            //#[ state ROOT.GenNeuronSC.state_1.state_0.(Entry) 
            setActivation(0);
            //#]
        }
        
        //## statechart_method 
        public void state_four_EJExit() {
        }
        
        //## statechart_method 
        public void state_1_state_1Exit() {
        }
        
        //## statechart_method 
        public void state_one_EJEnter() {
            //#[ state ROOT.GenNeuronSC.state_1.state_one_EJ.(Entry) 
            setTransTime(itsManager.getClockTime() + getDecayTime());
            gen(new evSendTrig());
            //#]
        }
        
        //## statechart_method 
        public void state_two_EJEnter() {
            //#[ state ROOT.GenNeuronSC.state_1.state_two_EJ.(Entry) 
            setTransTime(itsManager.getClockTime() + getDecayTime());
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
            animInstance().notifyTransitionStarted("9");
            state_0_exit();
            cond_state_entDef();
            animInstance().notifyTransitionEnded("9");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int state_five_ChemTakeevTick() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 10 
            if(getTransTime() < itsManager.getClockTime())
                {
                    animInstance().notifyTransitionStarted("10");
                    state_five_Chem_exit();
                    state_0_entDef();
                    animInstance().notifyTransitionEnded("10");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void state_four_EJ_enter() {
            animInstance().notifyStateEntered("ROOT.GenNeuronSC.state_1.state_four_EJ");
            state_1_subState = state_four_EJ;
            state_1_active = state_four_EJ;
            state_four_EJEnter();
        }
        
        //## statechart_method 
        public void state_four_EJEnter() {
            //#[ state ROOT.GenNeuronSC.state_1.state_four_EJ.(Entry) 
            setTransTime(itsManager.getClockTime() + getDecayTime());
            gen(new evSendTrig());
            //#]
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
                case state_1_state_1:
                {
                    state_1_state_1_exit();
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
                case state_four_EJ:
                {
                    state_four_EJ_exit();
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
        public void state_two_EJ_enter() {
            animInstance().notifyStateEntered("ROOT.GenNeuronSC.state_1.state_two_EJ");
            state_1_subState = state_two_EJ;
            state_1_active = state_two_EJ;
            state_two_EJEnter();
        }
        
        //## statechart_method 
        public void state_1_state_1_enter() {
            animInstance().notifyStateEntered("ROOT.GenNeuronSC.state_1.state_1");
            state_1_subState = state_1_state_1;
            state_1_active = state_1_state_1;
            state_1_state_1Enter();
        }
        
        //## statechart_method 
        public void state_one_EJ_exit() {
            state_one_EJExit();
            animInstance().notifyStateExited("ROOT.GenNeuronSC.state_1.state_one_EJ");
        }
        
        //## statechart_method 
        public void state_three_EJEnter() {
            //#[ state ROOT.GenNeuronSC.state_1.state_three_EJ.(Entry) 
            setTransTime(itsManager.getClockTime() + getDecayTime());
            gen(new evSendTrig());
            //#]
        }
        
        //## statechart_method 
        public void state_two_EJ_exit() {
            state_two_EJExit();
            animInstance().notifyStateExited("ROOT.GenNeuronSC.state_1.state_two_EJ");
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
        public void state_five_ChemEnter() {
            //#[ state ROOT.GenNeuronSC.state_1.state_five_Chem.(Entry) 
            setTransTime(itsManager.getClockTime() + getDecayTime());
            gen(new evSendTrig());
            //#]
        }
        
        //## statechart_method 
        public void state_five_Chem_entDef() {
            state_five_Chem_enter();
        }
        
        //## statechart_method 
        public void state_four_EJ_exit() {
            state_four_EJExit();
            animInstance().notifyStateExited("ROOT.GenNeuronSC.state_1.state_four_EJ");
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
        public void state_four_EJ_entDef() {
            state_four_EJ_enter();
        }
        
        //## statechart_method 
        public void state_three_EJ_exit() {
            state_three_EJExit();
            animInstance().notifyStateExited("ROOT.GenNeuronSC.state_1.state_three_EJ");
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
        public void state_five_Chem_exit() {
            state_five_ChemExit();
            animInstance().notifyStateExited("ROOT.GenNeuronSC.state_1.state_five_Chem");
        }
        
        //## statechart_method 
        public void state_five_ChemExit() {
            //#[ state ROOT.GenNeuronSC.state_1.state_five_Chem.(Exit) 
            setActivation(0);
            //#]
        }
        
        //## statechart_method 
        public int state_four_EJ_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evTrig.evTrig_Default_id))
                {
                    res = state_four_EJTakeevTrig();
                }
            else if(event.isTypeOf(evTick.evTick_Default_id))
                {
                    res = state_four_EJTakeevTick();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_1_takeEvent(id);
                }
            return res;
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
        public void state_three_EJ_enter() {
            animInstance().notifyStateEntered("ROOT.GenNeuronSC.state_1.state_three_EJ");
            state_1_subState = state_three_EJ;
            state_1_active = state_three_EJ;
            state_three_EJEnter();
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
            //## transition 6 
            if((getActivation() >= 0.20) && (getActivation() < 0.35))
                {
                    animInstance().notifyTransitionStarted("6");
                    cond_state_exit();
                    state_one_EJ_entDef();
                    animInstance().notifyTransitionEnded("6");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    //## transition 7 
                    if((getActivation() >= 0.80))
                        {
                            animInstance().notifyTransitionStarted("7");
                            cond_state_exit();
                            state_five_Chem_entDef();
                            animInstance().notifyTransitionEnded("7");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                    else
                        {
                            //## transition 12 
                            if((getActivation() < 0.20))
                                {
                                    animInstance().notifyTransitionStarted("12");
                                    cond_state_exit();
                                    state_0_entDef();
                                    animInstance().notifyTransitionEnded("12");
                                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                }
                            else
                                {
                                    //## transition 13 
                                    if((getActivation() >= 0.35) && (getActivation() < 0.50))
                                        {
                                            animInstance().notifyTransitionStarted("13");
                                            cond_state_exit();
                                            state_two_EJ_entDef();
                                            animInstance().notifyTransitionEnded("13");
                                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                        }
                                    else
                                        {
                                            //## transition 14 
                                            if((getActivation() >= 0.50) && (getActivation() < 0.65))
                                                {
                                                    animInstance().notifyTransitionStarted("14");
                                                    cond_state_exit();
                                                    state_three_EJ_entDef();
                                                    animInstance().notifyTransitionEnded("14");
                                                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                                }
                                            else
                                                {
                                                    //## transition 15 
                                                    if((getActivation() >= 0.65) && (getActivation() < 0.80))
                                                        {
                                                            animInstance().notifyTransitionStarted("15");
                                                            cond_state_exit();
                                                            state_four_EJ_entDef();
                                                            animInstance().notifyTransitionEnded("15");
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
        public int state_four_EJTakeevTrig() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("18");
            state_four_EJ_exit();
            cond_state_entDef();
            animInstance().notifyTransitionEnded("18");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
        public int state_four_EJTakeevTick() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 19 
            if(getTransTime() < itsManager.getClockTime())
                {
                    animInstance().notifyTransitionStarted("19");
                    state_four_EJ_exit();
                    state_0_entDef();
                    animInstance().notifyTransitionEnded("19");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void state_one_EJ_enter() {
            animInstance().notifyStateEntered("ROOT.GenNeuronSC.state_1.state_one_EJ");
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
        public void state_five_Chem_enter() {
            animInstance().notifyStateEntered("ROOT.GenNeuronSC.state_1.state_five_Chem");
            state_1_subState = state_five_Chem;
            state_1_active = state_five_Chem;
            state_five_ChemEnter();
        }
        
        //## statechart_method 
        public void state_one_EJExit() {
        }
        
        //## statechart_method 
        public int state_three_EJTakeevTrig() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("17");
            state_three_EJ_exit();
            cond_state_entDef();
            animInstance().notifyTransitionEnded("17");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
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
        public int state_one_EJTakeevTrig() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("11");
            state_one_EJ_exit();
            cond_state_entDef();
            animInstance().notifyTransitionEnded("11");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int state_three_EJTakeevTick() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 20 
            if(getTransTime() < itsManager.getClockTime())
                {
                    animInstance().notifyTransitionStarted("20");
                    state_three_EJ_exit();
                    state_0_entDef();
                    animInstance().notifyTransitionEnded("20");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int state_two_EJTakeevTrig() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("16");
            state_two_EJ_exit();
            cond_state_entDef();
            animInstance().notifyTransitionEnded("16");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
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
            return EX_IN.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassEX_IN; 
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
        msg.add("itsEX_SN", false, true, itsEX_SN);
        msg.add("itsEX_MN", false, true, itsEX_MN);
        msg.add("itsGen_Neuron", false, true, itsGen_Neuron);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(EX_IN.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            EX_IN.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            EX_IN.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/EX_IN.java
*********************************************************************/

