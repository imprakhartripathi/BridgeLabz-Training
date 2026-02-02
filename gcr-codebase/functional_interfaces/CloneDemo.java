package functional_interfaces;

class Model implements Cloneable {
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneDemo {
    public static void main(String[] args) throws Exception {
        Model m1 = new Model();
        Model m2 = (Model) m1.clone();
        System.out.println("Cloned successfully");
    }
}
