package Strog;

class Counter{  
static int count=0;//will get memory each time when the instance is created  
  
Counter(){  
count++;//incrementing value  
System.out.println(count);  
}  
  
public static void main(String args[]){  
//Creating objects  
Counter c1=new Counter();  
Counter c2=new Counter();  
}}