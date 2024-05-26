package package1;

public class Car {

    private String model;
    private int year;
    private double price;
    private char type;

    public Car(){}

    public Car(String model, int year, double price) {
        this.model = model;
//        this.year = year;
        this.setYear(year);
        this.price = price;
    }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        private void setYear(int year) {
            if (year < 0){
                throw new RuntimeException("less than 0");
            }
            this.year = year;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
}
