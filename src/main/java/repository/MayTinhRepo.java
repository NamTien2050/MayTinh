package repository;

import model.MayTinh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;

@Repository
public class MayTinhRepo implements IntefaceMayTinhRepo {
    @Autowired
    EntityManager entityManager;

    @Override
    public ArrayList<MayTinh> showAll() {
        return null;
    }

    @Override
    public MayTinh save(MayTinh mayTinh) {
        entityManager.getTransaction().begin();
        entityManager.persist(mayTinh);
        entityManager.getTransaction().commit();
        return mayTinh;
    }

    @Override
    public void edit(MayTinh mayTinh) {
        entityManager.getTransaction().begin();
        entityManager.persist(mayTinh);
        entityManager.getTransaction().commit();
    }

    @Override
    public void delete(MayTinh mayTinh) {
        entityManager.getTransaction().begin();
        entityManager.persist(mayTinh);
        entityManager.getTransaction().commit();
    }
}
