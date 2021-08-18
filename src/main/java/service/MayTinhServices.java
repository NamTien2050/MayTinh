package service;

import model.MayTinh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import repository.IntefaceMayTinhRepo;

import java.util.ArrayList;

@Service
public class MayTinhServices implements InterfaceMayTinhServices {
    @Autowired
    IntefaceMayTinhRepo intefaceMayTinhRepo;

    @Override
    public ArrayList<MayTinh> showAll() {
        return intefaceMayTinhRepo.showAll();
    }

    @Override
    public MayTinh save(MayTinh mayTinh) {
        return intefaceMayTinhRepo.save(mayTinh);
    }

    @Override
    public void edit(MayTinh mayTinh) {
        intefaceMayTinhRepo.edit(mayTinh);
    }

    @Override
    public void delete(MayTinh mayTinh) {
        intefaceMayTinhRepo.delete(mayTinh);
    }
}
