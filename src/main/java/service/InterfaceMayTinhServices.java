package service;

import model.MayTinh;

import java.util.ArrayList;

public interface InterfaceMayTinhServices {
    ArrayList<MayTinh> showAll();

    MayTinh save(MayTinh mayTinh);

    void edit(MayTinh mayTinh);

    void delete(MayTinh mayTinh);
}
