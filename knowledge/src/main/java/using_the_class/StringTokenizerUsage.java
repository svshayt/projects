package using_the_class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

// legacy class
public class StringTokenizerUsage {
    public static void main(String[] args) {
        String str = "This is   test example";
        StringTokenizer st = new StringTokenizer(str, " ");

        // counting tokens
        System.out.println("Total tokens : " + st.countTokens());
        // out: Total tokens : 4

        // checking tokens
        for (int i = 0; st.hasMoreTokens(); i++)
            System.out.println("#" + i + ": " + st.nextToken());
        // out: #0: This
        // out: #1: is
        // out: #2: test
        // out: #3: example


        String strSplit = "This is   test example";
        String[] split = strSplit.split(" ");

        for (int i = 0; i < split.length; i++)
            System.out.println("#" + i + ": " + split[i]);

        String[] result = strSplit.split("\\s");
        for (int x = 0; x < result.length; x++)
            System.out.println(result[x]);

        StringTokenizerUsage stringTokenizerUsage = new StringTokenizerUsage();
        List<String> expectedTokensForString = Arrays.asList(
                "Welcome", "to", "svshayt.com");

        List<String> expectedTokensForFile = Arrays.asList(
                "1", "IND", "India",
                "2", "MY", "Malaysia",
                "3", "AU", "Australia");

        String strWelcome = "Welcome,to,svshayt.com";
        List<String> actualTokens1 = stringTokenizerUsage.getTokens(strWelcome);
        System.out.println(actualTokens1);

        List<String> actualTokens2 = stringTokenizerUsage.getTokensFromFile(
                "data.csv", "|");
        System.out.println(actualTokens2);
    }

    public List<String> getTokens(String str) {
        List<String> tokens = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(str, ",");
        while (tokenizer.hasMoreElements()) {
            tokens.add(tokenizer.nextToken());
        }
        return tokens;
    }

    public List<String> getTokensWithCollection(String str) {
        return Collections.list(new StringTokenizer(str, ",")).stream()
                .map(token -> (String) token)
                .collect(Collectors.toList());
    }

    // Reading From CSV File
    public List<String> getTokensFromFile(String path, String delim) {
        List<String> tokens = new ArrayList<>();
        String currLine = "";
        StringTokenizer tokenizer;
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(StringTokenizerUsage.class.getResourceAsStream(
                        "/" + path)))) {
            while ((currLine = br.readLine()) != null) {
                tokenizer = new StringTokenizer(currLine, delim);
                while (tokenizer.hasMoreElements()) {
                    tokens.add(tokenizer.nextToken());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tokens;
    }
}
