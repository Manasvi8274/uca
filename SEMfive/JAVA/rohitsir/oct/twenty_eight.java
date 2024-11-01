package semfive.java.rohitsir.oct;
import java.util.*;

//     class TreeNode{
//         int val;
//         TreeNode left;
//         TreeNode right;
//         TreeNode(){};
//         TreeNode(int val){
//             this.val = val;
//         }
//         TreeNode(int val,TreeNode left,TreeNode right){
//             this.val = val;
//             this.left = left;
//             this.right = right;
//         }
//     }
//     //     if(root == null){
//     //         return min;
//     //     }
//     //     min = Integer.min(min,pos);
//     //     List<Integer> currList = lp.getOrDefault(pos, new ArrayList<>());
//     //     currList.add(root.val);
//     //     lp.put(pos, currList);//O(1)
//     //     int m1 = vot(root.left, pos-1, lp,min);
//     //     int m2 = vot(root.right, pos+1, lp,min);
//     //     return Integer.min(Integer.min(m1,m2),min);
//     // }
//     //     List<List<Integer>> ans = new ArrayList<>();
//     //     Map<Integer,List<Integer>> lp = new HashMap<>();
//     //     int min = vot(root,0,lp,0);
//     //     while(lp.containsKey(min)){
//     //         ans.add(lp.get(min));
//     //         min++;
//     //     }
//     //     return ans;
//     // }
//     public static void vot(TreeNode root,int pos,TreeMap<Integer,List<Integer>>lp){
//         if(root == null){
//             return;
//         }
//         List<Integer> currList = lp.getOrDefault(pos, new ArrayList<>());
//         currList.add(root.val);
//         lp.put(pos, currList);//O(1)
//         vot(root.left, pos-1, lp);
//         vot(root.right, pos+1, lp);
//     }

//     public static List<List<Integer>> VerticalOrder(TreeNode root){
//         List<List<Integer>> ans = new ArrayList<>();
//         TreeMap<Integer,List<Integer>> lp = new TreeMap<>();
//         vot(root,0,lp);

//         int lowestlevel=lp.firstEntry().getKey();
//         while(lp.containsKey(lowestlevel)){
//             ans.add(lp.get(lowestlevel));
//             lowestlevel++;
//         }
//         return ans;
//     }




// class Stud{
//     int roll;
//     String name;

//     Stud(int roll,String name){
//         this.roll = roll;
//         this.name = name;
//     }
// }
// public class twenty_eight {
    
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         TreeMap<Integer,String> StudentMap = new TreeMap<>();
//         int n= sc.nextInt();
//         while(n>0){
//             int roll = sc.nextInt();
//             String name = sc.next();

//             Stud student = new Stud(roll,name);
//             StudentMap.put(roll, name);
//             System.out.println(StudentMap);
//             n--;
//         }
//     }
// }

// class Stud{
//     int roll;
//     String name;
//     int marks;

//     Stud(int roll,String name,int marks){
//         this.roll = roll;
//         this.name = name;
//         this.marks = marks;
//     }

//     public String toString(){
//         return roll +" " + name + " " + marks;
//     }
// }
// public class twenty_eight {
    
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         TreeMap<Integer,Stud> StudentMap = new TreeMap<>((p1,p2) ->{
//             if(p1 > p2)   {
//                 return -1;
//             }
//             if(p1 < p2)   {
//                 return 1;
//             }
//             return 0;
//         });
//         int n= sc.nextInt();
//         while(n>0){
//             int roll = sc.nextInt();
//             String name = sc.next();
//             int marks = sc.nextInt();
//             Stud student = new Stud(roll,name,marks);
//             StudentMap.put(roll, student);
//             System.out.println(StudentMap);
//             n--;
//         }
//     }
// }



class Stud implements Comparable<Stud>{
    int roll;
    String name;
    int marks;

    Stud(int roll,String name,int marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public String toString(){
        return roll +" " + name + " " + marks;
    }

    public int compareTo(Stud that){
        return -Integer.compare(this.roll, that.roll);
    }
}
public class twenty_eight {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        TreeSet<Stud> StudentMap = new TreeSet<>();
        int n= sc.nextInt();
        while(n>0){
            int roll = sc.nextInt();
            String name = sc.next();
            int marks = sc.nextInt();
            Stud student = new Stud(roll,name,marks);
            StudentMap.add(student);
            System.out.println(StudentMap);
            n--;
        }
    }
}