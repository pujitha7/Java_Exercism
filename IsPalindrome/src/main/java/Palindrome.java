public class Palindrome {
    private Preprocess preprocess;

    Palindrome(){
        preprocess=new Preprocess();
    }

    public boolean check(String sentence) {
        sentence=preprocess.processSentence(sentence);
        
        int backward=sentence.length()-1;
        int midSize=(int)sentence.length()/2;

        for(int index=0;index<midSize;index++){
            if(sentence.charAt(index)!=sentence.charAt(backward-index)){
                return false;
            }
        }

        return true;
    }
    
}
