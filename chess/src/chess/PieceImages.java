package chess;

import java.awt.Color;
import java.nio.file.Path;

import javax.swing.ImageIcon;

public class PieceImages {
	static Color WHITECOLOR = Color.WHITE;
	static Color BLACKCOLOR = Color.BLACK;
	static String PAWN = "♟";
	static String ROOK = "♜";
	static String KNIGHT = "♞";
	static String BISHOP = "♝";
	static String QUEEN = "♛";
	static String KING = "♚";

	static ImageIcon wk;
	static ImageIcon bk;
	static ImageIcon wr;
	static ImageIcon br;
	static ImageIcon wq;
	static ImageIcon bq;
	static ImageIcon wb;
	static ImageIcon bb;
	static ImageIcon wn;
	static ImageIcon bn;
	static ImageIcon wp;
	static ImageIcon bp;

	public PieceImages() {
		wk = new ImageIcon("../resources/images/wk.png");
		bk = new ImageIcon("../resources/images/bk.png");
		wr = new ImageIcon("../resources/images/wr.png");
		br = new ImageIcon("../resources/images/br.png");
		wq = new ImageIcon("../resources/images/wq.png");
		bq = new ImageIcon("../resources/images/bq.png");
		wb = new ImageIcon("../resources/images/wb.png");
		bb = new ImageIcon("../resources/images/bb.png");
		wn = new ImageIcon("../resources/images/wn.png");
		bn = new ImageIcon("../resources/images/bn.png");
		wp = new ImageIcon("../resources/images/wp.png");
		bp = new ImageIcon("../resources/images/bp.png");
	}
}
