package com.company.bubblesort;

import java.util.Locale;

public class JadenCase {

        public String toJadenCase(String phrase) {
            // TODO put your code below this comment

            if (phrase==null || phrase.isEmpty()) {
                return null;
            }
            String[] phrase1;
            phrase1 = phrase.split(" ");
            for (int i=0; i < phrase.length(); i++) {
                phrase1[i] = String.valueOf(phrase1[i].charAt(0)).toUpperCase() + phrase1[i].substring(1);

            }
            return String.join(" ", phrase1);



//            return null;
        }


}
