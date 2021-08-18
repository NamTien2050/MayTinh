package repository;

import model.MayTinh;

import java.util.ArrayList;

public interface IntefaceMayTinhRepo {
    ArrayList<MayTinh> showAll();

    MayTinh save(MayTinh mayTinh);

    void edit(MayTinh mayTinh);

    void delete(MayTinh mayTinh);
}
