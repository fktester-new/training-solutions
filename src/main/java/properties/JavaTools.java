package properties;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class JavaTools {

    private static final String ENCODING_UTF8 = "UTF-8";
    public static final String NAME_PROPERTY_POSTFIX = "name";
    private static final String URL_PROPERTY_POSTFIX = "url";
    private Properties tools;

    public JavaTools() {

        try (
                InputStream resource = DatabaseConfiguration.class.getResourceAsStream("/javatools.properties")
        ) {
            tools = load(resource);
        } catch (IOException ioe) {
            throw new RuntimeException("Cannot read file from classpath", ioe);
        }
    }

    private Properties load(InputStream inputStream) {
        Properties result = new Properties();
        try (
                InputStreamReader reader = new InputStreamReader(inputStream, ENCODING_UTF8);
        ) {
            result.load(reader);
            return result;

        } catch (IOException ioe) {
            throw new RuntimeException("Cannot read properties file from input stream", ioe);
        }
    }

    public Set<String> getToolKeys() {
        Set<String> keys;
        Set<String> result = new HashSet<>();
        keys = tools.stringPropertyNames();
        for (String k : keys) {
            if (k.contains(NAME_PROPERTY_POSTFIX)) {
                result.add(k.substring(0, k.indexOf(".")));
            }
        }
        return result;
    }

    public Set<String> getTools() {
        Set<String> result = new HashSet<>();
        for(String k : getToolKeys()){
            result.add(getName(k));
        }
        return result;
    }

    public String getName(String key) {
        return tools.getProperty(key + "." + NAME_PROPERTY_POSTFIX);
    }

    public String getUrl(String key) {
        return tools.getProperty(key + "." + URL_PROPERTY_POSTFIX);
    }


}
