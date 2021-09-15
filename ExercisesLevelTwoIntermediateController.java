import java.util.ArrayList;

public class ExercisesLevelTwoIntermediateController {

	public static void main(String[] args) {
		// Boolean controller. Set Whichever code inside ExercisesLevelTwoIntermediate you wish to test to true to activate.
		boolean blackJack = false, uniqueSum = false, tooHot = false, people = true;
		
		
		/* BLACKJACK (not really but that's the task name)
		 * Given 2 integer values greater than 0, return whichever value is closest to 21 with- out going over 21. If they both go over 21 then return 0.
		 */
		if(blackJack) {
			System.out.println(ExercisesLevelTwoIntermediate.returnClosestTo21(21,12));
		}
		
		/* Unique Sum
		 * Given 3 integer values, return their sum. If one value is the same as another value, they do not count towards the sum. Aka only return the sum of unique numbers given.
		 */
		if (uniqueSum) {
			System.out.println(ExercisesLevelTwoIntermediate.uniqueSum(2,2,2));
		}
		
		/* Too Hot?
		 * Given an integer value and a Boolean value, temperature and isSummer, if temperature is between 60 and 90 (inclusive), 
		 * unless its summer where the upper limit is 100 instead of 90. Return true if the temperature falls within the range, false otherwise.
		 */
		if (tooHot) {
			System.out.println(ExercisesLevelTwoIntermediate.tooHot(99,false));
		}
		
		/* People
		 * Create a Person class that models the following:
		 *   • Name
		 *   • Age
		 *   • Job Title
		 * And has a method to return all three of these in a formatted string. (Override the toString() method!)
		 * Create some example objects with this class.
		 * Create an ArrayList and store those objects inside.
		 * Use an enhanced for loop to output all of your people to the console. 
		 */
		if(people) {
			ArrayList<Person> a1 = new ArrayList<Person>();
			
			Person larry = new Person();
			larry.setName("Larry");
			larry.setAge(22);
			larry.setJobTitle("Musician");
			
			Person bob = new Person();
			bob.setName("Bob");
			bob.setAge(87);
			bob.setJobTitle("Body Builder");
			
			Person emma = new Person();
			emma.setName("Emma");
			emma.setAge(46);
			emma.setJobTitle("Teacher");
			
			a1.add(larry);
			a1.add(bob);
			a1.add(emma);
			
			for(int i=0;i<a1.size();i++) {
				System.out.println(a1.get(i).getAll());
			}
		}

	}

}
