public class student implements kek {



    @Override
    public void topla(int a,int b) {
        int sonuc=a+b;
        System.out.println(sonuc);
    }

    @Override
    public void çıkar(int a,int b) {
        System.out.println(a-b);
    }

    @Override
    public void çarp(int a,int b) {
        System.out.println(a*b);
    }

    @Override
    public void böl(int a,int b) {
        System.out.println(a/b);
    }
}
