/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kmeans.pro;

import java.util.Scanner;
import kmeans.pro.model.KMeansModel;

/**
 *
 * @author Sonic Adv
 */
public class KMeansPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of K");
        int k = input.nextInt();
        System.out.println("Enter no of data items");
        int noOfItems = input.nextInt();
        new KMeansModel(k, noOfItems);
    }
    
}
