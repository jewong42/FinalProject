package com.jewong.joker;

import java.util.Random;

public class Joker {

    private static final String[] JOKE_LIST = {
            "What\'s the best thing about Switzerland? I don\'t know, but the flag is a big plus.",
            "I invented a new word: Plagiarism!",
            "Did you hear about the mathematician who\'s afraid of negative numbers? He\'ll stop at nothing to avoid them.",
            "Why do we tell actors to \"break a leg?\" Because every play has a cast.",
            "Helvetica and Times New Roman walk into a bar \"Get out of here!\" shouts the bartender. \"We don\'t serve your type.\"",
            "Yesterday I saw a guy spill all his Scrabble letters on the road. I asked him, \"What\'s the word on the street?\"",
            "How many times can you subtract 10 from 100? Once. The next time you would be subtracting 10 from 90.",
            "Hear about the new restaurant called Karma? There\'s no menu: You get what you deserve.",
            "A woman in labour suddenly shouted, \"Shouldn\'t! Wouldn\'t! Couldn\'t! Didn\'t! Can\'t!\" \"Don\'t worry,\" said the doctor. \"Those are just contractions.\"",
            "A bear walks into a bar and says, \"Give me a whiskey… and a cola.\" \"Why the big pause?\" asks the bartender. The bear shrugged. \"I\'m not sure. I was born with them.\"",
    };

    public String getJoke() {
        final int index = new Random().nextInt(9);
        return JOKE_LIST[index];
    }

}