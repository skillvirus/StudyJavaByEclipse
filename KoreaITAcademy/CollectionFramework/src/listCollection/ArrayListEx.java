package listCollection;

import java.util.ArrayList;

/*컬렉션 프레임워크는 배열의 단점을 보완하기 위해 설계됨
1. List, Set, Map 가 있음 
2. List : 순서 유지, 중복 허용(ArrayList, Vector 등
3. Set : 순서 유지 안함, 중복 불가 (HashSet, TreeSet 등)
4. Mat : Key와 Value로 구성된 데이터 집합(자료형), 순서는 유지 안함, 키는 중복 불가, 값은 중복 허용 (HashMap, TreeMap 등)
*/

public class ArrayListEx {
	public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();

        arrList.add("홍길동");
        arrList.add("강감찬");
        arrList.add("이순신");
        arrList.add("이이");
        arrList.add("이이");
        
        for(int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }
	}
}
