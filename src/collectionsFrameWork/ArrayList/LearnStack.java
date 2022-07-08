package collectionsFrameWork.ArrayList;
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {

        Stack <Integer> st = new Stack <Integer> ();

        st.push(12);
        st.push(34);
        st.push(543);
        st.push(765);
        System.out.println(st.peek());

        System.out.println(st.search(12));
        System.out.println(st.isEmpty());
    }
}
