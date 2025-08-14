package level1;

public class Main {

    static class Dog {

        private int age;
        private String breed;
        private String color;

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Dog c=new Dog();
        d.setAge(5);
        d.setBreed("pitbull");
        c.setBreed("pitbull");
        
        System.out.println(d.getBreed().equals(c.getBreed()));
    }
}
