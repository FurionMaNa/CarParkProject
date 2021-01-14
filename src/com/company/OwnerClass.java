package com.company;

import java.util.Random;

public class OwnerClass {

    private String [] arrSur = {"Иванов", "Петров", "Сидоров", "Гагарин", "Мухин", "Баранов", "Голиков", "Смирнов"};
    private String [] arrName = {"Иван", "Пётр", "Андрей", "Алексей", "Вячеслав", "Александр", "Сергей", "Иван"};
    private String [] arrPat = {"Иванович", "Петрович", "Андреевич", "Алексеевич", "Вячеславович", "Александрович", "Сергеевич", "Иванович"};

    private String surname = "Иванов";
    private String name = "Иван";
    private String patronymic = "Иванович";
    private Integer age = 28;

    public OwnerClass(){
        Random random = new Random();
        surname = arrSur[random.nextInt(8)];
        name = arrName[random.nextInt(8)];
        patronymic = arrPat[random.nextInt(8)];
        age = random.nextInt(50)+18;
    }

    public OwnerClass(String surname, String name, String patronymic, Integer age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
