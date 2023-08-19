

class VotePole
{
    void ageLimit (int age) throws Exception
    {
        if (age <18)
        System.out.println(" not valid ");
        else
        System.out.println("valid ");

    }
}


public class Excep_Throw {
    public static void main(String[] args) throws Exception
    {
      VotePole obj =new VotePole();
      obj.ageLimit(13);
        System.out.println( "Exception handled ");
    //    obj.ageLimit( 13);
    //    System.out.println(" Exception is handled ");
    }
    {

    }

}
