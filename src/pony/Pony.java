package pony;

/**
 * @ Author: JunkJumper
 * @ Link: https://github.com/JunkJumper
 * @ Copyright: Creative Common 4.0 (CC BY 4.0)
 * @ Create Time: 09-11-2020
 * @ Modified by: JunkJumper
 * @ Modified time: 09-11-2020
 */

public class Pony {
	
    private String name;
    private String group;
    private String gender;
    private String coatColor;
    private String maneColor;
    private String eyeColor;
    private String description;
    private String imageURL;
    
    public Pony(String n, String gr, String ge, String cc, String mc, String ec, String d, String i) {
    	this.setName(n);
    	this.setGroup(gr);
    	this.setGender(ge);
    	this.setCoatColor(cc);
    	this.setManeColor(mc);
    	this.setEyeColor(ec);
    	this.setDescription(d);
    	this.setImageURL(i);
    }

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the group
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @return the coatColor
	 */
	public String getCoatColor() {
		return coatColor;
	}

	/**
	 * @return the maneColor
	 */
	public String getManeColor() {
		return maneColor;
	}

	/**
	 * @return the eyeColor
	 */
	public String getEyeColor() {
		return eyeColor;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the imageURL
	 */
	public String getImageURL() {
		return imageURL;
	}

	/**
	 * @param name the name to set
	 */
	private void setName(String name) {
		this.name = name;
	}

	/**
	 * @param group the group to set
	 */
	private void setGroup(String group) {
		this.group = group;
	}

	/**
	 * @param gender the gender to set
	 */
	private void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @param coatColor the coatColor to set
	 */
	private void setCoatColor(String coatColor) {
		this.coatColor = coatColor;
	}

	/**
	 * @param maneColor the maneColor to set
	 */
	private void setManeColor(String maneColor) {
		this.maneColor = maneColor;
	}

	/**
	 * @param eyeColor the eyeColor to set
	 */
	private void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	/**
	 * @param description the description to set
	 */
	private void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param imageURL the imageURL to set
	 */
	private void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
    

   
        
}
