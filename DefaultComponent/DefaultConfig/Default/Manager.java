/*********************************************************************
	Rhapsody	: 7.6.1
	Login		: hlapid
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Manager
//!	Generated Date	: Mon, 14, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/Manager.java
*********************************************************************/

package Default;

//## dependency io 
import java.io.*;
//## auto_generated
import java.util.*;
//## dependency text 
import java.text.*;
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
// Default/Manager.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Manager 
public class Manager implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassManager = new AnimClass("Default.Manager",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    /**
     * same as EJmatrix for chemical synapses
     * used only for construction of CHSynWeights vectors
    */
    protected double[][] CHweightsMatrix;		//## attribute CHweightsMatrix 
    
    /**
     * 60X60 matrix of electric synapses weights
     * used only for construction of EJSynWeights vectors
    */
    protected double[][] EJweightsMatrix;		//## attribute EJweightsMatrix 
    
    /**
     * maximal number of neurons in simulation
    */
    protected int N_of_neurons;		//## attribute N_of_neurons 
    
    /**
     * clock time is the simulation time step;
    */
    protected int clockTime = 0;		//## attribute clockTime 
    
    /**
     * simulation log - all construction commans, triggers etc.
    */
    protected FileOutputStream cmdFile;		//## attribute cmdFile 
    
    /**
     * Java print object for cmfFIle
    */
    protected PrintStream cmdFileP;		//## attribute cmdFileP 
    
    /**
     * discrete table of distances between neurons for propagation times of triggers between neurons (60X60)
    */
    protected int[][] distMatrix;		//## attribute distMatrix 
    
    /**
     * hitObs guards from infinite looping over hitObs states, once entering hitObs state, hitObs = 1.
     * 
    */
    protected boolean hitObs = false;		//## attribute hitObs 
    
    protected Gen_IN[] interNeurons;		//## attribute interNeurons 
    
    protected ArrayList<String> interNeuronsList;		//## attribute interNeuronsList 
    
    protected Gen_MN[] motorNeurons;		//## attribute motorNeurons 
    
    protected ArrayList<String> motorNeuronsList;		//## attribute motorNeuronsList 
    
    /**
     * hash table of neuron number (1..60) and neuron name
    */
    protected Map neuron_names;		//## attribute neuron_names 
    
    /**
     * lists the activation values of all neurons at each simulation time step:
     * TS NEURON_NAME
     * int double
    */
    protected FileOutputStream outputFile;		//## attribute outputFile 
    
    /**
     * printed version of outputFile (Java object 'printStream')
    */
    protected PrintStream outputFileP;		//## attribute outputFileP 
    
    protected Gen_SN[] sensoryNeurons;		//## attribute sensoryNeurons 
    
    protected ArrayList<String> sensoryNeuronsList;		//## attribute sensoryNeuronsList 
    
    /**
     * simRuntime is the final simulation time step, conditioned at manager loop for exiting the simulation
    */
    protected int simRuntime = 150;		//## attribute simRuntime 
    
    protected ArrayList<Gen_IN> itsGen_IN = itsGen_IN = new ArrayList<Gen_IN>();		//## link itsGen_IN 
    
    protected ArrayList<Gen_MN> itsGen_MN = itsGen_MN = new ArrayList<Gen_MN>();		//## link itsGen_MN 
    
    protected ArrayList<Gen_Neuron> itsGen_Neuron = itsGen_Neuron = new ArrayList<Gen_Neuron>();		//## link itsGen_Neuron 
    
    protected ArrayList<Gen_SN> itsGen_SN = itsGen_SN = new ArrayList<Gen_SN>();		//## link itsGen_SN 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int manager=1;
    public static final int hit_obs=2;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int Manager_Timeout_manager_id = 1;		//## ignore 
    
    
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
    
    //## operation Manager() 
    public  Manager(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassManager.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        //#[ operation Manager() 
        
        // the creation of the output files doesn't compile without try & catch
        try{
        	outputFile = new FileOutputStream("dis_neuron_log.csv");
        	outputFileP = new PrintStream(outputFile);
          	
          	cmdFile = new FileOutputStream("cmd_log.txt");
          	cmdFileP = new PrintStream(cmdFile); 
        	cmdFileP.println("Starting simulation:");
        }
        catch (Exception e){
         	System.err.println ("Error opening file");
        }
        
        /**
         * creating objects
         */
        
        // the map that conaints (name, number) pairs
        neuron_names = new HashMap();
        
        interNeuronsList = new ArrayList<String>();
        motorNeuronsList = new ArrayList<String>();
        sensoryNeuronsList = new ArrayList<String>();
        
        // now fill in the HashMap - this is needed here because it defines N_of_neurons according to the input csv file
        cmdFileP.println("Creating (number,name) pairs:");
        createNamesDict();
        
        // the matrices of the input data - read from the CSV files in readInputFiles()
        distMatrix = new int[N_of_neurons][N_of_neurons];
        EJweightsMatrix = new double[N_of_neurons][N_of_neurons];
        CHweightsMatrix = new double[N_of_neurons][N_of_neurons];
        
        // creates arrays of neurons of different lengths
        interNeurons = new Gen_IN[interNeuronsList.size()];
        sensoryNeurons = new Gen_SN[sensoryNeuronsList.size()];
        motorNeurons = new Gen_MN[motorNeuronsList.size()];
        
        // read the csv files
        readInputFiles();
        
        /**
         * after we created all the object, we move to insert the data into them
         */
         
        String neuron_name;
        int mn_count = 0;
        int sn_count = 0;
        int in_count = 0;     
        
        
        for(int i = 0; i<N_of_neurons; i++){
        	neuron_name = neuron_names.get(i+1).toString();
         	
         	if (motorNeuronsList.contains(neuron_name)) {
         		motorNeurons[mn_count] = new Gen_MN(p_thread);
         		motorNeurons[mn_count].setItsManager(this);
         		motorNeurons[mn_count].EJsynWeights = new double[N_of_neurons];
        		motorNeurons[mn_count].CHsynWeights = new double[N_of_neurons];
        		motorNeurons[mn_count].propTimes = new int[N_of_neurons];
         		motorNeurons[mn_count].setNeuronNumber(i+1);
         		motorNeurons[mn_count].setNeuronName(neuron_name);
         		motorNeurons[mn_count].setNeuronType("MN");
         		motorNeurons[mn_count].setActivation(0);
         		motorNeurons[mn_count].setDecayTime(5);
         		motorNeurons[mn_count].setEJSynDelay(1);
         		motorNeurons[mn_count].setCHSynDelay(2); 
         		motorNeurons[mn_count].setEJcoeff(0.1);
         		motorNeurons[mn_count].setCHcoeff(0.4);
         		for(int j=0; j<N_of_neurons; j++){
         			motorNeurons[mn_count].setEJsynWeights(j, EJweightsMatrix[i][j]);
         			motorNeurons[mn_count].setCHsynWeights(j, CHweightsMatrix[i][j]);
         			motorNeurons[mn_count].setPropTimes(j, distMatrix[i][j]);
         		} 
         		mn_count++;
         	}
         	if (sensoryNeuronsList.contains(neuron_name)) {
         		sensoryNeurons[sn_count] = new Gen_SN(p_thread);
         		sensoryNeurons[sn_count].setItsManager(this);
         		sensoryNeurons[sn_count].EJsynWeights = new double[N_of_neurons];
        		sensoryNeurons[sn_count].CHsynWeights = new double[N_of_neurons];
        		sensoryNeurons[sn_count].propTimes = new int[N_of_neurons];
         		sensoryNeurons[sn_count].setNeuronNumber(i+1);
         		sensoryNeurons[sn_count].setNeuronName(neuron_name);
         		sensoryNeurons[sn_count].setNeuronType("SN");
         		sensoryNeurons[sn_count].setActivation(0);
         		sensoryNeurons[sn_count].setDecayTime(5);
         		sensoryNeurons[sn_count].setEJSynDelay(1);
         		sensoryNeurons[sn_count].setCHSynDelay(2);
         		sensoryNeurons[sn_count].setEJcoeff(0.1);
         		sensoryNeurons[sn_count].setCHcoeff(0.4);	
         		for(int j=0; j<N_of_neurons; j++){
         			sensoryNeurons[sn_count].setEJsynWeights(j, EJweightsMatrix[i][j]);
         			sensoryNeurons[sn_count].setCHsynWeights(j, CHweightsMatrix[i][j]);
         			sensoryNeurons[sn_count].setPropTimes(j, distMatrix[i][j]);
         		} 
         		sn_count++;
         	}
         	if (interNeuronsList.contains(neuron_name)) {
         		interNeurons[in_count] = new Gen_IN(p_thread);
         		interNeurons[in_count].setItsManager(this);
         		interNeurons[in_count].EJsynWeights = new double[N_of_neurons];
        		interNeurons[in_count].CHsynWeights = new double[N_of_neurons];
        		interNeurons[in_count].propTimes = new int[N_of_neurons];
         		interNeurons[in_count].setNeuronNumber(i+1);
         		interNeurons[in_count].setNeuronName(neuron_name);
         		interNeurons[in_count].setNeuronType("IN");
         		interNeurons[in_count].setActivation(0);
         		interNeurons[in_count].setDecayTime(5);
         		interNeurons[in_count].setEJSynDelay(1);
         		interNeurons[in_count].setCHSynDelay(2);
         		interNeurons[in_count].setEJcoeff(0.1);
         		interNeurons[in_count].setCHcoeff(0.4);			
         		for(int j=0; j<N_of_neurons; j++){
         			interNeurons[in_count].setEJsynWeights(j, EJweightsMatrix[i][j]);
         			interNeurons[in_count].setCHsynWeights(j, CHweightsMatrix[i][j]);
         			interNeurons[in_count].setPropTimes(j, distMatrix[i][j]);
         		} 
         		in_count++;	
         	}
        
        }
        
           
           
        // link different neurons - sensory:
        for (int i = 0; i<sensoryNeurons.length; i++) {
        	for (int j = 0; j<sensoryNeurons.length; j++) {
        		if ((EJweightsMatrix[sensoryNeurons[i].getNeuronNumber()-1][sensoryNeurons[j].getNeuronNumber()-1] != 0)
        		 || (CHweightsMatrix[sensoryNeurons[i].getNeuronNumber()-1][sensoryNeurons[j].getNeuronNumber()-1] != 0)) {
        			sensoryNeurons[i].addItsGen_SN(sensoryNeurons[j]);
        		}
        	}
        	for (int j = 0; j<interNeurons.length; j++) {
        		if ((EJweightsMatrix[sensoryNeurons[i].getNeuronNumber()-1][interNeurons[j].getNeuronNumber()-1] != 0)
        		 || (CHweightsMatrix[sensoryNeurons[i].getNeuronNumber()-1][interNeurons[j].getNeuronNumber()-1] != 0)) {
        			sensoryNeurons[i].addItsGen_IN(interNeurons[j]);
        		}
        	}
        	for (int j = 0; j<motorNeurons.length; j++) {
        		if ((EJweightsMatrix[sensoryNeurons[i].getNeuronNumber()-1][motorNeurons[j].getNeuronNumber()-1] != 0)
        		 || (CHweightsMatrix[sensoryNeurons[i].getNeuronNumber()-1][motorNeurons[j].getNeuronNumber()-1] != 0)) {
        			sensoryNeurons[i].addItsGen_MN(motorNeurons[j]);
        		}
        	}
        } 
        
        // link different neurons - motor:
        for (int i = 0; i<motorNeurons.length; i++) {
        	for (int j = 0; j<sensoryNeurons.length; j++) {
        		if ((EJweightsMatrix[motorNeurons[i].getNeuronNumber()-1][sensoryNeurons[j].getNeuronNumber()-1] != 0)
        		 || (CHweightsMatrix[motorNeurons[i].getNeuronNumber()-1][sensoryNeurons[j].getNeuronNumber()-1] != 0)) {
        			motorNeurons[i].addItsGen_SN(sensoryNeurons[j]);
        		}
        	}
        	for (int j = 0; j<interNeurons.length; j++) {
        		if ((EJweightsMatrix[motorNeurons[i].getNeuronNumber()-1][interNeurons[j].getNeuronNumber()-1] != 0)
        		 || (CHweightsMatrix[motorNeurons[i].getNeuronNumber()-1][interNeurons[j].getNeuronNumber()-1] != 0)) {
        			motorNeurons[i].addItsGen_IN(interNeurons[j]);
        		}
        	}
        	for (int j = 0; j<motorNeurons.length; j++) {
        		if ((EJweightsMatrix[motorNeurons[i].getNeuronNumber()-1][motorNeurons[j].getNeuronNumber()-1] != 0)
        		 || (CHweightsMatrix[motorNeurons[i].getNeuronNumber()-1][motorNeurons[j].getNeuronNumber()-1] != 0)) {
        			motorNeurons[i].addItsGen_MN(motorNeurons[j]);
        		}
        	}
        } 
        
        // link different neurons - inter:
        for (int i = 0; i<interNeurons.length; i++) {
        	for (int j = 0; j<sensoryNeurons.length; j++) {
        		if ((EJweightsMatrix[interNeurons[i].getNeuronNumber()-1][sensoryNeurons[j].getNeuronNumber()-1] != 0)
        		 || (CHweightsMatrix[interNeurons[i].getNeuronNumber()-1][sensoryNeurons[j].getNeuronNumber()-1] != 0)) {
        			interNeurons[i].addItsGen_SN(sensoryNeurons[j]);
        		}
        	}
        	for (int j = 0; j<interNeurons.length; j++) {
        		if ((EJweightsMatrix[interNeurons[i].getNeuronNumber()-1][interNeurons[j].getNeuronNumber()-1] != 0)
        		 || (CHweightsMatrix[interNeurons[i].getNeuronNumber()-1][interNeurons[j].getNeuronNumber()-1] != 0)) {
        			interNeurons[i].addItsGen_IN(interNeurons[j]);
        		}
        	}
        	for (int j = 0; j<motorNeurons.length; j++) {
        		if ((EJweightsMatrix[interNeurons[i].getNeuronNumber()-1][motorNeurons[j].getNeuronNumber()-1] != 0)
        		 || (CHweightsMatrix[interNeurons[i].getNeuronNumber()-1][motorNeurons[j].getNeuronNumber()-1] != 0)) {
        			interNeurons[i].addItsGen_MN(motorNeurons[j]);
        		}
        	}
        }    
        
        	 
        
        
        
        startBehavior();
        
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation createCHMatrix() 
    public void createCHMatrix() {
        try {
            animInstance().notifyMethodEntered("createCHMatrix",
               new ArgData[] {
               });
        
        //#[ operation createCHMatrix() 
        String csvFile = "c:\\Users\\hlapid\\Desktop\\CSVFiles\\CHweights_normed.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        
        try {
            int row = 0;
        	br = new BufferedReader(new FileReader(csvFile));
        	while ((line = br.readLine()) != null) {
        		        // use comma as separator
        		String[] weights = line.split(cvsSplitBy);
        		for(int col=0; col<N_of_neurons; col++) {
        			CHweightsMatrix[row][col] = Double.parseDouble(weights[col]);
        		}
        		row++;
        	}
        
        } catch (FileNotFoundException e) {
        	e.printStackTrace();
        } catch (IOException e) {
        	e.printStackTrace();
        } finally {
        	if (br != null) {
        		try {
        			br.close();
        		} catch (IOException e) {
        			e.printStackTrace();
        		}
        	}
        }
        // save CHweightsMatrix into cmd_log.txt for debugging:
        for(int i=0; i<N_of_neurons; i++) {
        	for(int j=0; j<N_of_neurons; j++) {
        		cmdFileP.print(CHweightsMatrix[i][j]+",");
        	}
        	cmdFileP.println();
        
        }
        cmdFileP.println("CHMatrix complete.");
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation createDistMatrix() 
    public void createDistMatrix() {
        try {
            animInstance().notifyMethodEntered("createDistMatrix",
               new ArgData[] {
               });
        
        //#[ operation createDistMatrix() 
        String csvFile = "c:\\Users\\hlapid\\Desktop\\CSVFiles\\distances_normed.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        
        try {
            int row = 0;
        	br = new BufferedReader(new FileReader(csvFile));
        	while ((line = br.readLine()) != null) {
        		        // use comma as separator
        		String[] distances = line.split(cvsSplitBy);
        		for(int col=0; col<N_of_neurons; col++) {
        			distMatrix[row][col] = Integer.parseInt(distances[col]);
        		}
        		row++;
        	}
        
        } catch (FileNotFoundException e) {
        	e.printStackTrace();
        } catch (IOException e) {
        	e.printStackTrace();
        } finally {
        	if (br != null) {
        		try {
        			br.close();
        		} catch (IOException e) {
        			e.printStackTrace();
        		}
        	}
        }
        // save distMatrix into cmd_log.txt for debugging:
        for(int i=0; i<N_of_neurons; i++) {
        	for(int j=0; j<N_of_neurons; j++) {
        		cmdFileP.print(distMatrix[i][j]+",");
        	}
        	cmdFileP.println();
        }
        cmdFileP.println("distMatrix complete.");
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation createEJMatrix() 
    public void createEJMatrix() {
        try {
            animInstance().notifyMethodEntered("createEJMatrix",
               new ArgData[] {
               });
        
        //#[ operation createEJMatrix() 
        String csvFile = "c:\\Users\\hlapid\\Desktop\\CSVFiles\\EJweights_normed.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        
        try {
            int row = 0;
        	br = new BufferedReader(new FileReader(csvFile));
        	while ((line = br.readLine()) != null) {
        		        // use comma as separator
        		String[] weights = line.split(cvsSplitBy);
        		for(int col=0; col<N_of_neurons; col++) {
        			EJweightsMatrix[row][col] = Double.parseDouble(weights[col]);
        		}
        		row++;
        	}
        
        } catch (FileNotFoundException e) {
        	e.printStackTrace();
        } catch (IOException e) {
        	e.printStackTrace();
        } finally {
        	if (br != null) {
        		try {
        			br.close();
        		} catch (IOException e) {
        			e.printStackTrace();
        		}
        	}
        }
        // save EJweightsMatrix into cmd_log.txt for debugging:
        for(int i=0; i<N_of_neurons; i++) {
        	for(int j=0; j<N_of_neurons; j++) {
        		cmdFileP.print(EJweightsMatrix[i][j] + ",");
        	}
        	cmdFileP.println();
        }
        cmdFileP.println("EJMatrix complete.");
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation createNamesDict() 
    public void createNamesDict() {
        try {
            animInstance().notifyMethodEntered("createNamesDict",
               new ArgData[] {
               });
        
        //#[ operation createNamesDict() 
        String csvFile = "c:\\Users\\hlapid\\Desktop\\CSVFiles\\names.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        int neurons_counter = 0;
        
        try {
        
        	br = new BufferedReader(new FileReader(csvFile));
        	while ((line = br.readLine()) != null) {
        		        // use comma as separator
        		String[] names = line.split(cvsSplitBy);
        		
        		// each line in the file looks like: "neuron_name, neuron_number, neuron_type"
        		String name = names[0];
        		int num = Integer.parseInt(names[1]);
        		String type = names[2];
        		
                // add the (name, number) to the list
                neuron_names.put(num, name);
                cmdFileP.println("Adding the pair: " + num + ":" + name + " (" + type + ")");	
                
                // count one more neuron in the list
                neurons_counter++;
                
                // add the name to the appropriate list
                if (type.equals("MN")) {motorNeuronsList.add(name);}
                else if (type.equals("SN")) {sensoryNeuronsList.add(name);}
                else if (type.equals("IN")) {interNeuronsList.add(name);}
        		
        	}
        
        } catch (FileNotFoundException e) {
        	e.printStackTrace();
        } catch (IOException e) {
        	e.printStackTrace();
        } finally {
        	if (br != null) {
        		try {
        			br.close();
        		} catch (IOException e) {
        			e.printStackTrace();
        		}
        	}
        }
        N_of_neurons = neurons_counter;
        cmdFileP.println(motorNeuronsList.size());
        cmdFileP.println("HashMap complete.");
        
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation createNeurons() 
    public void createNeurons() {
        try {
            animInstance().notifyMethodEntered("createNeurons",
               new ArgData[] {
               });
        
        //#[ operation createNeurons() 
         /**
         String neuron_name;
         int mn_count = 0;
         int sn_count = 0;
         int in_count = 0;
         
         for(int i = 1; i<N_of_neurons+1; i++){
         	neuron_name = neuron_names.get(i).toString();
         	
         	if (Arrays.asList(motorNeuronsList).contains(neuron_name)) {
         		motorNeurons[mn_count] = new Gen_MN(p_thread);	
         		mn_count++;
         	}
         	if (Arrays.asList(sensoryNeuronsList).contains(neuron_name)) {
         		sensoryNeurons[sn_count] = new Gen_SN(p_thread);	
         		sn_count++;
         	}
         	if (Arrays.asList(interNeuronsList).contains(neuron_name)) {
         		interNeurons[in_count] = new Gen_IN(p_thread);
         		in_count++;	
         	}
        
         }
         System.out.println(mn_count);
         */
         
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation createOutputFile() 
    public void createOutputFile() {
        try {
            animInstance().notifyMethodEntered("createOutputFile",
               new ArgData[] {
               });
        
        //#[ operation createOutputFile() 
        //creating headers for the output CSV file
        outputFileP.print("Time");
        for(int i=0; i<N_of_neurons; i++) {
        	outputFileP.print("," + neuron_names.get(i+1));
        }
        outputFileP.println();
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation outputCurrentStatus() 
    public void outputCurrentStatus() {
        try {
            animInstance().notifyMethodEntered("outputCurrentStatus",
               new ArgData[] {
               });
        
        //#[ operation outputCurrentStatus() 
        outputFileP.print(getClockTime());
        
        String neuron_name;
        int mn_count = 0;
        int sn_count = 0;
        int in_count = 0;
        
        for(int i = 0; i<N_of_neurons; i++){
        	neuron_name = neuron_names.get(i+1).toString();
        	
         	if (motorNeuronsList.contains(neuron_name)) {    
         		outputFileP.print("," + getMotorNeurons(mn_count).getActivation());
         		mn_count++;
         	}
         	if (sensoryNeuronsList.contains(neuron_name)) {
         		outputFileP.print("," + getSensoryNeurons(sn_count).getActivation());
         		sn_count++;
         	}
         	if (interNeuronsList.contains(neuron_name)) { 
         		outputFileP.print("," + getInterNeurons(in_count).getActivation());
         		in_count++;	
         	}
         }
        
        outputFileP.println();            
        
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation readInputFiles() 
    public void readInputFiles() {
        try {
            animInstance().notifyMethodEntered("readInputFiles",
               new ArgData[] {
               });
        
        //#[ operation readInputFiles() 
        cmdFileP.println("Creating EJMatrix:");
        createEJMatrix();
        
        cmdFileP.println("Creating CHMatrix:");
        createCHMatrix();
        
        cmdFileP.println("Creating DistMatrix:");
        createDistMatrix();
        
        cmdFileP.println("Creating headers in outputFile");
        createOutputFile();
        
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation tick() 
    public void tick() {
        try {
            animInstance().notifyMethodEntered("tick",
               new ArgData[] {
               });
        
        //#[ operation tick() 
        setClockTime(getClockTime() + 1);
        
        for (int i = 0; i < motorNeurons.length; i++){motorNeurons[i].gen(new evTick());}
        for (int i = 0; i < sensoryNeurons.length; i++){sensoryNeurons[i].gen(new evTick());}
        for (int i = 0; i < interNeurons.length; i++){interNeurons[i].gen(new evTick());}
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public double getCHweightsMatrix(int i2, int i1) {
        return CHweightsMatrix[i2][i1];
    }
    
    //## auto_generated 
    public void setCHweightsMatrix(int i2, int i1, double p_CHweightsMatrix) {
        CHweightsMatrix[i2][i1] = p_CHweightsMatrix;
    }
    
    //## auto_generated 
    public double getEJweightsMatrix(int i2, int i1) {
        return EJweightsMatrix[i2][i1];
    }
    
    //## auto_generated 
    public void setEJweightsMatrix(int i2, int i1, double p_EJweightsMatrix) {
        EJweightsMatrix[i2][i1] = p_EJweightsMatrix;
    }
    
    //## auto_generated 
    public int getN_of_neurons() {
        return N_of_neurons;
    }
    
    //## auto_generated 
    public void setN_of_neurons(int p_N_of_neurons) {
        N_of_neurons = p_N_of_neurons;
    }
    
    //## auto_generated 
    public int getClockTime() {
        return clockTime;
    }
    
    //## auto_generated 
    public void setClockTime(int p_clockTime) {
        clockTime = p_clockTime;
    }
    
    //## auto_generated 
    public FileOutputStream getCmdFile() {
        return cmdFile;
    }
    
    //## auto_generated 
    public void setCmdFile(FileOutputStream p_cmdFile) {
        cmdFile = p_cmdFile;
    }
    
    //## auto_generated 
    public PrintStream getCmdFileP() {
        return cmdFileP;
    }
    
    //## auto_generated 
    public void setCmdFileP(PrintStream p_cmdFileP) {
        cmdFileP = p_cmdFileP;
    }
    
    //## auto_generated 
    public int getDistMatrix(int i2, int i1) {
        return distMatrix[i2][i1];
    }
    
    //## auto_generated 
    public void setDistMatrix(int i2, int i1, int p_distMatrix) {
        distMatrix[i2][i1] = p_distMatrix;
    }
    
    //## auto_generated 
    public boolean getHitObs() {
        return hitObs;
    }
    
    //## auto_generated 
    public void setHitObs(boolean p_hitObs) {
        hitObs = p_hitObs;
    }
    
    //## auto_generated 
    public Gen_IN getInterNeurons(int i1) {
        return interNeurons[i1];
    }
    
    //## auto_generated 
    public void setInterNeurons(int i1, Gen_IN p_interNeurons) {
        interNeurons[i1] = p_interNeurons;
    }
    
    //## auto_generated 
    public ArrayList<String> getInterNeuronsList() {
        return interNeuronsList;
    }
    
    //## auto_generated 
    public void setInterNeuronsList(ArrayList<String> p_interNeuronsList) {
        interNeuronsList = p_interNeuronsList;
    }
    
    //## auto_generated 
    public Gen_MN getMotorNeurons(int i1) {
        return motorNeurons[i1];
    }
    
    //## auto_generated 
    public void setMotorNeurons(int i1, Gen_MN p_motorNeurons) {
        motorNeurons[i1] = p_motorNeurons;
    }
    
    //## auto_generated 
    public ArrayList<String> getMotorNeuronsList() {
        return motorNeuronsList;
    }
    
    //## auto_generated 
    public void setMotorNeuronsList(ArrayList<String> p_motorNeuronsList) {
        motorNeuronsList = p_motorNeuronsList;
    }
    
    //## auto_generated 
    public Map getNeuron_names() {
        return neuron_names;
    }
    
    //## auto_generated 
    public void setNeuron_names(Map p_neuron_names) {
        neuron_names = p_neuron_names;
    }
    
    //## auto_generated 
    public FileOutputStream getOutputFile() {
        return outputFile;
    }
    
    //## auto_generated 
    public void setOutputFile(FileOutputStream p_outputFile) {
        outputFile = p_outputFile;
    }
    
    //## auto_generated 
    public PrintStream getOutputFileP() {
        return outputFileP;
    }
    
    //## auto_generated 
    public void setOutputFileP(PrintStream p_outputFileP) {
        outputFileP = p_outputFileP;
    }
    
    //## auto_generated 
    public Gen_SN getSensoryNeurons(int i1) {
        return sensoryNeurons[i1];
    }
    
    //## auto_generated 
    public void setSensoryNeurons(int i1, Gen_SN p_sensoryNeurons) {
        sensoryNeurons[i1] = p_sensoryNeurons;
    }
    
    //## auto_generated 
    public ArrayList<String> getSensoryNeuronsList() {
        return sensoryNeuronsList;
    }
    
    //## auto_generated 
    public void setSensoryNeuronsList(ArrayList<String> p_sensoryNeuronsList) {
        sensoryNeuronsList = p_sensoryNeuronsList;
    }
    
    //## auto_generated 
    public int getSimRuntime() {
        return simRuntime;
    }
    
    //## auto_generated 
    public void setSimRuntime(int p_simRuntime) {
        simRuntime = p_simRuntime;
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
                p_Gen_IN._setItsManager(this);
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
                p_Gen_IN.__setItsManager(null);
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
            (itsGen_IN.get(iter.nextIndex()))._clearItsManager();
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
                p_Gen_MN._setItsManager(this);
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
                p_Gen_MN.__setItsManager(null);
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
            (itsGen_MN.get(iter.nextIndex()))._clearItsManager();
            iter.next();
        }
        _clearItsGen_MN();
    }
    
    //## auto_generated 
    public ListIterator<Gen_Neuron> getItsGen_Neuron() {
        ListIterator<Gen_Neuron> iter = itsGen_Neuron.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsGen_Neuron(Gen_Neuron p_Gen_Neuron) {
        if(p_Gen_Neuron != null)
            {
                animInstance().notifyRelationAdded("itsGen_Neuron", p_Gen_Neuron);
            }
        else
            {
                animInstance().notifyRelationCleared("itsGen_Neuron");
            }
        itsGen_Neuron.add(0, p_Gen_Neuron);
    }
    
    //## auto_generated 
    public void addItsGen_Neuron(Gen_Neuron p_Gen_Neuron) {
        if(p_Gen_Neuron != null)
            {
                p_Gen_Neuron._setItsManager(this);
            }
        _addItsGen_Neuron(p_Gen_Neuron);
    }
    
    //## auto_generated 
    public void _removeItsGen_Neuron(Gen_Neuron p_Gen_Neuron) {
        animInstance().notifyRelationRemoved("itsGen_Neuron", p_Gen_Neuron);
        itsGen_Neuron.remove(p_Gen_Neuron);
    }
    
    //## auto_generated 
    public void removeItsGen_Neuron(Gen_Neuron p_Gen_Neuron) {
        if(p_Gen_Neuron != null)
            {
                p_Gen_Neuron.__setItsManager(null);
            }
        _removeItsGen_Neuron(p_Gen_Neuron);
    }
    
    //## auto_generated 
    public void _clearItsGen_Neuron() {
        animInstance().notifyRelationCleared("itsGen_Neuron");
        itsGen_Neuron.clear();
    }
    
    //## auto_generated 
    public void clearItsGen_Neuron() {
        ListIterator<Gen_Neuron> iter = itsGen_Neuron.listIterator();
        while (iter.hasNext()){
            (itsGen_Neuron.get(iter.nextIndex()))._clearItsManager();
            iter.next();
        }
        _clearItsGen_Neuron();
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
                p_Gen_SN._setItsManager(this);
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
                p_Gen_SN.__setItsManager(null);
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
            (itsGen_SN.get(iter.nextIndex()))._clearItsManager();
            iter.next();
        }
        _clearItsGen_SN();
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
            switch (rootState_subState) {
                case manager:
                {
                    manager_add(animStates);
                }
                break;
                case hit_obs:
                {
                    hit_obs_add(animStates);
                }
                break;
                default:
                    break;
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
            switch (rootState_active) {
                case manager:
                {
                    res = manager_takeEvent(id);
                }
                break;
                case hit_obs:
                {
                    res = hit_obs_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void manager_add(AnimStates animStates) {
            animStates.add("ROOT.manager");
        }
        
        //## statechart_method 
        public void hit_obs_add(AnimStates animStates) {
            animStates.add("ROOT.hit_obs");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int hit_obs_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = hit_obsTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void managerExit() {
            itsRiJThread.unschedTimeout(Manager_Timeout_manager_id, this);
            //#[ state ROOT.manager.(Exit) 
            outputCurrentStatus();
            
            if (getSimRuntime() <= getClockTime())
            {
            	outputFileP.println("End of simulation");
            	System.exit(0);
            	
            }
            
            	//debugging only
            System.out.println(getClockTime());
            //#]
        }
        
        //## statechart_method 
        public void manager_entDef() {
            manager_enter();
        }
        
        //## statechart_method 
        public void hit_obsEnter() {
            //#[ state ROOT.hit_obs.(Entry) 
            hitObs = true;
            sensoryNeurons[0].setActivation(1);
            sensoryNeurons[1].setActivation(1);
            sensoryNeurons[2].setActivation(1);
            
            
            sensoryNeurons[0].gen(new evExternalTrig());
            sensoryNeurons[1].gen(new evExternalTrig());
            sensoryNeurons[2].gen(new evExternalTrig());
            
            
            //#]
        }
        
        //## statechart_method 
        public int manager_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = managerTakeNull();
                }
            else if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = managerTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void hit_obs_entDef() {
            hit_obs_enter();
        }
        
        //## statechart_method 
        public int managerTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 1 
            if((getClockTime() == 50) && !hitObs)
                {
                    animInstance().notifyTransitionStarted("1");
                    manager_exit();
                    hit_obs_entDef();
                    animInstance().notifyTransitionEnded("1");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int managerTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Manager_Timeout_manager_id)
                {
                    //## transition 0 
                    if(getClockTime()<getSimRuntime())
                        {
                            animInstance().notifyTransitionStarted("0");
                            manager_exit();
                            //#[ transition 0 
                            // the guard is to keep the simulation from running forever
                            
                            /*
                            * advance the clock
                            */
                            
                            tick();
                            //#]
                            manager_entDef();
                            animInstance().notifyTransitionEnded("0");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public void hit_obs_exit() {
            popNullConfig();
            hit_obsExit();
            animInstance().notifyStateExited("ROOT.hit_obs");
        }
        
        //## statechart_method 
        public void managerEnter() {
            itsRiJThread.schedTimeout(200, Manager_Timeout_manager_id, this, "ROOT.manager");
        }
        
        //## statechart_method 
        public void hit_obs_enter() {
            animInstance().notifyStateEntered("ROOT.hit_obs");
            pushNullConfig();
            rootState_subState = hit_obs;
            rootState_active = hit_obs;
            hit_obsEnter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void manager_exit() {
            popNullConfig();
            managerExit();
            animInstance().notifyStateExited("ROOT.manager");
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
        public void hit_obsExit() {
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("3");
            manager_entDef();
            animInstance().notifyTransitionEnded("3");
        }
        
        //## statechart_method 
        public int hit_obsTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 2 
            if(true)
                {
                    animInstance().notifyTransitionStarted("2");
                    hit_obs_exit();
                    //#[ transition 2 
                    tick();
                    //#]
                    manager_entDef();
                    animInstance().notifyTransitionEnded("2");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void manager_enter() {
            animInstance().notifyStateEntered("ROOT.manager");
            pushNullConfig();
            rootState_subState = manager;
            rootState_active = manager;
            managerEnter();
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
            return Manager.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassManager; 
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
        
        msg.add("clockTime", clockTime);
        msg.add("outputFile", outputFile);
        msg.add("outputFileP", outputFileP);
        msg.add("hitObs", hitObs);
        msg.add("simRuntime", simRuntime);
        msg.add("neuron_names", neuron_names);
        msg.add("N_of_neurons", N_of_neurons);
        msg.add("distMatrix", distMatrix);
        msg.add("EJweightsMatrix", EJweightsMatrix);
        msg.add("CHweightsMatrix", CHweightsMatrix);
        msg.add("cmdFile", cmdFile);
        msg.add("cmdFileP", cmdFileP);
        msg.add("motorNeuronsList", motorNeuronsList);
        msg.add("interNeuronsList", interNeuronsList);
        msg.add("sensoryNeuronsList", sensoryNeuronsList);
        msg.add("interNeurons", interNeurons);
        msg.add("motorNeurons", motorNeurons);
        msg.add("sensoryNeurons", sensoryNeurons);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsGen_IN", false, false, itsGen_IN);
        msg.add("itsGen_SN", false, false, itsGen_SN);
        msg.add("itsGen_Neuron", false, false, itsGen_Neuron);
        msg.add("itsGen_MN", false, false, itsGen_MN);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Manager.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Manager.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Manager.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Manager.java
*********************************************************************/

