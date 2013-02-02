package org.study.java.junit.exercises.testdouble20_4;

public interface AccountDao {

    /**
     * userId を指定し、アカウント情報を取得する
     * @param userId システムで一意であるユーザ ID
     * @return 指定されたユーザ ID のアカウント情報、存在しない場合は null
     */
    Account findOrNull(String userId);
}
