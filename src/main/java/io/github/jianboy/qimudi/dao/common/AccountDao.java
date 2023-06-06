package io.github.jianboy.qimudi.dao.common;
/**
 * 前端用户信息管理数据库操作层
 */
import io.github.jianboy.qimudi.entity.common.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao extends JpaRepository<Account, Long> {
	
	@Query("select a from Account a where a.id = :id")
	Account find(@Param("id")Long id);
	
	Account findByMobile(String mobile);
}
