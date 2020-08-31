package com.kumsalyazilim.repository;

import com.kumsalyazilim.entity.Kullanici;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KullaniciRepostory extends MongoRepository<Kullanici,String> {


}
