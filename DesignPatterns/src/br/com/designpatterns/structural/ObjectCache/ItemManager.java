package br.com.designpatterns.structural.ObjectCache;

public class ItemManager {

	ItemCache cache;
	DBManager manager;
	
	public ItemManager() {
		cache = new ItemCache();
		manager = new DBManager();
	}
	
	public void activate(String code) {
		String message = performActivation(code);
		this.notifyListeners(message);
	}
	
	private String performActivation(String code) {
		if(cache.getItem(code) != null) 
			return "Item already activated - cache";
			
		if (manager.isActiveItem(code)) 
			return "Item already activated - DB access";
			
		activateItemOnDataBase(code);
		return "Item activated sucessfully";
	}

	private void activateItemOnDataBase(String code) {
		manager.activateItem(code);
		cache.addItem(code);
	}

	protected void notifyListeners(String message) {
		System.out.println(message);
	}

}
