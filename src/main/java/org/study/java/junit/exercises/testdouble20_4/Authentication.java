package org.study.java.junit.exercises.testdouble20_4;

public class Authentication {

    AccountDao dao;

    public Account authenticate(String userId, String password) {
        assert dao != null;
        
        Account account = dao.findOrNull(userId);
        
        if (account == null) return null;
        
        return account.getPassword().equals(password) ? account : null;
    }

}
