public enum Test {
    A {
        @Override
        void test() {
            System.out.println("a");
        }
    },
    B{
        @Override
        void test() {
            System.out.println("b");
        }
    };

    abstract void test();
}
