package mypackage;
/**
 * @author Mehdi Lahrach , Rim Ourrak , Moad Monaji
 * @version 1.0 17/10/2021
 */

public final class Professor {
	/***
	 * Professor id.
	 */
	private int id;
	/***
	 * Professor name.
	 */
	private String name;
	/***
	 * Professor salary:
	 */
	private double salary;
	/***
	 * Professor image.
	 */
	private String image;
	/***
	 * 
	 * @return Professor id.
	 */
	public int getId() {
		return id;
	}
	/***
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/***
	 * 
	 * @return professor name.
	 */
	public String getName() {
		return name;
	}
	/***
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/***
	 * 
	 * @return Professor Salary.
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * 
	 * @param salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/***
	 * 
	 * @return Professor image.
	 */
	public String getImage() {
		return image;
	}
	/***
	 * 
	 * @param image
	 */
	public void setImage(String image) {
		this.image = image;
	}
	
	

	
}
