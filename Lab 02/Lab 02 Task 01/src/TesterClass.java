import java.util.Scanner;

public class TesterClass {

	public static void main(String[] args) {

		Scanner fr = new Scanner(System.in);
		BookRecord br = new BookRecord();

		int i;
		try {
			for (i = 0;; i++) {
				printLine("\n-----WELCOME TO BRAC UNIVERSITY LIBRARY-----\n");
				printLine("Enter 1 to Add a Record\n");
				printLine("Enter 2 to Print the Records\n");
				printLine("Enter 3 to Delete a Record\n");
				printLine("Enter 4 to Edit a Record\n");
				int userInput = fr.nextInt();

				if (userInput > 4) {
					printLine("Sorry, your number do not match with us. \nSo, please enter your number between 1-4. ");
				}

				if (userInput == 1) {
					printLine("\nEnter the book name.");
					String name = fr.nextLine();
					name = fr.nextLine();
					printLine("\nEnter the book ID.");
					String id = fr.nextLine();
					printLine("\nEnter the author name.");
					String author = fr.nextLine();
					printLine("\nEnter the publisher name.");
					String publisher = fr.nextLine();
					br.addRecord(name, id, author, publisher);

				} else if (userInput == 2) {
					br.printRecord();

				} else if (userInput == 3) {
					br.deletRecord();

				} else if (userInput == 4) {
					printLine("Please enter the book ID which you want to edit from the record.");
					String id = fr.next();
					br.editRecord(id);

				}

				printLine("If u want to continue the program please press Y/y.");
				printLine("If u want to continue the program please press Y/y.");
				String userChoice = fr.next();

				String y1 = "y";
				String y2 = "Y";
				if (userChoice.equals(y1) || userChoice.equals(y2)) {
					continue;

				} else {

					print("----thanks for visiting BRAC University library. ");
					break;
				}

			}
		} catch (Exception e) {

			print(e);
			e.printStackTrace();
		}
	}

	public static void printLine(Object anyObject) {
		System.out.println(anyObject);
	}

	public static void print(Object anyObject) {
		System.out.print(anyObject);

	}
}
