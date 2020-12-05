package dao;

public class Hello {
  private static Hello hello = new Hello();
  private Hello(){};
  public static Hello getHello(){
      return hello;
  }

}
