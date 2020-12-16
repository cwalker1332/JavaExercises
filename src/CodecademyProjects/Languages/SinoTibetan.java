package CodecademyProjects.Languages;

// ensure SiboTibetan class inherits variables from parent class (Language)
class SinoTibetan extends Languages{

    // create constructor for SinoTibetan languages, but assign values to regions wdOrders
    // TODO: fix above comment (and the same comment in Mayan class)
    SinoTibetan(String langName, int speakers){
        super(langName, speakers, "Asia", "subject-object-verb");

        // override parent class to print out unique information to mayan languages
        if (langName.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }
    }
}