public class OOPS {

    public static class Employee{
        public String name;
        public int age;
        public int Serialno;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getSerialno() {
            return Serialno;
        }

        public void setSerialno(int serialno) {
            Serialno = serialno;
        }
    }
    public static void main(String[] args) {

        Employee myEmployee= new Employee();

        myEmployee.setName("Sifat");
        myEmployee.setAge(15);
        myEmployee.setSerialno(3);

        System.out.println(myEmployee.getName());
        System.out.println(myEmployee.getAge());
        System.out.println(myEmployee.getSerialno());
    }
}
