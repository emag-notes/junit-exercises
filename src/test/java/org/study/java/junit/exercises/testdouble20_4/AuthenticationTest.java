package org.study.java.junit.exercises.testdouble20_4;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.*;

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
    
}
