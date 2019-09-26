void setup(){
size (1200,600);
}
 int p1=300;
 int p2=900;
int speed1=1;
int speed2=1;
void draw(){
   if(p1>1050){speed1=-speed1;}
p1+=speed1;
if(p1<150){speed1=-speed1;}

if(p2>150){speed2=-speed2;}
p2+=speed2;
if(p2<1050){speed2=-speed2;}
  background(255,255,255);

  int s1=350;
      for (int i = 0; i<50; i++){
     noFill();
       ellipse(p1,300,s1,s1);
        s1+=-7;}
  
  int s2=350;
      for (int i = 0; i<50; i++){
     noFill();
       ellipse(p2,300,s2,s2);
        s2+=-7;
       }
 
  
  
  
  
  
  
  
  
  
  
  

      }
