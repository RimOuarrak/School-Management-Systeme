package mypackage;
/**
 * @author Mehdi Lahrach , Rim Ourrak , Moad Monaji
 * @version 1.0 14/10/2021
 */

public final class Student extends Personne {
	 
    /***
     * Student score.
     */
    private float score  ;

    
    /***
     * Student description.
     */
    private String description;
    
    /***
     * Student attendance; 
     */
    private String attendance;


    /**
     * @return The score
     */
    public float getScore() {
        return score;
    }

    /**
     * @param scoreInput
     *            The score to set.
     */
    public void setScore(final float scoreInput) {
        this.score = scoreInput;
    }
    
    /**
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param descriptionInput
     *            The description to set.
     */
    public void setDescription(final String descriptionInput) {
        this.description = descriptionInput;
    }
    
	
	/***
	 * 
	 * @return student attendance
	 */
	public String isAttendance() {
		return attendance;
	}
	/***
	 * 
	 * @param attendance
	 */
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

    /**
     * @param idInput
     *            The id to set.
     * @param nameInput
     *            The name to set.
     * @param scoreInput
     *            The score to set.
     * @param imageInput
     *            The image to set.
     * @param addressInput
     *            The address to set.
     * @param descriptionInput
     *            The description to set.
     * @param phoneNbrInput
     *            The phone number to set.
     */
    public Student(final int idInput, final String nameInput,final String emailInput,
            final float scoreInput, final String imageInput,
            final String addressInput, final String descriptionInput, final String phoneNbrInput) {
        super(idInput, nameInput, imageInput, emailInput, phoneNbrInput,addressInput);
        this.score = scoreInput ;
        this.description = descriptionInput;
    }
    

    public Student() {
        super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("     Student ID         :");
        sb.append(getId());
        sb.append("\n");
        sb.append("     Student Name       :");
        sb.append(getName());
        sb.append("\n");
        sb.append("     Student Score      :");
        sb.append(getScore());
        sb.append("\n");
        sb.append("     Student Image      :");
        sb.append(getImage());
        sb.append("\n");
        sb.append("     Student Address    :");
        sb.append(getAddresse());
        sb.append("\n");
        sb.append("     Student Phone Number    :");
        sb.append(getPhoneNbr());
        sb.append("\n");
        sb.append("     Student Phone email    :");
        sb.append(getEmail());
        sb.append("\n");
        sb.append("     Student Description		:");
        sb.append(getDescription());
        sb.append("\n");

        return sb.toString();
    }

    /***
     * to string to save in a file.
     * 
     * @return string
     */
    
    public String toStringSaveFile() {
        
        return super.toStringSaveFile()+","+ getScore() +","+getDescription();
    }

    

	

}
