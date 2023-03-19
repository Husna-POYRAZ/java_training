package org.example;

import java.util.List;

public class PersonelIslem {
    public void personelListeler(Person[] person) {
        for (Person p : person) {
            if (p instanceof Employee)
                System.out.println("Personel adı : " + p.getName() + " yaşı : " + p.getAge() + " maaşı : " + ((Employee) p).getSalary());
            else
                System.out.println("Personel adı : " + p.getName() + " yaşı : " + p.getAge() + " okulu : " + ((Intern) p).getSchool() );

        }
    }


}
