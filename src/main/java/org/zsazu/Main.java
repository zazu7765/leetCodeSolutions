package org.zsazu;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"abc","bce","cae"};
        int result = deleteColumnsToMakeSorted.minDeletionSize(strs);
        System.out.println(result);
    }
}