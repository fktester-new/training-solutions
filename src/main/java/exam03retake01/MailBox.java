package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    public static final int FROM_PREFIX_LENGTH = 5;
    public static final int TO_PREFIX_LENGTH = 3;
    private List<Mail> mails = new ArrayList<>();

    public List<Mail> getMails() {
        return mails;
    }

    public void addMail(Mail mail) {
        mails.add(mail);
    }

    public List<Mail> findByCriteria(String criteria) {
        List<Mail> result = new ArrayList<>();
        if (criteria.contains("from:")) {
            result = findSender(criteria);
            return result;
        }
        if (criteria.contains("to:")) {
            result = findReceiver(criteria);
            return result;
        } else {
            for (Mail mail : mails) {
                if (mail.getSubject().contains(criteria) || mail.getMessage().contains(criteria)) {
                    result.add(mail);
                }
            }
            return result;
        }
    }


    private List<Mail> findSender(String criteria) {
        String crit = criteria.substring(FROM_PREFIX_LENGTH);
        List<Mail> result = new ArrayList<>();
        for (Mail mail : mails) {
            if (mail.getFrom().matchContacts(crit)) {
                result.add(mail);
            }
        }
        return result;
    }

    private List<Mail> findReceiver(String criteria) {
        String crit = criteria.substring(TO_PREFIX_LENGTH);
        List<Mail> result = new ArrayList<>();
        for (Mail mail : mails) {
            for (Contact contact : mail.getTo()) {
                if (contact.matchContacts(crit)) {
                    result.add(mail);
                }
            }
        }
        return result;
    }


}

