/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public  int findpeak(MountainArray mountainArr,int left,int right){
        while(left<right){
            int  mid=( left+right )/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                left=mid+1;
            }
            else {
                right=mid;
            }
        }
        return left;
    }
    public int binarysearch(MountainArray mountainArr,int st,int end,int target,boolean ascending){
    while(st<=end){
        int mid= (st+end)/2;
        int value= mountainArr.get(mid);
        if(value==target){
            return mid;
        }
        if(ascending){
            if(value<target){
                st= mid+1;
            }
            else{
                end=mid-1;
            }
        }
        else{
            if(target<value){
                st= mid+1;
            }
            else{
                end=mid-1;
            }
        }
    }
    return -1;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=  mountainArr.length();
        int peak=findpeak(mountainArr,0,n-1);
        int result =binarysearch(mountainArr,0,peak,target,true);
        if(result!=-1){
            return result;
        }
        return binarysearch(mountainArr,peak+1,n-1,target,false);

    }
}