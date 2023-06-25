package ArrayWallahPlusShraddha;

public class Problem5 {
    // find last occurence of the element

    static int lastOccurrence(int [] array,int key){
        int pos=-1;
        for (int i=0;i<array.length;i++){
            if(array[i]==key){
                pos=i;
            }
        }
        return pos;
    }


    public static void main(String[] args) {

        int [] array = {23,11,44,2,4,2,55,55,2,2,2};
        int pos = lastOccurrence(array,55);
        if (pos == -1) {
            System.out.println("no element present");
        }
        else {
            System.out.println("the position at which element lastly occurred is =  " + pos);
        }

    }
}
