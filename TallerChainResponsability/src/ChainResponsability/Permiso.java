/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainResponsability;

/**
 *
 * @author ASUS PC
 */
public class Permiso implements TipoPermiso {

    Coordinador coordinador = new Coordinador();
    Director director = new Director();
    Gerente gerente = new Gerente();
    Vicepresidente vicepresidente = new Vicepresidente();
    Presidente presidente = new Presidente();

    @Override
    public void permisoEspecial(int PermisoDias) {
        
        vicepresidente.solicitarPermiso(PermisoDias);
        presidente.solicitarPermiso(PermisoDias);
    }

    @Override
    public void permisoNormal(int PermisoDias) {
       
        gerente.solicitarPermiso(PermisoDias);
        coordinador.solicitarPermiso(PermisoDias);
        director.solicitarPermiso(PermisoDias);
        presidente.solicitarPermiso(PermisoDias);
    }
}

        
