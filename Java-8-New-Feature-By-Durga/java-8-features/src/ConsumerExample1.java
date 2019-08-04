import java.util.function.Consumer;

public class ConsumerExample1 {

	public static void main(String[] args) {
		Consumer<String> c1=str->System.out.println(str);
		Consumer<Integer> c2=i->System.out.println(i);
		
		c1.accept("somak");
		c2.accept(20121980);

	}

}
