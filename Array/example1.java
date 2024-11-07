package Array;

class example1 {
    public static void main(String[] args) {
        // Creating a static array
        int nums[] = {1,2,3,4,5};

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);

        nums[0] = 0;
        System.out.println(nums[0]);

        // Creating a dynamic array
        // This will create a array containing 0 only
        int arr[] = new int[5];
        
        for(int i = 0; i < arr.length; i++)
        {
            System.err.println(arr[i]);
        }
    }
}