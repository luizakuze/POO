package engtelecom.poo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStream;
import java.awt.event.KeyListener;

import java.net.URL;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * Trata-se de um exemplo simples e não representa uma boa prática de
 * programação, pois a classe está com muita responsabilidade. O ideal
 * seria separar a lógica do jogo da parte gráfica e criar uma classe
 * para cada componente, elemento do jogo.
 * 
 * Tem-se ainda alguns problemas de desempenho, pois o arquivo de áudio é
 * carregado a cada colisão com o bloco de ferro. O ideal seria carregar
 * o arquivo de áudio uma única vez. O mesmo acontece com a fonte.
 * O ideal seria carregar a fonte uma única vez.
 */
public class App {

    public static void main(String[] args) {

        ParanoidOO jogo = new ParanoidOO();

        jogo.iniciar();
    }
}