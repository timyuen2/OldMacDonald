class Chick implements Animal {     
     private String myType;     
     private String mySound1;
     private String mySound2;      
     public Chick(String type, String sound1, String sound2)  
     {         
         this.myType = type;         
         this.mySound1 = sound1;
         this.mySound2 =sound2;     
     }     
     public String getSound()
     {
     		return Math.random()>.5 ? this.mySound1 : this.mySound2;   
     }
     public String getType(){return myType;} 
}