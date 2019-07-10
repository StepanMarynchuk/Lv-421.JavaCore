public class EmployeeList {
    public static void main(String[] args) {
        Employee [] e = new Employee[4];
        e[0] = new SalariedEmployee("Martin", 1020, 0001);
        e[1] = new ContractWorker("gin", 9978, 160, 12, 345);
        e[2]= new ContractWorker("Marta", 4564, 168, 10,343);
        e[3] =new SalariedEmployee("Janin", 4353, 3456);

        for (int i =0; i<e.length;i++){
            System.out.println(e[i].name + e[i].getSalary());
        }
        Employee temp;
        for (int i=0; i<e.length-1; i++){
            for(int j=i+1; j<e.length; j++){
                if(e[i].getSalary()<e[j].getSalary()){
                    temp = e[i];
                    e[i]=e[j];
                    e[j]=temp;
                }
                for (i=0;i<e.length;i++){
                    System.out.println(e[i]);
                }
            }
        }
    }
    }

