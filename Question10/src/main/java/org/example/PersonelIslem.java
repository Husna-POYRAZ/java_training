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

    public void personelDagilim(Person[] person) {
        int kisiSayisi = person.length;
        int cocukSayisi = 0;
        int gencSayisi = 0;
        int yasliSayisi = 0;
        for (Person p : person) {
            if(p.getAge() > 0 && p.getAge() < 20)
                cocukSayisi ++;
            else if (p.getAge() > 20 && p.getAge() < 40) {
                gencSayisi ++;
            }
            else
                yasliSayisi ++;

        }
        int cocukYuzdesi = (100*cocukSayisi)/kisiSayisi;
        int gencYuzdesi = (100*gencSayisi)/kisiSayisi;
        int yasliYuzdesi = (100*yasliSayisi)/kisiSayisi;

        System.out.println("0 – 20 arası : %" + cocukYuzdesi + "\n20 – 40 arası : %" + gencYuzdesi + "\n40 ve üzeri : %" + yasliYuzdesi);
    }


}
