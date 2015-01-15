package parejas;

import utilidades.*;

/**
 * Se encarga de las opciones de configuración inicial del juego, y de los métodos no relacionados directamente con el juego.
 */
public class Config {
	
	private int [] altos; // Número de filas del tablero por nivel
	private int [] anchos;  // Número de columnas por nivel
	private int puntosAcierto;
	private int puntosFallo;
	
	// Constructores
	
	public Config () {
		this.altos = new int[]{4, 4, 5, 6};
		this.anchos = new int[]{4, 6, 6, 6};
		this.puntosAcierto = 5;
		this.puntosFallo = -1;
	}
	
	public Config (int [] altos, int [] anchos, int puntosAcierto, int puntosFallo) {
		this.altos = altos;
		this.anchos = anchos;
		this.puntosAcierto = puntosAcierto;
		this.puntosFallo = puntosFallo;
	}
	
	// Getters y Setters
	
	public int getAltos(int i) {
		return altos[i];
	}

	public void setAltos(int i, int valor) {
		this.altos[i] = valor;
	}

	public int getAnchos(int i) {
		return anchos[i];
	}

	public void setAnchos(int i, int valor) {
		this.anchos[i] = valor;
	}

	public int getPuntosAcierto() {
		return puntosAcierto;
	}

	public void setPuntosAcierto(int puntosAcierto) {
		this.puntosAcierto = puntosAcierto;
	}

	public int getPuntosFallo() {
		return puntosFallo;
	}

	public void setPuntosFallo(int puntosFallo) {
		this.puntosFallo = puntosFallo;
	}
	
	// Métodos
	
	/**
	 * Inicio del programa, lanzamiento consecutivo de los métodos imprimeCartel e imprimeIntro
	 */
	public void arrancar() {
		imprimeCartel();
		imprimeIntro();
	}
	
	

	/**
	 * Muestra el cartel "Pareja de Cartas", dibujado con ASCII.
	 * 
	 * @param dummy Es una variable tonta, que almacena el valor utilizado para el "Pulsar Intro para continuar". No se usa para nada, solo para esperar el Intro, de ahí el warning del Eclipse.
	 */
	public void imprimeCartel () { 
		System.out.println();
		Utiles.repiteCadena("# ", 71, true);
		System.out.println("#                                                                                                                                           #");
		System.out.println("#                                                                                                                                           #");
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
		System.out.println("#                                                                                                                                           #");
		System.out.println("#                                                                                                                                           #");
		Utiles.repiteCadena("# ", 71, true);
		System.out.print("\n - Pulsa INTRO para continuar: ");
		Leer.datoChar();
		
		Utiles.limpiaPantalla();
	}
	
	/**
	 * Muestra la introducción, formada por los componentes del grupo, frase de bienvenida y reglas básicas.
	 * 
	 * @param dummy Es una variable tonta, que almacena el valor utilizado para el "Pulsar Intro para continuar". No se usa para nada, solo para esperar el Intro, de ahí el warning del Eclipse.
	 */
	public void imprimeIntro () {
		System.out.println();
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
		Leer.datoChar();
		
		Utiles.limpiaPantalla();
	}
	
	/**
	 * Selecciona los elementos que formarán las parejas, según la temática elegida por el usuario
	 * @param n Número de colección, según el menú mostrado.
	 * @return
	 */
	public Coleccion configuraColeccion (int n) {
		
		String listElementos [] = new String [18];
		String coleNombres [] = {"Hugo", "Daniel", "Pablo", "Álvaro", "Mario", "Lucas", "Carlos", "Andrés", "Sergio", 
				"Paula", "Sara", "Macarena", "Julia", "Alba", "Marta", "Elena", "Inés", "Enma"}; 
		String coleEuropa [] = {"España", "Italia", "Francia", "Holanda", "Alemania", "Austria", "Eslovenia", "Portugal",  
				"Croacia", "Rusia", "Bélgica", "Noruega", "Dinamarca", "Finlandia", "Suiza", "Suecia", "Eslovaquia", "Malta"};
		String coleEstrellas [] = {"Altair", "Sirrah", "Sirius", "Vega", "Deneb", "Canopus", "Rigel", "Polaris",  
				"Pollux", "Eltanin", "Procyon", "Capella", "Acrux", "Mirfak", "Alrescha", "Atria", "Spica", "Sol"};
		String coleFlores [] = {"Amapola", "Anémona", "Azucena", "Begonia", "Caléndula", "Camelia", "Alhelí", "Violeta",  
				"Girasol", "Clavel", "Geranio", "Rosa", "Cala", "Margarita", "Dalia", "Petunia", "Nardo", "Jacinto"};
		String coleMinerales [] = {"Azurita", "Cobre", "Cuarzo", "Diamante", "Dolomita", "Bauxita", "Apatito", "Corindón",  
				"Berilo", "Mica", "Calcita", "Apatito", "Malaquita", "Pirita", "Fluorita", "Galena", "Feldespato", "Yeso"};

		while (n<6 && n>0) {   
			switch (n) {
			case 1:
				listElementos = coleNombres;
				n = 0;
				break;
			case 2:
				listElementos = coleEuropa;
				n = 0;
				break;
			case 3:
				listElementos = coleEstrellas;
				n = 0;
				break;
			case 4:
				listElementos = coleFlores;
				n = 0;
				break;
			case 5:
				listElementos = coleMinerales;
				n = 0;
				break;
			default:
				System.out.println("\nNúmero de colección incorrecto. Por favor, introduzca un número entre 1 y 5: ");
				n = Leer.datoInt();
			}
		}	
		Coleccion colEscogida = new Coleccion (listElementos);
		return colEscogida;
	}
	
	/**
	 * Guarda en un objeto de tipo Coleccion únicamente las cartas que serán utilizadas en el juego, descartando las demás de la temática, dependiendo del nivel y de la temática elegida por el usuario.
	 * @param nivel El nivel de juego, que determina el número de cartas necesarias
	 * @param colEscogida El conjunto de todas las cartas de la temática elegida.
	 * @return Las cartas que serán usadas.
	 */
	public Coleccion generaParejas (int nivel, Coleccion colEscogida) {
		int numParejas = altos[nivel-1] * anchos[nivel-1] / 2;
		String [] utilizadas = new String[numParejas];
		
		for (int i = 0; i < utilizadas.length; i++) {
			utilizadas[i] = colEscogida.getParejas(i);
		}
		
		Coleccion parejas = new Coleccion (utilizadas);
		return parejas;
	}
	
	/**
	 * Solicita el nivel de juego (tamaño del tablero). Comprueba si es correcto con el método <b>compruebaNivel</b>
	 * @return Un entero, donde se guarda el número de nivel
	 */
	public int seleccionaNivel () {
		int nivel = 0;
		boolean comprobado = false;
		
		Utiles.repiteCadena("# ", 71, true);
		System.out.println("#                                                                                                                                           #");
		System.out.println("#      Por favor, seleccione el nivel de juego:                                                                                             #");
		System.out.println("#                                                                                                                                           #");
		while (!comprobado) {
			System.out.println("#        1 - Nivel fácil (tablero de 4x4)                                                                                                   #\n"
					 + "#        2 - Nivel normal (tablero de 4x6)                                                                                                  #\n"
					 + "#        3 - Nivel difícil (tablero de 5x6)                                                                                                 #\n"
					 + "#        4 - Nivel muy difícil (tablero de 6x6)                                                                                             #");			 
			System.out.println("#                                                                                                                                           #");
			Utiles.repiteCadena("# ", 71, true);
			System.out.print("\n - Nivel: ");
			nivel = Leer.datoInt();
			System.out.println();
			comprobado = compruebaNivel(nivel);
		}
		return nivel;
	}
	
	/**
	 * Solicita la temática que tendrán las cartas del juego. Comprueba si la elección es válida con el método <b>compruebaColeccion</b>
	 * @return Un entero que guarda el número de temática.
	 */
	public int seleccionaColeccion () {
		int numColeccion = 0;
		boolean comprobado = false;
		
		Utiles.repiteCadena("# ", 71, true);
		System.out.println("#                                                                                                                                           #");
		System.out.println("#      Por favor, seleccione la colección a usar:                                                                                           #");
		System.out.println("#                                                                                                                                           #");
		while (!comprobado) {
			System.out.println("#        1 - Nombres propios de persona                                                                                                     #\n"
					+ "#        2 - Países de Europa                                                                                                               #\n"
					+ "#        3 - Estrellas del firmamento                                                                                                       #\n"
					+ "#        4 - Nombres de flores                                                                                                              #\n"
					+ "#        5 - Nombres de Minerales                                                                                                           #");		 
			System.out.println("#                                                                                                                                           #");
			Utiles.repiteCadena("# ", 71, true);
			System.out.print("\n - Colección: ");
			numColeccion = Leer.datoInt();
			System.out.println();
			comprobado = compruebaColeccion(numColeccion);
		}
		configuraColeccion(numColeccion);
		return numColeccion;
	}
	
	/**
	 * Verifica que el nivel introducido es un nivel válido.
	 * @param nivel El nivel introducido
	 * @return Un booleano, que dice si el nivel es válido o no.
	 */
	public boolean compruebaNivel (int nivel) {
		boolean comprobado = (nivel > 0 && nivel < 5) ? true : false;
		if (!comprobado) {
			System.out.println("\nNivel introducido no válido. Por favor escoja uno correcto.\n");
		}
		return comprobado;
	}
	
	/**
	 * Verifica que la temática introducida es un número de temática válido, según el menú mostrado.
	 * @param nivel El número de temática introducido
	 * @return Un booleano, que dice si el número es válido o no.
	 */
	public boolean compruebaColeccion (int numColeccion) {
		boolean comprobado = (numColeccion > 0 && numColeccion < 6) ? true : false;
		if (!comprobado) {
			System.out.println("\nNúmero de colección no válido. Por favor escoja uno correcto.\n");
		}
		return comprobado;
	}
	
	
	public Coleccion [] preparaParejas (int nivel) {
		Coleccion [] misColecciones = new Coleccion [2];
		Coleccion cole = configuraColeccion(seleccionaColeccion());
		cole.desordenar();
		Coleccion coleRepe = generaParejas(nivel, cole);
		coleRepe.desordenar();
		misColecciones[0] = cole;
		misColecciones[1] = coleRepe;
		return misColecciones;
	}
	
	
	/**
	 * Crea un Array de tipo Jugador con los dos jugadores que participarán, solicitando sus nombres.
	 * @return
	 */
	public Jugador[] creaJugadores () {
		Jugador [] jugadores = new Jugador[2];
		String [] nombre = new String [2];
		boolean comprobado = false, iguales = false;
			
		do {
			for (int i = 0; i < jugadores.length; i++) {
				do {
					System.out.print("\n - Por favor, introduzca el nombre del jugador "+(i+1)+": ");
					nombre[i] = Leer.dato();
					comprobado = comprobarNombre (nombre[i]);
				} while (!comprobado);
			}
			iguales = comprobarIguales (nombre);
		} while (iguales);
		
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i] = new Jugador (nombre[i]);
		}
		
		return jugadores;
	}
	
	public boolean comprobarNombre (String nombre) {
		boolean comprobado = true;
		if (nombre.length() > 30) {
			comprobado = false;
			System.out.println("\n - El nombre del jugador no puede tener más de 30 caracteres de largo.");
		} else if (nombre.length() == 0){
			comprobado = false;
			System.out.println("\n - El nombre del jugador no puede estar vacío.");
		}
		return comprobado;
	}
	
	public boolean comprobarIguales (String [] nombres) {
		boolean comprobado = false;
		if (nombres[0].equals(nombres[1])) {
			comprobado = true;
			System.out.println("\nLos dos jugadores no pueden tener el mismo nombre.");
		}
		return comprobado;
	}
	
	/**
	 * Sortea quién empieza a abrir casillas en el tablero.
	 * @param jugadores Los participantes en el juego, necesario para mostrar el nombre del ganador del sorteo.
	 * @return Un string, con el nombre del participante que empieza.
	 */
	public String sorteoInicial (Jugador [] jugadores) {
		String turno = (Math.random() > 0.5) ? jugadores[0].getNombre() : jugadores[1].getNombre();
		
		if (turno.equals(jugadores[0].getNombre())) {
			System.out.println("\nComienza jugando "+jugadores[0].getNombre()+". ¡Buena Suerte!\n");
		}
		else {
			System.out.println("\nComienza jugando "+jugadores[1].getNombre()+". ¡Buena Suerte!\n");
		}
		System.out.print("\n - Pulsa INTRO para continuar: ");
		
		Utiles.limpiaPantalla();
		return turno;
	}
	
	/**
	 * Solicita al jugador que tiene el turno que indique qué casilla desea abrir. Comprueba con el método <b>comprobarCoordenadas</b> si la casilla escogida es válida.
	 * @param turno Un String con el nombre del jugador al que le toca
	 * @param jugada Un entero, que vale 1 si es su primera casilla, o 2 si es la segunda que abre.
	 * @param coordenadas Un array de enteros, donde se van guardando las posiciones que determinan la casilla a abrir en el tablero. Los índices 0 y 1 corresponden a la fila y columna de la primera "tirada", y los índices 2 y 3 a los de la segunda.
	 * @param nivel El nivel del juego, que determina el tamaño del tablero y por tanto las coordenadas máximas.
	 * @return El array de coordenadas relleno.
	 */
	public int [] pideCoordenadas (String turno, int jugada, int [] coordenadas, int nivel) {
		boolean comprobado = false;
		
		while (!comprobado) {
			if (jugada == 1) {
				System.out.print("\n"+turno+", introduce la fila: ");
				coordenadas[0] = Leer.datoInt();
				System.out.print("\n"+turno+", introduce la columna: ");
				coordenadas[1] = Leer.datoInt();
			} else {
				System.out.print("\n"+turno+", introduce la segunda fila: ");
				coordenadas[2] = Leer.datoInt();
				System.out.print("\n"+turno+", introduce la segunda columna: ");
				coordenadas[3] = Leer.datoInt();
			}
			comprobado = comprobarCoordenadas (coordenadas, nivel, jugada);
		}	
		return coordenadas;
	}
	
	/**
	 * Comprueba que la casilla que el usuario decide abrir existe en el tablero.
	 * @param coordenadas Las coordenadas introducidas.
	 * @param nivel El nivel del tablero, que determina sus coordenadas máximas.
	 * @param jugada Indica si es la primera tirada o la segunda, para mirar las posiciones exactas en el array de coordenadas.
	 * @return Un booleano que indica si la casilla es válida o no.
	 */
	public boolean comprobarCoordenadas (int [] coordenadas, int nivel, int jugada) {
		boolean comprobado = true;
		if (jugada == 1) {
			if (coordenadas[0] > altos[nivel-1] || coordenadas[0] < 1)
				comprobado = false;
			if (coordenadas[1] > anchos[nivel-1] || coordenadas[1] < 1)
				comprobado = false;
		} else {
			if (coordenadas[2] > altos[nivel-1] || coordenadas[2] < 1)
				comprobado = false;
			if (coordenadas[3] > anchos[nivel-1] || coordenadas[3] < 1)
				comprobado = false;
		}
		if (!comprobado)
			System.out.println("\nLa fila o la columna introducida está fuera de los límites del tablero. Por favor, "
					+ "introduce una celda válida.");
		
		return comprobado;
	}
	
	/**
	 * Realiza las operaciones posteriores a la apertura de las dos casillas por parte de un jugador: Sumar o restar puntos, según si ha acertado o no las dos cartas iguales, comprobar si tras el acierto quedan parejas por abrir, y en caso de que el jugador haya fallado, pasar el turno al otro jugador.
	 * @param resultado Booleano que indica si se acertaron las dos cartas iguales o no.
	 * @param finalizado Booleano que indica si quedan parejas por abrir.
	 * @param turno El turno del jugador que ha abierto las casillas.
	 * @param jugadores Los participantes.
	 * @return Un String turno que indica a quién le va a tocar en la siguiente tirada.
	 */
	public String finalizaJugada (boolean resultado, boolean finalizado, String turno, Jugador [] jugadores) {
		if (resultado) {
			if (!finalizado) {
				System.out.println("\n¡¡¡ Muy bien !!! Continúa tu turno");
			}
			if (turno.equals(jugadores[0].getNombre()))
				jugadores[0].setPuntos(jugadores[0].getPuntos()+puntosAcierto);
			else
				jugadores[1].setPuntos(jugadores[1].getPuntos()+puntosAcierto);
		} else {
			System.out.println("\n¡¡¡ Mala suerte !!! Quizá a la próxima. Pierdes tu turno.");
					
			if (turno.equals(jugadores[0].getNombre())) {
				jugadores[0].setPuntos(jugadores[0].getPuntos()+puntosFallo);
			} else {
				jugadores[1].setPuntos(jugadores[1].getPuntos()+puntosFallo);
			}
			
			turno = (turno.equals(jugadores[0].getNombre())) ? jugadores[1].getNombre() : jugadores[0].getNombre();
		}
		return turno;
	}
	
	
	
	/**
	 * Muestra el marcador final, y quién es el ganador de la partida.
	 * @param jugadores
	 */
	public void devuelveGanador (Jugador [] jugadores) {
		
		System.out.println("\n\n\t **** Resultado Final: "+jugadores[0].getNombre()+" "+jugadores[0].getPuntos()+" puntos, "
														  +jugadores[1].getNombre()+" "+jugadores[1].getPuntos()+" puntos. **** \n");
		if (jugadores[0].getPuntos() > jugadores[1].getPuntos()) {
			System.out.println("\n - ¡¡¡El ganador es ........ "+jugadores[0].getNombre()+", con "+jugadores[0].getPuntos()+" puntos!!! ¡¡¡ Enhorabuena !!!");		
		} else if (jugadores[1].getPuntos() > jugadores[0].getPuntos()) {
			System.out.println("\n - ¡¡¡El ganador es ........ "+jugadores[1].getNombre()+", con "+jugadores[1].getPuntos()+" puntos!!! ¡¡¡ Enhorabuena !!!");		
		} else {
			System.out.println("\n - ¡Vaya, tenemos un empate! Habrá que jugar otra partida, ¿no? ;)");		
		}
	}
	
	/**
	 * Muestra el menú final, que pregunta al usuario si quiere volver a jugar, y si se repiten jugadores y / o si se acumulan los puntos conseguidos.
	 * @param jugadores Los participantes
	 * @return Un array de dos booleanos, que indican el primero si se desea volver a jugar, y el segundo si se desean acumular los puntos conseguidos.
	 */
	public boolean [] preguntarRepeticion (Jugador [] jugadores) {
		boolean [] repetida = {false, false};
		int repetir = 0;
		
		do {
			if (repetir < 0 || repetir > 3) {
				System.out.println("\nOpción incorrecta. Por favor, seleccione una opción del menú.\n");
			}
			System.out.print("\n - ¿Qué desea hacer ahora?\n\n"
					+ "\t1 - Jugar una partida nueva con los mismos jugadores\n"
					+ "\t2 - Jugar una partida con los mismos jugadores, pero acumulando los puntos\n"
					+ "\t3 - Jugar una partida con otros jugadores.\n\n"
					+ "\t0 - Salir del juego");
			System.out.print("\n - Opción: ");
			repetir = Leer.datoInt();
			
		} while (repetir < 0 || repetir > 3);
		
		switch (repetir) {
		case 1:
			repetida[0] = true;
			for (int i = 0; i < jugadores.length; i++) {
				jugadores[i].setPuntos(0);
			}
			break;
		case 2:
			repetida[0] = true;
			break;
		case 3:
			repetida[0] = true;
			repetida[1] = true;
			break;
		case 0:
			System.out.println("\n\n - ¡¡¡Gracias por jugar a nuestro juego!!!");	
		}
		return repetida;
	}

}
