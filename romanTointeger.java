class Solution {
    public int romanToint(string s){
        Map<character,Integer> Map = New HashMap();
        Map.put('I',1);
        Map.put('v',5);
        Map.put('x',10);
        Map.put('L',50);
        Map.put('c',100);
        Map.put('D',500);
        Map.put('M',1000);
        int res = map.get(s.charAT(s.length()-1));
        for(int i = s.length()-2;i>=0; i--)
        {
            if(map.get(s.charAt(i)) < map.get(s.charAT(i+1))){
                res -= map.get(s.charAT(i));
            }
            else{
                res += map.get(s.charAT(i));
            }
        }
        return res;
    }
}