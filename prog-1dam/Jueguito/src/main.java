
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String array1  = 		"    ivYi     .rvv:   \n"
			      + "  :MOG0OMr  vB8ZEM8. \n"
			      + "  GE5U22XG ,MF1u12OS \n"
			      + "  0022u2UFXq22uUu1Ek \n"
			      + "  iMSU2uUu1U2uUu2SB, \n"
			      + "   vOSuUuUuuuUu1SMi  \n"
			      + "    i8q22u2uUu1qO,   \n"
			      + "     .NG22uUU5ZX     \n"
			      + "       uO52UkOL      \n"
			      + "        rMkqOi       \n"
			      + "         :@8.        \n"
			      + "          ,.         ";

		String array2 = array1;
		String array3 = array1;
		String array4 = array1;
		String array5 = array1;
		String array6 = array1;
		String array7 = array1;
		String array8 = array1;
		String array9 = array1;
		String array10 = array1;
		String array11 = array1;
		String array12 = array1;
		

		String [][] tablero = {{array1, array2, array3, array4}, {array5,
	                              array6, array7, array8}, {array9, array10,
	                              array11, array12}};


		for (int x=0; x < tablero.length; x++) {
			
			System.out.println("\n");
			for (int y=0; y < tablero[x].length; y++) {
				
				System.out.print(tablero[x][y]);
	  
				  
				if (y!=tablero[x].length-1) System.out.print("\t");
			}

		}



		
		
	}

}
