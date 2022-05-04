public class Salary {
    int getSum(Employee[]employeesArray){
        int sum =0;
        for(int i=0; i< employeesArray.length;i++){
            sum+=employeesArray[i].salary;
        }
        return  sum;
    }


}
