package cn.yangxy.cloud.system.user.repository;

import cn.yangxy.cloud.system.user.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *
 * @author <a href="mailto:yangxianyin@mail.taiji.com.cn">yangxy</a>
 * @version 1.0, 2023/5/22
 */

@Repository("userRepository")
public interface UserRepository extends JpaRepository<UserEntity, String> {
}
