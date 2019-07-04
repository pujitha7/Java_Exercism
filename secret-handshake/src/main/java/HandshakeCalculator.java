import java.util.List;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

class HandshakeCalculator {

    private static HashMap<Integer,Signal> map=new HashMap<>();
    static{
        map.put(1,Signal.WINK);
        map.put(2,Signal.DOUBLE_BLINK);
        map.put(3,Signal.CLOSE_YOUR_EYES);
        map.put(4,Signal.JUMP);
    }

    String binaryConversion(int number){
        StringBuilder str=new StringBuilder("");
        if(number==0){
            return str.toString();
        }
        while(number!=1){
            str.append(number%2);
            number=number/2;
        }
        str.append("1");
        str=str.reverse();
        return str.toString();
    }

    List<Signal> calculateHandshake(int number) {
        String binary=binaryConversion(number);
        ArrayList<Signal> signals=new ArrayList<>();
        for(int i=binary.length()-1;i>=0;i--){
            if(binary.charAt(i)=='1'){
                int ind=binary.length()-i;
                if(ind==5){
                    Collections.reverse(signals);
                }
                else{
                    signals.add(map.get(ind));
                }
            }
        }
        return signals;
    }

}
