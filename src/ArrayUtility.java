public class ArrayUtility {

    public static void print(int[] array) {
        for(int i=0;i<array.length;i++){
            if(i!=0) System.out.print(", ");
            System.out.print(array[i]);
        }
    }

    public static int sum(int[] array) {
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        double s = sum(array);
        double avg = s/array.length;
        int ok = (int)(avg*100);
        return (double)ok/100;
    }

    public static int minimum(int[] array) {
        int m = 10000;
        for(int i=0;i<array.length;i++){
            if(array[i]<m){
                m=array[i];
            }
        }
        return m;
    }

    public static int maximum(int[] array) {
        int m = -1;
        for(int i=0;i<array.length;i++){
            if(array[i]>m){
                m=array[i];
            }
        }
        return m;
    }

    public static int evenCount(int[] array) {
        int cnt=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0) cnt++;
        }
        return cnt;
    }

    public static int[] reverseOne(int[] array) {
        int[] ok = new int[array.length];
        for(int i=array.length-1;i>=0;i--){
            ok[array.length-i-1]=array[i];
        }
        return ok;
    }

    public static void reverseTwo(int[] array) {
        for(int i=0;i<array.length/2;i++){
            int x = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=x;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for(int i=0;i<array.length;i++){
            if(array[i]==num) return true;
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for(int i=0;i<array.length;i++){
            if(array[i].equals(str)) return true;
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for(int i=0;i<array.length;i++){
            array[i]*=2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for(int i=0;i<array.length;i++){
            array[i]*=n;
        }
    }

    public static String toString(int[] array) {
        String ans = "";
        for(int i=0;i<array.length;i++){
            if(i!=0) ans += ", ";
            ans += array[i];
        }
        return ans;
    }

    public static boolean twoSum(int[] array, int num) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(i==j) continue;
                if(array[i]+array[j]==num) return true;
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int x = array[array.length-1];
        for(int i=array.length-1;i>=1;i--){
            array[i]=array[i-1];
        }
        array[0]=x;
    }

    public static void shiftLeft(int[] array) {
        int x = array[0];
        for(int i=0;i<array.length-1;i++){
            array[i]=array[i+1];
        }
        array[array.length-1]=x;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for(int i=1;i<=n;i++){
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for(int i=1;i<=n;i++){
            shiftLeft(array);
        }
    }


}
