package strings;

class Geek
{
    int num;
    String name;
    public int Geek(){
    	int i=2;
    	return i;
    }
    // this would be invoked while object
    // of that class created.
   /* Geek()
    {
        System.out.println("Constructor called");
    }*/
}
 
class GFG
{
    public static void main (String[] args)
    {
        // this would invoke default constructor.
        Geek geek1 = new Geek();
 
        // Default constructor provides the default
        // values to the object like 0, null
        System.out.println(geek1.name);
        System.out.println(geek1.num);
        System.out.println(geek1.Geek());
    }
 
}
