class Product {
    private final int requiredA, requiredB, optionalC, optionalD;

    private Product(Builder builder) {
        this.requiredA = builder.requiredA;
        this.requiredB = builder.requiredB;
        this.optionalC = builder.optionalC;
        this.optionalD = builder.optionalD;
    }

    public static class Builder {
        private final int requiredA;
        private final int requiredB;
        private int optionalC = 0;
        private int optionalD = 0;

        public Builder(int requiredA, int requiredB) {
            this.requiredA = requiredA;
            this.requiredB = requiredB;
        }

        public Builder setC(int val) {
            this.optionalC = val;
            return this;
        }

        public Builder setD(int val) {
            this.optionalD = val;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Product sample= new Product.Builder(20,30)
                .setC(40)
                .setD(50)
                .build();
    }
}