
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] tablero = new String [4][4];
		
		tablero [0][0] = "    ivYi     .rvv:   \n"
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
		
		tablero [0][1] = "         i@L         \n"
			           + "        7@B@u        \n"
			           + "       X@BMM@O       \n"
			           + "      B@MOGOO@B,     \n"
			           + "    iB@OOG8ZOO@BL    \n"
			           + "   1B@O8GOGOZ88BBG   \n"
			           + "  ZBBOO8MOMOMOO8MB@  \n"
			           + " :B@OOO@B@M@M@OOOBBj \n"
			           + " .@@@B@B :@Y k@@BB@7 \n"
			           + "  r@B@B  .Bv  E@B@u  \n"
			           + "         B@B         \n"
			           + "        .7:r,        ";
		
		tablero [0][2] = "          7.         \n"
			           + "         2BMi        \n"
			           + "       .E0FSMJ       \n"
			           + "      rMk2u228P.     \n"
			           + "     5O11uUu2Uq8i    \n"
			           + "   rOZ12uUuUuUUXMX   \n"
			           + "   j@P1uUuUu2u21MM,  \n"
			           + "    .G0FuUuUu1FML    \n"
			           + "      28kUUu5q8:     \n"
			           + "       ;8q2FZX       \n"
			           + "        .PMML        \n"
			           + "          Ui         ";
		
		tablero [0][3] = "         ...         \n"
			           + "       0@B@B@M.      \n"
			           + "      M@@BMBB@B      \n"
			           + "      kB@OO8BB@      \n"
			           + "       rB@8BBU       \n"
			           + "  uOMXi  1@Z  ,FMMX  \n"
			           + " @B@B@B@08MOX@B@@@@@ \n"
			           + ":@@OOOMB@BMB@@MOO8BBF\n"
			           + ".@BBM@B@UuBP7@@@MBB@7\n"
			           + " r@B@BM.  @,  qB@B@2 \n"
			           + "         ;BF     .   \n"
			           + "        .@@B:        ";
		
		tablero [1][0] = tablero [0][2];
		tablero [1][1] = tablero [0][1];
		tablero [1][2] = tablero [0][3];
		tablero [1][3] = tablero [0][1];
		tablero [2][0] = tablero [0][2];
		tablero [2][1] = tablero [0][3];
		tablero [2][2] = tablero [0][2];
		tablero [2][3] = tablero [0][1];
		tablero [3][0] = tablero [0][3];
		tablero [3][1] = tablero [0][2];
		tablero [3][2] = tablero [0][1];
		tablero [3][3] = tablero [0][3];
		
		System.out.println(" ");
		
		for (int x=0; x < tablero.length; x++) {
			 // System.out.print("|");
			  for (int y=0; y < tablero[x].length; y++) {
			    System.out.print (tablero[x][y]);
			    if (y!=tablero[x].length-1) System.out.print("\t");
			  }
			 // System.out.println("|");
			}
		
		
		
		
	}

}
