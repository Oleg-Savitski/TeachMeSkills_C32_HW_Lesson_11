package com.teachmeskills.lesson_11.document.document_util;

public class DocumentProcessor {

    // Вывести на экран в одну строку два первых блока по 4 цифры.
    public static void printFirstTwoBlocksNumbers(String documentNumber) {
        String cleanedNumber = documentNumber.replace("-", "");
        String firstBlock = cleanedNumber.substring(0, 4);
        String secondBlock = cleanedNumber.substring(7, 11);
        System.out.println("The first two blocks of digits: " + firstBlock + " " + secondBlock);
    }

    // Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
    public static void printMaskedDocumentWithoutLetters(String documentNumber) {
        String masked = documentNumber.replaceAll("[A-Za-z]", "*");
        System.out.println("The classified document number: " + masked);
    }

    // Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
    public static void printLowercaseLetters(String documentNumber) {
        StringBuilder lowercaseLetters = new StringBuilder();
        for (char c : documentNumber.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowercaseLetters.append(c);
            }
        }
        System.out.println("The letters from the document are in lowercase: " + lowercaseLetters);
    }

    /* Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем
    регистре(реализовать с помощью класса StringBuilder). */
    public static void printUppercaseLetters(String documentNumber) {
        StringBuilder uppercaseLetters = new StringBuilder();
        for (char c : documentNumber.toCharArray()) {
            if (Character.isLetter(c)) {
                uppercaseLetters.append(Character.toUpperCase(c));
            }
        }
        System.out.println("Uppercase letters from the document: " + uppercaseLetters);
    }

    /* Проверить содержит ли номер документа последовательность "abc" и вывети
    сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью). */
    public static void checkContains(String documentNumber) {
        if (documentNumber.toLowerCase().contains("abc")) {
            System.out.println("The document number contains the sequence 'abc'.");
        } else {
            System.out.println("The document number does not contain the sequence 'abc'.");
        }
    }

    // Проверить начинается ли номер документа с последовательности 555.
    public static void checkStartsWith(String documentNumber) {
        if (documentNumber.startsWith("555")) {
            System.out.println("The document number starts with '555'.");
        } else {
            System.out.println("The document number does not start with '555'.");
        }
    }

    // Проверить заканчивается ли номер документа на последовательность 1a2b.
    public static void checkEndsWith(String documentNumber) {
        if (documentNumber.toLowerCase().endsWith("1a2b")) {
            System.out.println("The document number ends with '1a2b'.");
        } else {
            System.out.println("Номер документа заканчивается на '1a2b'.");
        }
    }

    /* Метод проверки ввода строки с консоли.
    1. Проверка длины.
    2. Проверка на корректность ввода первых четырёх символов. */
    public static boolean isValidFormat(String documentNumber) {
        if (documentNumber.length() != 22) {
            System.out.println("Error: The document number must contain exactly 22 characters.");
            return false;
        }

        if (!documentNumber.substring(0, 4).matches("[0-9]+")) {
            System.out.println("Error: The first 4 characters of the document number must be digits.");
            return false;
        }

        return true;
    }
}