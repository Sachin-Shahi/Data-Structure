package NestedClass;

/**
 * Created by DAGR8DON on 12/11/16.
 */
public class NestedClass {
     void Outermethod() {
       innerClassA inner= new innerClassA();
        inner.inner();
        innerClassB innerr= new innerClassB();
        innerr.innerMethodB();
        System.out.println("I'm in outer method");
    }

    private class innerClassA {
        private int a=10;
        void inner() {
            System.out.println("I'M innner method A and the value is "+a);
        }

    }

    private  class innerClassB {
        private int b=15;
        private void innerMethodB() {

            System.out.println("Im inner class B and the value is "+b);
        }
    }
}
class Main{
    public static void main(String[] args) {
       NestedClass nested=new NestedClass();
        nested.Outermethod();
        //NestedClass.Outermethod();
    }
}