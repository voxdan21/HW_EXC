public class PasswordChecker {
    private int minLength;
    private int maxRepeats;

    public void setMinLength(int length) {
        if (length < 0) throw new IllegalArgumentException("Не может быть отрицательным числом");
        else this.minLength = length;
    }

    public void setMaxRepeats(int repeats) {
        if (repeats <= 0) throw new IllegalArgumentException("Может быть больше только больше 0");
        else this.maxRepeats = repeats;
    }

    public boolean verify(String password) {
        if (password.length() >= minLength && repeatsSymbols(password)) {System.out.println("Подходит! "); return true;}
        else {System.out.println("Не подходит! ");return false;}
    }

    public boolean repeatsSymbols(String password) {
        int consecutiveCount = 1;
        for (int i = 1; i < password.length(); i++) {
            if (password.charAt(i) == password.charAt(i - 1)) {
                consecutiveCount++;
                if (consecutiveCount > maxRepeats) {
                    return false;
                }
            } else {
                consecutiveCount = 1;
            }
        }

        return true;
    }


}
