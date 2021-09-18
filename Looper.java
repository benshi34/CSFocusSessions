// This is a class called looper, that contains certain methods related to loops.
// Follow the instructions in the comments to complete the methods in this class.
public class Looper {
    // This variable is our funNumber!
    int funNumber;

    // The constructor, no need to touch this
    public Looper(int funNumber) {
        this.funNumber = funNumber;
    }

    // Write a method with the signature below that determines whether our
    // fun number is divisible by 4, and returns true if it is, false if it isn't
    // Hint: % is the modulo operator, look it up if you don't know what that
    // means
    public boolean divisibleByFour() {

    }

    // Write a toString method that prints out "Our funNumber is ____", replacing
    // the blank with our funNumber
    public String toString() {
    }

    // CHALLENGE: Write a method here that determines how many digits are in our fun number.
    // THIS IS TOUGH! Hint: Use loops and remember how integers divide in java!
    public int howManyDigits() {
        /* 3579/10 = 357
        357/10 = 35
        35/10 = 3
        3/10 = 0 */

        int counter = 0;
        int copy = funNumber;
        while (copy > 0) {
            copy = copy / 10;
            counter++;
        }
        return counter;
    }


    public static void main(String[] args) {
        // Create a Looper Object here named Bob (I did this one for you)
        Looper Bob = new Looper(5); // Bob's funNumber is 5
        // Create a Looper Object here named Cindy, and give her a funNumber of 7

        // Call the toString method on both Bob and Cindy, and print the result out
        // using System.out.println. Did it print out what you expected?

        // Call the toString method on both Bob and Cindy, and print the result out
        // using System.out.println. Did it print out what you expected?

    }
}
