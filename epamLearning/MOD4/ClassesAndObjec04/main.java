
package by.epamLearning.MOD4.ClassesAndObjec04;


//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.




public class main {
    public static void main(String[] args) {
        
        
        
        depo depo = new depo();
        train[] Train = depo.Depo();
        trainView.infoAboutTrain(Train);
    }
   
    
    
}
