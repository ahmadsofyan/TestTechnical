/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technical.test;

/**
 *
 * @author User
 */
public class  technicalTest3 {
    public static void main(String[]args){
        int X[]={6,8,1,4,7,2}; 
        int nilaiTerbesar = X[0];
        
        for(int i=0;i<X.length;i++){
            if(nilaiTerbesar <X[i]){
                nilaiTerbesar = X[i];
            }
            
        }
        System.out.println("Output:"+nilaiTerbesar);
    }
}
