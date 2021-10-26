package designpattern;

import java.io.*;

public class HTMLBuilder extends Builder {
    private String filename;                                 // 파일명
    private PrintWriter writer;                               //문자열을 기록할 PrintWriter
    public void makeTitle(String title) {                       // HTML 타이틀
    	filename = title + ".html";                           // 타이틀로 파일명 생
        try {
            writer = new PrintWriter(new FileWriter(filename)); // PrintWriter 생성
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>"); 
								// 데이터 기록
        writer.println("<h1>" + title + "</h1>");
    }
    public void makeString(String str) {                        // HTML 문자열 생성
        writer.println("<p>" + str + "</p>");                   
    }
    public void makeItems(String[] items) {                     // HTML 항목 생성
        writer.println("<ul>");                                 
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }
    public void close() {                                 // 문서 완성  
        writer.println("</body></html>");                     
        writer.close();                                        
    }
    public String getResult() {
        return filename;                                      // 파일명 리턴 
    }

}
