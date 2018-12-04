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
                "Wow, Good battle son. You're a natural!",
                "You should go find the pokeycenter. They'll heal your pokeymon there."
        };
        int[] momsPokeymon = {1,2,3};
        int[] guardsPokeymon = {20,20,20};
        int[] dextersPokeymon = {10,10,10};
        String[] healersWords = {
                "I heard that your pokeymon are running out of health.",
                "healPokeymon",
                "There you go, I just healed them for you. They should be better now.",
                "Come back in to see me whenever your pokeymon faint."
        };
        String[] guardsWords = {
                "Well, you beat me fair and square.",
                "Now you can go inside the arena and try to become the new champion!",
                "It's gonna be pretty hard though, the current champion is amazing.",
                "He's been the champion for 20 years!",
                "And he's only 16!"
        };
        String[] kid1sWords = {
                "This gym is really hard!",
                "You might wanna try gym 1 or 2 first."
        };
        String[] dextersWords = {
                "You wanna buy some drugs?",
                "Nah, you don't look like that's what you're here for.",
                "Do you wanna make a delivery for me?",
                "Let's battle to see if you're good enough to do it."
        };
        String[] kid2sWords = {
                "This gym is really hard!",
                "You might wanna try gym 1 first."
        };
        //new Monster("Your Mom","The strongest enemy you will ever face",5,5,'&',0,"A","B","C"),
        Sign[] signs = {
            new Sign("Your House Sign","A sign", 7,13, '?',"This is your house."),
                new Sign("Healer Sign","A sign", 9,16, '?',"This is where you can heal your pokeymon."),
                new Sign("Arena Wall Sign","A sign", 15,7, '?',"This is the wall that protects the Pokeymon Grand Champion Arena. To get inside you must battle and defeat the guard."),
                new Sign("Arena Wall Sign","A sign", 14,6, '?',"This is the wall that protects the Pokeymon Grand Champion Arena. To get inside you must battle and defeat the guard."),
                new Sign("Gym 3","A sign", 4,2, '?',"This is the third pokeymon gym."),
                new Sign("Gym 2","A sign", 4,17, '?',"This is the second pokeymon gym."),
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
                new NPC("Healer","She heals your pokeymon.",9,19,'%',2,
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
                new NPC("Kid","He's annoying.",4,2,'K',0,
                                "    XXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                                        "  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                                        " XXXXXXXXXXXXXXXXXX         XXXXXXXX\n" +
                                        "XXXXXXXXXXXXXX              XXXXXXX\n" +
                                        "XXXXXXXXXXX                   XXXXX\n" +
                                        " XXX     _________ _________     XXX    \n" +
                                        "  XX    I  _xxxxx I xxxxx_  I    XX      \n" +
                                        " ( X----I         I         I----X )         \n" +
                                        "( +I    I      00 I 00      I    I+ )\n" +
                                        " ( I    I    __0  I  0__    I    I )\n" +
                                        "  (I    I______ /   \\_______I    I)\n" +
                                        "   I           ( ___ )           I\n" +
                                        "   I    _  :::::::::::::::  _    i\n" +
                                        "    \\    \\___ ::::::::: ___/    /\n" +
                                        "     \\_      \\_________/      _/\n" +
                                        "       \\        \\___,        /\n" +
                                        "         \\                 /\n" +
                                        "          |\\             /|\n" +
                                        "          |  \\_________/  |\n" +
                                        "              \\___\\__\n" ,kid1sWords,false),
                new NPC("Dexter the drug dealer","He's a drug dealer.",2,9,'D',0,
                        "                      ____...                                  \n" +
                                "             .-\"--\"\"\"\".__    `.                                \n" +
                                "            |            `    |                                \n" +
                                "  (         `._....------.._.:          \n" +
                                "   )         .()''        ``().                                \n" +
                                "  '          () .=='  `===  `-.         \n" +
                                "   . )       (         g)                                \n" +
                                "    )         )     /        J          \n" +
                                "   (          |.   /      . (                                  \n" +
                                "   $$         (.  (_'.   , )|`                                 \n" +
                                "   ||         |\\`-....--'/  ' \\                                \n" +
                                "  /||.         \\\\ | | | /  /   \\.                              \n" +
                                " //||(\\         \\`-===-'  '     \\o.                            \n" +
                                ".//7' |)         `. --   / (     OObaaaad888b.                 \n" +
                                "(<<. / |     .a888b`.__.'d\\     OO888888888888a.               \n" +
                                " \\  Y' |    .8888888aaaa88POOOOOO888888888888888.              \n" +
                                "  \\  \\ |   .888888888888888888888888888888888888b              \n" +
                                "   |   |  .d88888P88888888888888888888888b8888888.             \n" +
                                "   b.--d .d88888P8888888888888888a:f888888|888888b             \n" +
                                "   88888b 888888|8888888888888888888888888\\8888888\n"  ,dextersWords,false),
                new Monster("Dexter the drug dealer","He's a drug dealer.",2,9,'D',0,"?","?","?",
                        "                      ____...                                  \n" +
                                "             .-\"--\"\"\"\".__    `.                                \n" +
                                "            |            `    |                                \n" +
                                "  (         `._....------.._.:          \n" +
                                "   )         .()''        ``().                                \n" +
                                "  '          () .=='  `===  `-.         \n" +
                                "   . )       (         g)                                \n" +
                                "    )         )     /        J          \n" +
                                "   (          |.   /      . (                                  \n" +
                                "   $$         (.  (_'.   , )|`                                 \n" +
                                "   ||         |\\`-....--'/  ' \\                                \n" +
                                "  /||.         \\\\ | | | /  /   \\.                              \n" +
                                " //||(\\         \\`-===-'  '     \\o.                            \n" +
                                ".//7' |)         `. --   / (     OObaaaad888b.                 \n" +
                                "(<<. / |     .a888b`.__.'d\\     OO888888888888a.               \n" +
                                " \\  Y' |    .8888888aaaa88POOOOOO888888888888888.              \n" +
                                "  \\  \\ |   .888888888888888888888888888888888888b              \n" +
                                "   |   |  .d88888P88888888888888888888888b8888888.             \n" +
                                "   b.--d .d88888P8888888888888888a:f888888|888888b             \n" +
                                "   88888b 888888|8888888888888888888888888\\8888888\n"  ,kid1sWords,dextersPokeymon),
                new NPC("Kid","He's annoying.",4,17,'K',0,
                        "    XXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                                "  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                                " XXXXXXXXXXXXXXXXXX         XXXXXXXX\n" +
                                "XXXXXXXXXXXXXX              XXXXXXX\n" +
                                "XXXXXXXXXXX                   XXXXX\n" +
                                " XXX     _________ _________     XXX    \n" +
                                "  XX    I  _xxxxx I xxxxx_  I    XX      \n" +
                                " ( X----I         I         I----X )         \n" +
                                "( +I    I      00 I 00      I    I+ )\n" +
                                " ( I    I    __0  I  0__    I    I )\n" +
                                "  (I    I______ /   \\_______I    I)\n" +
                                "   I           ( ___ )           I\n" +
                                "   I    _  :::::::::::::::  _    i\n" +
                                "    \\    \\___ ::::::::: ___/    /\n" +
                                "     \\_      \\_________/      _/\n" +
                                "       \\        \\___,        /\n" +
                                "         \\                 /\n" +
                                "          |\\             /|\n" +
                                "          |  \\_________/  |\n" +
                                "              \\___\\__\n" ,kid2sWords,false),
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
                                "        /                                                \\\n", momsWords2, momsPokeymon),
                new Monster("The Guard to the Pokeymon Champion Arena","He guards stuff", 15, 6, 'G',0,"!","?","$",
                        "                ,#####,\n"+
                                "                 #_   _#\n"+
                                "                 |a` `a|\n"+
                                "                 |  u  |\n"+
                                "                 \\  =  /\n"+
                                "                 |\\___/|\n"+
                                "        ___ ____/:     :\\____ ___\n"+
                                "      .'   `.-===-\\   /-===-.`   '.\n"+
                                "     /      .-\"\"\"\"\"-.-\"\"\"\"\"-.      \\\n"+
                                "    /'             =:=             '\\\n"+
                                "  .'  ' .:    o   -=:=-   o    :. '  `.\n"+
                                "  (.'   /'. '-.....-'-.....-' .'\\   '.)\n"+
                                "  /' ._/   \".     --:--     .\"   \\_. '\\\n"+
                                " |  .'|      \".  ---:---  .\"      |'.  |\n"+
                                " |  : |       |  ---:---  |       | :  |\n"+
                                "  \\ : |       |_____._____|       | : /\n"+
                                "  /   (       |----|------|       )   \\\n"+
                                " /... .|      |    |      |      |. ...\\\n"+
                                "|::::/''     /     |       \\     ''\\::::|\n"+
                                "'\"\"\"\"       /'    .L_      `\\       \"\"\"\"'\n"+
                                "           /'-.,__/` `\\__..-'\\\n"+
                                "          ;      /     \\      ;\n"+
                                "          :     /       \\     |\n"+
                                "          |    /         \\.   |\n"+
                                "          |`../           |  ,/\n"+
                                "          ( _ )           |  _)\n"+
                                "          |   |           |   |\n"+
                                "          |___|           \\___|\n"+
                                "          :===|            |==|\n"+
                                "           \\  /            |__|\n"+
                                "           /\\/\\           /\"\"\"`8.__\n"+
                                "           |oo|           \\__.//___)\n"+
                                "           |==|\n"+
                                "           \\__/\n", guardsWords, guardsPokeymon)

        };
        String[][] rooms = {
                {
                        "XXXXXXXXXXXXXXXXXXXXXXX",
                        "XHHH       X    HHHHHHX",
                        "XHH|       XX    |HHHHX",
                        "XHHH        XX    HHHHX",
                        "X##          XX    HHHX",
                        "X##           X     -HX",
                        "X#                   HX",
                        "X               X     X",
                        "X  HHH           XX   X",
                        "X  HH|            XX  X",
                        "X  HHH    ##       XX X",
                        "X        ####       XXX",
                        "X       HHH###        X",
                        "X       |HH##         X",
                        "X       HHH#          X",
                        "X                     X",
                        "XHHH               HHHX",
                        "XHH|    H-H        |HHX",
                        "XHHH    HHH     ###HHHX",
                        "XXXXXXXXXXXXXXXXXXXXXXX"
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
                        "   HHHHHH-HHHHHH                                   ",
                        "   H           H                                   ",
                        "   H           H                                   ",
                        "   H           H                                   ",
                        "   HHHHHHHHHHHHH                                   ",
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
                    map += " ";
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
