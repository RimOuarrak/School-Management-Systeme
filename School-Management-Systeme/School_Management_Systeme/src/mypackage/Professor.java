package mypackage;
/**
 * @author Mehdi Lahrach , Rim Ourrak , Moad Monaji
 * @version 1.0 17/10/2021
 */

public final class Professor extends Personne {
	private double salary;
		
		
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
		public Professor(){
			super();
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
				final String emailInput, final int phoneNbrInput,final String adresseInput ) {
			super(idInput, nameInput, imageInput, emailInput, phoneNbrInput, adresseInput);
			this.salary=salaryInput;
		}
		@Override
		public String toString() {
	
			StringBuilder pr = new StringBuilder();
			pr.append("     Professor ID         :");
			pr.append(getId());
			pr.append("\n");
			pr.append("     Professor Name       :");
			pr.append(getName());
			pr.append("\n");
		   
			pr.append("\n");
			pr.append("     Professor Image      :");
			pr.append(getImage());
			pr.append("\n");
			pr.append("     Professor Address    :");
			pr.append(getAddresse());
			pr.append("\n");
			pr.append("     Professor Phone Number    :");
			pr.append(getPhoneNbr());
			pr.append("\n");
			
			pr.append("\n");
			
			pr.append("\n");
	
			return pr.toString();
		}
	
		/***
		 * to string to save in a file.
		 * 
		 * @return string
		 */

		@Override
		public String toStringSaveFile(){
			return super.toStringSaveFile()+ "," +getSalary();
		}
		
	
}	