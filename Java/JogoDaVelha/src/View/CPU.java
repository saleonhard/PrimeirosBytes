package View;

import View.Tabuleiro;
import java.awt.Color;
import java.util.Scanner;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CPU {

    /**
     * @return the p
     */
    public static String getP() {
        return p;
    }

    /**
     * @param aP the p to set
     */
    public static void setP(String aP) {
        p = aP;
    }

    /**
     * @return the pJog
     */
    public static String getpJog() {
        return pJog;
    }

    /**
     * @param apJog the pJog to set
     */
    public static void setpJog(String apJog) {
        pJog = apJog;
    }

    /**
     * @return the jdas
     */
    public static int getJdas() {
        return jdas;
    }

    /**
     * @param aJdas the jdas to set
     */
    public static void setJdas(int aJdas) {
        jdas = aJdas;
    }

    /**
     * @return the vXO
     */
    public static String getvXO() {
        return vXO;
    }

    /**
     * @param avXO the vXO to set
     */
    public static void setvXO(String avXO) {
        vXO = avXO;
    }

    /**
     * @return the jXO
     */
    public static String getjXO() {
        return jXO;
    }

    /**
     * @param ajXO the jXO to set
     */
    public static void setjXO(String ajXO) {
        jXO = ajXO;
    }

    static Scanner ler = new Scanner(System.in);
    static String nome1, nome2, n_vez;
    static int continua = 2;

    static final String VAZIO = "*";

    static public String v[] = new String[9];
    static Random rand = new Random();
    static boolean armadilhaAtiva = false, jogada3Ativa = false, aMeioAtiva = false, aEntreAtiva = false;
    static int pxmaJogada1 = 0, pxmaJogada2 = 0, pxmaJogada3 = 0;

    static String pJog;
    static int jdas = 0, pa, pp1, pp2, pp3, pp4, fTipo;
    static String vXO;
    static String jXO;
    static String p = pJog;

    public static void falsoCLS() {
        int i;
        for (i = 0; i < 8; i++) {
            System.out.println();
        }

    }
    //zerar velha 

    public static void iniciarTabuleiro() {
        int i;
        for (i = 0; i < 9; i++) {
            v[i] = VAZIO;
        }
    }

    //mostra velha
    public static void mostraTabuleiro() {
        int i;
        System.out.println();
        for (i = 0; i < 9; i++) {
            System.out.printf("  %s", v[i]);
//System.out.printf("  %c",(v[i]==VAZIO)?(char)'i+1':;v[i]);
            if (i == 2 || i == 5) {
                System.out.println();
            }
        }
    }

    //funcoes para verif. Gahnador
    public static boolean verificaLCD(int a, int b, int c, String xo) {

        return ((xo.equals(v[c])) && (v[a].equals(v[b])) && (v[b].equals(v[c])));
    }
    // funcao q verif. Ganhador

    public static boolean ganhou(String xo) {
        //String mxo;
        //mxo = ("x".equals(da_vez)) ? "X" : "O";

        if (verificaLCD(0, 1, 2, xo)) {
            System.out.println(verificaLCD(0, 1, 2, xo));
            Tabuleiro.Botao1.setForeground(Color.green);
            Tabuleiro.Botao2.setForeground(Color.green);
            Tabuleiro.Botao3.setForeground(Color.green);
            return true;
        } else if (verificaLCD(3, 4, 5, xo)) {
            System.out.println(verificaLCD(3, 4, 5, xo));
            Tabuleiro.Botao4.setForeground(Color.green);
            Tabuleiro.Botao5.setForeground(Color.green);
            Tabuleiro.Botao6.setForeground(Color.green);
            return true;
        } else if (verificaLCD(6, 7, 8, xo)) {
            System.out.println(verificaLCD(6, 7, 8, xo));
            Tabuleiro.Botao7.setForeground(Color.green);
            Tabuleiro.Botao8.setForeground(Color.green);
            Tabuleiro.Botao9.setForeground(Color.green);
            return true;
        } else if (verificaLCD(0, 3, 6, xo)) {
            System.out.println(verificaLCD(6, 7, 8, xo));
            Tabuleiro.Botao1.setForeground(Color.green);
            Tabuleiro.Botao4.setForeground(Color.green);
            Tabuleiro.Botao7.setForeground(Color.green);
            return true;
        } else if (verificaLCD(1, 4, 7, xo)) {
            System.out.println(verificaLCD(1, 4, 7, xo));
            Tabuleiro.Botao2.setForeground(Color.green);
            Tabuleiro.Botao5.setForeground(Color.green);
            Tabuleiro.Botao8.setForeground(Color.green);
            return true;
        } else if (verificaLCD(2, 5, 8, xo)) {
            System.out.println(verificaLCD(2, 5, 8, xo));
            Tabuleiro.Botao3.setForeground(Color.green);
            Tabuleiro.Botao6.setForeground(Color.green);
            Tabuleiro.Botao9.setForeground(Color.green);
            return true;
        } else if (verificaLCD(0, 4, 8, xo)) {
            System.out.println(verificaLCD(0, 4, 8, xo));
            Tabuleiro.Botao1.setForeground(Color.green);
            Tabuleiro.Botao5.setForeground(Color.green);
            Tabuleiro.Botao9.setForeground(Color.green);
            return true;
        } else if (verificaLCD(2, 4, 6, xo)) {
            System.out.println(verificaLCD(2, 4, 6, xo));
            Tabuleiro.Botao3.setForeground(Color.green);
            Tabuleiro.Botao5.setForeground(Color.green);
            Tabuleiro.Botao7.setForeground(Color.green);
            return true;
        }
        return false;
    }

    //verifica ganhdor ou  se houve empate
    public static void empataGanha(String xo) {

        if (ganhou(xo)) {

            falsoCLS();
            mostraTabuleiro();
            JOptionPane.showMessageDialog(null, "****GANHOU****", "", 0);
            System.out.printf("\t\t\n****GANHOU****");
            setpJog(getjXO());
            //System.out.printf("\n%s(%s) ganhou essa partida. ", (da_vez.equals(XouO.vXO)) ? nome1 : nome2, da_vez);

        } else if (getJdas() == 9) {
            //falsoCLS();
            mostraTabuleiro();
            JOptionPane.showMessageDialog(null, "****EMPATE****", "Erro", JOptionPane.YES_OPTION);

            System.out.printf("\t\t\t\t\t****EMPATE****");

        }
    }

    // jogada da velha
    public static boolean pontas(int a, int b, int c, int d, int e, String xo) {
        return ((v[a].equals(xo) && v[b].equals(xo))
                || (v[4].equals(xo) && v[c].equals(xo)) || (v[d].equals(xo)) && v[e].equals(xo));
    }

    public static boolean entrePontas(int a, int b, int c, String xo) {
        return ((v[a].equals(xo) && v[b].equals(xo))
                || (v[4].equals(xo) && v[c].equals(xo)));
    }

    public static boolean centro(String xo) {
        return ((v[0].equals(xo) && v[8].equals(xo))
                || (v[2].equals(xo) && v[6].equals(xo))
                || (v[3].equals(xo) && v[5].equals(xo))
                || (v[1].equals(xo) && v[7].equals(xo)));
    }

    // funcao pra velha 
    public static boolean bloqueiaGanha(String xo) {

        if (entrePontas(0, 2, 7, xo) && (v[1].equals(VAZIO))) {
            v[1] = getvXO();
            return true;
        } else if (entrePontas(2, 8, 3, xo) && (v[5].equals(VAZIO))) {
            v[5] = getvXO();
            return true;
        } else if (entrePontas(6, 8, 1, xo) && (v[7].equals(VAZIO))) {
            v[7] = getvXO();
            return true;
        } else if (entrePontas(0, 6, 5, xo) && (v[3].equals(VAZIO))) {
            v[3] = getvXO();
            return true;
        } else if (pontas(1, 2, 8, 3, 6, xo) && (v[0].equals(VAZIO))) {
            v[0] = getvXO();
            return true;
        } else if (pontas(7, 8, 2, 3, 0, xo) && (v[6].equals(VAZIO))) {
            v[6] = getvXO();
            return true;
        } else if (pontas(0, 1, 6, 5, 8, xo) && (v[2].equals(VAZIO))) {
            v[2] = getvXO();
            return true;
        } else if (pontas(6, 7, 0, 5, 2, xo) && (v[8].equals(VAZIO))) {
            v[8] = getvXO();
            return true;
        } else if (centro(xo) && (v[4].equals(VAZIO))) {
            v[4] = getvXO();
            return true;
        } else {
            return false;
        }
    }

    public static void fatality(int id1, int id2, int a, int b, int c, int d) {

        int op = rand.nextInt(2);

        if (v[id1].equals(getjXO())) {
            v[(op == 1) ? a : b] = getvXO();
        } else if (v[id2].equals(getjXO())) {
            v[(op == 1) ? c : b] = getvXO();
        }
    }

    public static void fatalityMeio(int id1, int id2, int t) {

        int jgda = rand.nextInt(6);
        int op = rand.nextInt(2);
        int a = 0, b = 2, c = 6, d = 8;
        int e = 0, f = 0, g = 0, h = 0;

        if (t == 1) {
            e = 6;
            f = 8;
            g = 0;
            h = 2;

        } else {
            e = 2;
            f = 0;
            g = 8;
            h = 6;

        }

        switch (jgda) {
            case 0:
                v[a] = vXO;
                pxmaJogada1 = e;
                break;
            case 1:
                v[b] = vXO;
                pxmaJogada1 = f;
                break;
            case 2:
                v[c] = vXO;
                pxmaJogada1 = g;
                break;
            case 3:
                v[d] = vXO;
                pxmaJogada1 = h;
                break;
            case 4:
                v[id1] = vXO;
                pxmaJogada1 = (op == 1) ? a : e;
                break;
            case 5:
                v[id2] = vXO;
                pxmaJogada1 = (op == 1) ? h : d;
                break;
        }

    }

    public static void fatalityEntre() {

        if ((v[1].equals(getvXO()) || v[3].equals(getvXO())) && (v[1].equals(getjXO()) || v[3].equals(getjXO()))) {
            v[0] = vXO;
        } else if ((v[3].equals(getvXO()) || v[7].equals(getvXO())) && (v[3].equals(getjXO()) || v[7].equals(getjXO()))) {
            v[6] = vXO;
        } else if ((v[1].equals(getvXO()) || v[5].equals(getvXO())) && (v[1].equals(getjXO()) || v[5].equals(getjXO()))) {
            v[2] = vXO;
        } else if ((v[5].equals(getvXO()) || v[7].equals(getvXO())) && (v[5].equals(getjXO()) || v[7].equals(getjXO()))) {
            v[8] = vXO;
        } else if ((v[1].equals(getvXO()) || v[3].equals(getvXO())) && (v[6].equals(getjXO()) || v[2].equals(getjXO()))) {
            v[0] = vXO;
        } else if ((v[1].equals(getvXO()) || v[5].equals(getvXO())) && (v[8].equals(getjXO()) || v[0].equals(getjXO()))) {
            v[2] = vXO;
        } else if ((v[3].equals(getvXO()) || v[7].equals(getvXO())) && (v[8].equals(getjXO()) || v[0].equals(getjXO()))) {
            v[6] = vXO;
        } else if ((v[5].equals(getvXO()) || v[7].equals(getvXO())) && (v[6].equals(getjXO()) || v[2].equals(getjXO()))) {
            v[8] = vXO;
        }

        pxmaJogada1 = 4;

    }

    // jogador
    public static void jogadorJoga(String xo, String nome, int coo) {

        //int coo;

        /* if (jdas == 1) {
        System.out.printf("\t\t\nEntao, %s(%s) voce comeca\n", nome, da_vez);
        } else {
        System.out.printf("\t\t\nSua vez %s(%s)...\n", nome, da_vez);
        }
        while (true) {
        System.out.print("\nDigite a sua jogada<< ");
        coo = ler.nextInt();
        if (coo != 1 && coo != 2 && coo != 3 && coo != 4 && coo != 5 && coo != 6 && coo != 7 && coo != 8 && coo != 9) {
        System.out.printf("\t\t\n***JOGADA INVALIDA***\n");
        System.out.printf("%s, voce digitou uma opcao invalida.\ntTente novamente.", nome);
        //falsoCLS();
        continue;
        } else*/ if ((coo == 1) && (v[0].equals(VAZIO))) {
            v[0] = xo;
            return;
        } else if ((coo == 2) && (v[1].equals(VAZIO))) {
            v[1] = xo;
            return;
        } else if ((coo == 3) && (v[2].equals(VAZIO))) {
            v[2] = xo;
            return;
        } else if ((coo == 4) && (v[3].equals(VAZIO))) {
            v[3] = xo;
            return;
        } else if ((coo == 5) && (v[4].equals(VAZIO))) {
            v[4] = xo;
            return;
        } else if ((coo == 6) && (v[5].equals(VAZIO))) {
            v[5] = xo;
            return;
        } else if ((coo == 7) && (v[6].equals(VAZIO))) {
            v[6] = xo;
            return;
        } else if ((coo == 8) && (v[7].equals(VAZIO))) {
            v[7] = xo;
            return;
        } else if ((coo == 9) && (v[8].equals(VAZIO))) {
            v[8] = xo;
            return;
        } else {
            System.out.printf("\t\t***LUGAR OCUPADO***\n");
        }
        System.out.printf("%s, voce digitou um coordenada ja ocupada.\n Tente novamente.", nome);
//falsoCLS();

        CPU.setpJog(getvXO());
        System.out.println(getpJog());
    }

    //}
    //  velha jogando
    public static void velhaJoga() {

        if (armadilhaAtiva) {
            if (jogada3Ativa && v[pxmaJogada3].equals(VAZIO)) {
                v[pxmaJogada3] = getvXO();
                System.out.println("\nVerificou p3.2 t");
            } else if (getJdas() == 2) {
                if (v[4].equals(getjXO()) || v[0].equals(getjXO()) || v[2].equals(getjXO()) || v[6].equals(getjXO()) || v[8].equals(getjXO())) {
                    if (v[pxmaJogada1].equals(VAZIO)) {
                        v[pxmaJogada1] = getvXO();
                        System.out.println("\nVerificou p1");
                    } else {
                        if (rand.nextInt(2) == 0) {
                            v[pxmaJogada2] = getvXO();
                            System.out.println("\nVerificou p2");
                            jogada3Ativa = true;
                        } else {
                            v[pxmaJogada3] = getvXO();
                            System.out.println("\nVerificou p3.1");
                            pxmaJogada3 = pxmaJogada2;
                            jogada3Ativa = true;
                        }
                    }
                } else {
                    v[4] = getvXO();
                    System.out.println("\nVerificou meio p");
                }
            } else if (getJdas() == 4) {
                if (bloqueiaGanha(getjXO())) {
                } else if (v[0].equals(getjXO())) {
                    fatality(5, 7, 6, 7, 2, 5);
                    System.out.println("\nVerificou F1");
                } else if (v[2].equals(getjXO())) {
                    fatality(3, 7, 8, 7, 0, 3);
                    System.out.println("\nVerificou F2");
                } else if (v[6].equals(getjXO())) {
                    fatality(1, 5, 5, 8, 0, 1);
                    System.out.println("\nVerificou F3");
                } else if (v[8].equals(getjXO())) {
                    fatality(1, 3, 3, 6, 1, 2);
                    System.out.println("\nVerificou F4");
                }

                armadilhaAtiva = false;
            }
        } else if (getJdas() == 0 && rand.nextInt(2) == 1) {
            while (true) {
                int pontaAleatoria = rand.nextInt(9);
                if ((pontaAleatoria % 2 == 0 && pontaAleatoria != 4) || pontaAleatoria == 0) {
                    v[pontaAleatoria] = CPU.getvXO();
                    System.out.println("\nVerificou Ponta");
                    armadilhaAtiva = true;
                    switch (pontaAleatoria) {
                        case 0:
                            pxmaJogada1 = 8;
                            pxmaJogada2 = 6;
                            pxmaJogada3 = 2;
                            break;
                        case 2:
                            pxmaJogada1 = 6;
                            pxmaJogada2 = 2;
                            pxmaJogada3 = 8;
                            break;
                        case 6:
                            pxmaJogada1 = 2;
                            pxmaJogada2 = 8;
                            pxmaJogada3 = 0;
                            break;
                        case 8:
                            pxmaJogada1 = 0;
                            pxmaJogada2 = 2;
                            pxmaJogada3 = 6;
                            break;
                        default:
                            break;
                    }

                    break;

                }
            }
        } else if ((getJdas() >= 1 && getJdas() <= 3) && (rand.nextInt(2) == 1) && (v[4].equals(VAZIO))) {

            v[4] = getvXO();
            System.out.println("\n\nVerificou Meio");
        } else if (getJdas() >= 4 && bloqueiaGanha(getvXO())) {
            System.out.println("\n\nVerificou ganhou");
        } else if (getJdas() >= 3 && bloqueiaGanha(getjXO())) {
            System.out.println("\n\nVerificou bloqueia");
        } else {
            while (true) {
                int i = rand.nextInt(9);
                if (VAZIO.equals(v[i])) {
                    v[i] = getvXO();
                    System.out.println("\nVerificou Aleatorio");
                    break;
                }

            }
        }

        if (getvXO().equals(CPU.v[0])) {
            Tabuleiro.Botao1.setEnabled(false);
            Tabuleiro.Botao1.setText(getvXO());
        }
        if (getvXO().equals(CPU.v[1])) {
            Tabuleiro.Botao2.setEnabled(false);
            Tabuleiro.Botao2.setText(getvXO());
        }
        if (getvXO().equals(CPU.v[2])) {
            Tabuleiro.Botao3.setEnabled(false);
            Tabuleiro.Botao3.setText(getvXO());
        }
        if (getvXO().equals(CPU.v[3])) {
            Tabuleiro.Botao4.setEnabled(false);
            Tabuleiro.Botao4.setText(getvXO());
        }
        if (getvXO().equals(CPU.v[4])) {
            Tabuleiro.Botao5.setEnabled(false);
            Tabuleiro.Botao5.setText(getvXO());
        }
        if (getvXO().equals(CPU.v[5])) {
            Tabuleiro.Botao6.setEnabled(false);
            Tabuleiro.Botao6.setText(getvXO());
        }
        if (getvXO().equals(CPU.v[6])) {
            Tabuleiro.Botao7.setEnabled(false);
            Tabuleiro.Botao7.setText(getvXO());
        }
        if (getvXO().equals(CPU.v[7])) {
            Tabuleiro.Botao8.setEnabled(false);
            Tabuleiro.Botao8.setText(getvXO());
        }
        if (getvXO().equals(CPU.v[8])) {
            Tabuleiro.Botao9.setEnabled(false);
            Tabuleiro.Botao9.setText(getvXO());
        }

        CPU.empataGanha(getvXO());
        System.out.println(CPU.ganhou(getvXO()));

        setpJog(CPU.getjXO());
        CPU.jdas++;
        System.out.println(jdas);
        System.out.println("\nvelha jogou");
        CPU.mostraTabuleiro();
        System.out.println(getpJog());
    }

    public static void velhaJogaF() {

        System.out.print("\n TESTE FACIL ");

        while (true) {
            int i = 0;
            i = rand.nextInt(9);
            if (VAZIO.equals(v[i])) {
                v[i] = getvXO();
                System.out.println("\nVerificou Aleatorio");
                jdas++;
                System.out.print("\n JV: ");
                System.out.println(jdas);
                break;
            }

        }
        if (getvXO().equals(v[0])) {
            Tabuleiro.Botao1.setEnabled(false);
            Tabuleiro.Botao1.setText(getvXO());
        }
        if (getvXO().equals(v[1])) {
            Tabuleiro.Botao2.setEnabled(false);
            Tabuleiro.Botao2.setText(getvXO());
        }
        if (getvXO().equals(v[2])) {
            Tabuleiro.Botao3.setEnabled(false);
            Tabuleiro.Botao3.setText(getvXO());
        }
        if (getvXO().equals(v[3])) {
            Tabuleiro.Botao4.setEnabled(false);
            Tabuleiro.Botao4.setText(getvXO());
        }
        if (getvXO().equals(v[4])) {
            Tabuleiro.Botao5.setEnabled(false);
            Tabuleiro.Botao5.setText(getvXO());
        }
        if (getvXO().equals(v[5])) {
            Tabuleiro.Botao6.setEnabled(false);
            Tabuleiro.Botao6.setText(getvXO());
        }
        if (getvXO().equals(v[6])) {
            Tabuleiro.Botao7.setEnabled(false);
            Tabuleiro.Botao7.setText(getvXO());
        }
        if (getvXO().equals(v[7])) {
            Tabuleiro.Botao8.setEnabled(false);
            Tabuleiro.Botao8.setText(getvXO());
        }
        if (getvXO().equals(v[8])) {
            Tabuleiro.Botao9.setEnabled(false);
            Tabuleiro.Botao9.setText(getvXO());
        }

        mostraTabuleiro();

    }

    public static void velhaJogaM() {
    }

    public static void velhaJogaD() {
       
         
        if (jdas==0){
        fTipo=rand.nextInt(4);
        System.out.println("\nTipo de Fatality: "+fTipo);
       
        }
        
        if (aEntreAtiva && (v[pa].equals(getvXO()) && (v[pp1].equals(getjXO()) || v[pp2].equals(getjXO()) || v[pp3].equals(getjXO()) || v[pp4].equals(getjXO())))) {

            if (jdas == 2) {
                fatalityEntre();
                System.out.println("\n F Entre");
            } else if (jdas == 4 && bloqueiaGanha(getvXO())) {
                System.out.println("\n Ganhou A .Entre");
            } else if (jdas == 4 && bloqueiaGanha(getjXO())) {
                System.out.println("\n Bloqueio A . Entre");
                aEntreAtiva = false;
            } else if (jdas == 4) {
                v[pxmaJogada1] = vXO;
                System.out.println("\n Jogada final A . Entre");
                aEntreAtiva = false;
            }

            System.out.println("\n Entrou Entre ");
            System.out.println(pa);
            System.out.println(pp1);
            System.out.println(pp2);
            System.out.println(pp3);

        } else if (aMeioAtiva && (v[1].equals(getjXO()) || v[3].equals(getjXO()) || v[5].equals(getjXO()) || v[7].equals(getjXO()))) {

            if (jdas == 2) {

                if (v[1].equals(getjXO())) {
                    fatalityMeio(3, 5, 1);
                    System.out.println("\n Meio F1");
                } else if (v[3].equals(getjXO())) {
                    fatalityMeio(1, 7, 2);
                    System.out.println("\n Meio F3");
                }
                if (v[5].equals(getjXO())) {
                    fatalityMeio(1, 7, 2);
                    System.out.println("\n Meio F5");
                }
                if (v[7].equals(getjXO())) {
                    fatalityMeio(3, 5, 1);
                    System.out.println("\n Meio F7");
                }
            }
            System.out.println("\n Entrou Meio");

            if (jdas == 4 && bloqueiaGanha(getvXO())) {
                System.out.println("\n Bloqueio A . meio");
            } else if (jdas == 4) {
                v[pxmaJogada1] = vXO;
                System.out.println("\n Jogada final A . meio");
                aMeioAtiva = false;
            }

        } else if (armadilhaAtiva) {
            if (jogada3Ativa && v[pxmaJogada3].equals(VAZIO)) {
                v[pxmaJogada3] = getvXO();
                System.out.println("\nVerificou p3.2 t");
            } else if (getJdas() == 2) {
                if (v[4].equals(getjXO()) || v[0].equals(getjXO()) || v[2].equals(getjXO()) || v[6].equals(getjXO()) || v[8].equals(getjXO())) {
                    if (v[pxmaJogada1].equals(VAZIO)) {
                        v[pxmaJogada1] = getvXO();
                        System.out.println("\nVerificou p1");
                    } else {
                        if (rand.nextInt(2) == 0) {
                            v[pxmaJogada2] = getvXO();
                            System.out.println("\nVerificou p2");
                            jogada3Ativa = true;
                        } else {
                            v[pxmaJogada3] = getvXO();
                            System.out.println("\nVerificou p3.1");
                            pxmaJogada3 = pxmaJogada2;
                            jogada3Ativa = true;
                        }
                    }
                } else {
                    v[4] = getvXO();
                    System.out.println("\nVerificou meio p");
                }
            } else if (getJdas() == 4) {
                if (bloqueiaGanha(getjXO())) {
                    System.out.println("\nACHEI");
                } else if (v[0].equals(getjXO())) {
                    fatality(5, 7, 6, 7, 2, 5);
                    System.out.println("\nVerificou F1");
                } else if (v[2].equals(getjXO())) {
                    fatality(3, 7, 8, 7, 0, 3);
                    System.out.println("\nVerificou F2");
                } else if (v[6].equals(getjXO())) {
                    fatality(1, 5, 5, 8, 0, 1);
                    System.out.println("\nVerificou F3");
                } else if (v[8].equals(getjXO())) {
                    fatality(1, 3, 3, 6, 1, 2);
                    System.out.println("\nVerificou F4");
                }

                armadilhaAtiva = false;
            }
        } else if (fTipo==0&&jdas==0) {

            int i = rand.nextInt(4);

            switch (i) {
                case 0:
                    v[1] = vXO;
                    pa = 1;
                    pp1 = 3;
                    pp2 = 5;
                    pp3 = 6;
                    pp4 = 8;
                    break;
                case 1:
                    v[3] = vXO;
                    pa = 3;
                    pp1 = 1;
                    pp2 = 7;
                    pp3 = 8;
                    pp4 = 2;
                    break;
                case 2:
                    v[5] = vXO;
                    pa = 5;
                    pp1 = 1;
                    pp2 = 7;
                    pp3 = 0;
                    pp4 = 6;

                    break;
                case 3:
                    v[7] = vXO;
                    pa = 7;
                    pp1 = 3;
                    pp2 = 5;
                    pp3 = 0;
                    pp4 = 2;
                    break;
                default:
                    break;
            }
            aEntreAtiva = true;
            System.out.println("\nArmadilha Entre");

        } else if (fTipo==1&&jdas==0) {

            v[4] = vXO;
            aMeioAtiva = true;
            System.out.println("\nArmadilha Meio");

        } else if ((fTipo==2||fTipo==3)&&jdas==0) {
            while (true) {
                int pontaAleatoria = rand.nextInt(9);
                if ((pontaAleatoria % 2 == 0 && pontaAleatoria != 4) || pontaAleatoria == 0) {
                    v[pontaAleatoria] = CPU.getvXO();
                    System.out.println("\nVerificou Ponta");
                    armadilhaAtiva = true;
                    switch (pontaAleatoria) {
                        case 0:
                            pxmaJogada1 = 8;
                            pxmaJogada2 = 6;
                            pxmaJogada3 = 2;
                            break;
                        case 2:
                            pxmaJogada1 = 6;
                            pxmaJogada2 = 2;
                            pxmaJogada3 = 8;
                            break;
                        case 6:
                            pxmaJogada1 = 2;
                            pxmaJogada2 = 8;
                            pxmaJogada3 = 0;
                            break;
                        case 8:
                            pxmaJogada1 = 0;
                            pxmaJogada2 = 2;
                            pxmaJogada3 = 6;
                            break;
                        default:
                            break;
                    }

                    break;

                }
            }
        } else if ((getJdas() >= 1 && getJdas() <= 3) && (v[4].equals(VAZIO))) {

            v[4] = getvXO();
            System.out.println("\n\nVerificou Meio");
            aEntreAtiva = false;
        } else if (getJdas() >= 4 && bloqueiaGanha(getvXO())) {
            System.out.println("\n\nVerificou ganhou");
        } else if (getJdas() >= 3 && bloqueiaGanha(getjXO())) {
            System.out.println("\n\nVerificou bloqueia");
        } else {
            while (true) {
                int i = rand.nextInt(9);
                if (VAZIO.equals(v[i])) {
                    v[i] = getvXO();
                    System.out.println("\nVerificou Aleatorio");
                    aMeioAtiva = false;
                    aEntreAtiva = false;
                    break;
                }

            }
        }

        if (getvXO().equals(CPU.v[0])) {
            Tabuleiro.Botao1.setEnabled(false);
            Tabuleiro.Botao1.setText(getvXO());
        }
        if (getvXO().equals(CPU.v[1])) {
            Tabuleiro.Botao2.setEnabled(false);
            Tabuleiro.Botao2.setText(getvXO());
        }
        if (getvXO().equals(CPU.v[2])) {
            Tabuleiro.Botao3.setEnabled(false);
            Tabuleiro.Botao3.setText(getvXO());
        }
        if (getvXO().equals(CPU.v[3])) {
            Tabuleiro.Botao4.setEnabled(false);
            Tabuleiro.Botao4.setText(getvXO());
        }
        if (getvXO().equals(CPU.v[4])) {
            Tabuleiro.Botao5.setEnabled(false);
            Tabuleiro.Botao5.setText(getvXO());
        }
        if (getvXO().equals(CPU.v[5])) {
            Tabuleiro.Botao6.setEnabled(false);
            Tabuleiro.Botao6.setText(getvXO());
        }
        if (getvXO().equals(CPU.v[6])) {
            Tabuleiro.Botao7.setEnabled(false);
            Tabuleiro.Botao7.setText(getvXO());
        }
        if (getvXO().equals(CPU.v[7])) {
            Tabuleiro.Botao8.setEnabled(false);
            Tabuleiro.Botao8.setText(getvXO());
        }
        if (getvXO().equals(CPU.v[8])) {
            Tabuleiro.Botao9.setEnabled(false);
            Tabuleiro.Botao9.setText(getvXO());
        }

        CPU.empataGanha(getvXO());
        System.out.println(CPU.ganhou(getvXO()));

        setpJog(CPU.getjXO());
        CPU.jdas++;
        System.out.print("\n JV: ");
        System.out.println(jdas);
        System.out.println("\nvelha jogou");
        CPU.mostraTabuleiro();
        System.out.println(getpJog());

    }

}
