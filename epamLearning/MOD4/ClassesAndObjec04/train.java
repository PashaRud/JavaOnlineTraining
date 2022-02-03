
package by.epamLearning.MOD4.ClassesAndObjec04;

import java.util.Objects;



//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.


public class train {
    
       private String destanation;
   private int numberOfTrain;
   private int departureTimeH;
   private int departureTimeM;

    public train(String destanation, int numberOfTrain, int departureTimeH, int departureTimeM) {
        this.destanation = destanation;
        this.numberOfTrain = numberOfTrain;
        this.departureTimeH = departureTimeH;
        this.departureTimeM = departureTimeM;
    }

    public String getDestanation() {
        return destanation;
    }

    public void setDestanation(String destanation) {
        this.destanation = destanation;
    }

    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public void setNumberOfTrain(int numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    public int getDepartureTimeH() {
        return departureTimeH;
    }

    public void setDepartureTimeH(int departureTimeH) {
        this.departureTimeH = departureTimeH;
    }

    public int getDepartureTimeM() {
        return departureTimeM;
    }

    public void setDepartureTimeM(int departureTimeM) {
        this.departureTimeM = departureTimeM;
    }

    @Override
    public String toString() {
        return "Поезд - {" + "Пункт назначения = " + destanation + ", Номер поезда = " + numberOfTrain + ", Время отправления = " + departureTimeH + " ч" + departureTimeM + " мин." + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.destanation);
        hash = 53 * hash + this.numberOfTrain;
        hash = 53 * hash + this.departureTimeH;
        hash = 53 * hash + this.departureTimeM;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final train other = (train) obj;
        if (this.numberOfTrain != other.numberOfTrain) {
            return false;
        }
        if (this.departureTimeH != other.departureTimeH) {
            return false;
        }
        if (this.departureTimeM != other.departureTimeM) {
            return false;
        }
        if (!Objects.equals(this.destanation, other.destanation)) {
            return false;
        }
        return true;
    }

   
   


    
}
