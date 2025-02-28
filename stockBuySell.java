
class Solution {
    // Function to find the days of buying and selling stock for max profit.
    int stockBuySell(int arr[]) {
        int s=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                s+=(arr[i]-arr[i-1]);
            }
        }
        return s;
    }
}