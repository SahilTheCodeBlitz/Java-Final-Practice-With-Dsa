package ArrayWallahPlusShraddha;

public class Problem3 {
    // Search the given element x in the given array . If present then return the index else return -1

    int search(int []array,int key){
        for (int i=0;i<array.length;i++){
            if(array[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []array={234,-2,4,4,3,5,4,3,4,4,3,33};
        Problem3 obj = new Problem3();
        int pos = obj.search(array,-2);
        System.out.println(pos);
    }
}
