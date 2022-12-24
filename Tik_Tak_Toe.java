package mini_project_01;

import java.util.Scanner;

public class Tik_Tak_Toe {
	
	public static void main(String[] args) {
		System.out.println("- Tik_Tak_Toe -");
		System.out.println();
		System.out.println(" 1 | 2 | 3");
		System.out.println("--- --- ---");
		System.out.println(" 4 | 5 | 6 ");
		System.out.println("--- --- ---");
		System.out.println(" 7 | 8 | 9 ");
		System.out.println();
		System.out.println("Enter the number to play.");
		System.out.println();
		System.out.println("Example :");
		System.out.println("Enter the number : 5");
		System.out.println();
		System.out.println("_|_|_");
		System.out.println("_|X|_");
		System.out.println(" | | ");
		
		System.out.println();
	
	char Game_Board [][] = {{'_','|','_','|','_'},
							{'_','|','_','|','_'},
							{' ','|',' ','|',' '},
							};
	
	while(true) {
		
	Scanner sc = new Scanner (System.in);
	System.out.println("Player 1 : Enter the number. ");
	int input1 = sc.nextInt();
	
	System.out.println();
	
	switch(input1) {
	
	case 1:
		Game_Board[0][0] = 'X';
		break;
		
	case 2:
		Game_Board[0][2] = 'X';
		break;
		
	case 3:
		Game_Board[0][4] = 'X';
		break;
		
	case 4:
		Game_Board[1][0] = 'X';
		break;
		
	case 5:
		Game_Board[1][2] = 'X';
		break;
		
	case 6:
		Game_Board[1][4] = 'X';
		break;
		
	case 7:
		Game_Board[2][0] = 'X';
		break;
		
	case 8:
		Game_Board[2][2] = 'X';
		break;
		
	case 9:
		Game_Board[2][4] = 'X';
		break;
	}
	
	if(input1>9) {
		System.out.println("Error");
		System.exit(input1);
	}
	
	for (int row=0;row<Game_Board.length;row++) {
		for(int col=0;col<Game_Board[row].length;col++) {
			System.out.print(Game_Board[row][col]);
		} 		
		System.out.println();
	}
	System.out.println();
	
	if(Game_Board[0][0]== 'X') {
		if(Game_Board[0][2] == 'X') {
			if(Game_Board[0][4] == 'X') {
				System.out.println("Congratulations Player 1 wins.");
				System.exit(input1);
			}
		}	
	}
	 if(Game_Board[1][0]== 'X') {
			if(Game_Board[1][2] == 'X') {
				if(Game_Board[1][4] == 'X') {
				System.out.println("Congratulations Player 1 wins.");
				System.exit(input1);
			}
		}	
	}
	 if(Game_Board[2][0]== 'X') {
			if(Game_Board[2][2] == 'X') {
				if(Game_Board[2][4] == 'X') {
					System.out.println("Congratulations Player 1 wins.");
					System.exit(input1);
			}
		}	
	}
	 if(Game_Board[0][0]== 'X') {
			if(Game_Board[1][0] == 'X') {
				if(Game_Board[2][0] == 'X') {
				System.out.println("Congratulations Player 1 wins.");
				System.exit(input1);
			}
		}	
	}
	 if(Game_Board[0][2]== 'X') {
			if(Game_Board[1][2] == 'X') {
				if(Game_Board[2][2] == 'X') {
				System.out.println("Congratulations Player 1 wins.");
				System.exit(input1);
			}
		}	
	}
	 if(Game_Board[0][4]== 'X') {
			if(Game_Board[1][4] == 'X') {
				if(Game_Board[2][4] == 'X') {
				System.out.println("Congratulations Player 1 wins.");
				System.exit(input1);
			}
		}	
	}
	 if(Game_Board[0][0]== 'X') {
			if(Game_Board[1][2] == 'X') {
				if(Game_Board[2][4] == 'X') {
				System.out.println("Congratulations Player 1 wins.");
				System.exit(input1);
			}
		}
	}
	 if(Game_Board[0][4]== 'X') {
			if(Game_Board[1][2] == 'X') {
				if(Game_Board[2][0] == 'X') {
				System.out.println("Congratulations Player 1 wins.");
				System.exit(input1);
			}
		}	
	}	
	 
	 int count=0;
		for(int i=0;i<Game_Board.length;i++) {
			for(int j=0;j<Game_Board.length;j++) {
				if(Game_Board[i][j]=='X' || Game_Board[i][j]=='O') {
					count++;
				}
			}
		}
		System.out.println(count);
		if(count==6) {
			System.out.println();
			System.out.println("no one wins");
			System.out.println("Thanks for Playing :)");
			count++;
			System.exit(0);
		}
	
	System.out.println("Player 2 : Enter the number. ");
	int input2 = sc.nextInt();
	System.out.println();
	switch(input2) {
		
		case 1:
			Game_Board[0][0] = 'O';
			break;
			
		case 2:
			Game_Board[0][2] = 'O';
			break;
			
		case 3:
			Game_Board[0][4] = 'O';
			break;
			
		case 4:
			Game_Board[1][0] = 'O';
			break;
			
		case 5:
			Game_Board[1][2] = 'O';
			break;
			
		case 6:
			Game_Board[1][4] = 'O';
			break;
			
		case 7:
			Game_Board[2][0] = 'O';
			break;
			
		case 8:
			Game_Board[2][2] = 'O';
			break;
			
		case 9:
			Game_Board[2][4] = 'O';
			break;
		}
	
	if(input1 == input2) {
		System.out.println("Place is already full.");
		System.out.println("Please restart the game.");
		System.exit(input2);
	}
	if(input2>9) {
		System.out.println("Error");
		System.exit(input2);
	}
	
	
	for (int row=0;row<Game_Board.length;row++) {
		for(int col=0;col<Game_Board[row].length;col++) {
			System.out.print(Game_Board[row][col]);
		} 		
		System.out.println();
		}
		System.out.println();
	
		if(Game_Board[0][0]== 'O') {
			if(Game_Board[0][2] == 'O') {
				if(Game_Board[0][4] == 'O') {
					System.out.println("Congratulations Player 2 wins.");
					System.exit(input2);
				}
			}	
		}
		 if(Game_Board[1][0]== 'O') {
				if(Game_Board[1][2] == 'O') {
					if(Game_Board[1][4] == 'O') {
					System.out.println("Congratulations Player 2 wins.");
					System.exit(input2);
				}
			}	
		}
		 if(Game_Board[2][0]== 'O') {
				if(Game_Board[2][2] == 'O') {
					if(Game_Board[2][4] == 'O') {
						System.out.println("Congratulations Player 2 wins.");
						System.exit(input2);
				}
			}	
		}
		 if(Game_Board[0][0]== 'O') {
				if(Game_Board[1][0] == 'O') {
					if(Game_Board[2][0] == 'O') {
					System.out.println("Congratulations Player 2 wins.");
					System.exit(input2);
				}
			}	
		}
		 if(Game_Board[0][2]== 'O') {
				if(Game_Board[1][2] == 'O') {
					if(Game_Board[2][2] == 'O') {
					System.out.println("Congratulations Player 2 wins.");
					System.exit(input2);
				}
			}	
		}
		 if(Game_Board[0][4]== 'O') {
				if(Game_Board[1][4] == 'O') {
					if(Game_Board[2][4] == 'O') {
					System.out.println("Congratulations Player 2 wins.");
					System.exit(input2);
				}
			}	
		}
		 if(Game_Board[0][0]== 'O') {
				if(Game_Board[1][2] == 'O') {
					if(Game_Board[2][4] == 'O') {
					System.out.println("Congratulations Player 2 wins.");
					System.exit(input2);
				}
			}
		}
		 if(Game_Board[0][4]== 'O') {
				if(Game_Board[1][2] == 'O') {
					if(Game_Board[2][0] == 'O') {
					System.out.println("Congratulations Player 2 wins.");
					System.exit(input2);
				}
			}	
		}
		
		
		 
		}	
	}
}
