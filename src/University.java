class University {
    String name;
    void batch () {
        System.out.println("Batch 22");
    }
}
class College extends University{
    int grade;

    @Override
    void batch() {
        System.out.println("Grade 13 Batch");
    }
}
class Test1{
    public static void main(String[] args) {
        University u = new College();
        u.name = "UOC";
        College c = (College) u;
        c.grade = 13;
        System.out.println(c.name);
        System.out.println(c.grade);
        c.batch();
    }
}


