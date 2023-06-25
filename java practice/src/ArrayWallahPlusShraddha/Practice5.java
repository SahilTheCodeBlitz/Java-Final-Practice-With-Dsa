package ArrayWallahPlusShraddha;

public class Practice5 {
// java me pass by value hota hai lets understand that concept with reference to normal int variable and int array

    static void changeData(int number){
        //value khud pass nhi hoti copy banti hai fir pass hoti  hai so change karne pe main
        // function pe no effect hota hai
        number=0;
    }

    static void changeArray(int arr[]){
        // value khud pass nhi hoti copy banti hai fir pass hoti
        // par stack ki value pass hui mtlb referece pass hua vo function me pass hua
        // therefore same reference for noth array so function call se bhi value change hogi

        arr[0]=0;
        arr[1]=0;
        arr[2]=0;
    }

    static void displayArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(" value of n before function call = "+n);
        changeData(n);
        System.out.println("value of n after function call = "+n); // no changes

        int arra[] = {23,22,12,32,11};

        System.out.println("value of array before function call");

        displayArray(arra);

        System.out.println("value of array after the function call");

        changeArray(arra);

        displayArray(arra);

    }
}
