class NaturalNumber {
    int num;
    Classification numType;
    NaturalNumber(int num){
        if(num<=0){
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.num=num;
    }
    int factorSum(){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    Classification getClassification(){
        int sum=factorSum();
        if(sum==num){
            return numType.PERFECT;
        }
        else if(sum>num){
            return numType.ABUNDANT;
        }
        return numType.DEFICIENT;
    }


}
