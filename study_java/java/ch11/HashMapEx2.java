package ch11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("안자바", new Integer(90));

		Set set = map.entrySet(); // 키,값을 엔트리형태로 set에 저장하여 반환
		Iterator it = set.iterator();

		while (it.hasNext()) { // 하나씩 꺼내서 출력
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("이름: " + e.getKey() + ", 점수: " + e.getValue());
		}

		set = map.keySet();
		System.out.println("참가자명단 : " + set); // 키값 출력

		Collection values = map.values(); // 값들
		it = values.iterator();

		int total = 0;

		while (it.hasNext()) {
			Integer i = (Integer) it.next(); // 값 하나씩 꺼내서 total에 더한다
			total += i.intValue();
		}

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float) total / set.size());
		System.out.println("최고 점수 : " + Collections.max(values));
		System.out.println("최저 점수 : " + Collections.min(values));
	}

}
