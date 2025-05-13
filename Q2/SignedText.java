public class SignedText {
    private String firstName;
    private String lastName;
    
    public SignedText(String fN, String lN) {
        firstName = fN;
        lastName = lN;
    }

    public String getSignature() {
        if (firstName.length() == 0) {
            return lastName;
        }else {
            return firstName.substring(0, 1) + "-" + lastName;
        }
    }

    public String addSignature(String text) {
        String sig = getSignature();
        int sigLength = sig.length();

        if (text.indexOf(sig) == text.length() - sigLength && text.length() >= sigLength) {
            return text;
        }else if (text.indexOf(sig) == 0) {
            return text.substring(sigLength) + sig;
        }else {
            return text + sig;
        }
    }
}
