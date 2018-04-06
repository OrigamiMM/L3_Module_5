package data_structures;

import java.util.ArrayList;

/**
 * Copyright The League of Amazing Programmers 2013-2017 Level 3 Two ArrayList
 * Cleaning Exercises Duration=.00 Platform=Eclipse Type=Recipe Objectives=
 */

public class RemovingStuffFromArrayLists {

	public static void main(String[] args) {

		abstract class Stuff {
			abstract boolean isDirt();
		}
		class Worm extends Stuff {

			@Override
			boolean isDirt() {
				// TODO Auto-generated method stub
				return false;
			}
		}
		class Dirt extends Stuff {

			@Override
			boolean isDirt() {
				// TODO Auto-generated method stub
				return true;
			}
		}
		ArrayList<Stuff> stuffIFoundInTheYard = new ArrayList<Stuff>();
		//stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		//stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());

		System.out.println(stuffIFoundInTheYard.size());
		/* TODO 1: Clean out the dirt but keep the delicious worms. */
		for (int i = 0; i < stuffIFoundInTheYard.size(); i++) {
			if (stuffIFoundInTheYard.get(i).isDirt()) {
				System.out.println(i);
				stuffIFoundInTheYard.remove(i);
				i = i-1;
			}
		}

		System.out.println(stuffIFoundInTheYard.size()); // should be 2
System.out.println("   ");


		ArrayList<Character> truth = new ArrayList<Character>();
		truth.add('#');
		truth.add('s');
		truth.add('u');
		truth.add('#');
		truth.add('n');
		truth.add('s');
		truth.add(' ');
		truth.add('#');
		truth.add('o');
		truth.add('u');
		truth.add('#');
		truth.add('t');
		truth.add('#');
		truth.add(' ');
		truth.add('g');
		truth.add('#');
		truth.add('n');
		truth.add('s');
		truth.add('#');
		truth.add(' ');
		truth.add('o');
		truth.add('#');
		truth.add('u');
		truth.add('t');
		
//suns out gns out
		
		/* TODO 2: Remove the hash symbols and print out the truth. */
for (int i = 0; i < truth.size(); i++) {
	if (truth.get(i).equals('#')) {
		truth.remove(i);
		i = i-1;
	}else {
		System.out.println(truth.get(i));
	}
}
	}

}
