package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class KakaoAPI {

	public static void main(String[] args) {
		String json = null;
		try {
			String urlAddr = "https://dapi.kakao.com/v3/search/book?target=title&query=";
			//파라미터 인코딩
			String title = "삼국지";
			urlAddr += URLEncoder.encode(title, "utf-8");
			URL url = new URL(urlAddr);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			//요청 헤더 설정
			conn.setRequestProperty("Authorization", "KakaoAK ae6b2875ee4452804ed4e01890078a7e");
			StringBuilder sb = new StringBuilder();
			if (conn != null) {
				conn.setConnectTimeout(20000);
				conn.setUseCaches(false);
				if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
					InputStreamReader isr = new InputStreamReader(conn.getInputStream());
					BufferedReader br = new BufferedReader(isr);
					while (true) {
						String line = br.readLine();
						if (line == null) {
							break;
						}
						sb.append(line);
					}
					br.close();
					conn.disconnect();
				}
			}
			json = sb.toString();
			System.out.printf("%s\n", json);
		} catch (Exception e) {
			System.out.printf("다운로드 중 에러 발생:%s\n", e.getMessage());
		}
	}
}
