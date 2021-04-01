public class Grades
{
  public static void main(String args[])
  {
    Grades g=new Grades();
    g.GradeAGirls();
  }
  void GradeAGirls()
  {
    int total=90,girls=45,boys=45,ga,ba=20;
    ga=(total/2)-ba;
    System.out.println("girls getting grade A" +ga);
  }
}
