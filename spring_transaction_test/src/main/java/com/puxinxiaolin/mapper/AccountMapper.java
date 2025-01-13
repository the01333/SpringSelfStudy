package com.puxinxiaolin.mapper;

import org.apache.ibatis.annotations.Param;

public interface AccountMapper {

    // 加钱
    void increMoney(@Param("accountName") String accountName,
                    @Param("money") Integer money);

    // 减钱
    void decreMoney(@Param("accountName") String accountName,
                    @Param("money") Integer money);

}
