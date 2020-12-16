package CodecademyProjects.Languages;

// ensure Mayan class inherits variables from parent class (Language)
class Mayan extends Languages{

    // create constructor for Mayan languages, but assign values to regions wdOrders
    Mayan(String langName, int speakers){
        super(langName, speakers, "Central America", "verb-object-subject");
    }

    // override parent class to print out unique information to mayan languages
    @Override
    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder + ".");
        System.out.println("Fun fact: " + this.name + " is an ergative language.");
    }
}