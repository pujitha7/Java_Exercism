import java.util.*;
class TwelveDays {
    
    private static HashMap<Integer,String> map=new HashMap<>();
    private static HashMap<Integer,String> ordinals=new HashMap<>();
    static{
        map.put(1,"a Partridge in a Pear Tree.");
        map.put(2,"two Turtle Doves");
        map.put(3,"three French Hens");
        map.put(4,"four Calling Birds");
        map.put(5,"five Gold Rings");
        map.put(6,"six Geese-a-Laying");
        map.put(7,"seven Swans-a-Swimming");
        map.put(8,"eight Maids-a-Milking");
        map.put(9,"nine Ladies Dancing");
        map.put(10,"ten Lords-a-Leaping");
        map.put(11,"eleven Pipers Piping");
        map.put(12,"twelve Drummers Drumming");

        ordinals.put(1,"first");
        ordinals.put(2,"second");
        ordinals.put(3,"third");
        ordinals.put(4,"fourth");
        ordinals.put(5,"fifth");
        ordinals.put(6,"sixth");
        ordinals.put(7,"seventh");
        ordinals.put(8,"eighth");
        ordinals.put(9,"ninth");
        ordinals.put(10,"tenth");
        ordinals.put(11,"eleventh");
        ordinals.put(12,"twelfth");
    }


    String verse(int verseNumber) {
        StringBuilder sb=new StringBuilder("");
        sb.append(String.format("On the %s day of Christmas my true love gave to me: ",ordinals.get(verseNumber)));
        for(int i=verseNumber;i>1;i--){
            sb.append(String.format("%s, ", map.get(i)));
            if(i==2){
                sb.append("and ");
            }
        }
        sb.append(String.format("%s\n",map.get(1)));
        return sb.toString();
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder sb=new StringBuilder("");
        for(int i=startVerse;i<endVerse;i++){ 
            sb.append(String.format("%s\n",verse(i)));
        }
        sb.append(verse(endVerse));
        return sb.toString();
    }
    
    String sing() {
        return verses(1,12);
    }
}
