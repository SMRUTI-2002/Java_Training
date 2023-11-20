package com.hib.jsf;

import javax.faces.event.ValueChangeEvent;

public class RadioBean {
	
	private String radioValue;
	private String radioText;
	private String gen;
	public String getRadioValue() {
		return radioValue;
	}
	public void setRadioValue(String radioValue) {
		this.radioValue = radioValue;
	}
	public String getRadioText() {
		return radioText;
	}
	public void setRadioText(String radioText) {
		this.radioText = radioText;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	
	// step 1
	public Gender[] getGender() {
		return Gender.values();
	}
	// step 2
	public void radioChanged(ValueChangeEvent e) {
		// assign new table to localeCode
		this.gen = e.getNewValue().toString();
	}
}
