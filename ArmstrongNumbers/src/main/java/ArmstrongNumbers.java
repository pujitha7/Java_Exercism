class ArmstrongNumbers {

	int order(int num){
		int ord=0;
		while(num>0){
			ord++;
			num=num/10;
		}
		return ord;
	}

	boolean isArmstrongNumber(int numberToCheck) {
		int orderNum=order(numberToCheck);
		int num=numberToCheck;
		int r;
		int sum=0;
		while(num>0){
			r=num%10;
			sum+=(int)Math.pow(r, orderNum);
			num=num/10;
		}
		if(sum==numberToCheck){
			return true;
		}
		return false;
	}

}
