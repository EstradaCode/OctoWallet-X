package Octo.Modelo.DAO;

import Octo.Modelo.Entidad.Persona;

import java.util.List;

public interface DaoPersona extends Crud<Persona>{
    // acá podriamos darle más metodos para que daoimp de persona deba implementarlos
    Persona obtener(long id);
}