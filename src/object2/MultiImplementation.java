package object2;

//�ڲ�����ʵ�ֶ��ؼ̳�
public class MultiImplementation {

}

class D {
}

abstract class F {
}

class Z extends F {
    D makeD() {        //������Ǽ̳�D�϶����һ������
        return new D();  //�������࣬��������ת��
    }

    ;
}