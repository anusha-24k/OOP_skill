package week6;

public class Student {
	int id;
    String name;
    int m1, m2, m3;

    public int findTotal() {
        return m1 + m2 + m3;
    }

    public double findAverage() {
        return findTotal() / 3.0;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Arun";
        s1.m1 = 85;
        s1.m2 = 90;
        s1.m3 = 80;

        Student s2 = new Student();
        s2.id = 102;
        s2.name = "Bobby";
        s2.m1 = 78;
        s2.m2 = 88;
        s2.m3 = 82;

        int total1 = s1.findTotal();
        double avg1 = s1.findAverage();
        System.out.println("ID: " + s1.id + " Name: " + s1.name);
        System.out.println("Total Marks: " + total1);
        System.out.println("Average Percentage: " + avg1);

        System.out.println();

        int total2 = s2.findTotal();
        double avg2 = s2.findAverage();
        System.out.println("ID: " + s2.id + " Name: " + s2.name);
        System.out.println("Total Marks: " + total2);
        System.out.println("Average Percentage: " + avg2);
    }
}
