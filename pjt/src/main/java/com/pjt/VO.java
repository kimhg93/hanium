package com.pjt;

public class VO {
	private String price;
	private String dprt;
	private String dprt_date;	
	private String ariv;
	private String ariv_date;
	private String cargo;
	private String cargo_kind;
	private String cargo_weight;
	private String via;
	
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
	public String getAriv() {
		return ariv;
	}
	public void setAriv(String ariv) {
		this.ariv = ariv;
	}
	public String getAriv_date() {
		return ariv_date;
	}
	public void setAriv_date(String ariv_date) {
		this.ariv_date = ariv_date;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getCargo_kind() {
		return cargo_kind;
	}
	public void setCargo_kind(String cargo_kind) {
		this.cargo_kind = cargo_kind;
	}
	public String getCargo_weight() {
		return cargo_weight;
	}
	public void setCargo_weight(String cargo_weight) {
		this.cargo_weight = cargo_weight;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}

	@Override
	public String toString(){
		return "USERVO {price="+price +", dprt="+dprt +", dprt_date"+dprt_date;
	}
	
}
