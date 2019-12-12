package com.naufar.entity;

import java.util.Arrays;

public class Coach {

	private UpperBerth[] upperBerth= {new UpperBerth(),new UpperBerth()};
	private MiddleBerth[] middleBerth= {new MiddleBerth(),new MiddleBerth()};
	private LowerBerth[] lowerBerth= {new LowerBerth(),new LowerBerth()};
	private SideBerth[] sideBert= {new SideBerth(),new SideBerth()};
	private Integer availableTickets=8;
	private Integer maleTickets=0;
	private Integer femaleTickets=0;
	private Integer femaleWithChildTickets=2;
	private Integer availUpperBerth=2;
	private Integer availMiddleBerth=2;
	private Integer availSideBerth=2;
	private Integer availLowerBerth=2;
	
	
	
	
	public Integer getAvailUpperBerth() {
		return availUpperBerth;
	}
	public void setAvailUpperBerth(Integer availUpperBerth) {
		this.availUpperBerth = availUpperBerth;
	}
	public Integer getAvailMiddleBerth() {
		return availMiddleBerth;
	}
	public void setAvailMiddleBerth(Integer availMiddleBerth) {
		this.availMiddleBerth = availMiddleBerth;
	}
	public Integer getAvailSideBerth() {
		return availSideBerth;
	}
	public void setAvailSideBerth(Integer availSideBerth) {
		this.availSideBerth = availSideBerth;
	}
	public Integer getAvailLowerBerth() {
		return availLowerBerth;
	}
	public void setAvailLowerBerth(Integer availLowerBerth) {
		this.availLowerBerth = availLowerBerth;
	}
	public UpperBerth[] getUpperBerth() {
		return upperBerth;
	}
	public void setUpperBerth(UpperBerth[] upperBerth) {
		this.upperBerth = upperBerth;
	}
	public MiddleBerth[] getMiddleBerth() {
		return middleBerth;
	}
	public void setMiddleBerth(MiddleBerth[] middleBerth) {
		this.middleBerth = middleBerth;
	}
	public LowerBerth[] getLowerBerth() {
		return lowerBerth;
	}
	public void setLowerBerth(LowerBerth[] lowerBerth) {
		this.lowerBerth = lowerBerth;
	}
	public SideBerth[] getSideBert() {
		return sideBert;
	}
	public void setSideBert(SideBerth[] sideBert) {
		this.sideBert = sideBert;
	}
	public Integer getAvailableTickets() {
		return availableTickets;
	}
	public void setAvailableTickets(Integer availableTickets) {
		this.availableTickets = availableTickets;
	}
	public Integer getMaleTickets() {
		return maleTickets;
	}
	public void setMaleTickets(Integer maleTickets) {
		this.maleTickets = maleTickets;
	}
	public Integer getFemaleTickets() {
		return femaleTickets;
	}
	public void setFemaleTickets(Integer femaleTickets) {
		this.femaleTickets = femaleTickets;
	}
	
	
	public Integer getFemaleWithChildTickets() {
		return femaleWithChildTickets;
	}
	public void setFemaleWithChildTickets(Integer femaleWithChildTickets) {
		this.femaleWithChildTickets = femaleWithChildTickets;
	}
	@Override
	public String toString() {
		return "Coach [upperBerth=" + Arrays.toString(upperBerth) + ", middleBerth=" + Arrays.toString(middleBerth)
				+ ", lowerBerth=" + Arrays.toString(lowerBerth) + ", sideBert=" + Arrays.toString(sideBert)
				+ ", availableTickets=" + availableTickets + ", maleTickets=" + maleTickets + ", femaleTickets="
				+ femaleTickets + ", femaleWithChildTickets=" + femaleWithChildTickets + ", availUpperBerth="
				+ availUpperBerth + ", availMiddleBerth=" + availMiddleBerth + ", availSideBerth=" + availSideBerth
				+ ", availLowerBerth=" + availLowerBerth + "]";
	}
	
	
}
