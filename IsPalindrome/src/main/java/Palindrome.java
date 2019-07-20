public class Palindrome {
    private Preprocess preprocess;

    Palindrome(){
        preprocess=new Preprocess();
    }

    public boolean check(String sentence) {
        sentence=preprocess.processSentence(sentence);
        int i=0;
        int j=sentence.length()-1;
        while(i<j){
            if(sentence.charAt(i)!=sentence.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}
