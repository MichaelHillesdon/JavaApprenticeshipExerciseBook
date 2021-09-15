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
public class Person {

	private String name, jobTitle;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public String getAll() {
		return "The person's name is: "+getName()+". Their age is: "+getAge()+". Their job title is: "+getJobTitle()+".";
	}
	
	
	
	
}
