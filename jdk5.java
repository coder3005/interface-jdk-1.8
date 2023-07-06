/* interface static methods */
interface A 
{
    public static void show()
    {
        System.out.println("can't Override interface static methods");
    }
}
class demo implements A
{
    @Override /* ERROR WILL COME DUE TO THIS */
    public static void show()
    {
        System.out.println("Errors");
    }
}
class test
{
    public static void main(String[] args) {
        A.show();
        demo d=new demo();
        d.show();
    }
}
