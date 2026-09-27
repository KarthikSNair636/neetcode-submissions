class Solution {

    public static boolean checkArr(int[] arr1,int arr2[]){
        for(int i = 0;i < 26;i++){
            if(arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
            return false;

        int[] arrS1 = new int[26];
        int[] arrS2 = new int[26];
        for(int i = 0;i < s1.length();i++){
            arrS1[(int)s1.charAt(i) - 97] += 1;
            arrS2[(int)s2.charAt(i) - 97] += 1;
        }

        int i = 0;
        int j = s1.length() - 1;

        while(j < s2.length()){
            if(checkArr(arrS1,arrS2))
                return true;
            arrS2[(int)s2.charAt(i) - 97] -= 1;
            i++;
            j++;
            if (j < s2.length()) {
                arrS2[(int)s2.charAt(j) - 97] += 1;
            }
        }
        return false;
    }
}
