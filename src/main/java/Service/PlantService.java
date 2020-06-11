package Service;

import DAO.PlantDAO;
import Entity.Plant;
import Util.SessionUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class PlantService extends SessionUtil implements PlantDAO {
    @Override
    public void addPlant(Plant plant) {
        openTransactionSession();
        Session session=getSession();
        session.save(plant);
        closeTransactionSession();
    }

    @Override
    public List<Plant> getAll() {
        openTransactionSession();
        Session session=getSession();
        Criteria criteria=session.createCriteria(Plant.class);
        List<Plant> plants=criteria.list();
        closeTransactionSession();
        return plants;
    }

    @Override
    public Plant getByID(long id) {
        openTransactionSession();
        Session session=getSession();
        Criteria criteria=session.createCriteria(Plant.class);
        criteria.add(Restrictions.eq("id",id));
        Plant plant=(Plant)criteria.uniqueResult();
        return plant;
    }

    @Override
    public void update(Plant plant) {
        openTransactionSession();
        Session session=getSession();
        session.update(plant);
        session.persist(plant);
        closeTransactionSession();
    }

    @Override
    public void remove(Plant plant) {
        openTransactionSession();
        Session session=getSession();
        session.remove(plant);
        closeTransactionSession();
    }
}
