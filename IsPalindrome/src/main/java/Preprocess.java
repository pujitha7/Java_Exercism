import static java.lang.Character.isLetterOrDigit;

public class Preprocess{

    public String processSentence(String sentence){
        StringBuilder modified=new StringBuilder("");
        char currChar;
        for(int index=0;index<sentence.length();index++){
            currChar=sentence.charAt(index);
            if(isLetterOrDigit(currChar)){
                modified.append(currChar);
            }
        }
        return modified.toString().toLowerCase();
    }

}