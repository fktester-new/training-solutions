package iodatastream.bank;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class BankAccountManager {

    public void saveAccount(BankAccount bankaccount, Path folder){
        Path file = folder.resolve(bankaccount.getAccountNumber() + ".dat");
        try(DataOutputStream os = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(file)))){
            os.writeUTF(bankaccount.getAccountNumber());
            os.writeUTF(bankaccount.getOwner());
            os.writeDouble(bankaccount.getBalance());

        } catch (IOException e) {
            throw new IllegalStateException("cannot write file!", e);
        }
    }

    public BankAccount loadAccount(InputStream is){
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(is))){

            return new BankAccount(dis.readUTF(), dis.readUTF(), dis.readDouble());

        } catch (IOException e) {
            throw new IllegalStateException("Cannot read bank account data!", e);
        }
    }
}
