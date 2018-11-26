public class Main {
    public static void main(String[] args) {
        Player bob = new Player("Bob","A guy named Bob",3,3,'@',0,1,10,10);
        String[] professorsWords = {"Oh, hello there. I seem to have forgotten your name.",
                "inputName",
                "Nice to meet you.",
                "Welcome to the amazing world of pokeymon.",
                "In this world there live strange creatures known as pokeymon.",
                "These creatures can be caught and trained to be used in battles.",
                "On your journey you will capture pokeymon and use them to become the greatest pokeymon trainer ever!",
                "givePokeymon",
                "Ah, good choice.",
                "I think that your mother has some things that she would like to say to you before you leave."
        };
        String[] momsWords = {
                "Hey Son, Professor Monitor is looking for you. I think he's inside the house."
        };
        //new Monster("Your Mom","The strongest enemy you will ever face",5,5,'&',0,"A","B","C"),
        Entity[] people = {
                new NPC("Professor Monitor","A nice man who helps you.",10,5,'P',1,

   "                        ;;\\\\/;;;;;;;;\n" +
        "                   ;;;;;;;;;;;;;;;;;\n"  +
        "                ;;;;;;;;;;;;     ;;;;;\n" +
        "               ;;;;;    ;;;         \\;;\n" +
        "              ;;;;      ;;          |;\n" +
        "             ;;;;         ;          |\n" +
        "             ;;;                     |\n" +
        "              ;;                     )\n" +
        "               \\    ~~~~ ~~~~~~~    /\n" +
        "                \\    ~~~~~~~  ~~   /\n" +
        "              |\\ \\                / /|\n" +
        "               \\\\| %%%%%    %%%%% |//\n" +
        "              [[====================]]\n" +
        "               | |  ^          ^  |\n" +
        "               | | :@: |/  \\| :@: | |\n" +
        "                \\______/\\  /\\______/\n" +
        "                  |     (@\\/@)     |\n" +
        "                 /                  \\\n" +
        "                /  ;-----\\  ______;  \\\n" +
        "                \\         \\/         /\n" +
        "                 )                  (\n" +
        "                /                    \\\n" +
        "                \\__                  /\n" +
        "                 \\_                _/\n" +
        "                  \\______/\\/\\______/\n" +
        "                    _|    /--\\    |_\n" +
        "                   /%%\\  /\"'\"'\\  /%%\\\n" +
        "     _____________/%%%%\\/\\'\"'\"/\\/%%%%\\______________\n" +
        "    / :  :  :  /  .\\%%%%%%%\"'/%%%%%%%/.  \\  :  :  : \\\n" +
        "   )  :  :  :  \\.  .\\%%%%%%/'\"\\%%%%%%/.  ./  :  :  :  (",professorsWords),
        new NPC("Mom","mom",5,5,'M',0,
"                 ,     ,  ._  ,\n" +
"                _.MMmm.mMm_Mm.MMm_:mMMmmm.._  .\n" +
"           _ .-mmMMMMMMMMMMMMm:MMm:MMMMMMMMMm._\n" +
"            `-.mm.MMMMMMM:MMMMMMMmmMMMMMMMMMmm._\n" +
"         _.mMMMMMmMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\"~.\n" +
"          .MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm._\n" +
"         _.MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm._\n" +
"      ..mMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMmmm.\n" +
"     _.mmMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm.\n" +
"      _.MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm_\n" +
"  .mmMMMMMMMMMMMMMMMMMMMMMMMM' `MMMMMMMMMMMMMMMMMMMMMMm,\n" +
" _.-' _.mMMMMMMMMMMMMMMMMMMM'      `MMMMMMMMMMMMMMMM\"\"`\n" +
"  _,MMMmMMMMMMMMMMMMMMMM'            `MMMMMMMMMMMMMMmm.\n" +
"    _.-'MMMMMMMMMMMMMMM.'\"\"`.    ,'\"\"`.MMMMMMMMMMMMMMMM.\n" +
"   .mmMMMMMMMMMMMMMMMM' <(o)>`  '<(o)>` MMMMMMMMMMMMMMMm.\n" +
"      .MMMMMMMMMMMMMMM                 'MMMMMMMMMMMMMMM:\n" +
"   ,MMMmMMMMMMMMMMMMM'                 `MMMMMMMMMMMMmm.\n" +
"  ,ME:MMMMMMMMMMMMMM_6       -  -       7_MMMMMMMMM:Mm_\n" +
"  !M:MmmMMMMMMMMMMMMML_                _JMMMMMMMMMm:MMm.\n" +
"  '':mMMMMMMMMMMMMMMMM\\     ______     /dMMMMMMMMMMM:'Mm.\n" +
"   ':MMM:MMMMMMMMMMMMMM\\    `.__.'    /MMMMMM:MMMMMMm: `\n" +
"  .M:MMM:MMMMMMMMMMMMMMM`.          ,'MMMMMMM:MMMMMMMm\n" +
"    .Mm:mMMMMMMMMMMMMMMM| `.      .' |MMMMMMm:.MMMMM.\n" +
"   .Mm:mMMMMMMMMMMMMMMMM|   `----':: |MMMMMMMmm`MMMMMm.\n" +
"     !:mMMMMMMMMMMMMMMMM|      ::::. |MMMMMMMMMMM``mMm.\n" +
"       !MMMMMMMMM'MMMMMM|      .:::. |MMMMMMMMMMMMM.._\n" +
"       MMMMMMMMM'MMMM'M/       ::::'  \\MMMMMMMMMMMMMMm,\n" +
"      .mMMMMMMM'MMMM'MMm.       '     .`\".MMMMMMMMMMMMm.\n" +
"       !!JmMMM'MMM' `M:.      ,  ,     .. M.\".MMMMMMMMm.\n" +
"        FMMMMMm.`M   M..              .. `Mm   `\"\".MMMmm.\n" +
"        MMMM'    M      ..           ..    `M      MM`.M!\n" +
"        Mm'               ..        ..      M      M'   \\\n" +
"        /                                                \\\n",momsWords)
        };
        String[][] rooms = {
                {
                        "XXXXXXXXXXXXXXXXXX",
                        "X                X",
                        "X                X",
                        "X       HHH      X",
                        "X       |HH      X",
                        "X       HHH      X",
                        "X                X",
                        "X               #X",
                        "X             ###X",
                        "X          ######X",
                        "XXXXXXXXXXXXXXXXXX"
                },
                {
                        "               ",
                        "       HHHHHHHH",
                        "       H      H",
                        "       H      H",
                        "       |      H",
                        "       H      H",
                        "       H      H",
                        "       HHHHHHHH",

                }
        };
        while (true) {
            String[] p = rooms[bob.getRoom()];
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
                        places[i][i2] = new Door("Door", "You found a door. Type anything to enter.", i, i2, '|');
                    }
                }
            }
            boolean breaker = false;
            String map = "";
            for (int i = 0; i < places.length; i++) {
                map += "\n";
                for (int i2 = 0; i2 < places[0].length; i2++) {
                    int a = -1;
                    for(int x = 0; x < people.length; x++){
                        {
                            if (people[x].getX() == i2 && people[x].getY() == i && people[x].getRoom() == bob.getRoom()) {
                                a = x;
                            }
                            if (people[x].getX() == bob.getX() && people[x].getY() == bob.getY() && people[x].getRoom() == bob.getRoom()) {
                                people[x].doThing(bob);
                            }
                        }
                    }
                    if(a >= 0){
                        map += people[a].getImage();
                    }
                    else if(i == bob.getY() && i2 == bob.getX()){
                        map += bob.getImage();
                        int a2 = places[i][i2].doThing(bob,bob.getRoom());
                        if(a2 > -1){
                            bob.setRoom(a2);
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
                for(int i = 0; i < 50; i++){
                    System.out.println();
                }
            }
        }
    }
}
