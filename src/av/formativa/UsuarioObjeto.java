package av.formativa;

public class UsuarioObjeto {
	public static void main(String[]args) {
	
	Usuario usuario1 = new Usuario();
	Usuario usuario2 = new Usuario(2, "Ritinha", 131006, "Admin", "maria123");
	
	System.out.println(usuario2.getId());
	System.out.println(usuario2.getNome());
	System.out.println(usuario2.getPassword());
	System.out.println(usuario2.getPermissao());
	System.out.println(usuario2.getUsuario());

 }
}