import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class GeradoraDeFigurinhas {
    
    void cria() throws Exception {

        // leitura da imagem
        BufferedImage original = ImageIO.read(new File("entrada/filme.jpg"));
      
        // cria a nova imagem em memória com transparencia e com tamanho novo
        int largura = original.getWidth();
        int altura = original.getHeight();
        int novaAltura = altura + 60;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        // copiar a imagem original para a imagem nova (em memória)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(original, 0, 0, null);
        // escrever uma frase na nova imagem

        // escrever a nova imagem em um arquivo
        ImageIO.write(novaImagem, "png", new File("saida/figurinha.png"));
        
    }
    public static void main(String[] args) throws Exception {
        var geradora = new GeradoraDeFigurinhas();
        geradora.cria();
    }
}
