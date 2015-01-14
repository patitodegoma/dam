package parejas;

import utilidades.*;

public class Principal {
//Rafael Carretero Barranca, Juan María Moreno Vázquez, José Manuel Palma Gallego
	//Guillermo Delgado Vázquez, Andrés Macías Jiménez.
	
	// TODO Do-While de repetir juego
	// TODO Modificar el generar espacios para que genere otras cosas
	
	public static void main(String[] args) {
		
		int nivel = 0, jugada = 1;
		int [] coordenadas = new int [4];
		String turno = "";
		char repetir = 'n';
		boolean acierto = false, finalizado = true, repetida = false;
		
		Jugador [] jugadores = new Jugador [2];
		
		Config partida = new Config ();
		
		Utiles.repiteCadena("# ", 71, true);
		System.out.println("#                                                                                                                               rBB@v       #");
		System.out.println("#                                                                                                             ,irLuXBX B@B@B:  G@B@B@G      #");
		System.out.println("#                                                                                             .,,;L  .B@B@B@. 8@B@@@B@ @@@B@L  @B@B@B@:     #");
		System.out.println("#                                                                                    :@B@B    @B@B@: .@@@B@B@ SB@B@B@M.B@B@@v :B@F B@Br     #");
		System.out.println("#                                                                ..,:,   rB@B@Bi    :@@@B@B.  @@B@Bv  B@B@B@B:P@B@B@MX,@BBB@J 7@BL @B@r.    #");
		System.out.println("#                                                     PB@Z      @B@B@B@. 7@B@B@L:   @@@M@B@2  @@@@@v  @B@.0B@r. kB@q  i@@uM@5 vB@F 28Ev.    #");
		System.out.println("#                                      r75  :@B@BO   @B@B@B,    B@B@B@@@ iB@@@BL.  ,B@B 2@Bk .B@G@Bu  B@@ j@@j  L@B8. :@BvO@X r@B@7   .     #");
		System.out.println("#                     ..::i,   B@@@B8 ,B@Bi 7B@B@M: 2@@B@B@S    @B@0GB@B r@BBukv:  i@BO uB@X ,@BLO@5  @B@ 2B@Y. uB@Z, rB@iOBO .B@@@j        #");
		System.out.println("#       ..    SGO@B  ,B@B@B@5  @B@B@0..@B@i 7@@@BB. O@BiL@@N,   B@Bi.@B@ 7B@8      rB@8 2@BN 7B@rOBq .@@M 5@BL. u@B8. J@B:Z@O. @B@B@Z       #");
		System.out.println("#    B@B@B@v  @B@B@7  @B@B@B@, B@B@BG .B@@i 2@@M@B, M@@ rB@Z:   BB@r.B@B.r@BM,     r@BO XB@N J@BiO@Z .@@Mq@B@i, uB@Z, PB@.ZB@:  @@@B@q      #");
		System.out.println("#    @B@B@B@. B@M@@v  B@MFM@@r @B@1UL,.@@@: F@81B@, O@B.iBBP;   B@B7.@B@ 7B@G.     r@@O P@@0 FB@,8@B ,B@M@BO::  j@BG. q@@ N@Bi   BB@B@i     #");
		System.out.println("#    B@BZM@Bi,@BMM@L  @BB uB@r.B@B:   .B@B: E@E7@Bi MB@X   .:   BB@r.B@B.r@BBM@.   r@BO.  :. q@B.q@B ,@BMM@BO   u@@0. MBM 2@@i    qB@Bv     #");
		System.out.println("#    @B@.;B@::BB1OB2  B@B L@B7 @B@r    @B@: M@X7B@; X@B@G       M@@7.@B@ rBMM@@v.  rB@O:     MBB PB@.,@BO.S@BJ  u@BZ  @@O:5@@i:8M7 BB@v.    #");
		System.out.println("#    B@B,:@B::@BvZ@1  @B@ JB@r.M@Bi   .B@B, @BFi@BY :B@B@@.     MB@r.B@B.r@MMB@7.  r@BO,     M@E 2@B:,@BB uB@u. uB@0  @BMMMM@irB@N N@BL.    #");
		System.out.println("#    @B@,iB@:rB@i8B0  @BM:0@B:.BMBO@L  @B@..@@u:B@U  PB@M@B,    M@@7.@B@.r@B8YuL,  rB@G.u@BS @BO7EM@::B@M U@Bj. Y@BE .BBMMMMB7:@B5 NB@v,    #");
		System.out.println("#    B@B.:@B:v@B:q@Z  @MMMBMu.,MMOBBS  B@B.:@@j.@Bk.  uBBM@X    B@@r.B@M.r@BZ.     r@BG XB@S,BBOMMM@r,@BB U@@Y. JB@q ,@MMSZM@L:B@k,8@B7,    #");
		System.out.println("#    @BMvkM@,uB@.0BO .BM8MMGi  @MMB@F  @B@.:B@r B@q:   iBBBG:   M@B7.@BB 7B@G:     rB@N u@@u.@OMMMO@7,BBM.u@BJ. Y@Bq :@BG 7BB5.@BBMM@@i:    #");
		System.out.println("#    BBOMMB@.5@M.X@M.,@MMLOB@  BMMULL. BBM.i@M7.BMZ.7uF rB@8i   M@Br.BBM.r@MZ.     :@BZ JB@7:BMOvFBMJ.@MM 2B@Y. jB@P 7@BO L@@O u@B@B@v;     #");
		System.out.println("#    @MMM@@1 GBO 5B@.:BMO j@Bv MMB:    @BB vMM8MOMZ.M@B,,@BM:   O@M;.BMM.7MMZ77:   .BB8:kBBii@MZ 7BB1,BBM.2@@u. F@BO 0B@O.v@BBi rBBOvi,     #");
		System.out.println("#    BBMFJY,.OBN JBB:,BMB JM@7.OMB7   .BBM.LBOMOMOM.XB@.:MB8i   MBM7vOBM.rBOMB@k.   @BMMBMB.L@@8 j@BO:@B@,EB@2: v881i:rYvi  :::   ...       #");
		System.out.println("#    @MB:    @OOEOOBi,MMM.YBM7 MMBi    @MM.uMO8E8MM.2BM:iBMG:   O@OMOMMO vBMOB@k:   j@BBB@7.q@@8,v0Ok7vjjr, rr:   ...                       #");
		System.out.println("#    BBB7.   @MGO8OMr.BMM JM@r.OMOj7i 7BMO.5MO7 ZMB,LBM8MM@5i   B@BMBB@j.U@B@@@Fi    rMB8Li.  ;:i   .                                       #");
		System.out.println("#    @M@7,  .@OM8OOMv,MMM.LBM7.MOOM@GvBBMM.0M@r OB@7,@BBM@Mri   B@BM8Gui..iJv7rri      ...                                                  #");
		System.out.println("#    BBBv,  :BM0.LMMu.BMB.jB@r.MMOMMPv@B@F.B@BL.@B@2..M@@E7i.    .i,,..                                                                     #");
		System.out.println("#    @M@7,  7@ME vB@F:@@B.5@BL,@B@B@qLBMqi:LuSv: :rr:  .:::                                                                                 #");
		System.out.println("#    B@BL,  PB@O.J@BMi@BBiJSGLi:7vrii: ...                                                                                                  #");
		System.out.println("#    @B@Y:  vEN1i.,Lr; .::   .                                                                                                              #");
		System.out.println("#    .irr:    . .                                                                                                                           #");
		Utiles.repiteCadena("# ", 71, true);
		System.out.print("\n - Pulsa INTRO para continuar: ");
		repetir = Leer.datoChar();
		
		Utiles.limpiaPantalla();
		Utiles.repiteCadena("# ", 71, true);
		System.out.println("#                                                                                                                                           #");
		System.out.println("#      Desarrollado por:                                                                                                                    #\n"
				+ "#      -----------------                                                                                                                    #\n"
				+ "#    Andrés Macías Jiménez  (Responsable)                                                                                                   #\n"
				+ "#                                                                                                                                           #\n"
				+ "#    Rafael Carretero Barranca                                                                                                              #\n"
				+ "#    Guillermo Delgado Vázquez                                                                                                              #\n"
				+ "#    Juan María Moreno Vázquez                                                                                                              #\n"
				+ "#    José Manuel Palma Gallego                                                                                                              #");
		System.out.println("#                                                                                                                                           #");
		Utiles.repiteCadena("# ", 71, true);
		System.out.println("#                                                                                                                                           #");
		System.out.println("#                           B I E N V E N I D O   A L   J U E G O   D E   L A S   P A R E J A S                                             #");
		System.out.println("#                                                                                                                                           #");
		Utiles.repiteCadena("# ", 71, true);
		System.out.println("#                                                                                                                                           #");
		System.out.println("#      El juego consiste en buscar por turnos las parejas de nombres en el tablero de juego. Cada vez que un jugador consigue               #");
		System.out.println("#      descubrir una pareja de nombres suma puntos, y cada error resta puntos.                                                              #");
		System.out.println("#                                                                                                                                           #");
		System.out.println("#      Si se acierta una pareja, se mantiene el turno, pasando al rival tras un error.                                                      #");
		System.out.println("#                                                                                                                                           #");
		System.out.println("#      ¡Esperamos que os guste y que lo paséis bien!                                                                                        #");
		System.out.println("#                                                                                                                                           #");
		Utiles.repiteCadena("# ", 71, true);
		System.out.print("\n - Pulsa INTRO para continuar: ");
		repetir = Leer.datoChar();
		
		Utiles.limpiaPantalla();
		do {
			nivel = partida.seleccionaNivel();				
			
			Coleccion cole = partida.configuraColeccion(partida.seleccionaColeccion());
			cole.desordenar();
									
			Coleccion coleRepe = partida.generaParejas(nivel, cole);	
			coleRepe.desordenar();
				
			Tablero miTablero = new Tablero (cole, coleRepe);
			miTablero.montaTablero(nivel);
			
			if (!repetida) {
				jugadores = partida.creaJugadores();
			}
			
			turno = partida.sorteoInicial(jugadores);
						
			miTablero.inicializarTablero(nivel);
			
			//TODO Clase jugar con el do-while
			
			do {
				miTablero.escribeDatos(jugadores, turno);
				miTablero.dibujarTablero(nivel);
				coordenadas = partida.pideCoordenadas(turno, jugada, coordenadas, nivel); // Las coordenadas serían un array de int de 4 posiciones
				
				while (!miTablero.comprobarLevantado(coordenadas[0] - 1, coordenadas[1] - 1)) {
					coordenadas = partida.pideCoordenadas(turno, jugada, coordenadas, nivel);
				}
				
				miTablero.setMostrar(coordenadas[0] - 1, coordenadas[1] - 1, true);  //TODO Cambiar las (0,0) por (1,1)
				miTablero.escribeDatos(jugadores, turno);
				miTablero.dibujarTablero(nivel);  
				jugada++;
				
				coordenadas = partida.pideCoordenadas(turno, jugada, coordenadas, nivel);
				
				while (!miTablero.comprobarLevantado(coordenadas[2] - 1, coordenadas[3] - 1)) {
					coordenadas = partida.pideCoordenadas(turno, jugada, coordenadas, nivel);
				}
				
				miTablero.setMostrar(coordenadas[2] - 1, coordenadas[3] - 1, true);
				miTablero.escribeDatos(jugadores, turno);
				miTablero.dibujarTablero(nivel);
				jugada--;
				
				acierto = miTablero.comprobarJugada(coordenadas);
				
				finalizado = miTablero.comprobarFinalizado();
				
				turno = partida.finalizaJugada(acierto, finalizado, turno, jugadores);
				
				miTablero.ocultarFallos (coordenadas, acierto);
				
				
				
				partida.pausa(finalizado);
				
				
				
			} while (!finalizado);
			
			partida.devuelveGanador(jugadores);
			
			System.out.print("\n¿Desea jugar una nueva partida con los mismos jugadores? (S/N): ");
			
			repetir = Leer.datoChar();
			
			if (repetir == 's' || repetir == 'S') {
				repetida = true;
				for (int i = 0; i < jugadores.length; i++) {
					jugadores[i].setPuntos(0);
				}
			}
			
		} while (repetida);
		
		System.out.println("\n¡¡¡Gracias por jugar a nuestro juego!!!");
		
	
	}

}
