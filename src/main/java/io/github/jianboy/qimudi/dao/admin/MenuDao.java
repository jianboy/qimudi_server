package io.github.jianboy.qimudi.dao.admin;
/**
 * 后台菜单数据库操作层
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import io.github.jianboy.qimudi.entity.admin.Menu;

@Repository
public interface MenuDao extends JpaRepository<Menu, Long> {
	@Query("select m from Menu m where m.id = :id")
	Menu find(@Param("id")Long id);
}
