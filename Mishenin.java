// реализация интерфейса в proginter
class mishenin implements proginter {
	// объявляем переменные
        String firstName;
	String lastName;
        // объявляем констурктор  объекта класса Mishenin
        Mishenin() {
                firstName = "Мишенин" ;
        	lastName = "Владимир";
	}

        // реализация метода интерфейса  getString - получения следующего значения в последовательности
        public String getString(String s) {
                return firstName +  " " +  lastName;
        }
}
class Vladimir {
        public static void main(String[] args) {
                Mishenin vladimir = new Mishenin();
                proginter s;
                s = vladimir;
                System.out.println("Вывод фамилии и им+ени \"через 2\"");

                for (int l = 0; l < 5; l++)
                        System.out.print(s.getString("Какой-то параметр ") + " ");
                System.out.println();

        }
}
