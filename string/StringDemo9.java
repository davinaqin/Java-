package edu.swun.string;

public class StringDemo9 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("fed");
        System.out.println(sb.append("---cba"));
        System.out.println(sb.delete(3,6));
    }
}
