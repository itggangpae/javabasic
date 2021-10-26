package designpattern;

public class TextBuilder extends Builder {
    private StringBuilder buffer = new StringBuilder();           //문서 구축
    public void makeTitle(String title) {                       // 타이틀 설정
        buffer.append("==============================\n");     // 장식선
        buffer.append("[" + title + "]\n");                   // 타이틀
        buffer.append("\n");                                // 빈 줄 
    }
    public void makeString(String str) {                       // 문자열 설정
        buffer.append('■' + str + "\n");                     // 글머리 기호 추
        buffer.append("\n");                                //빈 줄
    }
    public void makeItems(String[] items) {                   // 일반 텍스트에서의 개별항목
        for (int i = 0; i < items.length; i++) {
            buffer.append("▫︎" + items[i] + "\n");            // 글머리 기호 추가
        }
        buffer.append("\n");                              //빈 줄
    }
    public void close() {                                   // 문서 닫기
        buffer.append("==============================\n");     // 장식선
    }
    public String getResult() {                              // 문서 완성 
        return buffer.toString();                             
    }
}
