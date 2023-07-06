/* interface static methods */
interface A 
{
    public static void show()
    {
        System.out.println("can't Override interface static methods");
    }
}
class test
{
    public static void main(String[] args) {
        A.show();
    }
}
