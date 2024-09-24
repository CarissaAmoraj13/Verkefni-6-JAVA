
/******************************************************************************
 *  Nafn    : Ma. Kathy Carissa Jamora Todtod
 *  T-póstur: mkc4@hi.is
 *
 *  Lýsing  :  The Java code calculates the Jaccard similarity between two sentences.
 *
 *****************************************************************************/

import java.util.HashSet;
import java.util.Scanner;

public class Jaccard {

    public static void main(String[] args) {

        // Create scanner for input
        Scanner scanner = new Scanner(System.in);

        // Read first sentence A
        System.out.println("Enter sentence A:");
        String sentenceA = scanner.nextLine();

        // Read second sentence B (as one line)
        System.out.println("Enter sentence B:");
        String sentenceB = scanner.nextLine();

        HashSet<String> setA = new HashSet<>();
        HashSet<String> setB = new HashSet<>();

        for (String word : sentenceA.split(" ")) {
            setA.add(word.toLowerCase().trim());
        }

        for (String word : sentenceB.split(" ")) {
            setB.add(word.toLowerCase().trim());
        }

        HashSet<String> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);

        // Calculate the union (all unique words from both sets)
        HashSet<String> union = new HashSet<>(setA);
        union.addAll(setB);

        // Compute Jaccard similarity: |A ∩ B| / |A ∪ B|
        double jaccardSimilarity = (double) intersection.size() / union.size();

        // Output the result
        System.out.println("Jaccard Similarity: " + jaccardSimilarity);
    }
}
