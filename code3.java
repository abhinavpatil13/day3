class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        
        int count =0;
        for(int i=0;i<n;i++){
           // int count=0;
            for(int j=i+1; j<n;j++){
                
                if(arr[i]+arr[j]==k){
                    count++;
                    
                }
            }
        }
        return count;
    }
}
