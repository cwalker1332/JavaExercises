package CodecademyProjects.Languages;

public class Languages {

    // this code demonstrates polymorphism and inheritance concepts

    /* Ways to add on or improve code:
    Build an array or ArrayList of several language objects and loop through them to call getInfo().
    Add new methods that allow users to set a specific region, change the number of speakers, or modify the word order.
    Add in further linguistic features (e.g., which genders are used, whether the language is tonal, etc.).
    */

    // make variables protected so child classes can access them
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    // create language constructor that includes fields defined above
    public Languages(String langName, int speaker, String regions, String wdOrder) {
        this.name = langName;
        this.numSpeakers = speaker;
        this.regionsSpoken = regions;
        this.wordOrder = wdOrder;
    }

    // create method that will print out all information on a language
    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder + ".");
    }

    public static void main(String[] args) {

        // assign values with information on each language and print
        Languages japanese = new Languages("Japanese", 4000000, "Japan", "subject-object-verb");
        japanese.getInfo();

        Mayan chuj = new Mayan("Chuj", 31630);
        chuj.getInfo();

        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 920000000);
        mandarin.getInfo();

        SinoTibetan burmese = new SinoTibetan("Burmese", 33000000);
        burmese.getInfo();
    }
}