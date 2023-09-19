class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.equals("") && t.length() > 0 ) { return true; }

        char[] into = new char[s.length()];
        into = s.toCharArray();

        int ecx = 0;
        int equal_to_s = 0;
        
        for(char x : t.toCharArray()){
            System.out.println(x);
            if(x == into[ecx]){
                ecx++;
                equal_to_s++; 
                if(equal_to_s == s.length()) { return true; }
            }
        }     

        if(equal_to_s == s.length()) { return true; }

        return false;
    }
}