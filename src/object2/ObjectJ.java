package object2;

//����һ�������ڲ�����࣬����һ�����������У���������ڲ����ʵ��
public class ObjectJ {
    public static void main(String[] args) {
        Outer outer = new Outer();
        object2.Outer.Inner inner = outer.getInner();//�����ڲ���ʵ��
    }
}

class Outer2 {
    //����һ���ڲ���
    class Inner {
        public void method() {
            System.out.println("Inner.method");
        }
    }

    //����������Դ���һ���ڲ���
    public Inner getInner() {
        return new Inner();
    }
}