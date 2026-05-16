class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        hm.put(sum,-1);
        
        for(int i = 0 ;i < n ;i++){
            sum += a[i];
            int rem = sum % k;
            if(rem < 0)     rem += k;
            
            if(hm.containsKey(rem)){
                int len = i - hm.get(rem);
                if(len > maxLen)    maxLen = len;
            }else{
                hm.put(rem,i);
            }
        }
        return maxLen;
       
    }
 
}
