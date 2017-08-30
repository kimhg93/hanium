package com.pjt;

public class VO {
	private String price;
	private String dprt;
	private String dprt_date;
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDprt() {
		return dprt;
	}
	public void setDprt(String dprt) {
		this.dprt = dprt;
	}
	public String getDprt_date() {
		return dprt_date;
	}
	public void setDprt_date(String dprt_date) {
		this.dprt_date = dprt_date;
	}
	
	@Override
	public String toString(){
		return "USERVO {price="+price +", dprt="+dprt +", dprt_date"+dprt_date;
	}
	
}
