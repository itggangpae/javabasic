package lambdaandstream;

import java.util.Arrays;
import java.util.List;

public class StreamMapMain {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student(1, "김좌진", "남자", "컴퓨터공학과", 80 ),
			new Student(2, "홍범도", "남자", "기계공학과", 92),
			new Student(3, "유관순", "여자", "컴퓨터공학과", 87),
			new Student(4, "윤봉길", "남자", "컴퓨터공학과", 85),
			new Student(5, "남자현", "여자", "전자공학과", 78)
				);
		list.stream()
			.filter(student->student.getGender().equals("남자"))
			.mapToInt(Student::getScore)
			.forEach(student -> System.out.println(student));
	}
}
