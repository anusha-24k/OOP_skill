package week2;

public class StringBuffer6 {
	public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" Java");
        System.out.println("After append(): " + sb);

        sb.insert(6, "World ");
        System.out.println("After insert(): " + sb);

        sb.replace(6, 11, "Beautiful");
        System.out.println("After replace(): " + sb);

        sb.delete(6, 15);
        System.out.println("After delete(): " + sb);

        sb.reverse();
        System.out.println("After reverse(): " + sb);

        System.out.println("Current capacity: " + sb.capacity());

        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());
    }
}
    

    