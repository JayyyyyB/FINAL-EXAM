import java.util.Stack;

class Creature {
    String name;
    int power;

    Creature(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public String toString() {
        return name + " - " + power;
    }
}

public class BALBUENA_FinalExam {

    // Bubble Sort: Descending order

    public static void bubbleSortDescending(Creature[] creatures) {
        int n = creatures.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (creatures[j].power < creatures[j + 1].power) {
                    // Swap
                    Creature temp = creatures[j];
                    creatures[j] = creatures[j + 1];
                    creatures[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort: Ascending order

    public static void selectionSortAscending(Creature[] creatures) {
        int n = creatures.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (creatures[j].power < creatures[minIndex].power) {
                    minIndex = j;
                }
            }
            // Swap

            Creature temp = creatures[minIndex];
            creatures[minIndex] = creatures[i];
            creatures[i] = temp;
        }
    }

    // Display the array of creatures

    public static void displayCreatures(Creature[] creatures, String message) {
        System.out.println("* " + message + " *");
        for (Creature c : creatures) {
            System.out.println(c);
        }
        System.out.println();
    }

    // Stack Implementation

    public static void stackImplementation(Creature[] creatures) {
        Stack<Creature> creatureStack = new Stack<>();

    // Push creatures onto the stack

        for (Creature c : creatures) {
            creatureStack.push(c);
        }

    // Pop creatures from the stack

        System.out.println("* Stack Implementation: Popping Creatures *");
        while (!creatureStack.isEmpty()) {
            System.out.println("Popped: " + creatureStack.pop());
        }
    }

    public static void main(String[] args) {
    // Input data

        Creature[] creatures = {
                new Creature("Dragon", 95),
                new Creature("Griffin", 88),
                new Creature("Unicorn", 78),
                new Creature("Phoenix", 92),
                new Creature("Centaur", 85)
        };

    // Bubble Sort: Descending Order
        bubbleSortDescending(creatures);
        displayCreatures(creatures, "Bubble Sort: Descending Order by Power Level");

    // Selection Sort: Ascending Order
        selectionSortAscending(creatures);
        displayCreatures(creatures, "Selection Sort: Ascending Order by Power Level");

    // Stack Implementation
        bubbleSortDescending(creatures); 
        
    // Sort again in descending order before pushing to stack
        stackImplementation(creatures);
    }
}
