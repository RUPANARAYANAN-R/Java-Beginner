class inherit {
    int parents = 2;
    int siblings = 3;

    public  void countparents() {
        System.out.println("Parents: " + parents);
    }
    public void countsiblings() {
        System.out.println("Siblings: " + siblings);
    }
}
public class child extends inherit {
        public static void main(String[] args) {
            child myObj = new child();
            myObj.countparents();
            myObj.countsiblings();
        }
    }