package practice;

public class PhoneBook {
	private int index;
	private String name;
	private String phoneNum;
	private String address;
	
	public PhoneBook() {
	}
	
	public PhoneBook(int index, String name, String phoneNum, String address) {
		this.index = index;
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}