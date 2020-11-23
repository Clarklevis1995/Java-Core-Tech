public class Test {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println("s.hashCode: "+ Integer.toBinaryString(s.hashCode()));
        System.out.println("s.hashCode >>> 16: "+Integer.toBinaryString(s.hashCode()>>>16));
        System.out.println("s.hashCode ^ s.hashCode >>> 16: "+Integer.toBinaryString(s.hashCode()^(s.hashCode()>>>16)));
    }
}
//101 1110 1001 0001 1000 1101 0010
//                    101 1110 1001
//101 1110 1001 0001 1101 0011 1011
//101 1110 1001 0001 1101 0011 1011
