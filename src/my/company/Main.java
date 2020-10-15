package my.company;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("Ivanov", "Ivan", "Ivanovich", "Manager", "123@mail.ru", "+79091234552",30000, 25);
        persons[1] = new Person("Natarova", "IAroslava", "Nikolaevna", "Seller", "nin@mail.ru", "+79091234553",28000, 43);
        persons[2] = new Person("CHukreev", "Konstantin", "Proklovich", "Manager", "chp@mail.ru", "+79091238552",30000, 39);
        persons[3] = new Person("Anrep", "Prokofii", "Nikiforovich", "Director", "apn@mail.ru", "+79091734552",50000, 45);
        persons[4] = new Person("Limonova", "Inna", "Glebovna", "Deputy director", "lig@mail.ru", "+79099234552",40000, 41);

        for (Person perosn : persons){
            if (perosn.getAge() >= 40){
                perosn.infoAboutPerson();
            }
        }
    }
}
