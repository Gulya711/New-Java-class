public class Main {
    public static void main(String[] args) {
        Employee employee1 =new Employee();
        employee1.person.name= "Juli";
        employee1.salary= 10000;

        Employee employee2 =new Employee();
        employee2.person.name="Juli";
        employee2.salary =170080;

        Salary salary= new Salary();
        Employee[] array ={employee1,employee2};

        System.out.println(salary.getSum(array));
        System.out.println(employee1.isSameName(employee2));
    }
}
