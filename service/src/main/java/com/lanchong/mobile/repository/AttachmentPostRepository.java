package com.lanchong.mobile.repository;

import com.lanchong.mobile.entity.AttachmentInfo;
import com.lanchong.mobile.entity.AttachmentPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentPostRepository extends JpaRepository<AttachmentPost,Long> {
}
