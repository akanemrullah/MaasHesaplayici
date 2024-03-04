public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    // Constructor metot
    Employee(String name, int salary, int workhours, int hireYear) {

        this.name = name;
        this.salary = salary;
        this.workHours = workhours;
        this.hireYear = hireYear;
    }

    // Vergi hesabini yaptigimiz metot, Hicbir girdi almadan dogrudan vergi tutarini geri donduruyor.
    double tax() {

        double tax = 0;
        double taxRate = 0.03;

        if (this.salary >= 1000) {
            tax = this.salary * taxRate;
        }

        return tax;
    }

    // Bonus maas hesabini yaptigimiz alan. Yine girdi almiyoruz.
    double bonus() {
        double bonus = 0;
        double bonusRate = 30;

        if (this.workHours > 40) {
            bonus = (this.workHours - 40) * bonusRate;
        }

        return bonus;
    }

    // Maas zammini hesapladigimiz metot.
    double raiseSalary() {
        int currentDate = 2021;
        int workingPeriod;
        double salaryIncrease;

        workingPeriod = currentDate - this.hireYear;

        if (workingPeriod > 19) {
            salaryIncrease = this.salary * 0.15;
        } else if (workingPeriod > 9) {
            salaryIncrease = this.salary * 0.10;
        } else {
            salaryIncrease = this.salary * 0.5;
        }

        return salaryIncrease;
    }

    // Ciktiyi aldigimiz metot.
    void toStringg() {

        System.out.print("\nAdi: " + this.name);
        System.out.print("\nMaasi: " + this.salary);
        System.out.print("\nCalisma Saati: " + this.workHours);
        System.out.print("\nBaslangic Yili: " + this.hireYear);
        System.out.print("\nVergi: " + tax());
        System.out.print("\nBonus: " + bonus());
        System.out.print("\nMaas Artisi: " + raiseSalary());
        System.out.print("\nVergi ve Bonuslar Ile Birlikte Maas: " + (this.salary + (bonus() - tax())));
        System.out.print("\nToplam Maas: " + ((this.salary + raiseSalary()) + (bonus() - tax())));
    }

}
