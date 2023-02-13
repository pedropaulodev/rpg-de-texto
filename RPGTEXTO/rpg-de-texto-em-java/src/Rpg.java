
import java.util.Random;
import java.util.Scanner;

public class Rpg {
    public static void main(String[] args) {
        int Escolha1; //Você está pronto?
        int Escolha2; //Bônus inicial de HP
        int Escolha3; //Escolhe a arena
        int Escolha4; //Poção ou Ataque Crítico
        int Escolha5; //Fatality
        String TurnoPlayer;

        //Atributos Boss
        int HPBoss = 100;
        int AtaqueBoss = 6;

        //Atributos Player
        String nome; // Recebe nome
        int HPPlayer = 90; //HP Inicial
        int AtaqueNormal = 5; //Dano fixo do ataque normal
        int AtaqueForte = 7; //Dano fixo do ataque forte
        int bonusvida = 20; //Incremento de HP pré-batalha

        //Poções de Dano / Vida
        int pocaovida = 20; // Incremento de HP durante batalha
        int ataquecritico = 20; // Dano crítico no boss durante batalha

        //Cria o objeto dado
        Random dado = new Random();
        int [] NumeroAleatorio = new int[16]; //Recebe o valor do dado
        int contDado = 0; //Índice do valor do dado por turno
        int contTurno = 0; //Índice do turno

        //ATAQUE NORMAL DO PLAYER
        int [] DanoNormal = new int [20];
        DanoNormal [contTurno] = AtaqueNormal + NumeroAleatorio[contDado];

        //ATAQUE FORTE DO PLAYER
        int [] DanoForte = new int [20];
        DanoForte [contTurno] = AtaqueForte + NumeroAleatorio[contDado];

        //ATAQUE DO LOBONK
        int [] DanoBoss = new int [20];
        DanoBoss [contTurno] = AtaqueBoss + NumeroAleatorio[contDado];

        Scanner scan = new Scanner(System.in);

        System.out.println("                 ______________________________________________");
        System.out.println("                 ██╗░░░░░░█████╗░██████╗░░█████╗░███╗░░██╗██╗░░██╗");
        System.out.println("                 ██║░░░░░██╔══██╗██╔══██╗██╔══██╗████╗░██║██║░██╔╝");
        System.out.println("                 ██║░░░░░██║░░██║██████╦╝██║░░██║██╔██╗██║█████═╝░");
        System.out.println("                 ██║░░░░░██║░░██║██╔══██╗██║░░██║██║╚████║██╔═██╗░");
        System.out.println("                 ███████╗╚█████╔╝██████╦╝╚█████╔╝██║░╚███║██║░╚██╗");
        System.out.println("                 ╚══════╝░╚════╝░╚═════╝░░╚════╝░╚═╝░░╚══╝╚═╝░░╚═╝");
        System.out.println("                     _________________________________________");
        System.out.println("                 𒀴  █▀█   █▀▄▀█ █▀▀ █▄░█ ▀█▀ █ █▀█ █▀█ █▀ █▀█ 𒀸");
        System.out.println("                 𒅂  █▄█   █░▀░█ ██▄ █░▀█ ░█░ █ █▀▄ █▄█ ▄█ █▄█ 𒁍");
        System.out.println("                             𒁀 DURO & CHEIO GAMES 𒀶");
        System.out.println("");
        System.out.println("                                𒀽 APERTE ENTER 𒀾");
        System.out.println("");
        System.out.println("");
        scan.nextLine ();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("                   𒃵                     ");
        System.out.println("                  ... Dos mesmos criadores de 'DURO e CHEIO'      𒈛");
        System.out.println("");
        System.out.println("");
        System.out.println("                                                    𒆳");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
        scan.nextLine ();
        System.out.println("");
        System.out.println("");
        System.out.println("                                         .");
        System.out.println("");
        System.out.println("                                        𒆴");
        System.out.println("          𒀭  Você esta em sua faculdade vendo o trabalho de sua turma...");
        System.out.println("                O trabalho é de programação e cada grupo faz um game");
        System.out.println("       𒃺            E do nada cara, um ser surge atrás de você      𒄖");
        System.out.println("                            Cabelos louros e longos");
        System.out.println("             𒅂       Sim, era um elf. Olha essa orelha! 𒀮");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
        scan.nextLine ();
        System.out.println("                                         .");
        System.out.println("                     𒆜               𒂟ELF𒂟");
        System.out.println("                         Ola guerreiro, qual o seu nome?");
        System.out.println("");
        System.out.println("                                      𒂟VOCE𒂟");
        System.out.println("                         Como assim cara? Guerreiro? Ta maluco?");
        System.out.print("                                   Meu nome é ");
        nome = scan.next();
        System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
        scan.nextLine ();




        System.out.println("");
        System.out.println("                                       𒂟ELF𒂟");
        System.out.println("                       Certo " + nome + ", Agora você é um guerreiro!");
        System.out.println("                                 Eu me chamo BALERION.");
        System.out.println("               Você esta prestes a batalhar com LOBONK o REI de PROV LONE!");
        System.out.println("                        VOCÊ ESTA PREPARADO PARA ESTA BATALHA?");
        System.out.println("");
        System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
        scan.nextLine ();
        System.out.println("");
        System.out.println("       𒆜                           𒂟"+nome+"𒂟");
        System.out.println("                𒇄 1  Sim, estou pronto! Vamos amassar esse cara!");
        System.out.println("                   𒇄 2  Não, não quero! Quero ir jogar lol  𒆖");
        Escolha1 = scan.nextInt();


        switch(Escolha1){

            case 1:
                System.out.println("");
                System.out.println("");
                System.out.println("                               𒇲  𒂟BALERION𒂟");
                System.out.println("   𒈫    Perfeito " + nome + ", você é nossa ultima esperança neste trabalho de P.I!");
                System.out.println("      Vamos lhe dar uma espada sagrada que aplica dano 7 no ATAQUE FORTE e 5 no NORMAL!");
                System.out.println("           .                                                      𒇺");
                System.out.println("");
                System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                scan.nextLine ();
                break;
            case 2:
                System.out.println("");
                System.out.println("");
                System.out.println("            .                      𒂟BALERION𒂟       𒉽");
                System.out.println("          " + nome + " dependemos de você, você é nossa ultima esperança!");
                System.out.println("   𒉢        VAMOS PARA A LUTA! E PARE DE JOGAR ESSE JOGO HORROROSO!");
                System.out.println("");
                System.out.println("");
                System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                scan.nextLine ();
                break;

        }
        System.out.println("");
        System.out.println("                             𒂟BALERION FALA DEMAIS𒂟  𒊩");
        System.out.println("    𒌀       Não apenas isso, você tem 90 de HP. Vamos melhorar isso?     𒊻");
        System.out.println("              Lhe darei uma poção que acrescenta mais 20 pontos! Aceita?");
        System.out.println("");
        System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
        scan.nextLine ();
        System.out.println("                                   𒂟"+nome+"𒂟");
        System.out.println("       𒆜             𒇄 1  Sim, vou precisar de mais HP!");
        System.out.println("                         𒇄 2  Não, eu me garanto cara!          𒋽");
        Escolha2 = scan.nextInt();

        switch(Escolha2){

            case 1:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("              𒌋    𒌋     𒌋       𒂟BALERION𒂟");
                System.out.println("             Tome esta pocao que lhe dará +20 de HP, ficando com 110!");
                System.out.println("                      Ideal para a batalha! VAMOS COMEÇAR!");
                System.out.println("    𒌶 ");
                System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                scan.nextLine ();
                System.out.println("");
                HPPlayer = HPPlayer + bonusvida;
                break;
            case 2:
                System.out.println("");
                System.out.println("");
                System.out.println("                        𒍫         𒂟BALERION𒂟");
                System.out.println("            Confie em mim, você deveria aceitar. Será uma grande batalha!");
                System.out.println("                                  VAMOS COMEÇAR!    𒍧");
                System.out.println("");
                System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                scan.nextLine ();
                System.out.println("");
                break;

        }
        System.out.println("");
        System.out.println("                         𒍗");
        System.out.println("           𒎌   BALERION ABRE UM PORTAL E LHE COLOCA DE FRENTE PARA LOBONK 𒍮");
        System.out.println("                              𒋙    B A T A L H A        𒎕");
        System.out.println("");
        System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
        scan.nextLine ();
        System.out.println("                𒁇 LOBONK esta em sua sala real sentado olhando pra você  𒌐");
        System.out.println("                                      Ele diz: ");
        System.out.println("");
        System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
        scan.nextLine ();
        System.out.println("                                     𒂟LOBONK𒂟        𒌨");
        System.out.println("       Você tem coragem " + nome + "! Não o conheço, mas irei acabar com você");
        System.out.println("     𒌨           Sou o Rei de Prov Lone e nunca fui derrotado");
        System.out.println(" Para tentar ajudar você, eu tenho 100 de HP e nem vou precisar da minha marreta sanguinária.");
        System.out.println("                  Você parece fraco lhe falta ódio! (oi fans de Naruto)           𒌪");
        System.out.println("");
        System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
        scan.nextLine ();
        System.out.println("                   Vou deixar escolher onde acontecerá esta batalha! ");
        System.out.println("   𒆜         Você pode escolher a minha sala, o SENAC ou a Estação Jurubatuba!");
        System.out.println("                      𒍳       D E C I D A - L O G O   𒍱  ");
        System.out.println("");
        scan.nextLine ();
        System.out.println("");
        System.out.println("");
        System.out.println("                           𒈦      𒂟"+nome+"𒂟");
        System.out.println("                          𒇄 1  SALA DO PROPRIO LOBONK             𒇺");
        System.out.println("        𒇹               𒇄 2  CENTRO UNIVERSITÁRIO SENAC");
        System.out.println("                            𒇄 3  ESTAÇÃO JURUBATUBA         𒈫");
        Escolha3 = scan.nextInt();
        scan.nextLine ();

        switch(Escolha3){

            case 1:
                System.out.println("");
                System.out.println("");
                System.out.println("                              𒆐    𒂟LOBONK𒂟");
                System.out.println("        𒆕              Quer morrer aqui mesmo? HAHAHA  𒆵");
                System.out.println("           𒄬             VEM PRA CIMA! VAMOS COMEÇAR!");
                System.out.println("");
                System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                scan.nextLine ();
                System.out.println("                    𒄗  D E S C R E V E N D O O L O C A L 𒃮 ");
                System.out.println("");
                System.out.println("    𒀁         A sala de Lobonk é uma classica sala de boss medieval ");
                System.out.println("             Um trono gigante, tochas nas paredes e um ambiente gélido!");
                System.out.println("            𒀀     Vocês estão em frente ao trono se encarando!     𒀫");
                System.out.println("");
                System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                scan.nextLine ();
                System.out.println("");
                break;
            case 2:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("           𒀹                        𒂟LOBONK𒂟    𒀿");
                System.out.println("     Quer morrer na frente dos alunos desta INCRÍVEL INSTITUIÇÃO? OK! VAMOS LÁ");
                System.out.println("");
                System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                scan.nextLine ();
                System.out.println("                    𒄗  D E S C R E V E N D O O L O C A L 𒃮       ,");
                System.out.println("");
                System.out.println("                  Vocês estão no 'telletubies' da Universidade ");
                System.out.println("             O dia esta ensolarado e os passaros cantam desesperados   𒀶");
                System.out.println("       𒁂            como se algo terrível fosse acontecer   ");
                System.out.println("                     Os alunos que ali estudam param de comer    𒀺");
                System.out.println("                 e conversar para assistir esta batalha incrível!       𒆬");
                System.out.println("");
                System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                scan.nextLine ();
                System.out.println("");
                break;
            case 3:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("               𒈛                   𒂟LOBONK𒂟  𒆰");
                System.out.println("    𒈫             HAHAHA será engraçado lhe jogar nos trilhos e ");
                System.out.println("       parar mais uma vez esta linha esmeralda que já não funciona direito!   𒉡");
                System.out.println("");
                System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                scan.nextLine ();
                System.out.println("                     𒄗  D E S C R E V E N D O O L O C A L 𒃮  ");
                System.out.println("");
                System.out.println("       𒋙       A plataforma sentido Grajáu esta vazia, está frio     𒋧 ");
                System.out.println(" As capivaras que se banhavam no Rio Tietê vão a margem para assistir esta épica batalha! 𒎍");
                System.out.println("");
                System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                scan.nextLine ();
                break;

        }
        //INICIO DA BATALHA##################################################################################################################################################################################################

        //TURNO 1 ###########################################################################################################################################################################################################
        if (HPBoss > 20) {

            System.out.println("");
            System.out.println("                                    𒂟LOBONK𒂟");
            System.out.println("              JA QUE ESCOLHEU O LUGAR DA SUA MORTE, VAMOS COMEÇAR! ");
            System.out.println("    𒆜                𓌖 Lobonk se aproxima e te ataca      𒍡");
            NumeroAleatorio [contDado] = dado.nextInt(6)+1;
            DanoBoss [contTurno] = AtaqueBoss + NumeroAleatorio[contDado];
            System.out.println("                                  ↳ DADO = " + NumeroAleatorio[contDado]);
            System.out.println("                          ↳ DANO CAUSADO = " + DanoBoss [contTurno]);
            HPPlayer = HPPlayer - DanoBoss [contTurno];
            System.out.println("                       ↳ HP " + nome + " = " + HPPlayer);
            System.out.println("                             ↳ HP LOBONK = " + HPBoss);
            System.out.println("");
            System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
            scan.nextLine ();
            System.out.println("");
            System.out.println("                                    𒂟" + nome + "𒂟");
            System.out.println("     𒉼               Será que é o meu dia de morrer ou o seu?");
            System.out.println("                     𓌖 Você sorri com desdenho e ataca");
            System.out.println("                  𒁇 ESCOLHA UMA DAS DUAS FORMAS DE ATAQUE ↴      𒋖");
            System.out.println("              [ADAGA]  - Ataque NORMAL, não causa dano em você (5 dano)");
            System.out.println("        [ESPADA] - Ataque FORTE, causa 1 ponto de sangramento em você (7 dano)");
            contTurno++;
            contDado++;

            TurnoPlayer = scan.next();
            switch (TurnoPlayer.toUpperCase()) {
                case "ADAGA":
                    System.out.println("                                                              𒉽     ");
                    NumeroAleatorio [contDado] = dado.nextInt(6)+1;
                    DanoNormal [contTurno] = AtaqueNormal + NumeroAleatorio[contDado];
                    System.out.println("                                  ↳ DADO = " + NumeroAleatorio[contDado]);
                    System.out.println("                          ↳ DANO CAUSADO = " + DanoNormal[contTurno]);
                    HPBoss = HPBoss - DanoNormal[contTurno];
                    System.out.println("                       ↳ HP " + nome + " = " + HPPlayer);
                    System.out.println("                 𒊓          ↳ HP LOBONK = " + HPBoss);
                    System.out.println("");
                    System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                    scan.nextLine ();
                    break;
                case "ESPADA":
                    System.out.println("                                      𒊸  ");
                    NumeroAleatorio [contDado] = dado.nextInt(6)+1;
                    DanoForte [contTurno] = AtaqueForte + NumeroAleatorio[contDado];
                    System.out.println("          𒆜                      ↳ DADO = " + NumeroAleatorio[contDado]);
                    System.out.println("                        . ↳ DANO CAUSADO = " + DanoForte [contTurno] + " / DANO REFLETIDO EM VOCÊ = 1");
                    HPBoss = HPBoss - DanoForte[contTurno];
                    HPPlayer = HPPlayer - 1;
                    System.out.println("                 𒍻    ↳ HP " + nome + " = " + HPPlayer);
                    System.out.println("                             ↳ HP LOBONK = " + HPBoss);
                    System.out.println("");
                    System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                    scan.nextLine ();
                    break;
                default:
                    System.out.println("                        ESTA ARMA NÃO EXISTE MALUCO!");
            }
            contTurno++;
            contDado++;
        }//FIM TURNO 1 ############################################################################################################################


        //TURNO 2 ###########################################################################################################################################################################################################
        if (HPBoss > 20) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("                    𓌖 Lobonk sangra e ataca você novamente");
            NumeroAleatorio [contDado] = dado.nextInt(6)+1;
            DanoBoss [contTurno] = AtaqueBoss + NumeroAleatorio[contDado];
            System.out.println("                                  ↳ DADO = " + NumeroAleatorio[contDado]);
            System.out.println("                          ↳ DANO CAUSADO = " + DanoBoss [contTurno]);
            HPPlayer = HPPlayer - DanoBoss [contTurno];
            System.out.println("                       ↳ HP " + nome + " = " + HPPlayer);
            System.out.println("                             ↳ HP LOBONK = " + HPBoss);
            System.out.println("");
            System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
            scan.nextLine ();
            System.out.println("                              𒂟" + nome + " sussura:𒂟");
            System.out.println("                                Que força é essa?");
            System.out.println("              𓌖  " + nome + " da 2 passos para trás e ataca Lobonk");
            System.out.println("                           𒍗     [ADAGA]  (5 Dano)   𒌴");
            System.out.println("                           [ESPADA] (7 Dano/1 Sangramento)");
            contTurno++;
            contDado++;
            TurnoPlayer = scan.next();

            switch (TurnoPlayer.toUpperCase()) {
                case "ADAGA":
                    System.out.println("                                                              𒉽     ");
                    NumeroAleatorio [contDado] = dado.nextInt(6)+1;
                    DanoNormal [contTurno] = AtaqueNormal + NumeroAleatorio[contDado];
                    System.out.println("                                  ↳ DADO = " + NumeroAleatorio[contDado]);
                    System.out.println("                          ↳ DANO CAUSADO = " + DanoNormal[contTurno]);
                    HPBoss = HPBoss - DanoNormal[contTurno];
                    System.out.println("                       ↳ HP " + nome + " = " + HPPlayer);
                    System.out.println("                 𒊓          ↳ HP LOBONK = " + HPBoss);
                    System.out.println("");
                    System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                    scan.nextLine ();
                    break;
                case "ESPADA":
                    System.out.println("                                      𒊸  ");
                    NumeroAleatorio [contDado] = dado.nextInt(6)+1;
                    DanoForte [contTurno] = AtaqueForte + NumeroAleatorio[contDado];
                    System.out.println("          𒆜                      ↳ DADO = " + NumeroAleatorio[contDado]);
                    System.out.println("                        . ↳ DANO CAUSADO = " + DanoForte [contTurno] + " / DANO REFLETIDO EM VOCÊ = 1");
                    HPBoss = HPBoss - DanoForte[contTurno];
                    HPPlayer = HPPlayer - 1;
                    System.out.println("                 𒍻    ↳ HP " + nome + " = " + HPPlayer);
                    System.out.println("                             ↳ HP LOBONK = " + HPBoss);
                    System.out.println("");
                    System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                    scan.nextLine ();
                    break;
                default:
                    System.out.println("                        ESTA ARMA NÃO EXISTE MALUCO!");
            }
            contTurno++;
            contDado++;
        }//FIM TURNO 2 ############################################################################################################################

        //TURNO 3 ###########################################################################################################################################################################################################
        if (HPBoss > 20) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("                       𓌖 Lobonk recebe o golpe e recua       𒉿");
            System.out.println("                                     𒂟LOBONK𒂟      𒉡");
            System.out.println("   Você realmente esta a altura. O nome desta espada é Lig, ela quer lhe fazer sofrer");
            System.out.println("                              𓌖 Ele corre e ataca " + nome);
            NumeroAleatorio [contDado] = dado.nextInt(6)+1;
            DanoBoss [contTurno] = AtaqueBoss + NumeroAleatorio[contDado];
            System.out.println("                                  ↳ DADO = " + NumeroAleatorio[contDado]);
            System.out.println("                          ↳ DANO CAUSADO = " + DanoBoss [contTurno]);
            HPPlayer = HPPlayer - DanoBoss [contTurno];
            System.out.println("                       ↳ HP " + nome + " = " + HPPlayer);
            System.out.println("                             ↳ HP LOBONK = " + HPBoss);
            System.out.println("");
            System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
            scan.nextLine ();
            System.out.println("              𓌖 " + nome + " sente o golpe, respira e parte pra cima");
            System.out.println("                                 [ADAGA]  (5 Dano)   𒌀");
            System.out.println("                      𒋡  [ESPADA] (7 Dano/1 Sangramento)");
            contTurno++;
            contDado++;

            TurnoPlayer = scan.next();
            switch (TurnoPlayer.toUpperCase()) {
                case "ADAGA":
                    System.out.println("                                                              𒉽     ");
                    NumeroAleatorio [contDado] = dado.nextInt(6)+1;
                    DanoNormal [contTurno] = AtaqueNormal + NumeroAleatorio[contDado];
                    System.out.println("                                  ↳ DADO = " + NumeroAleatorio[contDado]);
                    System.out.println("                          ↳ DANO CAUSADO = " + DanoNormal[contTurno]);
                    HPBoss = HPBoss - DanoNormal[contTurno];
                    System.out.println("                       ↳ HP " + nome + " = " + HPPlayer);
                    System.out.println("                 𒊓          ↳ HP LOBONK = " + HPBoss);
                    System.out.println("");
                    System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                    scan.nextLine ();
                    break;
                case "ESPADA":
                    System.out.println("                                      𒊸  ");
                    NumeroAleatorio [contDado] = dado.nextInt(6)+1;
                    DanoForte [contTurno] = AtaqueForte + NumeroAleatorio[contDado];
                    System.out.println("          𒆜                      ↳ DADO = " + NumeroAleatorio[contDado]);
                    System.out.println("                        . ↳ DANO CAUSADO = " + DanoForte [contTurno] + " / DANO REFLETIDO EM VOCÊ = 1");
                    HPBoss = HPBoss - DanoForte[contTurno];
                    HPPlayer = HPPlayer - 1;
                    System.out.println("                 𒍻    ↳ HP " + nome + " = " + HPPlayer);
                    System.out.println("                             ↳ HP LOBONK = " + HPBoss);
                    System.out.println("");
                    System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                    scan.nextLine ();
                    break;
                default:
                    System.out.println("                        ESTA ARMA NÃO EXISTE MALUCO!");
            }
            contTurno++;
            contDado++;
        }//FIM TURNO 3 ############################################################################################################################

        //TURNO 4 ###########################################################################################################################################################################################################
        if (HPBoss > 20) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("          𒃰    𓌖 Lobonk olha para seus ferimentos e não desiste    𒄑");
            NumeroAleatorio [contDado] = dado.nextInt(6)+1;
            DanoBoss [contTurno] = AtaqueBoss + NumeroAleatorio[contDado];
            System.out.println("                                  ↳ DADO = " + NumeroAleatorio[contDado]);
            System.out.println("                          ↳ DANO CAUSADO = " + DanoBoss [contTurno]);
            HPPlayer = HPPlayer - DanoBoss [contTurno];
            System.out.println("                       ↳ HP " + nome + " = " + HPPlayer);
            System.out.println("                             ↳ HP LOBONK = " + HPBoss);
            System.out.println("");
            System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
            contTurno++;
            contDado++;

            scan.nextLine ();
            System.out.println("        𓌖 Você observa os teus ferimentos e também não se da por vencido");
            System.out.println("        𒆜                        [ADAGA]  (5 Dano)");
            System.out.println("                          [ESPADA] (7 Dano/1 Sangramento)");
            TurnoPlayer = scan.next();
            switch (TurnoPlayer.toUpperCase()) {
                case "ADAGA":
                    System.out.println("                                                              𒉽     ");
                    NumeroAleatorio [contDado] = dado.nextInt(6)+1;
                    DanoNormal [contTurno] = AtaqueNormal + NumeroAleatorio[contDado];
                    System.out.println("                                  ↳ DADO = " + NumeroAleatorio[contDado]);
                    System.out.println("                          ↳ DANO CAUSADO = " + DanoNormal[contTurno]);
                    HPBoss = HPBoss - DanoNormal[contTurno];
                    System.out.println("                       ↳ HP " + nome + " = " + HPPlayer);
                    System.out.println("                 𒊓          ↳ HP LOBONK = " + HPBoss);
                    System.out.println("");
                    System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                    scan.nextLine ();
                    break;
                case "ESPADA":
                    System.out.println("                                      𒊸  ");
                    NumeroAleatorio [contDado] = dado.nextInt(6)+1;
                    DanoForte [contTurno] = AtaqueForte + NumeroAleatorio[contDado];
                    System.out.println("          𒆜                      ↳ DADO = " + NumeroAleatorio[contDado]);
                    System.out.println("                        . ↳ DANO CAUSADO = " + DanoForte [contTurno] + " / DANO REFLETIDO EM VOCÊ = 1");
                    HPBoss = HPBoss - DanoForte[contTurno];
                    HPPlayer = HPPlayer - 1;
                    System.out.println("                 𒍻    ↳ HP " + nome + " = " + HPPlayer);
                    System.out.println("                             ↳ HP LOBONK = " + HPBoss);
                    System.out.println("");
                    System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                    scan.nextLine ();
                    break;
                default:
                    System.out.println("                        ESTA ARMA NÃO EXISTE MALUCO!");
            }
            contTurno++;
            contDado++;
        }//FIM TURNO 4 ############################################################################################################################

        //TURNO 5 ###########################################################################################################################################################################################################
        if (HPBoss > 20) {

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("               𓌖 Lobonk se ajoelha e lhe ataca debaixo para cima   𒀶");
            NumeroAleatorio [contDado] = dado.nextInt(6)+1;
            DanoBoss [contTurno] = AtaqueBoss + NumeroAleatorio[contDado];
            System.out.println("                                  ↳ DADO = " + NumeroAleatorio[contDado]);
            System.out.println("                          ↳ DANO CAUSADO = " + DanoBoss [contTurno]);
            HPPlayer = HPPlayer - DanoBoss [contTurno];
            System.out.println("                       ↳ HP " + nome + " = " + HPPlayer);
            System.out.println("                             ↳ HP LOBONK = " + HPBoss);
            System.out.println("");
            System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
            contTurno++;
            contDado++;
            scan.nextLine ();
            System.out.println("        𓌖 " + nome + " sente o golpe e com uma das mãos ataca Lobonk   𒁓");
            System.out.println("              𒁹                   [ADAGA]  (5 Dano)");
            System.out.println("                         [ESPADA] (7 Dano/1 Sangramento)");
            TurnoPlayer = scan.next();
            switch (TurnoPlayer.toUpperCase()) {
                case "ADAGA":
                    System.out.println("                                                              𒉽     ");
                    NumeroAleatorio [contDado] = dado.nextInt(6)+1;
                    DanoNormal [contTurno] = AtaqueNormal + NumeroAleatorio[contDado];
                    System.out.println("                                  ↳ DADO = " + NumeroAleatorio[contDado]);
                    System.out.println("                          ↳ DANO CAUSADO = " + DanoNormal[contTurno]);
                    HPBoss = HPBoss - DanoNormal[contTurno];
                    System.out.println("                       ↳ HP " + nome + " = " + HPPlayer);
                    System.out.println("                 𒊓          ↳ HP LOBONK = " + HPBoss);
                    System.out.println("");
                    System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                    scan.nextLine ();
                    break;
                case "ESPADA":
                    System.out.println("                                      𒊸  ");
                    NumeroAleatorio [contDado] = dado.nextInt(6)+1;
                    DanoForte [contTurno] = AtaqueForte + NumeroAleatorio[contDado];
                    System.out.println("          𒆜                      ↳ DADO = " + NumeroAleatorio[contDado]);
                    System.out.println("                        . ↳ DANO CAUSADO = " + DanoForte [contTurno] + " / DANO REFLETIDO EM VOCÊ = 1");
                    HPBoss = HPBoss - DanoForte[contTurno];
                    HPPlayer = HPPlayer - 1;
                    System.out.println("                 𒍻    ↳ HP " + nome + " = " + HPPlayer);
                    System.out.println("                             ↳ HP LOBONK = " + HPBoss);
                    System.out.println("");
                    System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                    scan.nextLine ();
                    break;
                default:
                    System.out.println("                        ESTA ARMA NÃO EXISTE MALUCO!");
            }
            contTurno++;
            contDado++;
        }//FIM TURNO 5 ############################################################################################################################

        //TURNO 6 ###########################################################################################################################################################################################################
        if (HPBoss > 20) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("             𓌖 O Rei de Prov Lone grita 'Eu sou o REI' e da um ataque feroz");
            System.out.println("");
            System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
            scan.nextLine ();
            System.out.println("                      𒄟     T O M E U M A D E C I S Ã O    𒆐 ");
            System.out.println("");
            System.out.println("       𓌖 BALERION surge atrás de você como se fosse um anjo e lhe pergunta:");
            System.out.println(nome + " para lhe ajudar você quer uma poção que lhe dará mais 20 de HP    𒆳");
            System.out.println("         𒆳            ou uma poção que lhe dará +5 por turno?");
            System.out.println("                  Qualquer uma delas poderá lhe trazer a vitória!");
            System.out.println("");
            System.out.println("");
            System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
            scan.nextLine ();
            System.out.println("                                    𒂟" + nome + "𒂟");
            System.out.println("                       𓌖 Você responde sem olhar pra trás     𒈛");
            System.out.println("                 𒈦                  Eu quero...");
            System.out.println("");
            System.out.println("");
            System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
            scan.nextLine ();
            System.out.println("                                 𒇄 1  POÇÃO DE HP         𒉼");
            System.out.println("         𒉭                     𒇄 2  ATAQUE CRÍTICO");
            System.out.println("                                 𒇄 3  NENHUMA AJUDA  𒉽");

            Escolha4 = scan.nextInt();


            switch (Escolha4) {

                case 1:
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("                                    𒂟BALERION𒂟");
                    HPPlayer = HPPlayer + pocaovida;
                    System.out.println("                   Ótima escolha, agora você tem " + HPPlayer + " de vida! ");
                    System.out.println("         𒉼                 Volte para a batalha " + nome + "!");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                    scan.nextLine ();
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("");
                    HPBoss = HPBoss - ataquecritico;
                    System.out.println("");
                    System.out.println("                                   𒂟BALERION𒂟");
                    System.out.println("         𒊓                       C R Í T I C O");
                    System.out.println("            Você causou um ataque que tirou 20 pontos de vida de LOBONK ");
                    System.out.println("                           agora ele tem " + HPBoss + "de HP   𒉽");
                    System.out.println("");
                    System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                    scan.nextLine ();
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("                                    𒂟" + nome + "𒂟");
                    System.out.println("        𒋙      EU NÃO PRECISO DE AJUDA PARA ACABAR COM ESSE ESTRANHO!   𒊩");
                    System.out.println("                    𒊺  Obrigado por oferecer ajuda BALERION!");
                    System.out.println("");
                    System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                    scan.nextLine ();
                    break;

            }

            System.out.println("");
            System.out.println("                      𓌖 Você responde após receber o golpe");
            System.out.println("          𒋰                         𒂟" + nome + "𒂟");
            System.out.println("         Eu não dou a minima, sou " + nome + " o melhor guerreiro da minha rua!");
            System.out.println("");
            System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
            scan.nextLine ();
            System.out.println("            𓌖 Balerion começa a desaparecer e antes de sumir ele diz:");
            System.out.println("                                    𒂟BALERION𒂟        𒋥");
            System.out.println("                𒋻    Lembre-se " + nome + ", precisamos de você!");
            System.out.println("");
            scan.nextLine();
            System.out.println("");
            System.out.println("                                  𓌖 Você escuta");
            System.out.println("                𒋧       EI, O QUE VOCÊ ESTA FAZENDO AI?       𒋧");
            System.out.println("      𓌖 Lobonk corre para atacar vocês e antes que acontecesse Balerion some.");
            System.out.println("");
            System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
            scan.nextLine ();
            System.out.println("          𓌖 " + nome + " se sente mais confiante com o buff e começa a rir");
            System.out.println("                     Se prepare que o castigo será 2 vezes pior");
            System.out.println("      𒋲            𓌖 Você salta para um ataque na vertical            𒋲   ");
            System.out.println("                                  [ADAGA]  (5 Dano)");
            System.out.println("                          [ESPADA] (7 Dano/1 Sangramento)");
            TurnoPlayer = scan.next();
            switch (TurnoPlayer.toUpperCase()) {
                case "ADAGA":
                    System.out.println("                                                              𒉽     ");
                    NumeroAleatorio [contDado] = dado.nextInt(6)+1;
                    DanoNormal [contTurno] = AtaqueNormal + NumeroAleatorio[contDado];
                    System.out.println("                                  ↳ DADO = " + NumeroAleatorio[contDado]);
                    System.out.println("                          ↳ DANO CAUSADO = " + DanoNormal[contTurno]);
                    HPBoss = HPBoss - DanoNormal[contTurno];
                    System.out.println("                       ↳ HP " + nome + " = " + HPPlayer);
                    System.out.println("                 𒊓          ↳ HP LOBONK = " + HPBoss);
                    System.out.println("");
                    System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                    scan.nextLine ();
                    break;
                case "ESPADA":
                    System.out.println("                                      𒊸  ");
                    NumeroAleatorio [contDado] = dado.nextInt(6)+1;
                    DanoForte [contTurno] = AtaqueForte + NumeroAleatorio[contDado];
                    System.out.println("          𒆜                      ↳ DADO = " + NumeroAleatorio[contDado]);
                    System.out.println("                        . ↳ DANO CAUSADO = " + DanoForte [contTurno] + " / DANO REFLETIDO EM VOCÊ = 1");
                    HPBoss = HPBoss - DanoForte[contTurno];
                    HPPlayer = HPPlayer - 1;
                    System.out.println("                 𒍻    ↳ HP " + nome + " = " + HPPlayer);
                    System.out.println("                             ↳ HP LOBONK = " + HPBoss);
                    System.out.println("");
                    System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
                    scan.nextLine ();
                    break;
                default:
                    System.out.println("                        ESTA ARMA NÃO EXISTE MALUCO!");
            }
            contTurno++;
            contDado++;
        }//FIM TURNO 6 ############################################################################################################################

        //TURNO 7 ###########################################################################################################################################################################################################
        if (HPBoss > 20) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("                 𓌖 Lobonk se ajoelha com o golpe, seu peito sangra");
            System.out.println("𓌖 Ele mantem a cabeça abaixada e seu corpo começa a expelir uma energia vermelha, parece fogo.");
            System.out.println("                         𓌖 O mentiroso lhe encara e diz:");
            System.out.println("");
            System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
            scan.nextLine ();
            System.out.println("                                     𒂟LOBONK𒂟");
            System.out.println("                      Por esta você não esperava, não é mesmo?   𒍮");
            System.out.println("  𓌖 Lobonk começa a levitar e com sua espada lhe devolve o ataque na vertical");
            NumeroAleatorio [contDado] = dado.nextInt(6)+1;
            DanoBoss [contTurno] = AtaqueBoss + NumeroAleatorio[contDado];
            System.out.println("                                  ↳ DADO = " + NumeroAleatorio[contDado]);
            System.out.println("                          ↳ DANO CAUSADO = " + DanoBoss [contTurno]);
            HPPlayer = HPPlayer - DanoBoss [contTurno];
            System.out.println("                       ↳ HP " + nome + " = " + HPPlayer);
            System.out.println("                             ↳ HP LOBONK = " + HPBoss);
            System.out.println("");
            System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
            contTurno++;
            contDado++;

        }//FIM TURNO 7 ############################################################################################################################
        scan.nextLine ();


        System.out.println("                         𓌖 Você se ajoelha e sente muita dor 𒋰");
        System.out.println(" 𓌖 Fica um tempo ajoelhado e repete o gesto do seu inimigo, o olha com raiva e da um sorriso");
        System.out.println("                                    𒂟" + nome + "𒂟");
        System.out.println("  Eu vou finalizar você! Eu vou acabar com você de uma forma incrívelmente dolorosa!");
        System.out.println("");
        System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
        scan.nextLine ();

        System.out.println("    𒌍        LOBONK ESTA AJOELHADO, SUA ESPADA ESTA CAÍDA AO SEU LADO");
        System.out.println("                          ELE LEVANTA A CABEÇA E PERGUNTA 𒈱");
        System.out.println("");
        System.out.println("                                                             𝔼𝕟𝕥𝕖𝕣");
        scan.nextLine ();
        System.out.println("                   𒇲 Vamos " + nome + ", acabe logo com isso");
        System.out.println("");
        System.out.println("           ☠　ESCOLHA O FATALITY QUE DESEJA APLICAR AO 'MENTIROSO'");
        System.out.println("                            𒇄 1  ARRANCAR A CABEÇA");
        System.out.println("                         𒇄 2  CORTAR LOBONK AO MEIO");
        System.out.println("                            𒇄 3  CHAMAR BALERION");
        Escolha5 = scan.nextInt();

        switch (Escolha5) {

            case 1:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("𓌖 " + nome + " anda devagar em direção de Lobonk com sua espada arrastando no chão");
                System.out.println("");
                System.out.println("                                    𒂟" + nome + "𒂟");
                System.out.println("           Eu vou acabar com você agora Lobonk, o mentiroso. No fim, eu venci");
                System.out.println("𓌖 " + nome + " segura sua espada com firmeza e com toda sua força separa a cabeça do pescoço do terrível Lobonk");
                System.out.println("     𓌖 Após lhe arrancar a cabeça, " + nome + " da as costas e vai para o portal");
                System.out.println("");
                System.out.println("            Rubens Ferracin, José Jr., Edgar e Pedro Paulo. (Turma E)");
                System.out.println("");
                System.out.println("                                                                                 ~ T H E E N D");
                break;
            case 2:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println(nome + " apoia sua espada em seu ombro e vai em direção de Lobonk.");
                System.out.println("");
                System.out.println("                                   𒂟" + nome + "𒂟");
                System.out.println("     Fique tranquilo, sua morte será rapida. Sinto pena de você, tão fraco!");
                System.out.println("𓌖 " + nome + " se posiciona para dar o ataque final e com toda sua força ataca o tronco de Lobonk");
                System.out.println("     𓌖 Após lhe cortar ao meio, " + nome + " da as costas e vai para o portal");
                System.out.println("");
                System.out.println("            Rubens Ferracin, José Jr., Edgar e Pedro Paulo. (Turma E)");
                System.out.println("");
                System.out.println("                                                                                 ~ T H E E N D");
                break;
            case 3:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println(nome + " clama por Balerion");
                System.out.println("                      𓌖 Balerion surge entre você e fala:");
                System.out.println("");
                System.out.println("                                    𒂟BALERION𒂟");
                System.out.println("             PERFEITO " + nome + ", você conseguiu vencer este terrível BOSS!");
                System.out.println("    Se ele continua vivo, você deseja que eu o leve para a prisão de Oranez ... Assim será!");
                System.out.println("                   Obrigado por nos ajudar " + nome + "! De verdade!");
                System.out.println("");
                System.out.println("          𓌖 Balerion some e deixa o portal aberto para que você volte!");
                System.out.println("");
                System.out.println("            Rubens Ferracin, José Jr., Edgar e Pedro Paulo. (Turma E)");
                System.out.println("");
                System.out.println("                                                                                 ~ T H E E N D");
                break;
        } //Fim do Fatality
        scan.close();
    }
}