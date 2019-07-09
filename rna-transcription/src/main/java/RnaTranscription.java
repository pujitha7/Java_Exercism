import java.util.*;

class RnaTranscription {

    private static HashMap<Dna,Character> map=new HashMap<>();

    static{
        map.put(Dna.G,'C');
        map.put(Dna.C,'G');
        map.put(Dna.T,'A');
        map.put(Dna.A,'U');
    }

    String transcribe(String dnaStrand) {
        StringBuilder rnaStrand=new StringBuilder("");
        for(int i=0;i<dnaStrand.length();i++){
            rnaStrand.append(map.get(Dna.diffDna(dnaStrand.charAt(i))));
        }
        return rnaStrand.toString();
    }



}
