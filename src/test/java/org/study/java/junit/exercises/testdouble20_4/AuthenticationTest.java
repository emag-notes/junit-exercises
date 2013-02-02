package org.study.java.junit.exercises.testdouble20_4;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class AuthenticationTest {

    public static class アカウントが存在しない場合 {
        Authentication sut;
        
        @Before
        public void setUp() throws Exception {
            sut = new Authentication();
            sut.dao = mock(AccountDao.class);
            when(sut.dao.findOrNull("user001")).thenReturn(null);
        }
        
        @Test
        public void authenticateはnullを返す() throws Exception {
            assertThat(sut.authenticate("user001", "pw123"), is(nullValue()));
        }
    }
    
    public static class アカウントが存在しパスワードが一致する場合 {
        Authentication sut;
        Account account;
        
        @Before
        public void setUp() throws Exception {
            sut = new Authentication();
            sut.dao = mock(AccountDao.class);
            account = new Account("user001", "pw123");
            when(sut.dao.findOrNull("user001")).thenReturn(account);
        }
        
        @Test
        public void authenticateはaccountを返す() throws Exception {
            assertThat(sut.authenticate("user001", "pw123"), is(account));
        }
    }
    
    public static class アカウントが存在しパスワードが一致しない場合 {
        Authentication sut;
        Account account;
        
        @Before
        public void setUp() throws Exception {
            sut = new Authentication();
            sut.dao = mock(AccountDao.class);
            account = new Account("user001", "pw999");
            when(sut.dao.findOrNull("user001")).thenReturn(account);
        }
        
        @Test
        public void authenticateはnullを返す() throws Exception {
            assertThat(sut.authenticate("user001", "pw123"), is(nullValue()));
        }
    }
}
