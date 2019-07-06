class RotationalCipher {
    int shiftKey;
    RotationalCipher(int shiftKey) {
        this.shiftKey=shiftKey;
    }

    String rotate(String data) {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<data.length();i++){
            char c=data.charAt(i);
            if(Character.isLowerCase(c)){
                c=(char)((((c-'a')+shiftKey)%26)+'a');
            }
            if(Character.isUpperCase(c)){
                c=(char)((((c-'A')+shiftKey)%26)+'A');
            }
            sb.append(c);
        }
        return sb.toString();
    }

}
