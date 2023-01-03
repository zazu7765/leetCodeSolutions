package org.zsazu;

public class deleteColumnsToMakeSorted {
    public static int minDeletionSize(String[] strs) {
        int count = 0;
        String str = strs[0];
        for(int i =0 ; i < str.length(); i++){
            for(int j =1; j<strs.length; j++){
                char jth = strs[j].charAt(i);
                char jthMinusOne = strs[j-1].charAt(i);
                if (jth < jthMinusOne){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
