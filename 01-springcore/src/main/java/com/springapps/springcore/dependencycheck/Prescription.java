package com.springapps.springcore.dependencycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {
	
	private int id;
	private String patient_name;
	private List<String> medicines;
	@Override
	public String toString() {
		return "Prescription [id=" + id + ", patient_name=" + patient_name + ", medicines=" + medicines + "]";
	}
	public int getId() {
		return id;
	}
	
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public List<String> getMedicines() {
		return medicines;
	}
	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	} 

}
