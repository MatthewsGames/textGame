public class Main {
    public static void main(String[] args) {
        Player bob = new Player("Bob","A guy named Bob",3,3,'@',1,10);
        Monster[] enemies = {new Monster("Your Mom","The strongest enemy you will ever face",5,5,'M',"A","B","C")};
        String[] p = {
                "XXXXXXXXXXXXXXXXXX",
                "X                X",
                "X                X",
                "X                X",
                "X                X",
                "X                X",
                "X                X",
                "X                X",
                "X                X",
                "X                X",
                "XXXXXXXXXXXXXXXXXX"
        };
        Place[][] places = new Place[p.length][p[0].length()];
        while (true) {
            for (int i = 0; i < p.length; i++) {
                for (int i2 = 0; i2 < p[0].length(); i2++) {
                    if (p[i].substring(i2, i2 + 1).equals(" ")) {
                        places[i][i2] = new Place("Grass", "Soft grass.", i, i2, ' ');
                    }
                    if (p[i].substring(i2, i2 + 1).equals("X")) {
                        places[i][i2] = new Place("Wall", "Stone wall.", i, i2, 'X');
                    }
                }
            }
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
                        places[i][i2].doThing();
                    }
                    else {
                        map += places[i][i2].getImage();
                    }
                }
            }
            System.out.println(map);
            bob.input();
        }
    }
}