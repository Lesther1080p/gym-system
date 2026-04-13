package services;

import models.Usuario;
import java.util.ArrayList;
import java.util.List;

public class GimnasioService {
    private List<Usuario> usuarios = new ArrayList<>();

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void listaUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados");
            return;
        }

        for (int i = 0; i < usuarios.size(); i++) {
            Usuario u = usuarios.get(i);
            System.out.println(i + ". Nombre: " + u.getNombre() +
                    " | Edad: " + u.getEdad() +
                    " | Peso: " + u.getPeso());
        }
    }

    public boolean eliminarUsuario(int index) {
        if (index >= 0 && index < usuarios.size()) {
            usuarios.remove(index);
            return true;
        } else {
            return false;
        }
    }

    public boolean hayUsuarios() {
        return !usuarios.isEmpty();
    }
}