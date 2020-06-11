package DAO;

import Entity.Plant;

import java.util.List;

public interface PlantDAO {
    void addPlant(Plant plant);
    List<Plant>getAll ();
    void update(Plant plant);
    void remove(Plant plant);
    Plant getByID(long id);
}
