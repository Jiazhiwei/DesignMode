package iteratorpattern;
/**
 *
 * @author jzw
 * @date 2020-11-18 21:56
 * @since cloud2.0
 */
public class NameRepository implements Container{

    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }


    private class NameIterator implements Iterator {
        Integer index = 0;

        @Override
        public Boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
