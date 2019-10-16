package com.xzg.gmail.service;


import com.xzg.gmail.bean.UmsMember;
import com.xzg.gmail.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
