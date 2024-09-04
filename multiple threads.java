class EvenNumbersThread extends Thread {
    public void run() {
        System.out.print("First 20 even natural numbers: ");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i * 2 + " ");
        }
        System.out.println();
    }
}

// Thread to print the square of the first 20 odd natural numbers
class SquareOfOddNumbersThread extends Thread {
    public void run() {
        System.out.print("Square of first 20 odd natural numbers: ");
        for (int i = 1; i <= 20; i++) {
            int oddNumber = i * 2 - 1;  // Calculate the odd number
            System.out.print(oddNumber * oddNumber + " ");
        }
        System.out.println();
    }
}

// Thread to print the cube of the first 20 even natural numbers
class CubeOfEvenNumbersThread extends Thread {
    public void run() {
        System.out.print("Cube of first 20 even natural numbers: ");
        for (int i = 1; i <= 20; i++) {
            int evenNumber = i * 2;  // Calculate the even number
            System.out.print(evenNumber * evenNumber * evenNumber + " ");
        }
        System.out.println();
    }
}

// Thread to print the first 20 multiples of 10
class MultiplesOf10Thread extends Thread {
    public void run() {
        System.out.print("First 20 multiples of 10: ");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i * 10 + " ");
        }
        System.out.println();
    }
}

// Main class to start the threads
public class MultiThreadingExample {
    public static void main(String[] args) {
        // Create instances of each thread
        EvenNumbersThread evenThread = new EvenNumbersThread();
        SquareOfOddNumbersThread squareThread = new SquareOfOddNumbersThread();
        CubeOfEvenNumbersThread cubeThread = new CubeOfEvenNumbersThread();
        MultiplesOf10Thread multiplesThread = new MultiplesOf10Thread();

        // Start each thread
        evenThread.start();
        squareThread.start();
        cubeThread.start();
        multiplesThread.start();
    }
}