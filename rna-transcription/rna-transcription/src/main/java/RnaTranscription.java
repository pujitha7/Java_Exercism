import java.util.*;

class RnaTranscription {
    private static HashMap<Character , Character> map = new HashMap<>() {{
        put('G','C');
        put('C','G');
        put('T','A');
        put('A','U');
    }};
    String transcribe(String dnaStrand) {
        StringBuilder rnaStrand=new StringBuilder("");
        for(int i=0;i<dnaStrand.length();i++){
            rnaStrand.append(map.get(Character.toUpperCase(dnaStrand.charAt(i))));
        }
        return rnaStrand.toString();
    }



}
