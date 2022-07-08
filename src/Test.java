import org.omg.Messaging.SyncScopeHelper;

public class Test {
    public static void main(String[] args) {

        int i = 5;
        byte b = 5;
        short s = 5;
        float f = 5;
        double d = 5;
        Integer it = i;
        int i1 = it.intValue();

        Byte bt = b;
        byte b1 = bt.byteValue();

        Short st = s;
        short s1 = st.shortValue();

        Float ft = f;
        float f1 = ft.floatValue();

        Double dt = d;
        double d1 = dt.doubleValue();
        System.out.println(b1);
        System.out.println(i1);
        System.out.println(d1);
        System.out.println(d1);
    }
}

