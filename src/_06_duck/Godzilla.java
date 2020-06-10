package _06_duck;

public class Godzilla {
int numberOfFriends;
String favoriteFood;
void roar() {
	System.out.println("*ROAR*");
}
void stomp() {
	System.out.println("*stomp*");
}
Godzilla(String favoriteFood, int numberOfFriends) {
    this.favoriteFood = favoriteFood;
    this.numberOfFriends = numberOfFriends;
}
}
