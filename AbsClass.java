abstract class Abs {
    public abstract void voiceCall();
    public abstract void videoCall();
    final public void add()
    {
        System.out.println("Haiii haiii haiii");
    }
    
}
class Check extends Abs
{
    @Override
    public void voiceCall(){
        System.out.println("Haiii");
    }
    @Override
    public  void videoCall(){
        System.out.println("Byeee");
    }

}
class AbsClass
{
    public static void main(String[] args) {
       Abs ref=new Check();
       ref.add();
    }
}

