package week03d04;


public class PhoneParser {
    public Phone parsePhone(String s) {
        String prefix = s.substring(0,s.indexOf("-"));
        String number = s.substring(s.indexOf("-") + 1);

        Phone phone = new Phone(prefix, number);
        return phone;
    }

    public static void main(String[] args) {

        PhoneParser parser = new PhoneParser();
        Phone phone = parser.parsePhone("30-2345678");

        System.out.println(phone.getPrefix());;
        System.out.println(phone.getNumber());
        System.out.println(phone);
        System.out.println(phone.toString());

    }
}
