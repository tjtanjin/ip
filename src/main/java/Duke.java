import java.util.Scanner;
import java.util.ArrayList;

/**
 * Duke is a project that eventually builds into a personal assistant chat bot.
 */
public class Duke {
    public static ArrayList<String> words = new ArrayList<>();

    /**
     * Entry point of the program, first greets then listens for input from user.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        greet();
        listenInput();

    }

    /**
     * Listens for input from the user.
     */
    @SuppressWarnings("InfiniteLoopStatement")
    public static void listenInput() {
        Scanner sc = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("------------------------------------");

            input = sc.nextLine();

            System.out.println("------------------------------------");

            //program exits on bye
            if (input.equals("bye")) {
                exit();
            } else if (input.equals("list")) {
                list();
            //program echoes input otherwise
            } else {
                add(input);
                echo(input);
            }
        }
    }

    /**
     * Greets the user upon program launch.
     */
    public static void greet() {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo + "\nWhat can I do for you?");
    }

    /**
     * Prints the input given by the user.
     * @param input input provided by user
     */
    public static void echo(String input) {
        System.out.println(input);
    }

    /**
     * Exits the program.
     */
    public static void exit() {
        System.out.println("Bye! See you later :D");
    }

    /**
     * Add the input from user into an ArrayList and prints "added: ".
     * @param input input provided by user
     */
    public static void add(String input) {
        words.add(input);
        System.out.print("added: ");
    }

    /**
     * List all words entered by user.
     */
    public static void list() {
        for (int i = 0; i < words.size(); i++) {
            int itemNo = i + 1;
            System.out.println(itemNo + ". " + words.get(i));
        }
    }
}
