// public class hw{
//     public static void main(String[] args){
//         System.out.println("hello all");
//     }
// }


// import java.util.*;

// class hello{
//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         int a=sc.nextInt();
//         float f = sc.nextFloat();
//         String b = sc.next();
//         sc.nextLine();
//         String c = sc.nextLine();
//         System.out.println(a);
//         System.out.println(f);
//         System.out.println(b);
//         System.out.println(c);
//         int a = 10;
//         float b= 11.11f;
//         String d = "hello";
//         System.out.println("%d",a);
//         System.out.println("%f",b);
//         System.out.println("%s",d);

//     }
// }




//day17_J2.java
// import java.util.*;


// class hello{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         for(int i=1;i<=5;i++){
//             for(int j=i;j<=5;j++){
//                 System.out.println("*");
//             }                       
//         }
//     }
// }



// import java.util.*;
// class hello{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5-i;j++){
//                 System.out.println(" ");
//             }
//             for(int k=i;k<=1;k++){
//                 System.out.println("*");
//             }
//         }System.out.println(" ");
//     }
// }


//pyramid pattern
// import java.util.*;

//  class hello{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5-i;i++){
//                 System.out.println(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.println("*");
//             }
//         } System.out.println("");
//     }
//  }



//reverse pattern of pyramid
import java.util.*;

class hello{
    public static void main(String args[]){
        Scanner sc = new  Scanner(System.in);
        for(int i=5;i<=1;i--){
            for(int j=1;j<=5-i;j++){
                System.out.println(" ")
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.println("*");
            }
        }System.out.println("");
    }
}



//code for factors and also for perfect number
import java.util.*;
  
class hello{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int sum=0;
        for( int i=1;i<10;i++){
            if(10%i==0)
            {
                System.out.println(i);
                //sum+=i;
            }
            //if(sum==n){
            //System.out.println("perfect number");}
            //else{System.out.println("not a perfect number");}
        }
    }
}


//code for cross pattern
 import java.util.*;
 class hello{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=5;i++){
        for(int j=0;j<=5;j++){
            if(i==j||i+j==n-1){
            System.out.println("*");}
        }System.out.println(" ");
        }
    }
 }



 //code for number to print as individual(like given number is 157 and output as 7  5  1  step by step)
 import java.util.*;
  class hello{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int temp=0;
        while(n>0){
            temp=n%10;
            System.out.println(temp);
        }
        n=n/10;
    }
  }



  // as like above code but in same order(like 157 then. 1  5  7)
  import java.util.*;
  class hello{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int temp=0;
        int q=100;//for digits place (like 3 digits 100,4 digits 1000...so on ..)
        while(n>0){
            temp=n/q;
             System.out.println(q);
                          

        }
    }
  }



//code for palindrome (task)


//code for armstrong(task)
import java.util.*;
class hii{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        int c = 0;
        while(n>0){
            c++;
            n = n/10;
        }
        n=t;
        while(n>0){
            int r = n%10;
            sum = sum + (int) Math.pow(r,c);
            n = n /10;
        }
        System.out.println(sum);
    }
}



//without using math function  (armstrong number)..
import java.util.*;
class hii{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        int c = 0, sum = 0,p;
        c++;
        n = n/10;
    }
    n=t;
    whlie(n>0){
        int r =. n % 10;
        p=1;
        for (int i =1;i<=c;i++){
            p=p*r;
        }
        sum = sum + p;
        n = n/10;
    }
    System.out.println(sum);
}




//code for plus pattern (task)



//day18_J3.java

//code for array
import java.util.*;
class  hello{
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int arr[] = {1,2,3,5,4,6};
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }


        // int n = sc.nextInt();
        // int arr[]=. new int[n];
        // for (int i=0; i<n;i++){
        //     arr[i]= sc.nextInt();
        //     System.out.println(arr[i]);
        // }


        // int n = sc.nextInt();
        // int arr[]= new int[n];
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     arr[i]= sc.nextInt(); 
        //     sum = sum+arr[i];
        // }
        // for(int i=0;i<n;i++){
        //     System.out.println(sum-arr[i]);
        // }



        int n = sc.nextInt();//5
        int sum =0;
        int arr[]= new int[n];
        for(int i=0; i<n;i++){
            arr[i]= sc.nextInt();
            sum = sum +arr[i];
        }
        for(int i=0;i<n;i++){
            sum = sum - arr[i];
            System.out.println(sum);
        }



        int n =sc.nextInt();//5
        int arr[]= new int[n];
        int sum1=0, sum2=0;
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
            if(arr[i]%2==0){
                sum1=sum1+arr[i];
            }
            else{
                sum2= sum2+arr[i];
            }
        }System.out.println(sum1+""sum2);



         int n = sc. nextInt();//5
         int arr[] = new int[n];
         for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
         } 
         int index = sc.nextInt();
         int val = sc.nextInt();
         arr[index] = val;
         for(int i=0;i<n;i++){
            System.out.println(arr[i]);
         }



         int n = sc.nextInt();//5
         int arr[] = new int[n];
         for(int i =0;i<n;i++){
           arr[i]= sc.nextInt();
         }
         int max= arr[0];
         for (int i=0; i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
         }System.out.println(max);



         //array using another array to print reverse 
         int n = sc.nextInt();
         int arr1[] = new int[n];
         int arr2[] = new int[n];
         for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
         }
         for (int i=0; i<n ; i++){
            arr2[i]= sc.nextInt();
         }
         for(int i=0;i<n;i++){
            System.out.println(arr2[i]);
         }




//day19.j4.java

     // finding max number in an array
     int n = sc.nextInt();
     int arr1[] = new int[n];
     int arr2[] = new int[n+1];
     for (int i=0;i<n;i++){
        arr1[i]= sc.nextInt();//2 4 1 5
     }
    //  int max = arr[0];
    //  int smax = arr[0];
    int max= Integer.MIN_VALUE;
    int smax = Integer.MIN_VALUE;
     for(int i =0; i<n ; i++){
        if(arr1[i]>max){
            smax=max;
            max=arr1[i];
        }else if(arr1[i]>samx && arr1[i]!=max){
            smax=arr1[i];
        }
     }  System.out.println(max+" "+smax);


//string buffer and string builder......(topics)
StringBuffer s = new StringBuffer("Hindi");
s.append("language");
System.out.println(s);



StringBuffer s = new StringBuffer("hindi");
s.append(sc.nextLine());
System.out.println(s);



StringBuffer s = new StringBuffer("hello all ");
s.replace(0,05,"hi");
System.out.println(s);


StringBuffer s = new StringBuilder(str:"hiiiiiii");
System.out.println(s);


int a = 123;
String s = String.valueOf(a);
String s = Integer .toString(a);
float f= 1.2334511f;
String s =String.valueOf(f);
String s = Float.toString(f);
char ch[]={'a','b','c','d'};
String s = new String(ch);
String s = String.valuOf(ch);
System.out.println(s);


    }
}





