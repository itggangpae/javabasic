package designpattern;

//문서를 만드는 클래스
public class Director {
    private Builder builder;
    public Director(Builder builder) {        // Builder의 하위 클래스를 받아서 생성
        this.builder = builder;             
    }
    public void construct() {               		//문서 설정
        builder.makeTitle("Greeting");              // title 설정 
        builder.makeString("아침과 낮에 ");         // 문자열 설정
        builder.makeItems(new String[]{            // 개별 항목 설정
            "좋은 아침입니다.",
            "안녕하세요",
        });
        builder.makeString("밤에 ");                // 별도의 문자열
        builder.makeItems(new String[]{           // 별도의 개별 항목 
            "안녕하세요",
            "안녕히 주무세요",
            "안녕히 계세요",
        });
        builder.close();                           // 문서 완성 
    }
}
