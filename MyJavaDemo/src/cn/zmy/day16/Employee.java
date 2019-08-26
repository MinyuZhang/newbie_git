package cn.zmy.day16;

public class Employee {
	private String name;
	private String id;
	private String cardNum;
	
	public Employee() {}
	
	public Employee(String name, String id, String cardNum) {
		this.name = name;
		this.id = id;
		this.cardNum = cardNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", cardNum=" + cardNum + "]";
	}
	
}
