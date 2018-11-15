public class Main {
    public static void main(String[] args) {
        Player bob = new Player("Bob","A guy named Bob",3,3,'@',1,10);
        Monster[] enemies = {new Monster("Your Mom","The strongest enemy you will ever face",5,5,'&',"A","B","C")};
        String[][] rooms = {
                {
                        "XXXXXXXXXXXXXXXXXX",
                        "X               #X",
                        "X              ##X",
                        "X       HHH   ###X",
                        "X       |HH  ####X",
                        "X       HHH #####X",
                        "X          ######X",
                        "X         #######X",
                        "X       #########X",
                        "X      ##########X",
                        "XXXXXXXXXXXXXXXXXX"
                },
                {
                        "      XXXXXXXX",
                        "      X      X",
                        "      X      X",
                        "      X      X",
                        "      X      X",
                        "      X      X",
                        "      X      X",
                        "      X      X",
                        "      X      X",
                        "      X      X",
                        "      XXXXXXXX"
                }
        };
        int room = 0;
        while (true) {
            String[] p = rooms[room];
        Place[][] places = new Place[p.length][p[0].length()];
            for (int i = 0; i < p.length; i++) {
                for (int i2 = 0; i2 < p[0].length(); i2++) {
                    if (p[i].substring(i2, i2 + 1).equals(" ")) {
                        places[i][i2] = new Place("Grass", "Soft grass.", i, i2, ' ');
                    }
                    if (p[i].substring(i2, i2 + 1).equals("X")) {
                        places[i][i2] = new Wall("Wall", "Stone wall.", i, i2, 'X');
                    }
                    if (p[i].substring(i2, i2 + 1).equals("H")) {
                        places[i][i2] = new Wall("House Wall", "House wall.", i, i2, 'H');
                    }
                    if (p[i].substring(i2, i2 + 1).equals("#")) {
                        places[i][i2] = new LongGrass("Long Grass", "Really soft grass.", i, i2, '#');
                    }
                    if (p[i].substring(i2, i2 + 1).equals("|")) {
                        places[i][i2] = new Door("House Door", "Door to house 1. Type anything to enter.", i, i2, '|');
                    }
                }
            }
            boolean breaker = false;
            String map = "";
            for (int i = 0; i < places.length; i++) {
                map += "\n";
                for (int i2 = 0; i2 < places[0].length; i2++) {
                    int a = -1;
                    for(int x = 0; x < enemies.length; x++){
                        {
                            if (enemies[x].getX() == i2 && enemies[x].getY() == i) {
                                a = x;
                            }
                            if (enemies[x].getX() == bob.getX() && enemies[x].getY() == bob.getY()) {
                                enemies[x].doThing();
                            }
                        }
                    }
                    if(a >= 0){
                        map += enemies[a].getImage();
                    }
                    else if(i == bob.getY() && i2 == bob.getX()){
                        map += bob.getImage();
                        int a2 = places[i][i2].doThing(bob,room);
                        if(a2 > -1){
                            room = a2;
                        }
                        if(i != bob.getY() || i2 != bob.getX()){
                            breaker = true;
                        }
                    }
                    else {
                        map += places[i][i2].getImage();
                    }
                }
            }
            if(!breaker) {
                System.out.println(map);
                bob.input();
                for(int i = 0; i < 100; i++){
                    System.out.println();
                }
            }
        }
    }
}