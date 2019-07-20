import static java.lang.Character.isLetterOrDigit;

public class Preprocess{

    public String processSentence(String sentence){
        StringBuilder sb=new StringBuilder("");
        char currChar;
        for(int i=0;i<sentence.length();i++){
            currChar=sentence.charAt(i);
            if(isLetterOrDigit(currChar)){
                sb.append(currChar);
            }
        }
        return sb.toString().toLowerCase();
    }

}