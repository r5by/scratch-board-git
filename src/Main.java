public class Main {

    //Version -1
    public static void main(String[] args) {
        System.out.println("Hello Git!");
    }

    private void foo() {
        int i = 0;
        int j = 1;

        System.out.println(i+j);
        //End V-1

        //hotfix for cherry pick
        DummyClass.sayHi("Rocky");
        //End V-2
    }
}
