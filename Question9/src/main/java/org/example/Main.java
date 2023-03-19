package org.example;
/*
 PersonelIslem sınıfı tanımlayın. Bu sınıfa, Employee ve
Intern nesnelerinden oluşan bir Person dizisi alan
personelListele metodunu ekleyin.

 Bu metod dizideki elemanların özelliklerini sırayla
aşağıdaki gibi yazdırsın:
 Employeeler için; name, age, salary
 Internler için; name, age, school
 */

/*
UML Diagram
- private
+ public
# protected
~ package/default
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ali", 35, 10000);
        Intern intern = new Intern("Veli", 39, "YTÜ");

        Person[] person = {employee, intern};
        PersonelIslem personelIslem = new PersonelIslem();
        personelIslem.personelListeler(person);
    }
}