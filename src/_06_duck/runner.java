package _06_duck;

public class runner {
public static void main(String[] args) {
	Duck donald = new Duck("crackers", 5);
	donald.quack();
	Godzilla bob = new Godzilla("humans", 0);
	bob.stomp();
}
}
