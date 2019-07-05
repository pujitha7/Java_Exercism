import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

class Yacht {
    int[] dice;
    YachtCategory yachtCategory;
    Yacht(int[] dice, YachtCategory yachtCategory) {
        this.dice=dice;
        this.yachtCategory=yachtCategory;
    }

    int yacht(){
        for(int i=1;i<dice.length;i++){
            if(dice[i]!=dice[i-1]){
                return 0;
            }
        }
        return 50;
    }
    int numberOfSame(int x){
        int count=0;
        for(int i=0;i<dice.length;i++){
            if(dice[i]==x){
                count++;
            }
        }
        return count;
    }
    int fullHouse(){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<dice.length;i++){
            if(map.containsKey(dice[i])){
                map.put(dice[i],map.get(dice[i])+1);
            }
            else{
                map.put(dice[i],1);
            }
        }
        if(map.size()!=2){
            return 0;
        }
        int sum=0;
        for(Integer key:map.keySet()){
            if(map.get(key)==3 || map.get(key)==2){
                sum+=(key)*map.get(key);
            }
            else{
                return 0;
            }
        }
        return sum;
    }
    int fourOfKind(){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<dice.length;i++){
            if(map.containsKey(dice[i])){
                map.put(dice[i],map.get(dice[i])+1);
            }
            else{
                map.put(dice[i],1);
            }
        }
        if(map.size()>2){
            return 0;
        }
        int sum=0;
        for(Integer key:map.keySet()){
            if(map.get(key)>=4){
                sum+=key*4;
                break;
            }
        }
        return sum;

    }
    int littleStraight(){
        Arrays.sort(dice);
        if(dice[0]!=1){
            return 0;
        }
        for(int i=1;i<dice.length;i++){
            if(dice[i]-dice[i-1]!=1){
                return 0;
            }
        }
        return 30;
    }
    int bigStraight(){
        Arrays.sort(dice);
        if(dice[0]!=2){
            return 0;
        }
        for(int i=1;i<dice.length;i++){
            if(dice[i]-dice[i-1]!=1){
                return 0;
            }
        }
        return 30;

    }
    int choice(){
        int sum=0;
        for(int i=0;i<dice.length;i++){
            sum+=dice[i];
        }
        return sum;

    }
    int score() {
        int sc=0;
        switch(yachtCategory){
            case YACHT:
                sc=yacht();
                break;
            case ONES:
                sc=numberOfSame(1)*1;
                break;
            case TWOS:
                sc=numberOfSame(2)*2;
                break;
            case THREES:
                sc=numberOfSame(3)*3;
                break;
            case FOURS:
                sc=numberOfSame(4)*4;
                break;
            case FIVES:
                sc=numberOfSame(5)*5;
                break;
            case SIXES:
                sc=numberOfSame(6)*6;
                break;
            case FULL_HOUSE:
                sc=fullHouse();
                break;
            case FOUR_OF_A_KIND:
                sc=fourOfKind();
                break;
            case BIG_STRAIGHT:
                sc=bigStraight();
                break;
            case LITTLE_STRAIGHT:
                sc=littleStraight();
                break;
            case CHOICE:
                sc=choice();
                break;
        }
        return sc;
    }

}
