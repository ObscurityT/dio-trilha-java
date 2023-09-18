package Iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    //Reprodutor Musical
    public void SelecionarMusica(String musicaSelecionada) {

        System.out.println("Musica selecionada: " + musicaSelecionada);   
     }

    public void Tocar(String musicaSelecionada) {
        System.out.println("Tocando " + musicaSelecionada);
        }

    public void Pausar(String musicaSelecionada) {
        System.out.println("Pausando " + musicaSelecionada);

    }

    //Aparelho Telefonico
    
    public void Ligar(String numero) {
        System.out.println("Discando " + numero);
    }

    public void Atender() {
        System.out.println("Atendendo");
    }

    public void IniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    //NavegadorInternet

    public void ExibirPágina() {
        System.out.println("Exibindo página");
    }

    public void AdicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void AtualizarPágina() {
        System.out.println("Atualizando página");
    }

    public static void main(String[] args) {
        
        Iphone iphone = new Iphone();

        String musicaSelecionada = "Dance Macabre";


        iphone.SelecionarMusica(musicaSelecionada);
        iphone.Tocar(musicaSelecionada);
        iphone.Pausar(musicaSelecionada);
       
        iphone.Ligar("1111111");
        iphone.Atender();
        iphone.IniciarCorreioVoz();

        iphone.ExibirPágina();
        iphone.AdicionarNovaAba();
        iphone.AtualizarPágina();
    }
    
}
