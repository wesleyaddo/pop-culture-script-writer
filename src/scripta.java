import java.util.Random;

public class scripta {
    public static void main(String[] args) {
        Random random = new Random();

        String[] name1options = {"Spiderman", "Eddie Brock", "Dr. Octopus"};

        String name1 = name1options[random.nextInt(name1options.length)];

        String[] name2options = {"Uncle Ben", "Green Goblin", "J. Jonah Jameson"};

        String name2 = name2options[random.nextInt(name2options.length)];

        String[] scenario1options = {"bursts through a wall",
                "politely knocks on the door twice",
                "jumps down from the window to the ground. He did not realize how far off he was from the ground."};

        String[] scenario1response0 = {name1.toUpperCase() + "\nOoooh yeeeeaaaahhhh!",
                name1.toUpperCase() + "\nOof that's a lot of damage. Didn't mean to break that. I know a guy if you want his number.\n" +
                        "I'm just going to leave his card here. " +
                        "Same time Monday? No?... I'll see myself out."};

        String[] scenario1response1 = {name2.toUpperCase() + "\nYes? Who is it?",
                name1.toUpperCase() + "\nI come in now!"};

        String[] scenario1response2 = {"*Splat. He is dead. Like Uncle Ben.*\n\n" + name2.toUpperCase() +
                "\nIf only he had his protective gear on. It's a shame. Let's get out of here, boys",
                "GROUND\nOmae wa mou shindeiru"};


        String[] s1response0options0 = {name2.toUpperCase() + "\n" + name1 + ", goddamnit! How many times do I have to tell you?! " +
                "You're not as good as your father \nand you'll never be! There'll only ever be ONE Kool-aid Man, you hear me?! ONE!",
                "*" + name1 + " sees a letter on the coffee table and opens it*\n\n" + name2.toUpperCase() +
                        "\nBut alas, I had escaped before you found me here, to a  cabin in the Alps to start a family of my own.\n" +
                        "This life of incessant crime has grown tiresome and it is beginning to wear on my " +
                        "body and weigh on my\nconscience. If you are reading this, it is too late. Goodbye. Do not look for me."};

        String[] s1response0options1 = {name2.toUpperCase() + "\n...",
                name2.toUpperCase() + "\nCan't I ever have anything nice around here? :(\n\n" +
                        "*Tear rolls down cheek*"};

        String[] s1response1options0 = {name1.toUpperCase() + "\nIt's-a-me... One of the identical infinite copies of me, from a dystopian " +
                "Earth 300 years into the future, here to stop the robot uprising.",
                name1.toUpperCase() + "\nDo you not have any understanding of the basic call-response structure of a knock knock joke?\n\n" +
                        name2.toUpperCase() + "\nNo :("};

        String[] s1response1options1 = {name2.toUpperCase() + "\nNoooo, not yet!\n\n*Door swings open. Cue Seinfield theme*",
                "*" + name2 + " turns around in swivel chair*\n\n" + name2.toUpperCase() + "\nI've been waiting for you\n\n" +
                        "This content is brought to you by Seat Geek!"};

        String[] s1response2options0 = {"*Dramatic slow camera close up on " + name1 + "'s hand. Horror music rising and comimg to the fore. " +
                "A finger twtiches. \nScreen suddenly goes black. In a deep, blood red font the words, 'WELCOME TO MOE'S' appear on the screen",
                "That's all folks!\n*Cue Looney Tunes upbeat iconic ending theme*"};

        String[] s1response2options1 = {name1.toUpperCase() + "\nNani?",
                "*A day on, Captain Hindsight will rightly say he saw this coming.*"};


        String scenario1 = scenario1options[random.nextInt(scenario1options.length)];
        System.out.println("\n*" + name1 + " " + scenario1 + "*\n");

        {
            if (scenario1 == scenario1options[0]) {
                String s1response = scenario1response0[random.nextInt(scenario1response0.length)];
                System.out.println(s1response + "\n");
                {
                    if (s1response == scenario1response0[0]) {
                        System.out.println(s1response0options0[random.nextInt(s1response0options0.length)] + "\n");
                    } else if (s1response == scenario1response0[1]) {
                        System.out.println(s1response0options1[random.nextInt(s1response0options1.length)] + "\n");
                    }
                }
            } else if (scenario1 == scenario1options[1]) {
                String s1response1 = scenario1response1[random.nextInt(scenario1response1.length)];
                System.out.println(s1response1 + "\n");
                {
                    if (s1response1 == scenario1response1[0]) {
                        System.out.println(s1response1options0[random.nextInt(s1response1options0.length)] + "\n");
                    } else if (s1response1 == scenario1response1[1]) {
                        System.out.println(s1response1options1[random.nextInt(s1response1options1.length)] + "\n");
                    }
                }
            } else {
                String s1response2 = scenario1response2[random.nextInt(scenario1response2.length)];
                System.out.println(s1response2 + "\n");
                {
                    if (s1response2 == scenario1response2[0]) {
                        System.out.println(s1response2options0[random.nextInt(s1response2options0.length)] + "\n");
                    } else if (s1response2 == scenario1response2[1]) {
                        System.out.println(s1response2options1[random.nextInt(s1response2options1.length)] + "\n");
                    }
                }
            }
        }
    }
}