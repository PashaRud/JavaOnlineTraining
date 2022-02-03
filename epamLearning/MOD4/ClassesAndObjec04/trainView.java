
package by.epamLearning.MOD4.ClassesAndObjec04;

import by.epamLearning.MOD4.ClassesAndObjec04.depo;
import java.util.Scanner;

//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.



public class trainView {
    

    public static void infoAboutTrain(train[] Train){
        Scanner scanner = new Scanner(System.in);
        int command;
        int i;
        int numberOfTrain;
        String city;
        train tempTrain;
       
       
       while(true){
           System.out.println("Что вы хотите сделать? ");
            System.out.println("1 - Узнать всю информацию обо всех поездах");
            System.out.println("2 - Узнать номер поезда по его пункту назначения");
            System.out.println("3 - Узнать время прибытия поезда по его номеру");
            System.out.println("4 - Отсортировать поезда по номеру поезда?");
            System.out.println("0 - Выход");
          command = scanner.nextInt();
           
          
          
           if(command == 1){
               for(i = 0; i < Train.length; i++){
                   System.out.println(Train[i].toString());
               }
               break;
               
               
               
               
           } else if(command == 2) {            
               System.out.println("Введите пункт назначения -> " );
               String temp = scanner.nextLine();
               city = scanner.nextLine();
               System.out.println("Вы ввели - " + city);
               for(i = 0; i < Train.length; i++){
                   if(Train[i].getDestanation().equals(city)){
                       tempTrain = Train[i];
                       tempTrain.toString();
                       System.out.println("Номер поезда с заданным пунктом назначения - " + Train[i].getNumberOfTrain());
                   } 
               } 
               
               
               
                          
               
               
           } else if (command == 3){
               System.out.println("Введите номер поезда -> ");
               numberOfTrain = scanner.nextInt();
               System.out.println("Время прибытия -> " + Train[numberOfTrain].getDepartureTimeH() + " ч. " 
                       + Train[numberOfTrain].getDepartureTimeM() + " мин.");
               
               
               
               
               
               
               
               
               }  else if (command == 4){
                  trainLogic.sort(Train);
                  System.out.println("Поезда отсортированы по пункту назначения. Список отсортированных поездов: ");
                  for(i = 0; i < Train.length; i++){
                   System.out.println(Train[i].toString());
               }
                  
                  
                  
                  
                  
                  
                  
           } else if (command == 0){
           System.out.println("Выход");
                break;
           } else {
                   System.out.println("Извините, такой команды пока нет.");
               }
           
    }
    }
    
}
     
