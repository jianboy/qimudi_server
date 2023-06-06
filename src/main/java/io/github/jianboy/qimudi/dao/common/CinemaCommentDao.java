package io.github.jianboy.qimudi.dao.common;
/**
 * 影院评价信息管理数据库操作层
 */
import java.util.List;

import io.github.jianboy.qimudi.entity.common.CinemaComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaCommentDao extends JpaRepository<CinemaComment, Long> {
	
	List<CinemaComment> findByAccountIdOrderByCreateTimeDesc(Long accountId);
	
	List<CinemaComment> findByCinemaIdOrderByCreateTimeDesc(Long cinemaId);
	
}
