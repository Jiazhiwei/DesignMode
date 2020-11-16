package decorator;
/**
 *
 * @author jzw
 * @date 2020-11-16 22:38
 * @since cloud2.0
 */
public abstract class ShapeDecorator implements Shape{

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
