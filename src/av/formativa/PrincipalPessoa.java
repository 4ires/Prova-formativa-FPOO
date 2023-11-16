package av.formativa;

public class PrincipalPessoa {

	public static void main(String[] args) {

		Fisica pessoaf = new Fisica("Otavio", "46302556805", "3265876982");
		System.out.println("Nome: " + pessoaf.getNome());
		System.out.println("Matrícula: " + pessoaf.getCpf());
		System.out.println("Salário: " + pessoaf.getRg());
	}
}
