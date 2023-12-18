public class Lor {
    private Sit  start_lor;
    public Sit this_lor;
    public Lor(){
        start_lor = new Sit(
                "первая сделка (Windows)",
                "Только вы начали работать и тут-же удача! Вы нашли клиента и продаете ему "
                        + "партию ПО МС Виндовс. Ему в принципе достаточно взять 100 коробок версии HOME.\n"
                        + "(1)у клиента денег много, а у меня нет - вы выпишете ему счет на 120 коробок ULTIMATE по 50тр\n"
                        + "(2)чуть дороже сделаем, кто там заметит - вы выпишете ему счет на 100 коробок PRO по 10тр\n"
                        + "(3)как надо так и сделаем - вы выпишете ему счет на 100 коробок HOME по 5тр ",
                3, 0, 0, 0);
        //0
        start_lor.direction[0] = new Sit(
                "Выбор",
                "Неудачное начало, ну чтож, сегодня в конторе копроратив!\n "
                        + "(1)Познакомлюсь с коллегами, людей так сказать посмотрю, себя покажу\n"
                        + "(2) Останусь в офисе и потренеруюсь чтобы в слепдующий раз сделать все лучше ",
                            2, 0, -10, -10);
        start_lor.direction[0].direction[0] = new Sit(
                "вечеринка",
                "Вы познокомились с колегами и вы им очень понравились нор боссу не понравилось то что вы веселитесь после плдохо отработанного дня\n"
                 + " Так как директору это не понравилось он вас штрафанул на 10 тр",
                0 , 0,-10,0);
        start_lor.direction[0].direction[1] = new Sit(
                "усердная работа",
                "директор увидел что все веселятся , а вы работаете и вы возрасли в его глазах",
                + 0 , 1 , 0 , 0);

        //1
        start_lor.direction[1] = new Sit(
                "совещание, босс доволен",
                "Сегодня будет совещание, меня неожиданно вызвали\n"
                        + "На совещании директор задет вопрос \n"+
                        "Что ты выбирешь\n "
                        +"(1) корпус где больше платят но меньше карерного роста\n" +
                        "(2) корпус где меньше платят но больше карьерного роста" ,
                2, 1, 100, 0);
        start_lor.direction[1].direction[0] = new Sit(
                "ваш выбор деньги",
                "За хорошую работу директор превел вас в тот корпус куда вы и хотели ",
                0 , 1 , 150 , 0);
        start_lor.direction[1].direction[1] = new Sit(
                "ваш выбор карьера",
                "За хорошую работу директор превел вас в тот корпус куда вы и хотели ",
                0 , 3 , 20 , 0);


        start_lor.direction[2] = new Sit(
                "мой первый лояльный клиент",
                "Мой первый клиент доволен скоростью и качеством "
                        + "моей работы. Сейчас мне звонил лично \nдиреткор компании и сообщил что вот вот состоится еще более крупная сделка\n"
                        + " и он хотел чтобы по ней работал именно я!\n" +
                        "Влияьтельный клиент захотел 100 коробок версии Ultimate но у вас их осталось всего 80 \n" +
                        "(1) Задержать время ввыполнения заказа и отправить 100 коробок\n" +
                        "(2) Купить у другой компании 20 коробки и продать все 100 в срок (покупаете за свой счет)\n"+
                        "(3) Обмануть клиента и выслать 80 коробок Ultimate и 20 коробки PRO",
                         3 , 0 , 50 , 1);
        start_lor.direction[2].direction[0] = new Sit(
                "Задержка",
                "Клиент не доволен ,но вы единственная фирма которая взелась за этот заказ поэтому это сгладило ситуацию",
                0 , 1 , 70 , 0);
        start_lor.direction[2].direction[1] = new Sit(
                "В срок",
                "Клиент остался довольным директор компании увидел что вы справились с этой задачей и повысил вас(хорошим бонусом оказалось то что ваша новая зарплата покрыла ваши рассходы)",
                0 , 3 ,0 , 1);
        start_lor.direction[2].direction[2] = new Sit(
                "Обман",
                "Клиент оказался не довольным и написал плохой отзыв а так как он влиятельный то вашу компанию настиг криизис\n" +
                 "Диретор был в ярости и уволил вас",
                0 , -1000 ,0 , -1000);

        this_lor = start_lor;
    }
    public void go(int num){
        if (num <= this_lor.direction.length){
            this_lor = this_lor.direction[num - 1];
        }else {
            System.out.println("Вы можете выбрать из "
                    + this_lor.direction.length + " вариантов");
        }
    }
    public boolean isEnd() {
        return this_lor.direction.length == 0;
    }
}
