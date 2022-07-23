import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class GeradoraDeFigurinhas {
    
    void cria(InputStream inputStream, String nomeArquivo) throws Exception {

        // leitura da imagem
        //InputStream fileInputStream = new FileInputStream(new File("entrada/filme.jpg"));
        //InputStream inputStream = new URL("https://image.tmdb.org/t/p/w500/ocUp7DJBIc8VJgLEw1prcyK1dYv.jpg").openStream();
        BufferedImage original = ImageIO.read(inputStream);
      
        // cria a nova imagem em memória com transparencia e com tamanho novo
        int largura = original.getWidth();
        int altura = original.getHeight();
        int novaAltura = altura + 60;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        // copiar a imagem original para a imagem nova (em memória)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(original, 0, 0, null);
        
        //esolher a fonte
        var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 48);
        graphics.setColor(Color.YELLOW);
        graphics.setFont(fonte);

        // escrever uma frase na nova imagem
        graphics.drawString("RUINZÃO", 50, novaAltura - 10);
        
        // escrever a nova imagem em um arquivo
        ImageIO.write(novaImagem, "png", new File("saida/" + nomeArquivo));
        
    }
    
}
