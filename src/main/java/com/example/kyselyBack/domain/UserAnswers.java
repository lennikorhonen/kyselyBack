package com.example.kyselyBack.domain;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class UserAnswers {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userAnswerId;
	
	@ManyToMany
	@JoinTable(name = "id")
	Set<Question> question;
	private String textAnswer;
	private int type;
	
	public UserAnswers() {
		super();
	}
	
	public UserAnswers(String textAnswer, int type) {
		super();
		this.textAnswer = textAnswer;
		this.type = type;
	}

	public Long getUserAnswerId() {
		return userAnswerId;
	}

	public void setUserAnswerId(Long userAnswerId) {
		this.userAnswerId = userAnswerId;
	}

	public Set<Question> getQuestion() {
		return question;
	}

	public void setQuestion(Set<Question> question) {
		this.question = question;
	}

	public String getTextAnswer() {
		return textAnswer;
	}

	public void setTextAnswer(String textAnswer) {
		this.textAnswer = textAnswer;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
