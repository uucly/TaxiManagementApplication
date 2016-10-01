package com.sweisker.fleet.telematik.backend.controller;

import com.google.common.cache.CacheLoader;

public class TestBla extends CacheLoader<String, String>{

	private static int INDEX = 0;
	private String jup = "JUP";
	private static boolean doUpdate= true;

	public String get(String key) {
		System.out.println("Start");
		update();
		System.out.println("Finish");
		return jup + "/" + key;
	}

	void update() {
		if(true){
			doUpdate = false;
			try {
				System.out.println("Sleeping...");
				Thread.sleep(10000);
				System.out.println("...Finished");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public String load(String key) throws Exception {
		return new String(get(key)) ;
	}
}
