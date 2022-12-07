abstract class Bank{  // Abstract class 
    abstract void roi();  // Abstract method
}
class Sbi extends Bank {
    void roi() {
        System.out.println("5%");
    }

    public static void main(String args[]) {
        Bank obj = new Sbi();
        obj.roi();
    }

    class Pnb extends Bank {
        void roi() {
            System.out.println("7%");
        }

        public void main(String args[]) {
            Bank obj = new Pnb();
            obj.roi();
        }
    }
}