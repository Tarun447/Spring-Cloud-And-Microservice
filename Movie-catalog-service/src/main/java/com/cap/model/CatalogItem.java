package com.cap.model;

public class CatalogItem {

	private String name;
	private String desc;
	private String rat;
	
	public CatalogItem(String name, String desc, String rat) {

		this.name = name;
		this.desc = desc;
		this.rat = rat;
	}
	public CatalogItem() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getRat() {
		return rat;
	}

	public void setRat(String rat) {
		this.rat = rat;
	}
	
	
	
}
