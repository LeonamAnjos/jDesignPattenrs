package br.com.designpatterns.structural.ObjectCache;

import java.util.Vector;

public class DBManager {

	private Vector<String> cache;
	
	public DBManager() {
		cache = new Vector<String>();
	}
	
	public boolean isActiveItem(String code) {
		String item = getItem(code);
		return item != null;
	}

	public void activateItem(String code) {
		cache.add(code);
	}
	
	private String getItem(String code) {
		String barCode = null;

		int pos = cache.indexOf(code);
		if(pos != -1) 
			barCode = cache.get(pos);
		
		return barCode;
	}
}