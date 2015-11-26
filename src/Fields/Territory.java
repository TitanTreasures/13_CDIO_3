package Fields;

import Fields.Ownable;
import Game.Account;

public class Territory extends Ownable{

	Account Account = new Account();
	private int rent;
	private int price;
	private int player;
	private int[] terArray = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	private int[] priceArray = {100,300,500,700,1000,1300,1600,2000,2600,3200};
	private int[] rentArray = {1000,1500,2000,3000,4000,4300,4750,5000,5500};
	private int playerPosition;
	private int whoOwns;
	private int fieldNumber;

	@Override
	public void landOnField(int IDOfPlayer){
		
		rent = 0;
		price = 0;
		player = 0;
		boolean isOwned = isTerOwned(IDOfPlayer, playerPosition);
		
		if (isOwned == true){
			rent = rentArray[fieldNumber];
			player = whoOwns;
			
			Account.setPlayerStash(IDOfPlayer, -rent);
			Account.setPlayerStash(whoOwns, rent);
		}
	}
	public void setPlayerPositionTer(int playerPositionMethod) {
		playerPosition = playerPositionMethod;
	}
	public boolean isTerOwned(int IDOfPlayer, int playerPosition){
		boolean isOwned = false;
		String[] fieldNames = GameBoard.getFieldNames();
		
		if (fieldNames[playerPosition-1] == "TER1") {
			if (terArray[0] == -1) {
				isOwned = false;
			} else if (terArray[0] >= 0) {
				isOwned = true;
				fieldNumber = 0;
				whoOwns = terArray[0];
			}
		} else if(fieldNames[playerPosition-1] == "TER2") {
			if (terArray[1] == -1) {
				isOwned = false;
			} else if (terArray[1] >= 0) {
				isOwned = true;
				fieldNumber = 1;
				whoOwns = terArray[1];
			}
		} else if(fieldNames[playerPosition-1] == "TER3") {
			if (terArray[2] == -1) {
				isOwned = false;
			} else if (terArray[2] >= 0) {
				isOwned = true;
				fieldNumber = 2;
				whoOwns = terArray[2];
			}
		} else if(fieldNames[playerPosition-1] == "TER4") {
			if (terArray[3] == -1) {
				isOwned = false;
			} else if (terArray[3] >= 0) {
				isOwned = true;
				fieldNumber = 3;
				whoOwns = terArray[3];
			}
		} else if(fieldNames[playerPosition-1] == "TER5") {
			if (terArray[4] == -1) {
				isOwned = false;
			} else if (terArray[4] >= 0) {
				isOwned = true;
				fieldNumber = 4;
				whoOwns = terArray[4];
			}
		} else if(fieldNames[playerPosition-1] == "TER6") {
			if (terArray[5] == -1) {
				isOwned = false;
			} else if (terArray[5] >= 0) {
				isOwned = true;
				fieldNumber = 5;
				whoOwns = terArray[5];
			}
		} else if(fieldNames[playerPosition-1] == "TER7") {
			if (terArray[6] == -1) {
				isOwned = false;
			} else if (terArray[6] >= 0) {
				isOwned = true;
				fieldNumber = 6;
				whoOwns = terArray[6];
			}
		} else if(fieldNames[playerPosition-1] == "TER8") {
			if (terArray[7] == -1) {
				isOwned = false;
			} else if (terArray[7] >= 0) {
				isOwned = true;
				fieldNumber = 7;
				whoOwns = terArray[7];
			}
		} else if(fieldNames[playerPosition-1] == "TER9") {
			if (terArray[8] == -1) {
				isOwned = false;
			} else if (terArray[8] >= 0) {
				isOwned = true;
				fieldNumber = 8;
				whoOwns = terArray[8];
			}
		} else if(fieldNames[playerPosition-1] == "TER10") {
			if (terArray[9] == -1) {
				isOwned = false;
			} else if (terArray[9] >= 0) {
				isOwned = true;
				fieldNumber = 9;
				whoOwns = terArray[9];
			}
		} else if(fieldNames[playerPosition-1] == "TER11") {
			if (terArray[10] == -1) {
				isOwned = false;
			} else if (terArray[10] >= 0) {
				isOwned = true;
				fieldNumber = 10;
				whoOwns = terArray[10];
			}
		}
		return isOwned;
	}
	
	@Override
	public int getRent() {
		return rent;
	}
	public int getPrice(){
		return price;
	}
	
	public void setOwner(int IDOfPlayer){
		
		
	}
}

