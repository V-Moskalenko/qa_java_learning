/**
 * Класс предупреждения о штрафах
 */
public class SpeedingTicket {
    /**
     * Процедура определения превышения скорости
     * @param speedLimit - порог допустимой скорости
     * @param currentSpeed - текущая скорость
     * @return - предупреждение о штрафе
     */
    public String printSpeedingTicket(int speedLimit, int currentSpeed) {
        int overspeed = currentSpeed - speedLimit;
        if (overspeed >= 20 && overspeed < 40){
            return "Может прийти штраф: 500 рублей!";
        } else if (overspeed >= 40 && overspeed < 60){
            return "Может прийти штраф: 1000 рублей!";
        } else if (overspeed >= 60 && overspeed < 80){
            return "Может прийти штраф: 2500 рублей!";
        } else if (overspeed >= 80){
            return "Может прийти штраф: 5000 рублей!";
        }
        return null;
    }
}
