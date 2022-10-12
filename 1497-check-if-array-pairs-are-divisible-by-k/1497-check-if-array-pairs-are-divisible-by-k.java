class Solution {
    public boolean canArrange(int[] arr, int k) {
         int n = arr.length; 
        HashMap<Integer, Integer> map = new HashMap<>(); // stores <remainder, count>
        
        for(int num : arr){
            int rem = num % k; 
            if(rem < 0) rem+=k; // handle neg nums
            map.put(rem, map.getOrDefault(rem, 0) + 1); 
        }
        
        for(int r : map.keySet()){
            if(r == 0){ // eg k = 5 nums = [5, 10, 15, 20] then (5, 10) (15,20) can pair up with each other
                if(map.get(r) % 2 != 0) return false; // when freq is odd, 1 element is unpaired  eg (10, 20) (30)
            } 
            else if(r * 2 == k){// eg k = 10 nums = [15, 25,35,45] then (15, 25) (35,45) can pair up with each other
                if(map.get(r) % 2 != 0) return false;// when freq is odd, 1 element is unpaired eg (15, 25) (35) 
            }
            else{
               int count1 = map.get(r); //num whose remainder = r can pair up with num whose remainder = k-r
               int count2 = map.getOrDefault(k-r, 0); // count must be equal so that they can pair up with each other
               if(count1!=count2) return false; 
            }
        }
        return true; 
    }
}