package ioconvert.shopping;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListManager {

    public void saveShoppingList(OutputStream os, List<String> items) {
        try (PrintStream ps = new PrintStream(new BufferedOutputStream(os))) {
            for (String item : items) {
                ps.println(item);
            }
        }
    }

    public List<String> loadShoppingList(InputStream is) {
        List<String> shoppingList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                shoppingList.add(line);
            }
            return shoppingList;
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read input file!", e);
        }

    }
}
