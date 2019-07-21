import static java.lang.Character.isLetterOrDigit;

public class Preprocess{

    public String processSentence(String sentence){
        StringBuilder sb=new StringBuilder("");
        char currChar;
        for(int index=0;index<sentence.length();index++){
            currChar=sentence.charAt(index);
            if(isLetterOrDigit(currChar)){
                sb.append(currChar);
            }
        }
        return sb.toString().toLowerCase();
    }

}