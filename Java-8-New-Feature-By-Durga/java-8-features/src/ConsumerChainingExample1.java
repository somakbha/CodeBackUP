import java.util.function.Consumer;

class Movie {
	String name;

	Movie(String name) {
		this.name = name;
	}
}

public class ConsumerChainingExample1 {

	public static void main(String[] args) {
		Consumer<Movie> c1=m->System.out.print(m.name+" is going to be released. ");
		Consumer<Movie> c2=m->System.out.print(m.name+" is a flop movie. ");
		Consumer<Movie> c3=m->System.out.print(m.name+" movie information is stored in db.");
		Consumer<Movie> cc=c1.andThen(c2).andThen(c3);
		cc.accept(new Movie("gajini"));

	}

}
