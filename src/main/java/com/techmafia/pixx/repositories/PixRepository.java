package com.techmafia.pixx.repositories;

import com.techmafia.pixx.domain.entity.Pix;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PixRepository extends JpaRepository<Pix, Long> {
}
