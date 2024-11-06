package com.teachmeskills.lesson_11.application_runner;

import com.teachmeskills.lesson_11.document.DocumentNumber;
import com.teachmeskills.lesson_11.document.document_util.DocumentProcessor;

import java.util.Scanner;

/** Написать программу со следующим функционалом:
 На вход передать строку (будем считать, что это некий стандартный номер
 документа в заданном формате).
 Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это любая цифра,
 а y — это буква латинского алфавита (могут быть большие и маленькие).

 ** - Вывести на экран в одну строку два первых блока по 4 цифры.
 ** - Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
 ** - Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
 ** - Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
 ** - Проверить содержит ли номер документа последовательность "abc" и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
 ** - Проверить начинается ли номер документа с последовательности 555.
 ** - Проверить заканчивается ли номер документа на последовательность 1a2b.

 Все эти методы реализовать в отдельном классе в статических методах,
 каждая задача - в отдельном методе.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the document number in the format xxxx-yyy-xxxx-yyy-xyxy:");
        System.out.println("Where X is any number and Y is a letter of the Latin alphabet.");

        String inputDocumentNumber = scanner.nextLine();

        if (DocumentProcessor.isValidFormat(inputDocumentNumber)) {
            DocumentNumber documentNumber = new DocumentNumber(inputDocumentNumber);
            System.out.println("The entered document number: " + documentNumber.getNumber());

            DocumentProcessor.printFirstTwoBlocksNumbers(documentNumber.getNumber());
            DocumentProcessor.printMaskedDocumentWithoutLetters(documentNumber.getNumber());
            DocumentProcessor.printLowercaseLetters(documentNumber.getNumber());
            DocumentProcessor.printUppercaseLetters(documentNumber.getNumber());
            DocumentProcessor.checkContains(documentNumber.getNumber());
            DocumentProcessor.checkStartsWith(documentNumber.getNumber());
            DocumentProcessor.checkEndsWith(documentNumber.getNumber());
        } else {
            System.out.println("The document number format is incorrect.");
        }

        scanner.close();
    }
}