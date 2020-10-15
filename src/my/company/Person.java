package my.company;

public class Person {
    private String secondName;
    private String firstName;
    private String middleName;
    private String positionAtWork;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Person(String secondName, String firstName, String middleName, String positionAtWork, String email, String phoneNumber, int salary, int age) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.positionAtWork = positionAtWork;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void infoAboutPerson(){
        System.out.println("Данные сотрудника:\nФИО: " + secondName + " " + firstName + " " + middleName +
                "\nВозраст: " + age +
                "\nДолжность: " + positionAtWork +
                "\nКонтактная информация:\n\tE-mail: " + email + "\n\tМобильный телефон: " + phoneNumber +
                "\nЗаработная плата: " + salary);
        System.out.println("-------------------------------------------");
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPositionAtWork() {
        return positionAtWork;
    }

    public void setPositionAtWork(String positionAtWork) {
        this.positionAtWork = positionAtWork;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
