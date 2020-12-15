package defanging_an_ip_address;


// 1108. Defanging an IP Address
// https://leetcode.com/problems/defanging-an-ip-address/

import java.util.Arrays;

class Solution {
    public String defangIPaddr(String address) {
        String[] addressSplit = address.split("\\.");
        String defangedIP = "";
        for (int i=0; i< addressSplit.length; i++){
            defangedIP += addressSplit[i];
            // Don't add [.] to last element
            if (i<addressSplit.length-1){
                defangedIP += "[.]";
            }
        }
        return defangedIP;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.defangIPaddr("1.1.1.1")); // Expected "1[.]1[.]1[.]1"
    }
}