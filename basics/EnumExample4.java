package Strog;

class EnumExample4{  
enum Season{   
WINTER, SPRING, SUMMER, FALL   
} 
/*int value;  
 Season(int value)
	 {  
	this.value=value;  
	} */ 

public static void main(String args[]){  
for (Season s : Season.values())  
System.out.println(s);  
  
}}  
// shape - circle,rect
//bank 