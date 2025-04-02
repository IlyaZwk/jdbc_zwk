package entity;

public class AirplanePersonal {
    private Integer id;
    private Integer airplaneId;
    private Integer personalId;

    public Integer getAirplanePersonalId() {
        return id;
    }

    public void setAirplanePersonalId(Integer id) {
        this.id = id;
    }

    public Integer getAirplanePersonalPersonalId() {
        return personalId;
    }

    public void setAirplanePersonalPersonalId(Integer personalId) {
        this.personalId = personalId;
    }

    public Integer getAirplanePersonalAirplaneId() {
        return airplaneId;
    }

    public void setAirplanePersonalAirplaneId(Integer airplaneId) {
        this.airplaneId = airplaneId;
    }
}
