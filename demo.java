class Demo{
  public static void m1 (){
   System.out.println("***********Inside super class Demo");
}
 
}

class Child  extends Demo{
 
 public  static void m1 (){
   System.out.println("***********Inside child class child");
  }

public static void main(String[] args){
  
  Demo d = new Child();
  //Child c = new Child();
  d.m1(); 
}

}
