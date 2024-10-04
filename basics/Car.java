package Strog;

public class Car {
String name;
MusicPlayer m;
Car(String name,MusicPlayer m)
{
	this.name = name;
	this.m = m;
	}
   //int pcount=0;
  int count =0;
   
	void show(int count)
	{
		System.out.println(m.name + "count:"+count+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pcount=0;
		   int scount =0;
		MusicPlayer m = new MusicPlayer("Sony");
		MusicPlayer m3 = new MusicPlayer("Sony");
		MusicPlayer m4 = new MusicPlayer("Sony");
		MusicPlayer m1 = new MusicPlayer("philips");
		MusicPlayer m2 = new MusicPlayer("philips");

        Car c = new Car("kiaSeltos",m);
        Car c1 = new Car("kiaSeltos",m3);
        Car c2 = new Car("kiaSeltos",m2);
        Car c3 = new Car("kiaSeltos",m1);
        Car c4 = new Car("kiaSeltos",m4);
        
        Car car[] = new Car[5];
        car[0] = c;
        car[1] = c1;
        car[2] = c2;
        car[3] = c3;
        car[4] = c4;
        //c.show(car);
        
        for(int i =0; i<car.length;i++)
        {
        	if(car[i].m.name.equals("Sony"))
    		{
    			scount++;
    			
    		}
    		else {
    			pcount++;
    		
    		}
        	//car[i].show(scount,pcount);
    	}
        System.out.println(scount + " "+ pcount);
        
       // show(scount,pcount);
        
        for(int i =0; i<car.length;i++)
        {
        	if(car[i].m.name.equals("Sony"))
    		{
    			
        		car[i].show(scount);
        		break;
    		}
        	
    	}
        for(int i =0; i<car.length;i++)
        {
        	if(car[i].m.name.equals("philips"))
    		{
    			
        		car[i].show(pcount);
        		break;
    		}
        	
    	}
        
        
        
        
        }
        
		   
	}


