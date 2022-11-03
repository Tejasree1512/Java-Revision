package com.ineuron.basics;

import java.util.Scanner;

class Guesser {
	int guessNumber;

	public int guessNumber(int low, int high, int round) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Hi Guesser, kindly guess the number in round " + round);
		guessNumber = sc.nextInt();

		if (guessNumber >= low && guessNumber <= high && guessNumber != 0)
			return guessNumber;
		else {
			System.out.println("Please guess the number in the range " + low + " to " + high);
			guessNumber(low, high, round);
			return guessNumber;
		}
	}
}

class Player {

	Scanner sc = new Scanner(System.in);
	int numOfPlayers = sc.nextInt();
	int[] pguessNumber = new int[numOfPlayers];
	int count = 0;

	public void guessNumber(int low, int high) {
		for (int i = 0; i < numOfPlayers; i++) {
			count++;
			System.out.println("Hi Player " + count + ", kindly guess the number that guesser has guessed");
			pguessNumber[i] = sc.nextInt();
			if (pguessNumber[i] < low || pguessNumber[i] > high || pguessNumber[i] == 0) {
				System.out.println("Please guess the number in the range " + low + " to " + high);
				i -= 1;
				count--;
				guessNumber(low, high);
			}

		}

	}
}

class Umpire {
	int numFromGuesser;
	int round;

	public void compare(int low, int high) {
		round = 1;
		Guesser guesser = new Guesser();
		numFromGuesser = guesser.guessNumber(low, high, round);
		if (numFromGuesser != 0) {
			System.out.println("Enter Number of players");
			Player player = new Player();

			player.guessNumber(low, high);
			int n = player.numOfPlayers;
			int count = player.numOfPlayers;
			while (count > 1) {
				count = 0;
				for (int i = 0; i < n; i++) {
					if (numFromGuesser == player.pguessNumber[i]) {
						count++;
						System.out.print(i + 1 + " ");
					} else {
						player.pguessNumber[i] = 0;
					}
				}
				round++;
				if (count > 1) {
					System.out.print("Qualified for next round");
					System.out.println(" ");
					System.out.println("Round " + round + " Starts now");
					numFromGuesser = guesser.guessNumber(low, high, round);
					for (int i = 0; i < n; i++) {
						if (player.pguessNumber[i] != 0) {
							int j = i + 1;
							System.out.println("Player " + j + " please guess the number");
							Scanner sc = new Scanner(System.in);
							player.pguessNumber[i] = sc.nextInt();

						}
					}
				}
			}

			int flag = 0;
			System.out.println();
			for (int i = 0; i < n; i++) {
				if (player.pguessNumber[i] != 0) {
					System.out.println("Player " + (i+1) + " won the game");
					flag = 1;
				}

			}
			if (flag == 0) {
				System.out.println("No player guessed the number, try again...");
				Umpire umpire = new Umpire();
				umpire.compare(low, high);
			}
		} else {
			System.out.println("Can't proceed further");
		}

	}
}

public class Guessergame {

	public static void main(String[] args) {
		startGame();
	}

	public static void startGame() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter lower range");
		int low = sc.nextInt();
		System.out.println("enter higher range");
		int high = sc.nextInt();
		if (low > 0 && high > 0) {
			Umpire umpire = new Umpire();
			umpire.compare(low, high);
		} else {
			System.out.println("Kindly enter numbers greater than zero for low and high");
			startGame();
		}
	}

}
