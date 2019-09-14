  void setup(){
       size(800,800);
    }

    void draw(){
      int w=400; int h= 400;
    
      for (int i = 0; i<8; i++){
      if (i%2==0){fill(255,0,0);}
      else {fill(0,0,0);}
       ellipse(400,400,w,h);
        w+=-50;
        h+=-50;
      }
      
      
      
      
    }
