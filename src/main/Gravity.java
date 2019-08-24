/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 **/
package main;

import java.util.Scanner;
// uncomment the above line to use input in your program.

public class Gravity {
	// TODO 1: Create the main method
	public static void main(String[] args) {
		double time, speed, distance;
		Scanner scanner = new Scanner(System.in);
		time = scanner.nextDouble();
		double gravityConstant = 9.8;
		speed = gravityConstant * time;
		distance = (gravityConstant * time * time) / 2;
		System.out.println("the speed of object at" + time + "seconds after the release is " + speed + "and the distance the" + distance);

	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
