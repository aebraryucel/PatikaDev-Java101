public class Employee {


    String name;
    double salary;
    int workHours;
    int hireYear;


    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    double tax(double salary){
        double tax;

        if(salary<1000){
            tax=0.0;
        }
        else{
         tax=salary*0.03;
        }
        return tax;
    }


    double bonus(double salary,int workHours){
        int extraHours=0;
        double bonus;

        if(workHours>40){
            extraHours=workHours-40;
        }
        bonus=extraHours*30;
        return bonus;
    }

    double raiseSalary(double salary,int hireYear){
        int currentYear=2021;
        int workYear=currentYear-hireYear;
        double raise;

        if(workYear<10){
            raise=salary*0.05;
        }
        else if(workYear<20){
            raise=salary*0.1;
        }
        else{
            raise=salary*0.15;
        }
        return raise;
    }

    public void toString(Employee e){
        System.out.println("Adı : "+e.name);
        System.out.println("Maaşı : "+e.salary);
        System.out.println("Çalışma Saati : "+e.workHours);
        System.out.println("Başlangıç Yılı : "+e.hireYear);
        System.out.println("Vergi : "+e.tax(e.salary));
        System.out.println("Bonus : "+e.bonus(e.salary,e.workHours));
        System.out.println("Maaş Artışı : "+e.raiseSalary(e.salary,e.hireYear));
        double salary2=e.salary+e.bonus(e.salary,e.workHours)-e.tax(e.salary);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+salary2);
        double totalSalary=e.salary+e.raiseSalary(e.salary,e.hireYear);
        System.out.println("Zamlı maaş : "+totalSalary);

    }

}
