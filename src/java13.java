import java.util.*;  
public class java13{  
 public static void main(String args[])
 {  
   StringTokenizer st = new StringTokenizer("Java Programming is intresting"," ");//splits the string " "as parameter  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
   }  
}  
