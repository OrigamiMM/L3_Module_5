import java.util.ArrayList;

import data_structures.Randomness;

public class Plane extends Randomness{
int numOfPass;
static ArrayList<Snake> Snakes = new ArrayList<Snake>();
public static void main(String[] args) {
	Plane plane = new Plane();
	plane.createSnakes(100);
	int totalVenom = calcVenom(Snakes);
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
		System.out.println(snek.get(i).getVicious());
	}
	return sum;
}
}
