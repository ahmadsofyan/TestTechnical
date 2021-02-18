/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technical.test;


public class TechnicalTest2  {

    static void technicalTest(int[]X){
    int n = X.length;
    
    for(int i=0;i<n-1;i++){
        for(int j=0;j<(n-i-1);j++){
            if(X[j]>X[j+1])
                {    
                int temp = X[j];
                X[j]=X[j+1];
                X[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
       int X[]={6,8,1,4,7,2};   
           System.out.println();
               technicalTest(X);
               
         System.out.println("OutPut");
           for(int i=0; i<X.length;i++){
               System.out.print(X[i]+"");
           }
           
    }
    
   
}
