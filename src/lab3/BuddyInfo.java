package lab3;

public class BuddyInfo {
	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String address;
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private String phoneNumber;
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	private void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public BuddyInfo(String name, String address, String phoneNumber) {
		this.setName(name);
		this.setAddress(address);
		this.setPhoneNumber(phoneNumber);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo inst = new BuddyInfo("Bob","123 street road","(613) 444-5555");
		System.out.println("Hello " + inst.getName());
	}
}
