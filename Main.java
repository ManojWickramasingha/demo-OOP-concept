public class Main {
    public static void main(String[] args) {
        // create new object phone class---

        // Phone p2 = new Phone("nokia", "105m");
        // p2.call();
        // System.out.println(p2.brand);
        // Samsung p3 = new Samsung("sansun", "A30", 005);
        // p3.call();
        // p3.camera();
        // System.out.println(p3.brand);

        Samsung s = new Samsung("samsung", "A6", 9);
        Nokia n = new Nokia("nokia", "105mm");
        s.user();
        n.user();

        Phone s1 = new Samsung("samsung", "6345m", 100);
        Phone n1 = new Nokia("nkkiya", "v345");
        Samsung s2 = new Samsung("sam", "mnw123", 23);
        s1.user();
        n1.user();
        // System.out.println(s1.version);//private varible can not use onther class
        // dear--
        // obove theroy incapsulation mchn-----
        System.out.println(s2.getVersion());
        s2.setVersion(10000);
        System.out.println(s2.getVersion());
    }
}
