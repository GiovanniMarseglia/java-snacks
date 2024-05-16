package org.learning;

public class RandNameSurname {
    public static void main(String[] args) {
        String[] nameList = {"Francesco", "Michele", "Filippo", "Francesca", "Rebecca", "Stefano", "Stefania", "Lucrezia"};
        String[] surnameList = {"Rossi", "Bianchi", "Romano", "Colombo", "Conti", "De Luca", "Ricci", "Esposito"};
        String[] newList = new String[10];
        for (int i = 0; i < 10; i++) {
            newList[i] = nameList[(int)(Math.random() * nameList.length)] + " " + surnameList[(int)(Math.random() * surnameList.length)];
            for (int j = 0; j < i; j++) {
                if(newList[i].equals(newList[j])){
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(newList[i]);
        }

    }
}
