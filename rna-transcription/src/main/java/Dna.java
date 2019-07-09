public enum Dna{
    G,C,T,A;
    
    public static Dna diffDna(char dnaChar){
        if(Character.isLetter(dnaChar)){
            dnaChar=Character.toUpperCase(dnaChar);
        }
        if(dnaChar=='G' || dnaChar=='1'){
            return Dna.G;
        }
        if(dnaChar=='C' || dnaChar=='2'){
            return Dna.C;
        }
        if(dnaChar=='T' || dnaChar=='3'){
            return Dna.T;
        }
        if(dnaChar=='A' || dnaChar=='4'){
            return Dna.A;
        }
        return null;
    }
}