package oop_1;

class Calculate
{
	int result = 0;
	
	//매개변수가 정수 - call by value
	void inc1(int n) {
		n = n + 1;
	}
	
	//매개변수가 Calculate 클래스 - call by reference
	void inc2(Calculate test){
		 test.result = test.result + 1;
	}	
}
