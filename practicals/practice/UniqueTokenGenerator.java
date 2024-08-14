import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UniqueTokenGenerator {
    private static final int TOKEN_LENGTH = 8;
    private static final long TOTAL_TOKENS = 20L; // 20 billion

    public static void main(String[] args) {
        Set<String> generatedTokens = new HashSet<>();

        while (generatedTokens.size() < TOTAL_TOKENS) {
            String token = generateToken();
            generatedTokens.add(token);
        }

        System.out.println("Total unique tokens generated: " + generatedTokens.size());
    }

    private static String generateToken() {
        StringBuilder tokenBuilder = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < TOKEN_LENGTH; i++) {
            switch (random.nextInt(4)) {
                case 0: // Capital letter (A-Z)
                    tokenBuilder.append((char) (random.nextInt(26) + 'A'));
                    break;
                case 1: // Small letter (a-z)
                    tokenBuilder.append((char) (random.nextInt(26) + 'a'));
                    break;
                case 2: // Number (0-9)
                    tokenBuilder.append(random.nextInt(10));
                    break;
                case 3: // Special symbol
                    char[] symbols = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'};
                    tokenBuilder.append(symbols[random.nextInt(symbols.length)]);
                    break;
            }
        }

        return tokenBuilder.toString();
    }
}
