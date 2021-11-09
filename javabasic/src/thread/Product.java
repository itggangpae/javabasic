package thread;

import java.util.*;
class Product{
	List<Character> vec;
	Product(){
		vec=new ArrayList<Character>();
	}
	synchronized void put(char ch){
		vec.add(ch);
		System.out.print("창고에 제품 "+ch+"가 입고 되었습니다.\n");
		try{
			Thread.sleep(1000);	
		}
		catch (Exception e){ }
		System.out.print("재고수량:"+vec.size()+"\n");
		notifyAll();
	}
	
	synchronized char get(){
		try{
			if(vec.size() == 0) {
				wait();
			}
		}
		catch(InterruptedException E)
		{}
		
		Character ch=(Character)vec.remove(0);
		System.out.print("창고에서 제품 "+ch+"가 출고 되었습니다"+"\n");
		System.out.print("재고수량:"+vec.size()+"\n");
		return ch.charValue();
	}
}

