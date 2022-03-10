public class EncryptDecryptRunner {
    public static void main(String[] args) {
        Encryptor testCase = new Encryptor(6, 8);
        System.out.println(testCase.encryptMessage("You guys know it! Mr.Miller is the best!"));

        Encryptor testCase2 = new Encryptor(6, 8);
        System.out.println(testCase2.decryptMessage("Y !lhAok eeAunMr A or bAgw.ieAu MssAyii tAstlt!A"));



    }
}
