package nestedclass;

class EmbedClass{
	private ContainClass parent;
	private int y;
	
	EmbedClass(ContainClass parent){
		this.parent = parent;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	void disp() {
		System.out.println("부모의 x 사용하기:" + parent.x);
		parent.x = 20;
		System.out.println("y:" + y);
	}
	
}

class ContainClass{
	public int x;
	public EmbedClass embed;
	ContainClass(){
		x = 10;
	}
	
	void createEmbed() {
		//생성자를 이용한 전달
		embed = new EmbedClass(this);
		//setter를 이용한 전달
		embed.setY(x);
	}
	
	void print() {
		System.out.println("나의 x 사용하기:" + x);
	}
	
	void method() {
		embed.disp();
	}
	
}

public class IncludeMain {

	public static void main(String[] args) {
		ContainClass obj = new ContainClass();
		obj.print();
		obj.createEmbed();
		obj.print();
		obj.method();
	}

}
