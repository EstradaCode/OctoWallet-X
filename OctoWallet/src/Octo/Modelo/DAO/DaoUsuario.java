package Octo.Modelo.DAO;

import Octo.Modelo.Entidad.User;

public interface DaoUsuario extends Crud<User>{
    public boolean verificarMail(String mail);
    
}
