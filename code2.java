class Solution{
    
    static ArrayList<Integer> leaders(int arr[], int n){
        
        int max = arr[n-1];
         
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=n-1; i>=0; i--){
            
            if(arr[i]>=max){
            max=arr[i];
            al.add(max);
            }
        }
        Collections.reverse(al);
        return al;
    }
}
