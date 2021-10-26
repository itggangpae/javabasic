package lambdaandstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapMain {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java8 lambda", "stream mapping");
		list.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(word -> System.out.print(word + "\t"));

		System.out.println("\n========================");
		Stream<String[]> ar = Stream.of(new String[] { "베이브루스", "루게릭", "타이콥" },
				new String[] { "사이영", "랜디존슨", "페드로마르티네스" });
		Stream<String> stream = ar.flatMap(Arrays::stream);
		stream.forEach(str -> System.out.print(str + "\t"));


		class Group {
			private List<String> members;
			
			public Group() { 
				super();
				members = new ArrayList<>(); 
			}
			
			public void add(String member) { 
				members.add(member);
			}
			
			public List<String> getMembers() { 
				return members;
			} 
		}

		List<Group> groups = new ArrayList<>();

		Group blackpink = new Group();
		blackpink.add("지수");
		blackpink.add("제니");
		blackpink.add("로제");
		blackpink.add("리사");
		groups.add(blackpink);

		Group redvelvet = new Group();
		redvelvet.add("아이린");
		redvelvet.add("슬기");
		redvelvet.add("웬디");
		redvelvet.add("조이");
		redvelvet.add("예리");
		groups.add(redvelvet);

		Stream<String> flatMappedStream = groups.stream().flatMap(
				g -> g.getMembers().stream());
		System.out.println("\n========================");
		flatMappedStream.forEach(str -> System.out.print(str + "\t"));

	}
}
