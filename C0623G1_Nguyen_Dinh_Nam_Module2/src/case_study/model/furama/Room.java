package case_study.model.furama;

import java.util.Objects;

public class Room extends Furama {
    private String freeService;

    public Room() {
    }

    public Room(String id, String serviceName, double area, int costs, int maxPerson, String type, String freeService) {
        super(id, serviceName, area, costs, maxPerson, type);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(room.getId(), super.getId());
    }
}
