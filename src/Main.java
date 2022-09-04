public class Main {
    public static void main(String[] args) {

        //Task 1

        String firstName = "иван ";
        String middleName = "семёнович";
        String lastName = "иванов ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        //Task 2

        fullName = lastName.substring(0,1).toUpperCase() + lastName.substring(1) +
                firstName.substring(0,1).toUpperCase() + firstName.substring(1) +
                middleName.substring(0,1).toUpperCase() + middleName.substring(1);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

        //Task 3

        if (fullName.contains("ё")) {
            fullName.replace('ё', 'е');
        }
        System.out.println("Данные ФИО сотрудника — " + fullName.replace('ё','е'));

        //Task 4   Знаю, что не правильно, не догадался как

        for (int i = 0; i < 1; i++) {
            System.out.println("Имя сотрудника — " + firstName);
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("Фамилия сотрудника — " + lastName);
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("Отчество сотрудника — " + middleName);
        }

        //Task 5

        char[] c = fullName.toCharArray();
        if (lastName != lastName.substring(0,1).toUpperCase() + lastName.substring(1) ||
                firstName != firstName.substring(0,1).toUpperCase() + firstName.substring(1) ||
        middleName != middleName.substring(0,1).toUpperCase() + middleName.substring(1)){
            fullName = lastName.substring(0,1).toUpperCase() + lastName.substring(1) +
                    firstName.substring(0,1).toUpperCase() + firstName.substring(1) +
                    middleName.substring(0,1).toUpperCase() + middleName.substring(1);
            System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв —" + fullName);
        }

        //Task 6 Доделаю чуть позже


    }
}