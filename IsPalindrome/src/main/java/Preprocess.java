public class Preprocess{

    public String processSentence(String sentence){
        return sentence.replaceAll("[^a-zA-Z0-9]","").toLowerCase(); 
    }

}