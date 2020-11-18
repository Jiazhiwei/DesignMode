package builderpattern;/**
* ClassName: Burger <br/>
* Description: <br/>
* date: 2020/11/18 23:05<br/>
* @author 12079<br/>
* @version
* @since JDK 1.8
*//**
 *
 * @author jzw
 * @date 2020-11-18 23:05
 * @since cloud2.0
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();


}

