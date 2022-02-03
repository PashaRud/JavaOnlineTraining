package by.epamLearning.MOD4.ClassesAndObjec04;

//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.
public class trainLogic {

    public static train TempFinishline;
    public static train TempDepartureTimeHour;
    public static train TempDepartureTimeMin;

    public static train[] sort(train[] Train) {

        for (int i = 0; i < Train.length; i++) {
            for (int j = i + 1; j < Train.length; j++) {
                if (Train[i].getDestanation().compareTo(Train[j].getDestanation()) > 0) {
                    TempFinishline = Train[i];
                    Train[i] = Train[j];
                    Train[j] = TempFinishline;
                }
                if (Train[i].getDestanation().compareTo(Train[j].getDestanation()) == 0) {
                    if (Train[i].getDepartureTimeH() > Train[j].getDepartureTimeH()) {
                        TempDepartureTimeHour = Train[i];
                        Train[i] = Train[j];
                        Train[j] = TempDepartureTimeHour;
                    } else if (Train[i].getDepartureTimeH() == Train[j].getDepartureTimeH()) {
                        if (Train[i].getDepartureTimeM() > Train[j].getDepartureTimeM()) {
                            TempDepartureTimeMin = Train[i];
                            Train[i] = Train[j];
                            Train[j] = TempDepartureTimeMin;
                        }
                    }
                }
            }
        }
        return Train;
    }
}
