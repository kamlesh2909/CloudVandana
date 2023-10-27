package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


    class PangramChecker {
        public static boolean isPangram(String sentence) {
            // Create an array to mark the presence of each letter from 'a' to 'z'
            boolean[] letters = new boolean[26];

            // Convert the input sentence to lowercase to make it case-insensitive
            sentence = sentence.toLowerCase();

            for (int i = 0; i < sentence.length(); i++) {
                char c = sentence.charAt(i);

                // Check if the character is a lowercase letter
                if (c >= 'a' && c <= 'z') {
                    // Mark the corresponding letter as present
                    letters[c - 'a'] = true;
                }
            }

            // Check if all letters from 'a' to 'z' are marked as present
            for (boolean present : letters) {
                if (!present) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            String inputSentence = "The quick brown fox jumps over the lazy dog";
            boolean isPangram = isPangram(inputSentence);

            if (isPangram) {
                System.out.println("The input sentence is a pangram.");
            } else {
                System.out.println("The input sentence is not a pangram.");
            }
        }
    }
