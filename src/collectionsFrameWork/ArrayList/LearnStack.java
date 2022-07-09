package collectionsFrameWork.ArrayList;
import java.util.Stack;
import java.util.List;

public class LearnStack {
    public static void main(String[] args) {

        Stack <String> st = new Stack <String> ();

        st.push("Dog");
        st.push("Cat");
        st.push("Horse");
        st.push("Lion");
        System.out.println(st);
        System.out.println(st.peek());

       // System.out.println(st.search(12));
        System.out.println(st.isEmpty());
    }
}
