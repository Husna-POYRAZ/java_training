package org.example;
/*
 9. sorudaki sınıfları bu soruda da kullanılmaktadır

 PersonelIslem sınıfına Employee ve Intern nesnelerinden oluşan
bir Person dizisi alan personelDagilim metodu ekleyin.

 Bu metod, dizideki elemanların age özelliğine bakarak, yaş
aralıklarına göre personellerin yüzdesini ekrana yazdırsın:

 0 – 20 arası : %x // (personellerin yüzde kaçı 0-20 yaş aralığında)
 20 – 40 arası : %y
 40 ve üzeri : %z
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ali", 35, 10000);
        Employee employee2 = new Employee("Ahmet", 25, 15000);
        Employee employee3 = new Employee("Mehmet", 49, 20000);
        Intern intern = new Intern("Veli", 19, "YTÜ");
        Intern intern1 = new Intern("Ayşe", 18, "KTÜ");

        Person[] person = {employee, employee2, employee3, intern, intern1};
        PersonelIslem personelIslem = new PersonelIslem();
        //personelIslem.personelListeler(person);
        personelIslem.personelDagilim(person);
    }
}