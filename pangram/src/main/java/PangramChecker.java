import java.util.HashSet;

public class PangramChecker {

    public boolean isPangram(String input) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<input.length();i++){
            if(Character.isLetter(input.charAt(i))){
                set.add(Character.toLowerCase(input.charAt(i)));
            }
            
        }
        if(set.size()==26){
            return true;
        }
        return false;
    }

}
