package NavegadorInternet;

public class NavegadorInternet implements ExibirPagina, AtualizarPagina, AdicionarNovaAba {

    public void exibirPagina () {
        System.out.println("Exibindo uma página na internet.");
    }

    public void adicionarNovaAba () {
        System.out.println("Adicionando uma nova pagina na aba de internet");
    }

    public void atualizarPagina () {
        System.out.println("Atualizando a pagina");
    }

}
