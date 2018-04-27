package data_structures;
import java.util.ArrayList;

public class Plane extends Randomness{
static int numOfPass = 100;
static ArrayList<Snake> Snakes = new ArrayList<>();
public static void main(String[] args) {
	Plane plane = new Plane();
	plane.createSnakes(100);
	int totalVenom = calcVenom(Snakes);
	calcPercent(totalVenom,numOfPass);
}

void createSnakes(int amount) {
	for (int i = 0; i < amount; i++) {
		int vic = randomInt();
		boolean isVenom = randomBool();
		Snakes.add(new Snake(vic, isVenom));
	}
}
static int calcVenom(ArrayList<Snake> snek) {
	int sum = 0;
	for (int i = 0; i < snek.size(); i++) {
		if (snek.get(i).isVenomous()) {
			sum = sum+ snek.get(i).getViciousness();
		}	
	}
	System.out.println(sum);
	return sum;
}
static int calcPercent(int firstNum, int secondNum) {
	int percent = (firstNum*10)/secondNum;
	System.out.println("There is a " + percent + "% of death");
	return percent;
	
}
}
