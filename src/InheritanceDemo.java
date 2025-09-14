import java.util.ArrayList;

public class InheritanceDemo
{ public static void main(String[] args)
    {
        Worker workerI = new Worker("Olivia", "Scarlatella","000001","MS.",2008,13.5);
        Worker workerII= new Worker("John","Doe","000002","MR.",1967,23);
        Worker workerIII = new Worker("Jane","Doe","000003","MRS.",1986,26.5);



        SalaryWorker salaryWorkerI = new SalaryWorker("Oliver", "Scarlett","000001","MR.",2008,13.5,52000);
        SalaryWorker salaryWorkerII = new SalaryWorker("Johnathan", "Doe","000002","MR.",1967,23,62000);
        SalaryWorker salaryWorkerIII = new SalaryWorker("Janny", "Doe","000003","MRS.",1986,26.5,65400);

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(workerI);
        workers.add(workerII);
        workers.add(workerIII);

        workers.add(salaryWorkerI);
        workers.add(salaryWorkerII);
        workers.add(salaryWorkerIII);

        double[] hoursWorked = {40,50,30};
        for(int i=0; i<3; i++){
            System.out.printf("Week %d Pay$%n", i + 1);
            for(Worker worker : workers){
                worker.displayWeeklyPay(hoursWorked[i]);
            }
            System.out.println();
        }

    }
}