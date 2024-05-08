class FaultyKeyboard {
    public static String reverse(String s){
        char[] temp = s.toCharArray();
        int i=0;
        int j = s.length()-1;
        while(i<j){
            char a = temp[i];
            temp[i] = temp[j];
            temp[j] = a;
            i++;
            j--;
        }
        return new String(temp);
    }
    public String finalString(String s) {
        String out = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'i'){
                out = reverse(out);
            }else{
                out += ch + "";
            }
        }
        return out;
    }
}
