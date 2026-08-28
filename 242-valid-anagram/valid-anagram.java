class Solution {
    public boolean isAnagram(String s, String t) {
        int l=s.length();
        int l2=t.length();
        if(l!=l2) return false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch)) map.put(ch,1);
            else map.put(ch,map.get(ch)+1);
        }
        for(int i=0;i<l;i++){
            char cc=t.charAt(i);
            if(map.containsKey(cc)){
                map.put(cc,map.get(cc)-1);
                if(map.get(cc)==0) map.remove(cc);
            }
        }
        if(map.size()==0) return true;
        return false;
    }
}