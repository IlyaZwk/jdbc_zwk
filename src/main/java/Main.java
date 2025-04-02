import dao.AirplaneDao;
import entity.Airplane;

public class Main {
    public static void main(String[] args) {
        AirplaneDao airplaneDao = new AirplaneDao();
        Airplane airplane = new Airplane();
        airplane.setAirplaneId(123);
        airplane.setId(123);
        airplane.setRouteId(123);
        airplaneDao.create(airplane);
    }

}
