import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import java.util.ArrayList; 

public class JavaTest2 {

	public static void main(String[] args) {
		int UserNumPlay;
		int oneDi = 1;
		int twoDi = 2;
		int threeDi = 3;
		int lowPlay = 0;
		int highPlay = 1;
		int userGuess;
		int keepTrackOfGamePlayRight = 0;
		int keepTrackOfGamePlayWrong = 0;
		int TotalTrackOfGamePlay;
		int NumberOfGamePlay = 0;
		
		ArrayList userGuesses = new ArrayList();
		ArrayList systemNums = new ArrayList(); 

		int PlayAgainSymbol = 3;
		int PlayAgain = 0;

		boolean Play = false;

		Scanner myScan = new Scanner(System.in);
		Random generator = new Random();
		do {
			NumberOfGamePlay++;
			System.out
					.println("Hello User, My Name Jackson Dine Please Enter Your Warrior Name To Play D.O.D.:");
			String userName = myScan.nextLine();

			System.out
					.println("Hello "
							+ userName
							+ " You Can Enter The Interface, And Please, Watch Out For The Lions \n This Game Is Not For The Weak Hearted");

			System.out.println("Please Enter The Number Of Dice To Roll:");
			UserNumPlay = myScan.nextInt();
			System.out.println("Also Please Either Low (0) or High (1)");
			int UserInputLowOrHigh = myScan.nextInt();

			if (UserNumPlay == oneDi && UserInputLowOrHigh == lowPlay) {

				int num = Math.abs(generator.nextInt(3) + 1);
				
				
				System.out
						.println("Guess The Number That Is Being Generated, From 1-3 ");
				userGuess = myScan.nextInt();
				userGuesses.add(userGuess);
				systemNums.add(num);
				
				if (userGuess == num) {
					System.out.println("You Win");
					keepTrackOfGamePlayRight++;
				} else {
					System.out.println("Game Over");
					keepTrackOfGamePlayWrong--;

				}
			}

			if (UserNumPlay == oneDi && UserInputLowOrHigh == highPlay) {

				int num = Math.abs(generator.nextInt(3)   + 4);
				System.out
						.println("Guess The Number That Is Being Generated, From 4-6 ");
				userGuess = myScan.nextInt();
				userGuesses.add(userGuess);
				systemNums.add(num);
				if (userGuess == num) {
					System.out.println("You Win");
					keepTrackOfGamePlayRight++;

				} else {
					System.out.println("Game Over");
					keepTrackOfGamePlayWrong--;

				}
			}
			if (UserNumPlay == twoDi && UserInputLowOrHigh == lowPlay) {

				int num = Math.abs(generator.nextInt(4) + 2);
				System.out
						.println("Guess The Number That Is Being Generated, From 2-6");
				userGuess = myScan.nextInt();
				userGuesses.add(userGuess);
				systemNums.add(num);
				if (userGuess == num) {
					System.out.println("You Win");
					keepTrackOfGamePlayRight++;

				} else {
					System.out.println("Game Over");
					keepTrackOfGamePlayWrong--;

				}
			}

			if (UserNumPlay == twoDi && UserInputLowOrHigh == highPlay) {
				int num = Math.abs(generator.nextInt(5) + 7);
				System.out
						.println("Guess The Number That Is Being Generated, From 7-12 ");
				userGuess = myScan.nextInt();
				userGuesses.add(userGuess);
				systemNums.add(num);
				if (userGuess == num) {
					System.out.println("You Win");
					keepTrackOfGamePlayRight++;

				} else {
					System.out.println("Game Over");
					keepTrackOfGamePlayWrong--;

				}
			}

			if (UserNumPlay == threeDi && UserInputLowOrHigh == lowPlay) {

				int num = Math.abs(generator.nextInt(6) + 3);
				System.out
						.println("Guess The Number That is Being Generated, From 3-9");
				userGuess = myScan.nextInt();
				userGuesses.add(userGuess);
				systemNums.add(num);
				if (userGuess == num) {
					System.out.println("You Win");
					keepTrackOfGamePlayRight++;

				} else {
					System.out.println("Game Over");
					keepTrackOfGamePlayWrong--;

				}
			}
			if (UserNumPlay == threeDi && UserInputLowOrHigh == highPlay) {

				int num = Math.abs(generator.nextInt(8) + 10);
				System.out
						.println("Guess The Number That Is Being Generated, From 10-18 ");
				userGuess = myScan.nextInt();
				userGuesses.add(userGuess);
				systemNums.add(num);
				if (userGuess == num) {
					System.out.println("You Win");
					keepTrackOfGamePlayRight++;

				} else {
					System.out.println("Game Over");
					keepTrackOfGamePlayWrong--;

				}
				// keepTrackOfGamePlayWrong + keepTrackOfGamePlayRight =
				// TotalTrackOfGamePlay
				// Print out
				// System.out.println("The Total Number Of Correct Trys is: " +
				// TotalTrackOfGamePlay);
			}
			System.out
					.println("If you want to play again enter 1 if not enter -1");
			PlayAgainSymbol = myScan.nextInt();
			
			
		} while (PlayAgainSymbol > 0);
		TotalTrackOfGamePlay = keepTrackOfGamePlayWrong
				+ keepTrackOfGamePlayRight;

		System.out
				.println("The Total Points: " + TotalTrackOfGamePlay
						+ " And the total number of times played is"
						+ NumberOfGamePlay);
		System.out.println ("The User Guesses are" + userGuesses.toString());
		System.out.println("The Computer Numbers are" + systemNums.toString());
	}
}

// Add and Subtract Number Of Right and Wrong