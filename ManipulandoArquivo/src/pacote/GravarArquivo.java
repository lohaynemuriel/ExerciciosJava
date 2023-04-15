package pacote;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GravarArquivo {
	public static void main(String[] args) {
	String[][] lista = new String[120][4];
	
    lista[0][0]="Alexandre Wagner Cardoso Rodrigues ";	lista[0][1]="Alameda Munique, 8922";	lista[0][2]="(63)8883-3216";	lista[0][3]="alexandre_rodrigues@kpomail.com";
    lista[1][0]="Alexia Nunes Batista ";	lista[1][1]="Rua São Paulo, 6845";	lista[1][2]="(35)8589-3323";	lista[1][3]="alexia_batista@bbkmail.com";
    lista[2][0]="Allana Dalila Costa ";	lista[2][1]="Avenida Amesterdan, 4123";	lista[2][2]="(90)8195-6607";	lista[2][3]="allana_costa@cwbmail.com";
    lista[3][0]="Amanda Mercia Ferreira ";	lista[3][1]="Avenida Liverpool, 5176";	lista[3][2]="(74)9155-1532";	lista[3][3]="amanda_ferreira@pnnmail.com";
    lista[4][0]="Amanda Souza da Silva ";	lista[4][1]="Rua Manaus, 7162";	lista[4][2]="(34)9780-4304";	lista[4][3]="amanda_silva@wqcmail.com";
    lista[5][0]="Ana Carolina Borges de Lacerda ";	lista[5][1]="Alameda São Paulo, 2788";	lista[5][2]="(61)9182-5058";	lista[5][3]="ana_lacerda@itvmail.com";
    lista[6][0]="Ana Claudia Souza Inacio ";	lista[6][1]="Alameda Porto Alegre, 3194";	lista[6][2]="(91)8630-4797";	lista[6][3]="ana_inacio@hdbmail.com";
    lista[7][0]="Ana Julia Sandes Mariano ";	lista[7][1]="Alameda Salvador, 9997";	lista[7][2]="(63)9810-1315";	lista[7][3]="ana_mariano@wcsmail.com";
    lista[8][0]="Ana Taíssa de Resende Falcão ";	lista[8][1]="Avenida Bucareste, 1262";	lista[8][2]="(47)9638-7671";	lista[8][3]="ana_falcão@yecmail.com";
    lista[9][0]="Andressa Costa Cabral ";	lista[9][1]="Alameda Cuiabá, 6822";	lista[9][2]="(28)8728-3969";	lista[9][3]="andressa_cabral@oecmail.com";
    lista[10][0]="Anny Goncalves Mendes ";	lista[10][1]="Alameda Hanôver, 6227";	lista[10][2]="(48)9282-6200";	lista[10][3]="anny_mendes@ywumail.com";
    lista[11][0]="Antonio Guilherme Dutra Cardoso ";	lista[11][1]="Alameda Teerã, 5219";	lista[11][2]="(34)8487-6295";	lista[11][3]="antonio_cardoso@nvkmail.com";
    lista[12][0]="Beatriz Ferreira Cabral ";	lista[12][1]="Rua Alexandria, 8634";	lista[12][2]="(43)9640-2641";	lista[12][3]="beatriz_cabral@uwemail.com";
    lista[13][0]="Bruno da Rocha Santana ";	lista[13][1]="Alameda Mönchengladbach, 7973";	lista[13][2]="(44)9814-7292";	lista[13][3]="bruno_santana@tldmail.com";
    lista[14][0]="Bruno Rodrigues Borelli ";	lista[14][1]="Alameda Kuala Lumpur, 3977";	lista[14][2]="(85)9222-1343";	lista[14][3]="bruno_borelli@zeamail.com";
    lista[15][0]="Camila Alves Duarte ";	lista[15][1]="Avenida Barcelona, 1765";	lista[15][2]="(27)9847-8549";	lista[15][3]="camila_duarte@hybmail.com";
    lista[16][0]="Camilla Antunes ";	lista[16][1]="Avenida Glasgow, 1765";	lista[16][2]="(72)9771-6167";	lista[16][3]="camilla_antunes@gtgmail.com";
    lista[17][0]="Carlos Eduardo Martins de Almeida ";	lista[17][1]="Alameda Nairóbi, 3676";	lista[17][2]="(25)9896-3149";	lista[17][3]="carlos_almeida@ojymail.com";
    lista[18][0]="Cayo Germano Faria Alves ";	lista[18][1]="Avenida Chongqing, 3044";	lista[18][2]="(51)8753-6268";	lista[18][3]="cayo_alves@yngmail.com";
    lista[19][0]="Cristiano de Almeida Pires ";	lista[19][1]="Alameda Seattle, 2489";	lista[19][2]="(81)9226-7085";	lista[19][3]="cristiano_pires@jramail.com";
    lista[20][0]="Daiane Mangabeira Farias ";	lista[20][1]="Avenida Frankfurt, 5757";	lista[20][2]="(59)9961-4575";	lista[20][3]="daiane_farias@uzvmail.com";
    lista[21][0]="Débora Silva Sabota ";	lista[21][1]="Avenida Donetsk, 2476";	lista[21][2]="(55)9578-8155";	lista[21][3]="débora_sabota@dylmail.com";
    lista[22][0]="Douglas Barros Machado ";	lista[22][1]="Alameda Auckland, 6263";	lista[22][2]="(12)9524-7847";	lista[22][3]="douglas_machado@ufzmail.com";
    lista[23][0]="Durval Salviano do Nascimento Júnior ";	lista[23][1]="Rua Londres, 4062";	lista[23][2]="(14)9835-5169";	lista[23][3]="durval_júnior@qzzmail.com";
    lista[24][0]="Edmo Alves de Lima Neto ";	lista[24][1]="Alameda Düsseldorf, 2169";	lista[24][2]="(58)9658-7627";	lista[24][3]="edmo_neto@lugmail.com";
    lista[25][0]="Eduardo Felipe Ferreira Padilha ";	lista[25][1]="Alameda Trípoli, 9515";	lista[25][2]="(65)9484-7970";	lista[25][3]="eduardo_padilha@qffmail.com";
    lista[26][0]="Elaine Pinto Silva Pacheco ";	lista[26][1]="Alameda Annaba, 5909";	lista[26][2]="(79)8203-3999";	lista[26][3]="elaine_pacheco@jcbmail.com";
    lista[27][0]="Eliane Andrade Ferreira ";	lista[27][1]="Rua Bamako, 1954";	lista[27][2]="(28)8483-6902";	lista[27][3]="eliane_ferreira@uicmail.com";
    lista[28][0]="Eliane Satsuki Arakaki ";	lista[28][1]="Alameda Bengasi, 8984";	lista[28][2]="(20)8461-5349";	lista[28][3]="eliane_arakaki@uhwmail.com";
    lista[29][0]="Elida Goncalves Santos ";	lista[29][1]="Avenida Argel, 8712";	lista[29][2]="(66)9048-4842";	lista[29][3]="elida_santos@qdmmail.com";
    lista[30][0]="Ellen Olga Primo E Silva ";	lista[30][1]="Rua Oran, 3759";	lista[30][2]="(76)9819-2059";	lista[30][3]="ellen_silva@clumail.com";
    lista[31][0]="Erika de Sousa Gomes ";	lista[31][1]="Alameda Buenos Aires, 2591";	lista[31][2]="(27)8099-3062";	lista[31][3]="erika_gomes@yxvmail.com";
    lista[32][0]="Eva Freire da Silva ";	lista[32][1]="Rua Bagda, 7886";	lista[32][2]="(49)8866-3928";	lista[32][3]="eva_silva@dpfmail.com";
    lista[33][0]="Fabiana Aparecida Fraga ";	lista[33][1]="Alameda Florença, 8521";	lista[33][2]="(59)8285-3616";	lista[33][3]="fabiana_fraga@slymail.com";
    lista[34][0]="Fernanda Aparecida Ottoni Lucas ";	lista[34][1]="Rua Medellín, 5016";	lista[34][2]="(27)8028-5667";	lista[34][3]="fernanda_lucas@ruamail.com";
    lista[35][0]="Fernanda da Silva Passos ";	lista[35][1]="Avenida Dublin, 9323";	lista[35][2]="(24)8598-5949";	lista[35][3]="fernanda_passos@jlbmail.com";
    lista[36][0]="Fillipe de Paula Almeida ";	lista[36][1]="Alameda Cidade do México, 3092";	lista[36][2]="(80)8368-7731";	lista[36][3]="fillipe_almeida@ewzmail.com";
    lista[37][0]="Flavia Bueno Araujo ";	lista[37][1]="Rua Kumasi, 8411";	lista[37][2]="(54)8917-1783";	lista[37][3]="flavia_araujo@ltumail.com";
    lista[38][0]="Francielly Tavares de Araujo ";	lista[38][1]="Avenida Vancouver, 2678";	lista[38][2]="(76)8980-1632";	lista[38][3]="francielly_araujo@cwvmail.com";
    lista[39][0]="Frederico Rassi ";	lista[39][1]="Alameda Sevilha, 1946";	lista[39][2]="(59)9180-8038";	lista[39][3]="frederico_rassi@qngmail.com";
    lista[40][0]="Gabriel Angelo Guimaraes Alves ";	lista[40][1]="Alameda Oita, 9422";	lista[40][2]="(30)9308-4559";	lista[40][3]="gabriel_alves@rpsmail.com";
    lista[41][0]="Gabriel Freitas Vieira ";	lista[41][1]="Rua Niigata, 8106";	lista[41][2]="(71)8376-2233";	lista[41][3]="gabriel_vieira@jqymail.com";
    lista[42][0]="Gabriel Telles dos Santos Burgarelli ";	lista[42][1]="Avenida Yangon, 2242";	lista[42][2]="(75)8996-4243";	lista[42][3]="gabriel_burgarelli@sctmail.com";
    lista[43][0]="Gleycy Kellen dos Santos Gonçalves ";	lista[43][1]="Alameda Tbilisi, 7347";	lista[43][2]="(69)8245-3037";	lista[43][3]="gleycy_gonçalves@mvumail.com";
    lista[44][0]="Guilherme Nascimento de Freitas Lima ";	lista[44][1]="Avenida Busan, 6628";	lista[44][2]="(40)8592-3221";	lista[44][3]="guilherme_lima@nhgmail.com";
    lista[45][0]="Gustavo Oliveira Galvao ";	lista[45][1]="Avenida Beirute, 6940";	lista[45][2]="(54)9226-4912";	lista[45][3]="gustavo_galvao@yggmail.com";
    lista[46][0]="Henrique Antonio Coelho de Oliveira ";	lista[46][1]="Alameda Montevidéu, 6871";	lista[46][2]="(35)8546-2938";	lista[46][3]="henrique_oliveira@gskmail.com";
    lista[47][0]="Hiorrana Cassia Faria ";	lista[47][1]="Alameda Montevidéu, 4914";	lista[47][2]="(25)9898-6126";	lista[47][3]="hiorrana_faria@oxbmail.com";
    lista[48][0]="Isadora Ghannam Ferreira ";	lista[48][1]="Rua Pequim, 2196";	lista[48][2]="(41)8418-8097";	lista[48][3]="isadora_ferreira@jjrmail.com";
    lista[49][0]="Isadora Paula Rezende Cavalcante ";	lista[49][1]="Rua Constantina, 1887";	lista[49][2]="(56)9439-7981";	lista[49][3]="isadora_cavalcante@edlmail.com";
    lista[50][0]="Izadora Silva de Souza ";	lista[50][1]="Rua Phuthaditjhaba, 886";	lista[50][2]="(29)9373-3787";	lista[50][3]="izadora_souza@ifkmail.com";
    lista[51][0]="Janaína dos Santos Ribeiro ";	lista[51][1]="Avenida São Paulo, 4986";	lista[51][2]="(27)8189-3996";	lista[51][3]="janaína_ribeiro@retmail.com";
    lista[52][0]="Jessica Moura Bastos ";	lista[52][1]="Avenida Manchester, 7078";	lista[52][2]="(25)8735-4470";	lista[52][3]="jessica_bastos@ihomail.com";
    lista[53][0]="Joao Paulo Silva Rodrigues ";	lista[53][1]="Rua La Plata, 4730";	lista[53][2]="(67)9895-2451";	lista[53][3]="joao_rodrigues@agomail.com";
    lista[54][0]="Josiane Kelly Lacerda de Souza ";	lista[54][1]="Alameda Lanús, 227";	lista[54][2]="(69)9192-1259";	lista[54][3]="josiane_souza@sppmail.com";
    lista[55][0]="Karina Alves Bomtempo ";	lista[55][1]="Rua Edmonton, 8574";	lista[55][2]="(60)9543-2488";	lista[55][3]="karina_bomtempo@wzimail.com";
    lista[56][0]="Karlla Kamylla Passos ";	lista[56][1]="Alameda Puebla, 8031";	lista[56][2]="(17)9003-1555";	lista[56][3]="karlla_passos@xmcmail.com";
    lista[57][0]="Kathiely de Souza Amorim ";	lista[57][1]="Alameda Cidade do Cabo, 7830";	lista[57][2]="(76)8014-7020";	lista[57][3]="kathiely_amorim@dvkmail.com";
    lista[58][0]="Lais de Melo Montel ";	lista[58][1]="Rua Luanda, 4611";	lista[58][2]="(53)9802-2122";	lista[58][3]="lais_montel@ymdmail.com";
    lista[59][0]="Lais de Melo Montel ";	lista[59][1]="Alameda Sunderland, 8415";	lista[59][2]="(18)8434-8406";	lista[59][3]="lais_montel@mdbmail.com";
    lista[60][0]="Lais Rodrigues Muniz ";	lista[60][1]="Alameda Lisboa, 2917";	lista[60][2]="(68)8176-5460";	lista[60][3]="lais_muniz@nnmmail.com";
    lista[61][0]="Lara Danilla Moreira Silva de Morais ";	lista[61][1]="Alameda Maputo, 4045";	lista[61][2]="(77)9507-5751";	lista[61][3]="lara_morais@zermail.com";
    lista[62][0]="Larissa Rodrigues Caetano ";	lista[62][1]="Rua Xian, 546";	lista[62][2]="(43)9903-6345";	lista[62][3]="larissa_caetano@brnmail.com";
    lista[63][0]="Leonardo Lopes da Luz ";	lista[63][1]="Alameda Chorzów, 9713";	lista[63][2]="(34)9259-5855";	lista[63][3]="leonardo_luz@rtwmail.com";
    lista[64][0]="Leticia de Moura Santana ";	lista[64][1]="Avenida Dalian, 5489";	lista[64][2]="(58)9808-8809";	lista[64][3]="leticia_santana@hssmail.com";
    lista[65][0]="Luan Claro de Lima Mendonça ";	lista[65][1]="Avenida Jilin, 6809";	lista[65][2]="(36)9826-6139";	lista[65][3]="luan_mendonça@idamail.com";
    lista[66][0]="Luana Roberta de Souza Bueno ";	lista[66][1]="Rua Abuja, 5163";	lista[66][2]="(59)9564-7852";	lista[66][3]="luana_bueno@slmmail.com";
    lista[67][0]="Lucas Brandão do Prado ";	lista[67][1]="Rua Chengdu, 1541";	lista[67][2]="(53)9278-3055";	lista[67][3]="lucas_prado@nlcmail.com";
    lista[68][0]="Lucas Mariano de Lima ";	lista[68][1]="Alameda Daegu, 4019";	lista[68][2]="(89)8977-2011";	lista[68][3]="lucas_lima@flrmail.com";
    lista[69][0]="Lucas Mourao Silva ";	lista[69][1]="Alameda Fez, 6615";	lista[69][2]="(88)8822-2805";	lista[69][3]="lucas_silva@uwimail.com";
    lista[70][0]="Lucas Sousa Oliveira ";	lista[70][1]="Avenida Sydney, 147";	lista[70][2]="(59)8109-2239";	lista[70][3]="lucas_oliveira@wiymail.com";
    lista[71][0]="Macks Miller Lopes Cardoso ";	lista[71][1]="Rua So Kon Po, 921";	lista[71][2]="(21)9191-8929";	lista[71][3]="macks_cardoso@nlsmail.com";
    lista[72][0]="Maisa Moreira Souza Lemes Lima ";	lista[72][1]="Avenida Roterdão, 8312";	lista[72][2]="(34)8361-1767";	lista[72][3]="maisa_lima@glomail.com";
    lista[73][0]="Maiza dos Reis Silva de Oliveira ";	lista[73][1]="Alameda Quito, 9729";	lista[73][2]="(26)9160-5200";	lista[73][3]="maiza_oliveira@xtjmail.com";
    lista[74][0]="Marcello Victor Costa E Silva ";	lista[74][1]="Avenida Valência, 8841";	lista[74][2]="(26)8504-2553";	lista[74][3]="marcello_silva@zycmail.com";
    lista[75][0]="Márcia Cristina Correia Teixeira ";	lista[75][1]="Alameda Perak, 3165";	lista[75][2]="(80)8271-2772";	lista[75][3]="márcia_teixeira@ftomail.com";
    lista[76][0]="Marcos Felipe Santana Verissimo ";	lista[76][1]="Avenida Xangai, 3548";	lista[76][2]="(43)8456-5464";	lista[76][3]="marcos_verissimo@ktsmail.com";
    lista[77][0]="Maria Onicia Coelho Rosa ";	lista[77][1]="Avenida Palo Alto, 314";	lista[77][2]="(46)9502-4261";	lista[77][3]="maria_rosa@pjnmail.com";
    lista[78][0]="Marina Nobre Bernardes ";	lista[78][1]="Avenida Tóquio, 35";	lista[78][2]="(36)8129-3096";	lista[78][3]="marina_bernardes@omcmail.com";
    lista[79][0]="Matheus Cardoso Duarte Santos ";	lista[79][1]="Alameda Toyota, 5310";	lista[79][2]="(80)8133-6159";	lista[79][3]="matheus_santos@ocqmail.com";
    lista[80][0]="Matheus Fabricante Sabag ";	lista[80][1]="Alameda Harare, 8683";	lista[80][2]="(42)9088-1922";	lista[80][3]="matheus_sabag@vpjmail.com";
    lista[81][0]="Matheus Navas Camozzi Fedato ";	lista[81][1]="Avenida Minsk, 244";	lista[81][2]="(42)8674-1260";	lista[81][3]="matheus_fedato@mpimail.com";
    lista[82][0]="Maycon Martins da Costa ";	lista[82][1]="Rua Porto, 2203";	lista[82][2]="(31)8742-7710";	lista[82][3]="maycon_costa@dqjmail.com";
    lista[83][0]="Meiriane Goncalves dos Santos ";	lista[83][1]="Alameda Daejeon, 5280";	lista[83][2]="(65)8615-7778";	lista[83][3]="meiriane_santos@hdamail.com";
    lista[84][0]="Meriellen Graciano Patene ";	lista[84][1]="Avenida Seogwipo, 8760";	lista[84][2]="(24)8350-5539";	lista[84][3]="meriellen_patene@psmmail.com";
    lista[85][0]="Moises Hilario Rodrigues ";	lista[85][1]="Alameda Jeonju, 3416";	lista[85][2]="(32)8140-2494";	lista[85][3]="moises_rodrigues@qxymail.com";
    lista[86][0]="Monique Domingues Netto ";	lista[86][1]="Rua Suwon, 5283";	lista[86][2]="(61)9178-3187";	lista[86][3]="monique_netto@kaemail.com";
    lista[87][0]="Natalia Alves Pinto ";	lista[87][1]="Rua Pequim, 1829";	lista[87][2]="(63)8308-4352";	lista[87][3]="natalia_pinto@nfcmail.com";
    lista[88][0]="Nathalia Fernandes Pimentel ";	lista[88][1]="Alameda Bogotá, 8034";	lista[88][2]="(62)8735-5025";	lista[88][3]="nathalia_pimentel@poamail.com";
    lista[89][0]="Nathalia Nascimento Guimaraes ";	lista[89][1]="Avenida Tunes, 3346";	lista[89][2]="(51)8392-3225";	lista[89][3]="nathalia_guimaraes@gcymail.com";
    lista[90][0]="Nathane de Souza Gonçalves Campos Lima ";	lista[90][1]="Avenida Joanesburgo, 8326";	lista[90][2]="(40)9677-8651";	lista[90][3]="nathane_lima@mummail.com";
    lista[91][0]="Nicolas de Oliveira Sousa ";	lista[91][1]="Avenida Viena, 9670";	lista[91][2]="(88)9128-7958";	lista[91][3]="nicolas_sousa@ufwmail.com";
    lista[92][0]="Nicolas Victor Martins dos Santos ";	lista[92][1]="Rua Belém, 480";	lista[92][2]="(40)8910-2016";	lista[92][3]="nicolas_santos@wsxmail.com";
    lista[93][0]="Nina Souto Maior Furtado ";	lista[93][1]="Avenida Belgrado, 4789";	lista[93][2]="(34)9901-7221";	lista[93][3]="nina_furtado@rsfmail.com";
    lista[94][0]="Nixon Bastos Costa ";	lista[94][1]="Avenida Melbourne, 100";	lista[94][2]="(20)8646-6817";	lista[94][3]="nixon_costa@dhsmail.com";
    lista[95][0]="Olicio Furtado Pereira Junior ";	lista[95][1]="Alameda Roma, 8336";	lista[95][2]="(50)9930-7114";	lista[95][3]="olicio_junior@stmmail.com";
    lista[96][0]="Patricia Karla Lopes Ferreira ";	lista[96][1]="Avenida Arbil, 6702";	lista[96][2]="(31)8283-8859";	lista[96][3]="patricia_ferreira@bknmail.com";
    lista[97][0]="Paulo Sergio Carneiro ";	lista[97][1]="Avenida Kaiserslautern, 4901";	lista[97][2]="(79)9028-1435";	lista[97][3]="paulo_carneiro@gyfmail.com";
    lista[98][0]="Paulo Victor Costa Caetano ";	lista[98][1]="Alameda Udine, 6082";	lista[98][2]="(81)8713-2016";	lista[98][3]="paulo_caetano@kwymail.com";
    lista[99][0]="Poliana Xavier Alves ";	lista[99][1]="Avenida Surabaya, 1259";	lista[99][2]="(88)8544-5064";	lista[99][3]="poliana_alves@nccmail.com";
    lista[100][0]="Priscila Marinho Vaz ";	lista[100][1]="Rua Palimbão, 6059";	lista[100][2]="(60)9228-6729";	lista[100][3]="priscila_vaz@jnemail.com";
    lista[101][0]="Rafael Sousa Guimaraes ";	lista[101][1]="Alameda Cúcuta, 4093";	lista[101][2]="(80)8543-7849";	lista[101][3]="rafael_guimaraes@fydmail.com";
    lista[102][0]="Rafaela Cardoso ";	lista[102][1]="Avenida Ahvaz, 1449";	lista[102][2]="(68)9491-3377";	lista[102][3]="rafaela_cardoso@ojdmail.com";
    lista[103][0]="Raissa Stival Marques ";	lista[103][1]="Rua Rosário, 9451";	lista[103][2]="(32)8727-2433";	lista[103][3]="raissa_marques@fhxmail.com";
    lista[104][0]="Raul Alcantara Teixeira Lima ";	lista[104][1]="Rua Foxborough, 9598";	lista[104][2]="(77)9643-2058";	lista[104][3]="raul_lima@zgumail.com";
    lista[105][0]="Regiane Pereira da Silveira ";	lista[105][1]="Rua Milão, 2167";	lista[105][2]="(29)8713-2547";	lista[105][3]="regiane_silveira@doamail.com";
    lista[106][0]="Regner Cunha Melo ";	lista[106][1]="Rua Teresina, 3270";	lista[106][2]="(39)9632-7393";	lista[106][3]="regner_melo@bnwmail.com";
    lista[107][0]="Remo Gonçalves da Silva ";	lista[107][1]="Avenida São Luís, 6298";	lista[107][2]="(43)9072-4765";	lista[107][3]="remo_silva@sirmail.com";
    lista[108][0]="Renata Freitas Goncalves ";	lista[108][1]="Alameda Belo Horizonte, 6193";	lista[108][2]="(35)9995-6646";	lista[108][3]="renata_goncalves@cxtmail.com";
    lista[109][0]="Ricardo Alves de Oliveira ";	lista[109][1]="Alameda Fortaleza, 2598";	lista[109][2]="(80)9632-4476";	lista[109][3]="ricardo_oliveira@errmail.com";
    lista[110][0]="Ricardo Camargo de Oliveira ";	lista[110][1]="Rua Goyang, 7725";	lista[110][2]="(52)8278-6126";	lista[110][3]="ricardo_oliveira@ppwmail.com";
    lista[111][0]="Ritiele Souza Borges ";	lista[111][1]="Rua Gwangju, 3518";	lista[111][2]="(72)8880-1981";	lista[111][3]="ritiele_borges@uutmail.com";
    lista[112][0]="Ruth Cristina Custodio de Sousa Borges ";	lista[112][1]="Alameda Malaca, 6692";	lista[112][2]="(62)9844-8736";	lista[112][3]="ruth_borges@fszmail.com";
    lista[113][0]="Samuel Zacharias Alves Neto ";	lista[113][1]="Alameda Changsha, 7590";	lista[113][2]="(32)8944-2093";	lista[113][3]="samuel_neto@jrxmail.com";
    lista[114][0]="Savio Rosa Correia ";	lista[114][1]="Avenida La Paz, 5570";	lista[114][2]="(45)9611-3589";	lista[114][3]="savio_correia@zpzmail.com";
    lista[115][0]="Stefany Faria Sousa ";	lista[115][1]="Rua Qingdao, 377";	lista[115][2]="(86)8552-1671";	lista[115][3]="stefany_sousa@hvxmail.com";
    lista[116][0]="Stephane Carolline Cunha Oliveira ";	lista[116][1]="Rua Erevan, 9475";	lista[116][2]="(27)9985-6574";	lista[116][3]="stephane_oliveira@zncmail.com";
    lista[117][0]="Suellen da Silva Morais ";	lista[117][1]="Avenida Hangzhou, 5481";	lista[117][2]="(67)8420-1376";	lista[117][3]="suellen_morais@fpomail.com";
    lista[118][0]="Thamara de Oliveira Ferraz ";	lista[118][1]="Rua Glasgow, 7649";	lista[118][2]="(66)9335-6438";	lista[118][3]="thamara_ferraz@ulcmail.com";
    lista[119][0]="Thayane Ramos Gomes ";	lista[119][1]="Avenida Cusco, 6136";	lista[119][2]="(41)8457-2125";	lista[119][3]="thayane_gomes@dezmail.com";
    	 FileWriter gravaArquivo;
    	 try {
    		 gravaArquivo = new FileWriter(new File("E:/Lohayne/Java/Java2.0/Exemplo1/arquivoTeste.csv"));
    		 gravaArquivo.write("nome;endereco;telefone;email\n");
    		 for(int linha=0; linha<120; linha++) {
    			 for(int coluna=0; coluna<4; coluna++) {
    				 if(coluna==3) {
    					 gravaArquivo.write(lista[linha][coluna] +"\n");
    				 }else {
    					 gravaArquivo.write(lista[linha][coluna] + ";");
    				 }
    			 }
    		 }
    		 
    		 gravaArquivo.close();
    	 }catch (IOException ex) {
    		 ex.printStackTrace();
    	 }
    	 System.out.println("It's over...");
	}
}