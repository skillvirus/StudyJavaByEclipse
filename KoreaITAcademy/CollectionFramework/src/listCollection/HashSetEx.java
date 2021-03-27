package listCollection;

import java.util.HashSet;
import java.util.Iterator;

//Set 컬렉션 프레임워크는 중복 허용 하지 않음.

public class HashSetEx {

	public static void main(String[] args) {
		
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("이순신");
        hashSet.add("이순신");
        hashSet.add("강감찬");
        hashSet.add("이이");
        hashSet.add("이이");
        
        Iterator<String> iterator = hashSet.iterator();

        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
	}
}
