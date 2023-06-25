package ArrayWallahPlusShraddha;

public class Problem12 {
    // given an array of the integers return the first value that is repeating in this array . if no value is repeated
    // then return -1

    static int repeatingElementIndex(int [] array){
        for (int i=0;i<array.length;i++){

            for (int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
