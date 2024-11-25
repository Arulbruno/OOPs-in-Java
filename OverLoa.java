class OverLoa {
    void run() {
        System.out.println("running safely");
    }

    static class OLoa extends OverLoa {
        void Run() {
            System.out.println("running safely with 60km");
        }
    }

    public static void main(String[] ar) {
        OverLoa ov = new OLoa();
        OverLoa ov1=new OverLoa();
        // OLoa ol=new OLoa();
        // ol.run();
        ov.run();
        if (ov instanceof OLoa) {
            OLoa ol = (OLoa) ov;
            ol.Run();
            // ov.OLoa();
        }
    }
}
