package com.example.kyselyBack.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Question {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private String question;
	private int type;
    
    @ManyToOne
    @JoinColumn(name = "optionid")
    private Option option;


	public Question() {
    	super();
    }
    
    public Question(String question, int type, Option option) {
    	super();
    	this.question = question;
    	this.type = type;
    	this.option = option;
    }

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Option getOption() {
		return option;
	}

	public void setOption(Option option) {
		this.option = option;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", options=" + option + "]";
	}
    
	
}