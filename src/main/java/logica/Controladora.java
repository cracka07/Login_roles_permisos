package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis; 

    public  Controladora(){
        controlPersis=new ControladoraPersistencia();
    }
    
    public Usuario validarUsuario(String usuario, String password) {


        Usuario usr=null;
        List<Usuario> listaUser = controlPersis.traerUsuarios();
        for(Usuario user: listaUser ) {
            if (user.getNomUsuario().equals(usuario)) {
                if (user.getContrasenia().equals(password)) {
//                    mensaje = "Usuario y contraseña correctos. Bienvenido/a";
                      usr=user;
                      return usr;
//                    return mensaje;
                } else {
                    usr=null;
                    return usr;
//                    mensaje = "Contraseña Incorrecta";
//                    return mensaje;
                }
            } 
            else {

                  usr=null;
                   

            }
        }
        return usr;
    }

    public List<Usuario> traerUsuarios() {
        return controlPersis.traerUsuarios();
    }

    public List<Rol> traerRoles() {
        return controlPersis.traerRoles();
    }

    public void crearUsuario(String usuario, String pass, String rolRecibido) {
        Usuario usu=new Usuario();
        usu.setNomUsuario(usuario);
        usu.setContrasenia(pass);
        // al sr objeto me lo tengo quue traer creando un método
        Rol rolEncontrado=new Rol();
        rolEncontrado=this.traerRol(rolRecibido);
        if (rolEncontrado!=null){
            usu.setUnRol(rolEncontrado);
        }
        
         int id=this.buscarUltimoIdUsuario();
         //guardo en el proximo campo el id
         usu.setId(id+1);
        
        controlPersis.crearUsuario(usu);
    }

    private Rol traerRol(String rolRecibido) {
       List<Rol> listaRoles= controlPersis.traerRoles();
       
       for(Rol roles:listaRoles){
           if(roles.getNombreRol().equals(rolRecibido)){
               return roles;
           }
          
       }
        return null;
    }

    private int buscarUltimoIdUsuario() {
        List<Usuario> listaUsuario=this.traerUsuarios();
        //Me traigo el último usuario
        Usuario usu=listaUsuario.get(listaUsuario.size()-1);
        return usu.getId();
    }

    public void borrarUsuario(int id_usuario) {
        controlPersis.borrarUsuario(id_usuario);
        
    }

    public Usuario traerUsuario(int id_usuario) {
        return controlPersis.traerUsuarios(id_usuario);
    }

    public void editarUsuario(Usuario user, String usuario, String pass, String rolRecibido) {
           
        user.setNomUsuario(usuario);
        user.setContrasenia(pass);
         Rol rolEncontrado=new Rol();
        rolEncontrado=this.traerRol(rolRecibido);
        if (rolEncontrado!=null){
            user.setUnRol(rolEncontrado);
        }
        controlPersis.editarUsuario(user);
        
    }

   
}
