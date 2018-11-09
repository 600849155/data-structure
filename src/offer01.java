package exersise;

public class offer01 {
    public boolean Find(int target, int [][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int i=rows-1,j=0;
        while(i>=0 && j<cols){
            if(target<array[i][j])
                i--;
            else if(target>array[i][j])
                j++;
            else
                return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int [][]arr = {{7}, {1,2,8,9}, {2,4,9,12},{4,7,10,13},{6,8,11,15}};
        boolean a = (new offer01().Find(7,arr));
        System.out.println(a);
    }
}


