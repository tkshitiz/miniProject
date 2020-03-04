/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

enum news{
    Kantipur(10.0),GorkhaPatra(9.5),Nagarik(11.5),AnnaPurna(8.5),NayaPatrika(5.0);
  
private double price;
news(double p)
{
price=p;
}
double getprice()
{
return price;
}
}
public class newspaper {
    public static void main(String[] args){
        System.out.println("kantipur costs"+news.Kantipur.getprice()+"rupees");
        news np[]=news.values();
        System.out.println("****888");
        System.out.println("here is th elistt of news");
        for(news:np){
            
        }
        
    }
}
