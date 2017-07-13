/**
 * 
 */
package com.aces.learn.java8.lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
/**
 * @author aagarwal
 *
 */
public class StateFilterJava8 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String... args){	
		StateFilterJava8 stateService = new StateFilterJava8();		
				
		System.out.println("----------All States-----------");
		List<State> states = LearnJava8Utils.getAllStates();			
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
//******************************************************************************************************************************************************	
		System.out.println("----------All East Coast States-----------");
		List<State> statesOnEastCoast = stateService.filter(states, State::isEastCoast);
		System.out.println(statesOnEastCoast);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
				
		System.out.println("----------All States with more than 500 Counties-----------");
		List<State> statesMoreThan500Counties1 = stateService.filter(states, new MoreThan500CountiesPredicate());
		System.out.println(statesMoreThan500Counties1);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
			
		System.out.println("----------All States with more than 500 Counties, Specifying Type of 's' -----------");
		List<State> statesMoreThan500Counties2 = stateService.filter(states, (State s) -> s.getCounties() > 500);
		System.out.println(statesMoreThan500Counties2);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		System.out.println("----------All States with more than 500 Counties, Type Inference-----------");
		List<State> statesMoreThan500Counties3 = stateService.filter(states, (s) -> s.getCounties() > 500);
		System.out.println(statesMoreThan500Counties3);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
//******************************************************************************************************************************************************			
		System.out.println("----------All States with more than 200 Counties on East Coast, Specifying Type of 's'-----------");
		List<State> statesMoreThan200CountiesOnEastCoast1 
										= stateService.filter(states, (State s) -> {
											return s.getCounties() > 200 && s.isEastCoast();
										});
		System.out.println(statesMoreThan200CountiesOnEastCoast1);		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
				
		System.out.println("----------All States with more than 200 Counties on East Coast, Type Inference-----------");
		List<State> statesMoreThan200CountiesOnEastCoast2 
										= stateService.filter(states, (s) -> {
											return s.getCounties() > 200 && s.isEastCoast();
										});
		System.out.println(statesMoreThan200CountiesOnEastCoast2);		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		System.out.println("----------All States starting with M and on the east coast");
		Predicate<State> stateStartsWithM = (s) -> s.getName().startsWith("M");
		Predicate<State> stateStartsWithMandEastCoast =  stateStartsWithM.and((s)->s.isEastCoast());
		List<State> stateStartsWithMandEastCoastList = stateService.filter(states, stateStartsWithMandEastCoast);
		System.out.println(stateStartsWithMandEastCoastList);		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		
		System.out.println("----------All States starting with M and NOT on the east coast");
		Predicate<State> statesOnEastCoastPredicate = (s)-> s.isEastCoast();
		Predicate<State> stateStartsWithMandNotEastCoast =  stateStartsWithM.and(statesOnEastCoastPredicate.negate());
		List<State> stateStartsWithMandNotEastCoastList = stateService.filter(states, stateStartsWithMandNotEastCoast);
		System.out.println(stateStartsWithMandNotEastCoastList);		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	}	
	/**
	 * 
	 * @param states
	 * @param Predicate is a Functional Interface. It takes 'State' as an Input and returns a boolean
	 * @return
	 */
	public List<State> filter(List<State> states, Predicate<State> p){
        List<State> result = new ArrayList<>();
        for(State state : states){
            if(p.test(state)){
                result.add(state);
            }
        }
        return result;
    }     
}
