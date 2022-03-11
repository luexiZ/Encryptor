public class EncryptDecryptRunner {
    public static void main(String[] args) {
        Encryptor testCase = new Encryptor(5, 2);
        System.out.println(testCase.encryptMessage("abc"));

        Encryptor testCase2 = new Encryptor(6, 8);
        System.out.println(testCase2.decryptMessage("Y !lhAok eeAunMr A or bAgw.ieAu MssAyii tAstlt!A"));



    }
}
