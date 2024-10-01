public class Picnic implements Teacher, Student{
    @Override
    public void activities() {
        System.out.println("All teacher can singing song and play drama");
    }

    @Override
    public void sports() {
        System.out.println("All students can play football, cricket and rugby");
    }
}
