import java.lang.*;

import java.util.Scanner;

public class BookRecord {

	Scanner fr = new Scanner(System.in);

	Book bookArray[] = new Book[2];

	static int size = 0;
	int i;

	public void addRecord(String name, String id, String author,
			String publisher) {

		if (size == bookArray.length) {
			bookArray = resizeArray();
		}

		bookArray[size] = new Book(name, id, author, publisher);
		size++;
	}

	public Book[] resizeArray() {
		Book tempArray[] = new Book[bookArray.length + 5];
		for (int n = 0; n < bookArray.length; n++) {
			tempArray[n] = bookArray[n];
			// bookArray[n] = tempArray[n];

			// size++;
		}
		bookArray = tempArray;
		// size++;
		return bookArray;
	}

	public void printRecord() {
		Book temp;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (bookArray[i].name.compareTo(bookArray[j].name) > 0) {
					temp = bookArray[i];
					bookArray[i] = bookArray[j];
					bookArray[j] = temp;
				} else if (bookArray[i].name.compareTo(bookArray[j].name) == 0
						&& bookArray[i].id.compareTo(bookArray[j].id) > 0) {
					temp = bookArray[i];
					bookArray[i] = bookArray[j];
					bookArray[j] = temp;
				}
			}
		}

		for (int i = 0; i < size; i++) {
			System.out.println(bookArray[i].name + " " + bookArray[i].id + " "
							+ bookArray[i].author + " "
							+ bookArray[i].publisher + " .");
		}
	}

	public void deletRecord() {
		System.out.println("Please enter the book ID which you want to delet from the record.");
		String id = fr.nextLine();
		boolean assume = false;
		// Object a=0;

		for (int c = 0; c < size; c++) {
			if (id.equals(bookArray[c].id)) {

				System.out.println("Your ID has been found.");
				for (int j = c; j < size; j++) {
					bookArray[j] = bookArray[j + 1];
				}
				bookArray[size - 1] = null;
				size--;
				assume = true;
				break;
			}
		}
		if (assume == false)
			System.out.println("Sorry, your ID is invalid. Enter a valid ID.\n");
	}

	public void editRecord(String id) {
		int index = -1;
		for (int i = 0; i < bookArray.length; i++) {
			if (id.equals(bookArray[i].id)) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			System.out.println("Book ID match.");
			System.out
					.println("So, Please write the name of the book which u want to edit");
			String n = fr.nextLine();
			bookArray[index].name = n;
			System.out
					.println("Please write the publisher name of the book which u want to edit");
			String p = fr.nextLine();
			bookArray[index].publisher = p;
		}

	}
}
