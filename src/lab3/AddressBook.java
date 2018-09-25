package lab3;

import java.util.ArrayList;

public class AddressBook {
	private ArrayList<BuddyInfo> buddyList;
	
	public AddressBook() {
		buddyList = new ArrayList<BuddyInfo>();
	}

	public void addBuddy(BuddyInfo newBuddy) {
		buddyList.add(newBuddy);
	}
	
	public void removeBuddy(String buddyName) {
		for(BuddyInfo e: buddyList) {
			if (e.getName().equals(buddyName)){
				buddyList.remove(e);
				break;
			}
		}
	}

	public void removeBuddy(int index) {
		buddyList.remove(index);
	}
	
	public static void main(String[] args) {
		AddressBook addrBook = new AddressBook();
		System.out.println("Address book");
		addrBook.addBuddy(new BuddyInfo("Sam","456 Road Street","(613) 777-1122"));
		
		addrBook.removeBuddy(0);
	}
}
