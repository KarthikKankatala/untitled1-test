public class FormatExample{
   public static void main(String args[]){
       String name="pavan";
       String sf1=String.format("name is %s",name);
       String sf2=String.format("name is %f",32.33434);
       String sf3=String.format("name is %32.12f",32.33434);
       System.out.println(sf1);
       System.out.println(sf2);
       System.out.println(sf3);

   }
}
