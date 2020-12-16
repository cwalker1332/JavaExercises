package CodecademyProjects;

public class Dna {

    // this code determines if a protein can be transcribed out of a strand of DNA

    // can maybe add a scanner to this one too to determine if input letters result in a protein

    public static void main(String[] args) {

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        // find length of strand
        // can change dna = whichever dna strand you want to test
        String dna = dna3;
        int length = dna.length();
        System.out.println("Length: " + length);

        // does strand contain start codon
        int start = dna.indexOf("ATG");
        System.out.println("Start: " + start);

        // does strand contain stop codon
        int stop = dna.indexOf("TGA");
        System.out.println("Stop: " + stop);

        // is strand a protein
        if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
            System.out.println("Condition 1, 2, and 3 are satisfied.");

            // create and print protein
            String protein = dna.substring(start, stop + 3);
            System.out.println("Protein: " + protein);

        } else {
            System.out.println("No protein.");
        }
    }
}