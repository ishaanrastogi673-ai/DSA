class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr=new int[m+n];
        int i=0,j=0;
        int z=0;
        while(i!=m && j!=n){
            int n1=nums1[i];
            int n2=nums2[j];
            if(n1<=n2) {arr[z++]=n1;i++;}
            else {arr[z++]=n2;j++;}
        }
        if(i==m){
            while(j!=n){
                arr[z++]=nums2[j++];
            }
        }
        else if(j==n){
            while(i!=m){
                arr[z++]=nums1[i++];
            }
        }
        for(int o=0;o<m+n;o++){
            nums1[o]=arr[o];
        }
        return;
    }
}