public class SortArray {
    public static String [] sort (String[] nums){
        String min = "";
        int minIdx= 0;

        for (int i =0; i<nums.length-1;i++){
            int OldMinIdx = i;
            min = nums[i];

            for (int j =i+1; j<nums.length;j++){
                if(Double.parseDouble(min)> Double.parseDouble(nums[j])){
                    min = nums[j];
                    minIdx=j;

                }
            }
            swap(nums,minIdx,OldMinIdx,min);
        }
        return nums;

    }

    private static void swap(String[] nums, int minIdx, int oldMinIdx, String min) {
        String temp = nums [oldMinIdx];
        nums[minIdx]=temp;
    }

}
