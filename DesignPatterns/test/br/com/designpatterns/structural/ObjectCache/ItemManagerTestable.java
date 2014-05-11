package br.com.designpatterns.structural.ObjectCache;

public class ItemManagerTestable extends ItemManager {
	
	private String lastMessage;
	
	public String getLastMessage() {
		return lastMessage;
	}

	@Override
	protected void notifyListeners(String message) {
		this.lastMessage = message; 
	}
}
