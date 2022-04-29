package com.springapps.springcore.reftypes;

public class Student {

	private Scores scores;

	@Override
	public String toString() {
		return "Student [scores=" + scores + ", getScores()=" + getScores() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Scores getScores() {
		return scores;
	}

	public void setScores(Scores scores) {
		this.scores = scores;
	}

}
