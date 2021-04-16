package designpattern;

import java.util.ArrayList;
import java.util.List;

public class CollectionMain {

	interface Iterator<E> { 
		boolean hasNext();
		E next();
		void remove();
	}

	interface Iterable<T> { 
		Iterator<T> iterator();
	}

	interface Collection<E> extends Iterable<E> {

	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); 
		list.add("생성 패턴"); 
		list.add("구조 패턴"); 
		list.add("행동 패턴");
		java.util.Iterator<String> itr = (java.util.Iterator<String>) list.iterator();
		while (itr.hasNext()) { 
			String str = itr.next();
			System.out.println(str);
		}

	}

}
