class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        int count = 0;
        
        for(int i = 0 ; i < n ;i++){
            int tar = k - arr[i];
            if(hm.containsKey(tar)){
                count+=hm.get(tar);
            }
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            
        }
        
        return count;
    }
}
