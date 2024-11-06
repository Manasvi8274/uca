public class StringSubsequence {
    
    public static String[] findSubsequence(String str){
        if(str.length() == 0){
            String[] ans = {""};
            return ans;
        }
        String[] smallArr = findSubsequence(str.substring(1));
        String[] ans = new String[2*smallArr.length];
        for(int i=0;i<smallArr.length;i++){
            ans[i] = smallArr[i];
        }
        for(int i=0;i<smallArr.length;i++){
            ans[i+smallArr.length] = str.charAt(0) + smallArr[i];
        }
        return ans;
    }
    
    public static void main(String[] args) {
        String[] a = findSubsequence("xyz");
        // System.out.println();
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
