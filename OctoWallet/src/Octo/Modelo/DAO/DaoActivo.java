package Octo.Modelo.DAO;

import Octo.Modelo.Entidad.Activo;

public interface DaoActivo extends Crud<Activo> {
    // acá podriamos darle más metodos para que daoimp de activo deba implementarlos
    int actualizar(double valor, long idUser, long idMoneda);
    Activo obtener(long idUser, long idMoneda);
}