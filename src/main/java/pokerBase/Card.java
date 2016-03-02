package pokerBase;

import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Card {
	
	private eSuit eSuit;
	private eRank eRank;
	private int iCardNbr;
	
	public Card(pokerEnums.eSuit eSuit, pokerEnums.eRank eRank, int iCardNbr){
		super(); 
		this.eSuit = eSuit;
		this.eRank = eRank;
		this.iCardNbr = iCardNbr;
	}
		public eSuit geteSuit() {
			return eSuit;
	}
		public eRank geteRank() {
			return eRank;
	}
		public int getiCardNbr() {
			return iCardNbr;
	}
	
	@Override
	public int compareTo(Object arg0) {
		return 0;
	}
}
