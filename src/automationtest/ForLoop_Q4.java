package automationtest;
// 4/3
public class ForLoop_Q4 {
    public void printMyName(String name, int howManyTime) {
        for (int i = 1; i <= howManyTime; i++) {
            System.out.println("howManyTime = " + name);
        }
    }

    public static void main(String[] args) {
        ForLoop_Q4 obj1 = new ForLoop_Q4();
        obj1.printMyName("Nayan", 10);
    }
}
