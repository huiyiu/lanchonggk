package com.lanchong.forum.repository;

import com.lanchong.forum.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  AttachmentRepository  extends JpaRepository<Attachment,Long> {
    List<Attachment> findByPid(Integer pid);

    List<Attachment> findByTidAndUid(Integer tid, Integer uid);
}
