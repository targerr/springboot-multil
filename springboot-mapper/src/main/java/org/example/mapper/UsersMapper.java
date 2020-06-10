package org.example.mapper;

import org.example.pojo.Users;

/**
 * @author Wgs
 * @version 1.0
 * @create：2020/06/11
 */
public interface UsersMapper {
    Users queryById(String id);
}
