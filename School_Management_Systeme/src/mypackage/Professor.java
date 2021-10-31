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
	 * Professor email
	 */
	private String email;
	/***
	 * Professor phone number
	 */
	private int phoneNbr;
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
	/***
	 * 
	 * @return Professor email
	 */
	public String getEmail() {
		return email;
	}
	/***
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/***
	 * 
	 * @return phoneNbr
	 */
	public int getPhoneNbr() {
		return phoneNbr;
	}
	/***
	 * 
	 * @param phoneNbr
	 */
	public void setPhoneNbr(int phoneNbr) {
		this.phoneNbr = phoneNbr;
	}
	

	/***
	 * Professor constructor
	 * @param idInput
	 * @param nameInput
	 * @param salaryInput
	 * @param imageInput
	 * @param emailInput
	 * @param phoneNbrInput
	 */
	public Professor(final int idInput, final String nameInput,
            final float salaryInput, final String imageInput,
            final String emailInput, final int phoneNbrInput ) {
		
		
		this.id = idInput;
        this.name = nameInput;
        this.salary = salaryInput;
        this.image = imageInput;
        this.email = emailInput;
        this.phoneNbr = phoneNbrInput;
	}
	
}
