
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Rol;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    UsuarioJpaController userJpa=new UsuarioJpaController();
    RolJpaController rolJpa=new RolJpaController();
    public List<Usuario> traerUsuarios() {
        return userJpa.findUsuarioEntities();
        //SELECT * FROM USUARIO
    }

    public List<Rol> traerRoles() {
      return  rolJpa.findRolEntities();
    }

    public void crearUsuario(Usuario usu) {
        userJpa.create(usu);
    }

    public void borrarUsuario(int id_usuario) {
        try {
            userJpa.destroy(id_usuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuarios(int id_usuario) {
        return userJpa.findUsuario(id_usuario);
    }

    public void editarUsuario(Usuario user) {
        try {
            userJpa.edit(user);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
}
