import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
class Sieve {
    int maxPrime;
    Sieve(int maxPrime) {
        this.maxPrime=maxPrime;
    }

    List<Integer> getPrimes() {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<=maxPrime;i++){
            list.add(i);
        }
        list.set(0,-1);
        list.set(1, -1);
        for(int i=2;i<=(int)Math.sqrt(maxPrime);i++){
            int j=i*i;
            while(j<=maxPrime){
                list.set(j, -1);
                j+=i;
            }
        }
        List<Integer> l=new ArrayList<>();
        for(Integer num:list){
            if(num!=-1){
                l.add(num);
            }
        }
        
        return l;
    }
}
