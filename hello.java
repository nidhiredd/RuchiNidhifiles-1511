// class hello {
//     public static void main(String[] args) {
        // try{
        //     System.out.println("hello all");
        //     System.out.println("good morning");
        //     int a=10/0;
        //     String s=null;
        //     int len=s.length();
        //     System.out.println(len);
        //     String s1="123";
        //     int a=Integer.parseInt(s1);
        //     int arr[]=new int[5];
        //     System.out.println(arr[10]);
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        // try{
        //     System.out.println("good morning");
        //     int arr[]=new int[5];
        //     try{
        //         int a=10/0;
        //         System.out.println(a);
        //     }catch(Exception e){
        //         System.out.println(e);
        //     }
        // }finally{
        //         System.out.println("hiiiiiiii");
        //     }
        //     System.out.println("hello all");


//     }
// }

import java.util.Scanner;

class hello{
    public void valid(int a)throws Exception {
        if(a<17){
            throw new Exception("not eligible");
        } else {
            System.out.println("eligible");
        }
    }
    void show(int a){
        try{
            valid(a);
        } catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        hello h=new hello();
        int a=sc.nextInt();
        h.show(a);
    }
}
