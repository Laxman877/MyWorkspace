package org;

import java.util.Iterator;
import java.util.List;

public class Question {
	int qid;
	String que;
	List<Answer> answer;

	public Question(int qid, String que, List<Answer> answer) {
		super();
		this.qid = qid;
		this.que = que;
		this.answer = answer;
	}


	public void display() {
		System.out.println(qid+" "+que);
		for(Answer s:answer) {
			s.dispay();
		}
	}
}