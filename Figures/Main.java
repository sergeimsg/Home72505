package Figures;

public class Main {
    public static void main(String[] args) {

        //�����������
        Triangle triangle = new Triangle(3, 4);
        int areaTriangle = triangle.aSide*triangle.bSide/2;
        int c = triangle.aSide*triangle.aSide + triangle.bSide*triangle.bSide;
        double perimetr = Math.sqrt(c)+triangle.aSide+triangle.bSide;
        System.out.println("������� ������������ =  " + areaTriangle);
        System.out.println("�������� ������������ = " + perimetr);

        // �������������
        Rectangle rectangle = new Rectangle(5, 10);
        int areaRectangle = rectangle.with*rectangle.height;
        int perimetrR = (rectangle.height+rectangle.with)*2;
        System.out.println("������� �������������� = " + areaRectangle);
        System.out.println("�������� �������������� = " + perimetrR);
        //����

        Cycle cycle = new Cycle(10);
        double areaCycle = Math.PI*cycle.diam* cycle.diam/4;
        double perimetrCycle = Math.PI*cycle.diam;
        System.out.println("������� ����� = " + areaCycle);
        System.out.println("�������� ����� = " + perimetrCycle);

        double[] arrayS = new double[3];
        arrayS[0] = perimetr;
        arrayS[1] = perimetrCycle;
        arrayS[2] = perimetrR;
        double perimetrSum = arrayS[0]+arrayS[1]+arrayS[2];
        System.out.println("����� ���������� =  " + perimetrSum);

    }
}
