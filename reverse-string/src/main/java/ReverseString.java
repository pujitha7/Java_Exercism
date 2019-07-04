class ReverseString {

    String reverse(String inputString) {
        StringBuilder str=new StringBuilder(inputString);
        str=str.reverse();
        return str.toString();
    }
  
}