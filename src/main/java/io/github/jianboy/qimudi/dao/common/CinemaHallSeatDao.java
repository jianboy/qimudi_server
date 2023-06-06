package io.github.jianboy.qimudi.dao.common;
/**
 * 影厅座位信息管理数据库操作层
 */
import java.util.List;

import io.github.jianboy.qimudi.entity.common.CinemaHallSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaHallSeatDao extends JpaRepository<CinemaHallSeat, Long> {
	
	List<CinemaHallSeat> findByCinemaHallId(Long cinemaHallId);
}
