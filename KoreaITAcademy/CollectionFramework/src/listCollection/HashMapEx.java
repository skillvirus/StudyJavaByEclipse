package listCollection;

import java.util.HashMap;
//import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1,"홍길동");
		hashMap.put(2,"이순신");
		hashMap.put(3,"강감찬");
		
//		for (Entry<Integer, String> entry : hashMap.entrySet()) {
//		    System.out.println("[" + entry.getKey() + "] : " + entry.getValue());
//		}
		
		for(Integer i : hashMap.keySet()){
		    System.out.println("[" + i + "] : " + hashMap.get(i));
		}
	}

}
