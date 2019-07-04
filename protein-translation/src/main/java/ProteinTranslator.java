import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ProteinTranslator {
    private static HashMap<String,String> map=new HashMap<>();
    static{
        map.put("AUG", "Methionine");
        map.put("UUU","Phenylalanine");
        map.put("UUC","Phenylalanine");
        map.put("UUA", "Leucine");
        map.put("UUG","Leucine");
        map.put("UCU","Serine");
        map.put("UCC", "Serine");
        map.put("UCA","Serine");
        map.put("UCG","Serine");
        map.put("UAU", "Tyrosine");
        map.put("UAC","Tyrosine");
        map.put("UGU","Cysteine");
        map.put("UGC", "Cysteine");
        map.put("UGG","Tryptophan");
        map.put("UAA","STOP");
        map.put("UAG", "STOP");
        map.put("UGA", "STOP");
    }
    

    List<String> translate(String rnaSequence) {
        List<String> proteins=new ArrayList<>();
        for(int i=0;i<rnaSequence.length()-2;i=i+3){
            String protein=map.get(rnaSequence.substring(i, i+3));
            if(protein.equals("STOP")){
                return proteins;
            }
            proteins.add(protein);
        }
        return proteins;
    }
}