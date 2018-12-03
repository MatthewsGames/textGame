public class Main {
    public static void main(String[] args) {
        Player bob = new Player("Bob","A guy named Bob",3,12,'@',0,1,10,10);
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
        String[] momsWords2 = {
                "Wow, Good battle son. You're a natural!"
        };
        int[] momsPokeymon = {1,2,3};
        String[] healersWords = {
                "I heard that your pokeymon are running out of health.",
                "healPokeymon",
                "There you go, I just healed them for you. They should be better now.",
                "Come back in to see me whenever your pokeymon faint."
        };
        //new Monster("Your Mom","The strongest enemy you will ever face",5,5,'&',0,"A","B","C"),
        Sign[] signs = {
            new Sign("Your House Sign","A sign", 7,14, '?',"This is your house."),
                new Sign("Healer Sign","A sign", 18,16, '?',"This where you can heal your pokeymon.")
        };
        Entity[] people = {
                new NPC("Professor Monitor","A nice man who helps you.",10,14,'P',1,

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
        "   )  :  :  :  \\.  .\\%%%%%%/'\"\\%%%%%%/.  ./  :  :  :  (",professorsWords,false),
        new NPC("Mom","mom",5,14,'M',0,
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
"        /                                                \\\n",momsWords,false),
                new NPC("Healer","She heals your pokeymon.",19,19,'%',2,
                        "                                   ____________\n" +
                        "                               _____/            \\_\n" +
                        "                    __________/  _/          _____ \\__\n" +
                        "        ______ ____/            /           /     \\___\\_\n" +
                        "      _/      \\____           _/          _/             \\_\n" +
                        "    _/             \\____     /          _/    ___          \\\n" +
                        "   /    _______         \\_   |         /  ___/_____-        |\n" +
                        "  /   _/       \\__        \\_ |       _/__/      \\_ \\__      |\n" +
                        " /  _/            \\______     \\     /_/           \\   \\     |\n" +
                        " |_/                _____\\__________/              \\        |\n" +
                        " /               __/  __/ _/                          \\_   /\n" +
                        " |           ___/    /  _/                              \\_ |\n" +
                        " |        __/  /    |  /                  ________   \\    \\|\n" +
                        " |                  | /                   \\XXXXXXXXxx_|    |\n" +
                        " |\\                 | |                               |     \\___\n" +
                        " | |          |     \\ |______                         |         \\_\n" +
                        " |  \\             ___||XXXXX/                ---_     |           \\\n" +
                        " |  |         | xxXXX//                     /___-///  |           |\n" +
                        "  \\ \\        /\\     |/                 /   |///OX\\\\\\  |           |\n" +
                        "  |  ||    _/  |        __---_         |   | \\\\XX///   \\___      \\|\n" +
                        "  \\ //   _/    |     \\\\\\xxxxx \\        |   |\\_\\---       \\ \\_      \\\n" +
                        "   |/  _/      |      | //OXX\\\\\\        \\                 \\  \\_     \\\n" +
                        "  _/ _/        /\\     | \\\\XXX///\\                         |\\   \\    |\n" +
                        " /__/         /  \\     \\_-----                            | \\   |   /\n" +
                        "|/ /              |                       \\               /  |   \\_/\n" +
                        "   |             /|                      _|              |  | __/\n" +
                        "  /             | |                  \\ -                 / _/_/\n" +
                        "  |           _/ _/                         _____       |/\n" +
                        "  | _       _/  /\\\\ \\               ________/ / |       /_\n" +
                        "  |/       /   /  \\_ \\_          __/_________/ /       /  \\______\n" +
                        "   \\      |   | \\_  \\- \\_          \\__________/      _/          \\\n" +
                        "    \\__   |              \\___                      _/\\_           |\n" +
                        "       \\__|\\_                \\___                _/|   \\         /\n" +
                        "          \\__\\_______________/   \\___         __/  |\\          \\/\n" +
                        "                       \\___  |       \\_______/     | \\___       |\n" +
                        "                        /  \\_|                     |   \\ \\_____/\n" +
                        "                _______|____/                       \\___\\__\n" ,healersWords,true),
                new Monster("Your Mom","Your Mom", 10, 12, 'M',1,"A","B","C",
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
                                "        /                                                \\\n", momsWords2, momsPokeymon)

        };
        String[][] rooms = {
                {
                        "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
                        "X                                X    HHHHHHHHHHHX",
                        "X                                X    H-HHHHHHHHHX",
                        "X                                X       |HHHHHHHX",
                        "X                                X        HHH-HHHX",
                        "X                                                X",
                        "X                                XXXXXXXXXXXXXXXXX",
                        "X                                                X",
                        "X                                                X",
                        "X                                 ######         X",
                        "X                                ########        X",
                        "X                                ########        X",
                        "X       HHH                       ######         X",
                        "X       |HH                                      X",
                        "X       HHH                                      X",
                        "X                                                X",
                        "XHHH-HH                                          X",
                        "XHHHHHH           H-H                            X",
                        "XHHHHHH           HHH                            X",
                        "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"
                },
                {
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "       HHHHHHHH",
                        "       H      H",
                        "       H      H",
                        "       |      H",
                        "       H      H",
                        "       H      H",
                        "       HHHHHHHH",

                },
                {
                        "                                                   ",
                        "                                                   ",
                        "                                                   ",
                        "                                                   ",
                        "                                                   ",
                        "                                                   ",
                        "                                                   ",
                        "                                                   ",
                        "                                                   ",
                        "                                                   ",
                        "                                                   ",
                        "                                                   ",
                        "                                                   ",
                        "                                                   ",
                        "                                                   ",
                        "                                                   ",
                        "             HHHHHH-HHHHHH                         ",
                        "             H           H                         ",
                        "             H           H                         ",
                        "             H           H                         ",
                        "             HHHHHHHHHHHHH                         ",
                        "                                                   ",

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
                    if (p[i].substring(i2, i2 + 1).equals("-")) {
                        places[i][i2] = new Door("Door", "You found a door. Type anything to enter.", i, i2, '-');
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
                                if(!people[x].isPermanent()) {
                                    people[x].setX(-500);
                                }
                            }
                        }
                    }
                    int b = -1;
                    int c = -1;
                    if(bob.getRoom() == 0) {
                        for (int x = 0; x < signs.length; x++) {
                            {
                                if (signs[x].getX() == i2 && signs[x].getY() == i) {
                                    b = x;
                                }
                                if (signs[x].getX() == bob.getX() && signs[x].getY() == bob.getY()) {
                                    c = x;
                                }
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
                        if(b > -1) {
                            signs[b].doThing(bob, 0);
                        }
                    }
                    else if(b >= 0){
                        map += signs[b].getImage();
                    }
                    else {
                        map += places[i][i2].getImage();
                    }
                }
            }
            for(Entity x: people){
                if(!x.isAlive()){
                    x.setX(-1);
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
