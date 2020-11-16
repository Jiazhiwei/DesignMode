package decorator;
/**
 * 创建扩展了 ShapeDecorator 类的实体装饰类。
 * @author jzw
 * @date 2020-11-16 22:41
 * @since cloud2.0
 */
public class RedShapeDecorator extends ShapeDecorator{



    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
}
