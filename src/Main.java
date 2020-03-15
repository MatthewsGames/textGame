import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Player bob = new Player("Bob", "A guy named Bob", 3, 12, '@', 0, 1, 10, 10);
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
        int[] momsPokeymon = {1, 2, 3, 1};
        int[] guardsPokeymon = {25, 25, 25, 4};
        int[] dextersPokeymon = {10, 10, 10, 1};
        int[] crockettsPokeymon = {100, 100, 100, 9};
        int[] gym1Pokeymon = {10, 10, 10, 1};
        int[] gym2Pokeymon = {15, 15, 15, 2};
        int[] gym3Pokeymon = {20, 20, 20, 3};
        int[] policePokeymon = {10, 10, 10, 1};
        int[] randomPokeymon = {15, 30, 30, 3};
        int[] assistantPokeymon = {45, 30, 32, 5};
        int[] secretaryPokeymon = {50, 45, 37, 6};
        int[] charmersPokeymon = {35, 35, 36, 5};
        int[] matthewsPokeymon = {101, 99, 102, 10};
        int[] flyingsPokeymon = {30,35,40,4};
        String[] healersWords = {
                "I heard that your pokeymon are running out of health.",
                "healPokeymon",
                "There you go, I just healed them for you. They should be better now.",
                "Come back in to see me whenever your pokeymon faint.",
                "If you're looking for more pokeymon, you should go in the long grass. It looks like this: #",
                "After you have pokeymon that are high enough level, you can go challenge the gym leaders!",
                "And then the Grand Champion!"
        };
        String[] guardsWords = {
                "Well, you beat me fair and square.",
                "Now you can go inside the arena and try to become the new champion!",
                "It's gonna be pretty hard though, the current champion is amazing.",
                "He's been the champion for 20 years!",
                "And he's only 16!"
        };
        String[] guardsWords2 = {
                "I am the guard to the champion arena.",
                "You must beat me to try and battle the grand champion!",
                "Now, let's fight!"
        };
        String[] kid1sWords = {
                "This gym is really hard!",
                "You might wanna try gym 1 or 2 first."
        };
        String[] dextersWords = {
                "You wanna buy some stuff?",
                "Nah, you don't look like that's what you're here for.",
                "Do you wanna make a delivery for me?",
                "Let's battle to see if you're good enough to do it."
        };
        String[] kid2sWords = {
                "This gym is really hard!",
                "You might wanna try gym 1 first."
        };
        String[] crockettsWords = {
                "You have defeated the Mighty Crockett.",
                "I will now give you one of my Almighty Asterisks as your reward.",
                "giveAsterisk",
                "Now you are the true pokeymon champion."
        };
        String[] gym1Words = {
                "You have beaten me, old sport.",
                "Here's the cranky old man badge.",
                "Now, GET OFF MY LAWN!"
        };
        String[] dextersWords2 = {
                "I guess you're good enough for the job.",
                "Go into the store that we're next to and give this package to the owner.",
                "His name is Banana Guy Mike."
        };
        String[] policesWords = {
                "Ha! I caught you.",
                "You're working with Dexter aren't you!",
                "I'm gonna have to confiscate that package, but if you beat me in a battle I'll let you go."
        };
        String[] policesWords2 = {
                "Wow, you're good!",
                "Well, I guess you're free to go."
        };
        String[] gym2Words = {
                "You beat me, dude!",
                "Here's the shirtless surfer guy badge.",
                "I'm gonna go catch some gnarly waves."
        };
        String[] gym3Words = {
                "I'm a princess.",
                "I'm a higher social class than you so you're technically my slave.",
                "Well, you did beat me.",
                "Here's the annoying princess badge,",
                "Wait did they call me annoying?",
                "I'm going back to my castle."
        };
        String[] guysWords = {
                "Thanks for getting rid of that pesky policeman!",
                "He's always trying to stop my deliveries.",
                "Here's 10 free pokeyballs for your help!",
                "giveBalls"
        };
        String[] charmersWords = {
                "Do you like my snakes?",
                "They're very slithery.",
                "Let's fight!"
        };
        String[] charmersWords2 = {
                "You must have cheated! My snakes are too good for you.",
                "Leave now! You are disturbing me and my snakes."
        };
        String[] randomsWords = {
                "Hey puny kid!",
                "Did the guard let you in? Or did you climb the wall",
                "Your so bad you probably couldn't even win a battle against my grandma.",
                "Lets battle, if you beat me I'll give you all my pokeyballs."
        };
        String[] randomsWords2 = {
                "Wow, I must be really bad if you beat me,",
                "Here, I'll get the pokeyballs from my bag",
                "Come back in a second and I should have them."
        };
        String[] randomsWords3 = {
                "Here you go. I found them.",
                "giveBalls",
                "I hope my grandma beats you."
        };
        String[] assistantWords = {
                "I'm the assistant secretary to the Grand Champion.",
                "I'm also Randall's Grandma.",
                "He's such a sweet little boy, you should meet him if you haven't yet.",
                "Now let's battle!"
        };
        String[] assistantWords2 = {
                "You beat me, now you get to fight my boss."
        };
        String[] secretaryWords = {
                "I'm the secretary to the Grand Champion.",
                "If you beat me you can face the Grand Champion himself!",
                "Now let's battle!"
        };
        String[] secretaryWords2 = {
                "I hope you lose against the grand champion, he's the best in the whole wide world."
        };
        String[] matthewsWords = {
                "I am the Grand Champion, Matthew Sheppard.",
                "Good luck beating me, my pokeymon are the best!",
                "If you do beat me, you have become the grand champion and are the best pokeymon trainer in the world!",
                "That'll never happen though.",
                "Let's fight!"
        };
        String[] matthewsWords2 = {
                "Well, I guess you're the new grand champion.",
                "I'll just take my stuff and leave.",
                "You can have my secretary.",
                "And that weird old grandma that is always in here for some reason.",
                "Also, YOU WON THE GAME!"
        };
        String[] flyingsWords = {
        "I used to think that I could not go on",
        "And life was nothing but an awful song",
        "But now I know the meaning of true love",
        "I'm leaning on the everlasting arms",
                "If I can see it, then I can do it" ,
                "If I just believe it, there 's nothing to it",
                "believe I can fly" ,
                "I believe I can touch the sky",
        "I think about it every night and day (Night and day)",
        "Spread my wings and fly away",
        "I believe I can soar",
        "I see me running through that open door",
        "I believe I can fly",
        "I believe I can fly",
        "I believe I can fly hoo",
        "See I was on the verge of breaking down",
        "Sometimes silence can seem so loud",
        "There are miracles in life I must achieve",
        "But first I know it starts inside of me, ho oh",
        "If I can see it hoo, then I can be it",
        "If I just believe it, there 's nothing to it",
                "I believe I can fly" ,
                "I believe I can touch the sky",
        "I think about it every night and day",
        "Spread my wings and fly away",
        "I believe I can soar",
        "I see me running through that open door",
        "I believe I can fly",
        "I believe I can fly",
        "Oh, I believe I can fly hoo",
        "Hey, 'cause I believe in me, oh",
                "If I can see it hoo, then I can do it" ,
                "If I just believe it, there 's nothing to it hey",
                "I believe I can fly hoo" ,
                "I believe I can touch the sky",
        "I think about it every night and day",
        "Spread my wings and fly away",
        "I believe I can soar",
        "I see me running through that open door",
        "I believe I can fly(I can fly)",
        "I believe I can fly(I can fly)",
        "I believe I can fly(I can fly) hey",
        "If I just spread my wings (I can fly)",
        "I can fly(I can fly)",
        "I can fly(I can fly)",
        "I can fly, (I can fly)hey",
        "If I just spread my wings (I can fly)",
        "I can fly(I can fly)",
        "(I can fly)",
        "(I can fly)",
                "Do you wanna fly(I mean fight) my pokeymon?"
        };
        String[] flyingsWords2 = {
                "Wow, good job.",
                "If you believe, you can fly."
        };
        String[] flyingsWords3 = {
                "I used to think that I could not go on",
                "And life was nothing but an awful song",
                "But now I know the meaning of true love",
                "I'm leaning on the everlasting arms",
                "If I can see it, then I can do it" ,
                "If I just believe it, there 's nothing to it",
                "believe I can fly" ,
                "I believe I can touch the sky",
                "I think about it every night and day (Night and day)",
                "Spread my wings and fly away",
                "I believe I can soar",
                "I see me running through that open door",
                "I believe I can fly",
                "I believe I can fly",
                "I believe I can fly hoo",
                "See I was on the verge of breaking down",
                "Sometimes silence can seem so loud",
                "There are miracles in life I must achieve",
                "But first I know it starts inside of me, ho oh",
                "If I can see it hoo, then I can be it",
                "If I just believe it, there 's nothing to it",
                "I believe I can fly" ,
                "I believe I can touch the sky",
                "I think about it every night and day",
                "Spread my wings and fly away",
                "I believe I can soar",
                "I see me running through that open door",
                "I believe I can fly",
                "I believe I can fly",
                "Oh, I believe I can fly hoo",
                "Hey, 'cause I believe in me, oh",
                "If I can see it hoo, then I can do it" ,
                "If I just believe it, there 's nothing to it hey",
                "I believe I can fly hoo" ,
                "I believe I can touch the sky",
                "I think about it every night and day",
                "Spread my wings and fly away",
                "I believe I can soar",
                "I see me running through that open door",
                "I believe I can fly(I can fly)",
                "I believe I can fly(I can fly)",
                "I believe I can fly(I can fly) hey",
                "If I just spread my wings (I can fly)",
                "I can fly(I can fly)",
                "I can fly(I can fly)",
                "I can fly, (I can fly)hey",
                "If I just spread my wings (I can fly)",
                "I can fly(I can fly)",
                "(I can fly)",
                "(I can fly)",
        };

        //new Monster("Your Mom","The strongest enemy you will ever face",5,5,'&',0,"A","B","C"),
        Sign[] signs = {
            new Sign("Your House Sign","A sign", 7,13, '?',"This is your house."),
                new Sign("Healer Sign","A sign", 9,16, '?',"This is where you can heal your pokeymon."),
                new Sign("Arena Wall Sign","A sign", 15,7, '?',"This is the wall that protects the Pokeymon Grand Champion Arena. To get inside you must battle and defeat the guard."),
                new Sign("Arena Wall Sign","A sign", 14,6, '?',"This is the wall that protects the Pokeymon Grand Champion Arena. To get inside you must battle and defeat the guard."),
                new Sign("Gym 3","A sign", 4,2, '?',"This is the third pokeymon gym."),
                new Sign("Gym 2","A sign", 4,17, '?',"This is the second pokeymon gym."),
                new Sign("Gym 1","A sign", 18,17, '?',"This is the first pokeymon gym."),
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
        new NPC("Mom","mom",5,13,'M',0,
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
                new NPC("Dexter the stuffd" +
                        "d" +
                        " dealer","He's a drug dealer.",2,9,'D',0,
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
                new Monster("Dexter the stuff dealer","He's a drug dealer.",2,9,'D',0,"?","?","?",
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
                                "   88888b 888888|8888888888888888888888888\\8888888\n"  ,dextersWords2,dextersPokeymon),
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
                new NPC("The Guard to the Pokeymon Champion Arena","He guards stuff",15,6,'G',0,
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
                                "           \\__/\n" ,guardsWords2,false),
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
                                "           \\__/\n", guardsWords, guardsPokeymon),
                new NPC("Banana Guy Mike","He's a store owner",1,8,'B',6,
                        "                            __.......___\n" +
                                "                    __..od8888888888888888bo.\n" +
                                "                _.d888888888888888888888888888b.        _.._\n" +
                                "             .d8888888888888888888888888888888888b.  .d888888b.\n" +
                                "           .d88888888888888888888888888888888888888bd88888888888b.\n" +
                                "         .d888888888888888888888888888888888P'\"'  `\"48888888888888b.\n" +
                                "         888888888888888888888888888888888+'         `48888888888888.\n" +
                                "        j888888888888P\"'  '   `'  `\"'+++\"'              `488888888888.\n" +
                                "        88888888888P'                                     `48888888888.\n" +
                                "        888888888P'                                         `8888888888.\n" +
                                "       j8888888P'                                            `8888888888.\n" +
                                "      .8888888P                                               l8888888888.\n" +
                                "      8888888'                                                 88888888888\n" +
                                "     j888888'                                          ____    `8888888888l\n" +
                                "     888888f                                  _.ood8888++488b.  `8888888888\n" +
                                "    j888888                                 +P'\"          `488b._`888888888l\n" +
                                "    8888888           ___,,.ooo._         .dP'              `88888b888888888\n" +
                                "    8888888      _.d8++\"\"\"\"\"'''\"4b.      .8'                 `88888888888888\n" +
                                "    8888888    .dP\"'             `8b.__..88       _.._        88888888888888\n" +
                                "    8888888  .d8f                 `88888888.     \" 48P`.      88P`  88888888\n" +
                                "    l888888 j888'           _...   88f   `88.                 8P    88P'  `4\n" +
                                "     888888.d888        _.-'488P   88     `88.              ,jP     8f  db |\n" +
                                "     `4888888888.      '           8P      `48._      __..gP'       8   4P |\n" +
                                "      .\"`488+`48L                .jP         `+888888++\"\"'          '  . ' '\n" +
                                "      | _ `\"   `48.            _dP'          b.                        :  .\n" +
                                "      `'8b       `4b.__   __.odP'            `4.                      .d  |\n" +
                                "       \\`8         `\"\"+++++\"\"'   ,             `b                     8P  |\n" +
                                "        \\`                     .d'  ,.    _,o. ,P                     P   |\n" +
                                "         \\  d.                .P'  .P\"Y8\"\"  `'\"'                          |\n" +
                                "            88               j'        8.                                 |\n" +
                                "          ` `4              '          \"'                                 '\n" +
                                "           .  `                            __                           ,'\n" +
                                "                                  _.g8bogo+\"\"\"+++,._                   .\n" +
                                "            '                  _.o\"'              `\"'                  |\n" +
                                "            .                 j\"                                       |\n" +
                                "             \\                                                         |\n" +
                                "              `-.                                                    .d|\n" +
                                "                 .                                                 .d8'|\n" +
                                "                  .                                             .d888' jb.\n" +
                                "            __..od8b.                                      _.od88888' .8888b.\n" +
                                "    __..od88888888888b.                            __..oo888888888P' .88888888b\n" +
                                "o888888888888888888888b._            ______...ooo88888888888888P'  .8888888888\n" +
                                "8888888888888888888888888b. .ooo8b++++++\"\"\"888888888888888888+'  .d88888888888\n" +
                                "888888888888888888888888888              .d888888888888888+'   .d8888888888888\n" +
                                "888888888888888888888888888l            .888888888888888+'   .d888888888888888\n" ,guysWords,false),
                new NPC("Police Guy","He's a policeman",3,9,'B',6,
                        "       .-\"\"-.\n" +
                                "      /-.{}  \\\n" +
                                "      | _\\__.|\n" +
                                "      \\/^)^ \\/\n" +
                                "       \\ =  /\n" +
                                "  .---./`--`\\.--._\n" +
                                " /     `;--'`     \\\n" +
                                ";        /`       ;\n" +
                                "|       |*        |\n" +
                                "/   |   |     |    \\\n" +
                                "|    \\  |*    /    |\n" +
                                "\\_   |\\_|____/|  __/\n" +
                                "  \\__//======\\\\__/\n" +
                                "  / //_      _\\\\ \\\n" +
                                "  -'  |`\"\"\"\"`|  `-\n" +
                                "      |  L   |\n" +
                                "      >_ || _<\n" +
                        "      |  ||  |\n" +
                                "      |  ||  |\n" +
                                "     /   ||   \\\n" +
                                "    /    /,    \\\n" +
                                "     `|\"|`\"|\"|\"`\n" +
                                "     /  )  /  )  \n" +
                                "    /__/  /__/\n"  ,policesWords,false),
                new Monster("Police Guy","He's a policeman", 3, 9, 'B',6,"!","?","$",
                        "       .-\"\"-.\n" +
                                "      /-.{}  \\\n" +
                                "      | _\\__.|\n" +
                                "      \\/^)^ \\/\n" +
                                "       \\ =  /\n" +
                                "  .---./`--`\\.--._\n" +
                                " /     `;--'`     \\\n" +
                                ";        /`       ;\n" +
                                "|       |*        |\n" +
                                "/   |   |     |    \\\n" +
                                "|    \\  |*    /    |\n" +
                                "\\_   |\\_|____/|  __/\n" +
                                "  \\__//======\\\\__/\n" +
                                "  / //_      _\\\\ \\\n" +
                                "  -'  |`\"\"\"\"`|  `-\n" +
                                "      |  L   |\n" +
                                "      >_ || _<\n" +
                        "      |  ||  |\n" +
                                "      |  ||  |\n" +
                                "     /   ||   \\\n" +
                                "    /    /,    \\\n" +
                                "     `|\"|`\"|\"|\"`\n" +
                                "     /  )  /  )  \n" +
                                "    /__/  /__/\n" , policesWords2, policePokeymon),
                new NPC("Assistant Secretary to the Grand Champion who is Randall's Grandma","She's a grandma",19,3,'A',7,
                        "       ___\n" +
                                "      (___)\n" +
                                "     /`   `\\\n" +
                                "    /  /\"\\  \\\n" +
                                "    \\_/o o\\_/\n" +
                                "     (  _  )\n" +
                                "      `\\ /`\n" +
                                "     /\\\\V//\\\n" +
                                "    / /_ _\\ \\\n" +
                                "    \\ \\___/ /\n" +
                                "     \\/===\\/\n" +
                                "     ||   ||\n" +
                                "     ||   ||\n" +
                                "     ||___||\n" +
                                "     |_____|\n" +
                                "       |||\n" +
                                "      / Y \\\n" +
                                "      `\"`\"`"  ,assistantWords,false),
                new Monster("Assistant Secretary to the Grand Champion who is Randall's Grandma","She's a grandma",19,3,'A',7,"Z","Z","Z",
                        "       ___\n" +
                                "      (___)\n" +
                                "     /`   `\\\n" +
                                "    /  /\"\\  \\\n" +
                                "    \\_/o o\\_/\n" +
                                "     (  _  )\n" +
                                "      `\\ /`\n" +
                                "     /\\\\V//\\\n" +
                                "    / /_ _\\ \\\n" +
                                "    \\ \\___/ /\n" +
                                "     \\/===\\/\n" +
                                "     ||   ||\n" +
                                "     ||   ||\n" +
                                "     ||___||\n" +
                                "     |_____|\n" +
                                "       |||\n" +
                                "      / Y \\\n" +
                                "      `\"`\"`" , assistantWords2, assistantPokeymon),
                new NPC("Secretary to the Grand Champion","She's a secretary",20,2,'S',7,
                        "                   //////\n" +
                                "             <====//////====[]\n" +
                                "                 /////\\\\\\\\\\\n" +
                                "               ((((( ))))))))\n" +
                                "               ||| /\\   /\\ ||\n" +
                                "               || |_O| |O_|||\n" +
                                "              (9|     ^    |6)\n" +
                                "                 \\    V   /                          )\n" +
                                "                 (~~~~~~~~~)                   ( ((\n" +
                                "                /~~~~~~~~~~~\\                     )) )\n" +
                                "              ///////|||\\\\\\\\\\\\\\                 (( ((\n" +
                                "            //                 \\\\                )  ))\n" +
                                "      ______|~~~|____________|~~~|_________      (((\n" +
                                "    []#=====`^^^'============`^^^'========#[]    |||\n" +
                                "  __[]_____________________________________[]___(___)_\n" +
                                " [____________________________________________________]\n" +
                                "   )   ===========================================  (\n" +
                                "  /  /'~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`\\  \\\n" +
                                "<__/    (___________________________)               \\__> "  ,secretaryWords,false),
                new Monster("Secretary to the Grand Champion","She's a secretary",20,2,'S',7,"Z","Z","Z",
                        "                   //////\n" +
                                "             <====//////====[]\n" +
                                "                 /////\\\\\\\\\\\n" +
                                "               ((((( ))))))))\n" +
                                "               ||| /\\   /\\ ||\n" +
                                "               || |_O| |O_|||\n" +
                                "              (9|     ^    |6)\n" +
                                "                 \\    V   /                          )\n" +
                                "                 (~~~~~~~~~)                   ( ((\n" +
                                "                /~~~~~~~~~~~\\                     )) )\n" +
                                "              ///////|||\\\\\\\\\\\\\\                 (( ((\n" +
                                "            //                 \\\\                )  ))\n" +
                                "      ______|~~~|____________|~~~|_________      (((\n" +
                                "    []#=====`^^^'============`^^^'========#[]    |||\n" +
                                "  __[]_____________________________________[]___(___)_\n" +
                                " [____________________________________________________]\n" +
                                "   )   ===========================================  (\n" +
                                "  /  /'~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`\\  \\\n" +
                                "<__/    (___________________________)               \\__> " , secretaryWords2, secretaryPokeymon),
                    new NPC("The Grand Champion Matthew Sheppard","He's awesome",21,1,'M',7,
                        "             _.-\"\"\"\"-._\n" +
                                "            / .--....-.\\\n" +
                                "           / /         \\\\\n" +
                                "           ||          ||\n" +
                                "           || .--.  .--||\n" +
                                "           /`   @  \\ @ |/\n" +
                                "           \\_      _)  |\n" +
                                "            |   ,____, ;\n" +
                                "            | \\  `--' /\n" +
                                "         _./\\  '.___.;_\n" +
                                "     _.-'  | `\\      |\\'-.\n" +
                                "   .'       `\\ '.   / /   '.\n" +
                                "  /           |/ `\\/`\\|     \\"  ,matthewsWords,false),
                new Monster("The Grand Champion Matthew Sheppard","He's awesome",21,1,'M',7,"-","+","=",
                        "             _.-\"\"\"\"-._\n" +
                                "            / .--....-.\\\n" +
                                "           / /         \\\\\n" +
                                "           ||          ||\n" +
                                "           || .--.  .--||\n" +
                                "           /`   @  \\ @ |/\n" +
                                "           \\_      _)  |\n" +
                                "            |   ,____, ;\n" +
                                "            | \\  `--' /\n" +
                                "         _./\\  '.___.;_\n" +
                                "     _.-'  | `\\      |\\'-.\n" +
                                "   .'       `\\ '.   / /   '.\n" +
                                "  /           |/ `\\/`\\|     \\" , matthewsWords2, matthewsPokeymon),
                new NPC("Flying Guy","He's flying",20,8,'F',0,
                        "                       ,,,\n" +
                                "                       i i'\n" +
                                "                       \\~;\\\n" +
                                "                        \\; \\\n" +
                                "                         \\ ;\\    ====\n" +
                                "                          \\ ;\\  ==== \\\n" +
                                "                     __,--';;;\\-' (  0\n" +
                                "               __,--';;; ;;; ;;\\      >\n" +
                                "        __,--'\\\\ ;;; ;;; ;;; ;;;\\--__<\n" +
                                " _ _,--' __,--'\\\\  ;;; __,~~' \\ ;\\\n" +
                                "(_)|_,--' __,--'\\\\;,~~'        \\ ;\\\n" +
                                "|(_)|_,--'       ~~             \\; \\\n" +
                                "|| |                             \\ ;\\\n" +
                                " |_/                              !~!,\n" +
                                "                              .---'''---.\n" +
                                "                              |         |\n" +
                                "                              |         |\n" +
                                "                              |         |\n" +
                                "                              `---------'"  ,flyingsWords,false),
                new Monster("Flying Guy","He's flying",20,8,'F',0,"F","L","Y",
                        "                       ,,,\n" +
                                "                       i i'\n" +
                                "                       \\~;\\\n" +
                                "                        \\; \\\n" +
                                "                         \\ ;\\    ====\n" +
                                "                          \\ ;\\  ==== \\\n" +
                                "                     __,--';;;\\-' (  0\n" +
                                "               __,--';;; ;;; ;;\\      >\n" +
                                "        __,--'\\\\ ;;; ;;; ;;; ;;;\\--__<\n" +
                                " _ _,--' __,--'\\\\  ;;; __,~~' \\ ;\\\n" +
                                "(_)|_,--' __,--'\\\\;,~~'        \\ ;\\\n" +
                                "|(_)|_,--'       ~~             \\; \\\n" +
                                "|| |                             \\ ;\\\n" +
                                " |_/                              !~!,\n" +
                                "                              .---'''---.\n" +
                                "                              |         |\n" +
                                "                              |         |\n" +
                                "                              |         |\n" +
                                "                              `---------'" , flyingsWords2, flyingsPokeymon),
                new NPC("Flying Guy","He's flying",20,8,'F',0,
                        "                       ,,,\n" +
                                "                       i i'\n" +
                                "                       \\~;\\\n" +
                                "                        \\; \\\n" +
                                "                         \\ ;\\    ====\n" +
                                "                          \\ ;\\  ==== \\\n" +
                                "                     __,--';;;\\-' (  0\n" +
                                "               __,--';;; ;;; ;;\\      >\n" +
                                "        __,--'\\\\ ;;; ;;; ;;; ;;;\\--__<\n" +
                                " _ _,--' __,--'\\\\  ;;; __,~~' \\ ;\\\n" +
                                "(_)|_,--' __,--'\\\\;,~~'        \\ ;\\\n" +
                                "|(_)|_,--'       ~~             \\; \\\n" +
                                "|| |                             \\ ;\\\n" +
                                " |_/                              !~!,\n" +
                                "                              .---'''---.\n" +
                                "                              |         |\n" +
                                "                              |         |\n" +
                                "                              |         |\n" +
                                "                              `---------'"  ,flyingsWords3,true),
                new NPC("Snake Charmer Guy","He charms snakes",18,6,'S',0,
                        "   ,'._,`.\n" +
                                "  (-.___.-)\n" +
                                "  (-.___.-)\n" +
                                "  `-.___.-'\n" +
                                "   ((  @ @|              .            __\n" +
                                "    \\\\   ` |         ,\\\\   |`.    @|   |  |      _.-._\n" +
                                "   __`.`=-=mm===mm:: |   | |`.   |   |  |    ,'=` '=`.\n" +
                                "  (    `-'|:/  /:/  `/  @| | |   |, @| @|   /---)W(---\\\\\n" +
                                "   \\\\ \\\\   / /  / /         @| |   '         (----| |----) ,~\n" +
                                "   |\\\\ \\\\ / /| / /            @|              \\\\---| |---/  |\n" +
                                "   | \\\\ V /||/ /                              `.-| |-,'   |\n" +
                                "   |  `-' |V /                                 \\\\| |/    @'\n" +
                                "   |    , |-'                                 __| |__\n" +
                                "   |    .;: _,-.                         ,--\"\"..| |..\"\"--.\n" +
                                "   ;;:::' \"    )                        (`--::__|_|__::--')\n" +
                                " ,-\"      _,  /                          \\\\`--...___...--'/\n" +
                                "(    -:--'/  /                           /`--...___...--'\\\\\n" +
                                " \"-._  `\"'._/                           /`---...___...---'\\\\\n" +
                                "     \"-._   \"---.                      (`---....___....---')\n" +
                                "      .' \",._ ,' )                     |`---....___....---'|\n" +
                                "      /`._|  `|  |                     (`---....___....---')\n" +
                                "     (   \\\\    |  /                      \\\\`---...___...---'/\n" +
                                "      `.  `,  ^\"\"                        `:--...___...--;'\n" +
                                "        `.,'                               `-._______.-'"  ,charmersWords,false),
                new Monster("Snake Charmer Guy","He charms snakes", 18, 6, 'S',0,"S","S","S",
                        "   ,'._,`.\n" +
                                "  (-.___.-)\n" +
                                "  (-.___.-)\n" +
                                "  `-.___.-'\n" +
                                "   ((  @ @|              .            __\n" +
                                "    \\\\   ` |         ,\\\\   |`.    @|   |  |      _.-._\n" +
                                "   __`.`=-=mm===mm:: |   | |`.   |   |  |    ,'=` '=`.\n" +
                                "  (    `-'|:/  /:/  `/  @| | |   |, @| @|   /---)W(---\\\\\n" +
                                "   \\\\ \\\\   / /  / /         @| |   '         (----| |----) ,~\n" +
                                "   |\\\\ \\\\ / /| / /            @|              \\\\---| |---/  |\n" +
                                "   | \\\\ V /||/ /                              `.-| |-,'   |\n" +
                                "   |  `-' |V /                                 \\\\| |/    @'\n" +
                                "   |    , |-'                                 __| |__\n" +
                                "   |    .;: _,-.                         ,--\"\"..| |..\"\"--.\n" +
                                "   ;;:::' \"    )                        (`--::__|_|__::--')\n" +
                                " ,-\"      _,  /                          \\\\`--...___...--'/\n" +
                                "(    -:--'/  /                           /`--...___...--'\\\\\n" +
                                " \"-._  `\"'._/                           /`---...___...---'\\\\\n" +
                                "     \"-._   \"---.                      (`---....___....---')\n" +
                                "      .' \",._ ,' )                     |`---....___....---'|\n" +
                                "      /`._|  `|  |                     (`---....___....---')\n" +
                                "     (   \\\\    |  /                      \\\\`---...___...---'/\n" +
                                "      `.  `,  ^\"\"                        `:--...___...--;'\n" +
                                "        `.,'                               `-._______.-'" , charmersWords2, charmersPokeymon),
                new NPC("Randall the Random Guy","He's random",14,2,'R',0,
                        "      ////^\\\\\\\\\n" +
                                "      | ^   ^ |\n" +
                                "     @ (o) (o) @\n" +
                                "      |   <   |\n" +
                                "      |  ___  |\n" +
                                "       \\_____/\n" +
                                "     ____|  |____\n" +
                                "    /    \\__/    \\\n" +
                                "   /              \\\n" +
                                "  /\\_/|        |\\_/\\\n" +
                                " / /  |        |  \\ \\\n" +
                                "( <   |        |   > )\n" +
                                " \\ \\  |        |  / /\n" +
                                "  \\ \\ |________| / /\n" +
                                "   \\ \\|"  ,randomsWords,false),
                new Monster("Randall Random Guy","He's random", 14, 2, 'R',0,"X","Y","Z",
                        "      ////^\\\\\\\\\n" +
                                "      | ^   ^ |\n" +
                                "     @ (o) (o) @\n" +
                                "      |   <   |\n" +
                                "      |  ___  |\n" +
                                "       \\_____/\n" +
                                "     ____|  |____\n" +
                                "    /    \\__/    \\\n" +
                                "   /              \\\n" +
                                "  /\\_/|        |\\_/\\\n" +
                                " / /  |        |  \\ \\\n" +
                                "( <   |        |   > )\n" +
                                " \\ \\  |        |  / /\n" +
                                "  \\ \\ |________| / /\n" +
                                "   \\ \\|" , randomsWords2, randomPokeymon),
                new NPC("Randall the Random Guy","He's random",14,2,'R',0,
                        "      ////^\\\\\\\\\n" +
                                "      | ^   ^ |\n" +
                                "     @ (o) (o) @\n" +
                                "      |   <   |\n" +
                                "      |  ___  |\n" +
                                "       \\_____/\n" +
                                "     ____|  |____\n" +
                                "    /    \\__/    \\\n" +
                                "   /              \\\n" +
                                "  /\\_/|        |\\_/\\\n" +
                                " / /  |        |  \\ \\\n" +
                                "( <   |        |   > )\n" +
                                " \\ \\  |        |  / /\n" +
                                "  \\ \\ |________| / /\n" +
                                "   \\ \\|"  ,randomsWords3,false),
                new Monster("The old man who is a gym leader","He is old", 21, 18, 'O',5,"D","O","G",
                        "               ,\n" +
                                "            ,:' `..;\n" +
                                "            `. ,;;'%\n" +
                                "            +;;'%%%%%\n" +
                                "             /- %,)%%\n" +
                                "             `   \\ %%\n" +
                                "              =  )/ \\\n" +
                                "              `-'/ / \\\n" +
                                "                /\\/.-.\\\n" +
                                "               |  (    |\n" +
                                "               |  |   ||\n" +
                                "               |  |   ||\n" +
                                "           _.-----'   ||\n" +
                                "          / \\________,'|\n" +
                                "         (((/  |       |\n" +
                                "         //    |       |\n" +
                                "        //     |\\      |\n" +
                                "       //      | \\     |\n" +
                                "      //       |  \\    |\n" +
                                "     //        |   \\   |\n" +
                                "    //         |    \\  |\n" +
                                "   //          |    |\\ |\n" +
                                "  //           |    | \\|\n" +
                                " //            \\    \\\n" +
                                "'             |\\    \\\n" +
                                "               | \\    \\\n" +
                                "               |  \\    \\\n" +
                                "               |.' \\    \\\n" +
                                "              _\\    \\.-' \\ \n" +
                                "             (___.-(__.'\\/\n", gym1Words, gym1Pokeymon),
                new Monster("The weird shirtless guy who is a gym leader","He is shirtless", 1, 18, 'S',4,"C","U","P",
                        "     ////\\\\\\\\\n" +
                                "      |      |\n" +
                                "     @  O  O  @\n" +
                                "      |  ~   |         \\__\n" +
                                "       \\ -- /          |\\ |\n" +
                                "     ___|  |___        | \\|\n" +
                                "    /          \\      /|__|\n" +
                                "   /            \\    / /\n" +
                                "  /  /| .  . |\\  \\  / /\n" +
                                " /  / |      | \\  \\/ /\n" +
                                "<  <  |      |  \\   /\n" +
                                " \\  \\ |  .   |   \\_/\n" +
                                "  \\  \\|______|\n" +
                                "    \\_|______|\n" +
                                "      |      |\n" +
                                "      |  |   |\n" +
                                "      |  |   |\n" +
                                "      |__|___|\n" +
                                "      |  |  |\n" +
                                "      (  (  |\n" +
                                "      |  |  |\n" +
                                "      |  |  |\n" +
                                "     _|  |  |\n" +
                                " cccC_Cccc___)\n" , gym2Words, gym2Pokeymon),
                new Monster("The annoying princess girl who is a gym leader","She is a princess", 1, 3, 'P',3,"W","I","N",
                        "                       _._                                      \n" +
                                "                     ,\"-._\"-.                                   \n" +
                                "                     ;\"-._\"-.\"-.                                \n" +
                                "                     :.   \"-.`. \\                               \n" +
                                "                     (;`-._  `.\\ ;                              \n" +
                                "                      :_  _\".  \\\\:                              \n" +
                                "                      ;o: o` \\  \\;                              \n" +
                                "                      : ;     )-. `.                            \n" +
                                "                       ;=-  .:\\     \"-._                        \n" +
                                "                       :_.-\" ; `.       \"-.                     \n" +
                                "                 _._   ( :   :   \"-._      \"-.                  \n" +
                                "                /   `._.='    \\               `.                \n" +
                                "               :    \\:         `-.__ _._   \"-.  \\               \n" +
                                "                \\    '.    _      \",' ` \",    \\  ;              \n" +
                                "                 )-.   `j\"^,L_..--\"      ; ,-. : :              \n" +
                                "                :   )-._;)(:_           / : ._.' ;              \n" +
                                "                |  :   <_.Y(\\\"-..__ _.+'\\ :     /               \n" +
                                "                ;  ;   ;    \"      T   \\ \\ `---'`.              \n" +
                                "               :   :   :           : \\  \\ `.      `.            \n" +
                                "               |    \\   \\          /\\       \\._     \\           \n" +
                                "               ;    :\\   ;        :  \\       `.\"\"-.  ;          \n" +
                                "           _.-\":    ; ;  :        ;   `.       \\   ; :          \n" +
                                "     ___.-\"    ;   :  :          :  __  `.      ; .' ;          \n" +
                                ".--\"\" [_      /    |   ;         |.\"  \".  ).   \\;   /           \n" +
                                "'---. : \\`.        ;   :         |     : :      \\.-'            \n" +
                                "     \\;  ; \\      /    ;         ;  _.-' ;       ;              \n" +
                                "         :       /  .-:      _,-(V\\`-.__.;  /    :              \n" +
                                "          \\    .'  < \\/\\ .^-(/\\-     '. L _ _J              \n" +
                                "           `--'   .'`<^>(-.'/-.L/-;\\  bug  T_T \"                \n" , gym3Words, gym3Pokeymon),
                new Monster("Mr. Crockett the god has appeared and","He is the pokeymon god.", bob.getX(), bob.getY(), 'C',999,"*","*","*",
                        "                                                     ?IODNNNNNNNNDO?\n" +
                                "                                                   ZNMMNNNDDDD8D8DDDNN7\n" +
                                "                                                7MNMNDD88O88OOZO888888DDN\n" +
                                "                                             $MMNNN8OZ$ZZZZZZZOZZ$$$OO8DN8\n" +
                                "                                             ZMNNNDZ$$$$$$$Z$Z$7777777$ZOODD\n" +
                                "                                            DNNND8Z$$77IIIII??II7I?III7$$$ZODI\n" +
                                "                                           DNNDD8Z$$$77I???++++++==++?+?III$$8?\n" +
                                "                                          7NND88OOZ$77I??+++=====~~~~====?+??ID\n" +
                                "                                         NND8888Z$$7I??++======~~~~~~~====++?7D\n" +
                                "                                        8ND8888OZ$7I??+++====~~~~~~~~~~~~==++?8I\n" +
                                "                                        IND8888OZ$$7I??++++===~~~~~~~~~~~~~=++?ZD\n" +
                                "                                        8DD888OZ7$$7I??++++==~~~~~~~~~~~~~~==+?7O\n" +
                                "                                        DD888Z$$7777I?+++===~~~~::~~~~~~~~===++78I\n" +
                                "                                       IN888Z$$$$7$7?++++==~~::::::~~~~~~~~~=++IO$\n" +
                                "                                       Z8888Z$7$7$$II77II?+=~~~:::::::::::~~==+IZ7\n" +
                                "                                    7O778D8O$777$ZZOZOO888O$7?=~~::::~~~~~~~=+?IZI\n" +
                                "                                   I77I?7D8Z777777$II?+?++IIII++~~~~~+?$$Z?++++?Z?\n" +
                                "                                   7I7II$OZ$$7IIII7ZDONDZ$I$7I?+=~~~=+?I77$O$$I?8\n" +
                                "                                   I7?IIIOZ$7I????I$7ID87:I7III+~:~+I7$7?7?+??$?Z?\n" +
                                "                                    I+7+$ZZ$$7I?++++?++++++++II+~:~??7ODIIIII????$I\n" +
                                "                                    II7I7Z$$$7I?+========~=+???+~~==+?I8O=?7?+=?+Z?\n" +
                                "                                     7$$Z$$$7I?++=====~~~==+?I+~~==~=++++++===++??\n" +
                                "                                      7IZZ$$$7I??+==~~~~~~~=+??+~~=~=~~~~===~~=+++\n" +
                                "                                        OZZ$77I??+=~~~~~~=???II+====~~~~~~~~~~+++\n" +
                                "                                        OZZ$77II?+=~~~~==+I?+?+=~:~===~:~~:~~~==\n" +
                                "                                        OZZ$777I?+=====++?77OZ?+====~==~~:::~=+?\n" +
                                "                                        OZ$$77III++++?++??II7II7I?7I==+=~~~~~=+\n" +
                                "                                        OZZ$7III?++???????++++===+++=~=+=~~~~=+\n" +
                                "                                        OOZ$7I???=~+7IIIII+==~:~~~~=+===?====+I\n" +
                                "                                         OZ$7I?I?=~=+?7??~?=I??+++++==+?+===++\n" +
                                "                                         OZ$7II?I+===++IO:::,,:.::,I8ZI+=~=++?\n" +
                                "                                          O$7IIII?+===+??++==::~?=:?+==~~~=++I\n" +
                                "                                          OZ$7IIII?++=++?++~~~~~~=+==~~~~===?\n" +
                                "                                       NZ$ZOZ$7I?III?++++++++==~~===~~~~+==+=\n" +
                                "                                     8DDZ$$$OZ$7II77I?+======+==~~=~~==+==+I\n" +
                                "                                    NDDNO$77$ZZ$$7$$7I?=======~~~~~~==+==?Z88\n" +
                                "                                   DDDDNOZ77I$ZZZ$$$$I?+=+==~~~~~~==+?++?ND8OOO\n" +
                                "                                   DDDDNOZ$7777$Z$$$ZZ7I++====~==~=+?+?7?MND8OO8\n" +
                                "                                  DDD8DDO$$77III7ZZ$$$Z$7?+++====+?I?I++IMMD8OOOO\n" +
                                "                                 7DD88888Z777IIIII$Z$$$$Z$7I?I??77II?=+?IZMDOOOOO8\n" +
                                "                                DNDD8888NZ$7I7I7IIII7$Z$$$7$77777$?++++?7I8DOOOZOO7\n" +
                                "                              DNNNDD888888$7II?IIIIIIII777$$$7I?++====+?I?78OOOZOOD\n" +
                                "                           DDDNNNNDD888888Z7II?????III????++++++====~=+??+IZOOZOZODD8Z\n" +
                                "                        DD8DDDDNNNDDD88O88877I???+++?????++++====~~~~=++++7ZOOOOOOD8OO88O\n" +
                                "                   ODD8DDDDDDDDNNNDD88OOOOOIII?+++=++==+++==~~~~~~~==+==+78OOOOO8D8OOZ88888Z\n" +
                                "                 DDD8DDD888DDDDDDNNNND88OOOO$III?++=======~~~~~~~~=======+$8OOZOO8D8OOZZOOOO8888?\n" +
                                "             ZDD88DDDD888888D8888DNNNND88OOOO7?I??++======~~~~~~=~=====~=IO8OZOOO8D8OOZOZ8888888888$\n" +
                                "          8DD8DDDD8888888888888888DNNNND88OOOOI+??++=======~~~~~~~~~~~~=+DO8OOZZO8D8OOZOZZOOOOOOOOO8888I\n" +
                                "        DD8DDDDDD8888888888888D8O88DDNNNDD8OOO8+=++===~~~~~~~~~~~~~~~~=+88ZOOZZZO88OOOOOZZZOOOOOOOOO8OO88Z\n" +
                                "     ZDD8DDD8D88888888888888888DOO88DDNNNDD8OOO8+==~~~~~~~~~~~~~~~~~~~?OO8ZOOZZOOO88OZZZZZOOOOOOOOOOOO8OO88\n", guardsWords, guardsPokeymon)

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

                },
                {
                        "HHHHH          ",
                        "H   H          ",
                        "H   |          ",
                        "H   H          ",
                        "H   H          ",
                        "HHHHH          ",
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
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",


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
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "HHHHH          ",
                        "H   H          ",
                        "H   |          ",
                        "H   H          ",
                        "H   H          ",
                        "HHHHH          ",


                },
                {
                        "                       ",
                        "                       ",
                        "                       ",
                        "                       ",
                        "                       ",
                        "                       ",
                        "                       ",
                        "                       ",
                        "                       ",
                        "                       ",
                        "                       ",
                        "                       ",
                        "                       ",
                        "                       ",
                        "                       ",
                        "                  HHHHH",
                        "                  H   H",
                        "                  |   H",
                        "                  H   H",
                        "                  H   H",
                        "                  HHHHH",


                },
                {
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "HHHHHH         ",
                        "H    H         ",
                        "H    |         ",
                        "H    H         ",
                        "H    H         ",
                        "HHHHHH         ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",


                },
                {
                        "              HHHHHHHHH",
                        "               H X X  H",
                        "                | X   H",
                        "                 H   XH",
                        "                  H X H",
                        "                   - XH",
                        "                    H H",
                        "                     HH",
                        "                      H",
                        "                       ",
                        "                       ",
                        "                       ",
                        "                       ",
                        "                       ",
                        "                       ",
                        "                       ",
                        "                       ",
                        "                       ",
                        "                       ",
                        "                       "
                },
        };
        System.out.println();
        System.out.println("______     _ \n" +
                "| ___ \\   | |                                   \n" +
                "| |_/ /__ | | _____ _   _ _ __ ___   ___  _ __  \n" +
                "|  __/ _ \\| |/ / _ \\ | | | '_ ` _ \\ / _ \\| '_ \\ \n" +
                "| | | (_) |   <  __/ |_| | | | | | | (_) | | | |\n" +
                "\\_|  \\___/|_|\\_\\___|\\__, |_| |_| |_|\\___/|_| |_|\n" +
                "                     __/ |                      \n" +
                "                    |___/                       ");
        System.out.println("The Text-Based Adventure Game");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(" ________         ______               \n" +
                "/_  __/ /  ___   / __/ /____  ______ __\n" +
                " / / / _ \\/ -_) _\\ \\/ __/ _ \\/ __/ // /\n" +
                "/_/ /_//_/\\__/ /___/\\__/\\___/_/  \\_, / \n" +
                "                                /___/  ");
        System.out.println();
        System.out.println("\tYou live in Keebored City and you desire to prove yourself as a real\npokeymon trainer. One day, you find out that the professor wants to talk to\nyou. You are excited and he decides to give you your first pokeymon so\nthat you can catch more and become the greatest pokeymon trainer ever!\nTo become the grand champion you must battle with and train your\npokeymon. You must battle all 3 gym leaders, the guard at the gate, and\nthe assistant to the secretary to the grand champion, the secretary to the\ngrand champion, and finally, the one, the only, the amazing, the\nawe-inspiring, the Grand Champion Matthew Sheppard! If that isn’t enough\nbattles for you, there are plenty of other people willing to battle you. If you\nare lucky(or maybe unlucky) enough the mighty Crockett will appear and ask to\nfight you. Beware, for if you refuse to battle him, he will begin to hack your\nscreen and fill it with random binary digits. If you defeat him, he will give\nyou a super powerful Almighty Asterisk. This is the only way to get one of\nthese pokeymon, as they cannot be found in the wild. Start your adventure now,\nwith Pokeymon!\n");
        System.out.println("Press enter to begin game...");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        int destructionCounter = 0;
        while (true) {
            if(people[people.length - 1].getRoom() != 999 && !people[people.length - 1].hasBattled() && destructionCounter == 0){
                destructionCounter = 1;
            }
            int rand  = (int)(Math.random()*1000);
            if(rand == 100){
                people[people.length - 1] =  new Monster("Mr. Crockett the god has appeared and","He is the pokeymon god.", bob.getX(), bob.getY(), 'C',bob.getRoom(),"*","*","*",
                        "                                                     ?IODNNNNNNNNDO?\n" +
                                "                                                   ZNMMNNNDDDD8D8DDDNN7\n" +
                                "                                                7MNMNDD88O88OOZO888888DDN\n" +
                                "                                             $MMNNN8OZ$ZZZZZZZOZZ$$$OO8DN8\n" +
                                "                                             ZMNNNDZ$$$$$$$Z$Z$7777777$ZOODD\n" +
                                "                                            DNNND8Z$$77IIIII??II7I?III7$$$ZODI\n" +
                                "                                           DNNDD8Z$$$77I???++++++==++?+?III$$8?\n" +
                                "                                          7NND88OOZ$77I??+++=====~~~~====?+??ID\n" +
                                "                                         NND8888Z$$7I??++======~~~~~~~====++?7D\n" +
                                "                                        8ND8888OZ$7I??+++====~~~~~~~~~~~~==++?8I\n" +
                                "                                        IND8888OZ$$7I??++++===~~~~~~~~~~~~~=++?ZD\n" +
                                "                                        8DD888OZ7$$7I??++++==~~~~~~~~~~~~~~==+?7O\n" +
                                "                                        DD888Z$$7777I?+++===~~~~::~~~~~~~~===++78I\n" +
                                "                                       IN888Z$$$$7$7?++++==~~::::::~~~~~~~~~=++IO$\n" +
                                "                                       Z8888Z$7$7$$II77II?+=~~~:::::::::::~~==+IZ7\n" +
                                "                                    7O778D8O$777$ZZOZOO888O$7?=~~::::~~~~~~~=+?IZI\n" +
                                "                                   I77I?7D8Z777777$II?+?++IIII++~~~~~+?$$Z?++++?Z?\n" +
                                "                                   7I7II$OZ$$7IIII7ZDONDZ$I$7I?+=~~~=+?I77$O$$I?8\n" +
                                "                                   I7?IIIOZ$7I????I$7ID87:I7III+~:~+I7$7?7?+??$?Z?\n" +
                                "                                    I+7+$ZZ$$7I?++++?++++++++II+~:~??7ODIIIII????$I\n" +
                                "                                    II7I7Z$$$7I?+========~=+???+~~==+?I8O=?7?+=?+Z?\n" +
                                "                                     7$$Z$$$7I?++=====~~~==+?I+~~==~=++++++===++??\n" +
                                "                                      7IZZ$$$7I??+==~~~~~~~=+??+~~=~=~~~~===~~=+++\n" +
                                "                                        OZZ$77I??+=~~~~~~=???II+====~~~~~~~~~~+++\n" +
                                "                                        OZZ$77II?+=~~~~==+I?+?+=~:~===~:~~:~~~==\n" +
                                "                                        OZZ$777I?+=====++?77OZ?+====~==~~:::~=+?\n" +
                                "                                        OZ$$77III++++?++??II7II7I?7I==+=~~~~~=+\n" +
                                "                                        OZZ$7III?++???????++++===+++=~=+=~~~~=+\n" +
                                "                                        OOZ$7I???=~+7IIIII+==~:~~~~=+===?====+I\n" +
                                "                                         OZ$7I?I?=~=+?7??~?=I??+++++==+?+===++\n" +
                                "                                         OZ$7II?I+===++IO:::,,:.::,I8ZI+=~=++?\n" +
                                "                                          O$7IIII?+===+??++==::~?=:?+==~~~=++I\n" +
                                "                                          OZ$7IIII?++=++?++~~~~~~=+==~~~~===?\n" +
                                "                                       NZ$ZOZ$7I?III?++++++++==~~===~~~~+==+=\n" +
                                "                                     8DDZ$$$OZ$7II77I?+======+==~~=~~==+==+I\n" +
                                "                                    NDDNO$77$ZZ$$7$$7I?=======~~~~~~==+==?Z88\n" +
                                "                                   DDDDNOZ77I$ZZZ$$$$I?+=+==~~~~~~==+?++?ND8OOO\n" +
                                "                                   DDDDNOZ$7777$Z$$$ZZ7I++====~==~=+?+?7?MND8OO8\n" +
                                "                                  DDD8DDO$$77III7ZZ$$$Z$7?+++====+?I?I++IMMD8OOOO\n" +
                                "                                 7DD88888Z777IIIII$Z$$$$Z$7I?I??77II?=+?IZMDOOOOO8\n" +
                                "                                DNDD8888NZ$7I7I7IIII7$Z$$$7$77777$?++++?7I8DOOOZOO7\n" +
                                "                              DNNNDD888888$7II?IIIIIIII777$$$7I?++====+?I?78OOOZOOD\n" +
                                "                           DDDNNNNDD888888Z7II?????III????++++++====~=+??+IZOOZOZODD8Z\n" +
                                "                        DD8DDDDNNNDDD88O88877I???+++?????++++====~~~~=++++7ZOOOOOOD8OO88O\n" +
                                "                   ODD8DDDDDDDDNNNDD88OOOOOIII?+++=++==+++==~~~~~~~==+==+78OOOOO8D8OOZ88888Z\n" +
                                "                 DDD8DDD888DDDDDDNNNND88OOOO$III?++=======~~~~~~~~=======+$8OOZOO8D8OOZZOOOO8888?\n" +
                                "             ZDD88DDDD888888D8888DNNNND88OOOO7?I??++======~~~~~~=~=====~=IO8OZOOO8D8OOZOZ8888888888$\n" +
                                "          8DD8DDDD8888888888888888DNNNND88OOOOI+??++=======~~~~~~~~~~~~=+DO8OOZZO8D8OOZOZZOOOOOOOOO8888I\n" +
                                "        DD8DDDDDD8888888888888D8O88DDNNNDD8OOO8+=++===~~~~~~~~~~~~~~~~=+88ZOOZZZO88OOOOOZZZOOOOOOOOO8OO88Z\n" +
                                "     ZDD8DDD8D88888888888888888DOO88DDNNNDD8OOO8+==~~~~~~~~~~~~~~~~~~~?OO8ZOOZZOOO88OZZZZZOOOOOOOOOOOO8OO88\n", crockettsWords, crockettsPokeymon);
            }
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
                            if(i*20 + i2 < destructionCounter){
                                double rando = Math.random()*2;
                                map += (int)(rando);
                            }
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
            if(destructionCounter > 0){
                destructionCounter++;
            }
        }
    }
}
