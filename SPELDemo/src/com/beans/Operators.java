package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("operators")
public class Operators {

	//using reg-ex
	@Value("#{('500' matches '\\d+')? 'Pattern match' : 'Not matching'}")
	private String numMatch;

	@Value("#{nums.a==nums.b}")
	private boolean equal;

	@Value("#{nums.b>nums.a ? true : false}")
	private boolean greater;

	@Value("#{nums.a +nums.b}")
	public int add;

	@Value("#{'Hello'+'@'+'SPEL'}")
	public String concate;

	public String getNumMatch() {
		return numMatch;
	}

	public void setNumMatch(String numMatch) {
		this.numMatch = numMatch;
	}

	public int getAdd() {
		return add;
	}

	public void setAdd(int add) {
		this.add = add;
	}

	public String getConcate() {
		return concate;
	}

	public void setConcate(String concate) {
		this.concate = concate;
	}

	public boolean isEqual() {
		return equal;
	}

	public void setEqual(boolean equal) {
		this.equal = equal;
	}

	public boolean isGreater() {
		return greater;
	}

	public void setGreater(boolean greater) {
		this.greater = greater;
	}

}
