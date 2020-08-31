package com.kumsalyazilim;

import com.kumsalyazilim.entity.Kullanici;
import com.kumsalyazilim.repository.KullaniciRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kullanici")
public class KullaniciApi {

    @Autowired
    private KullaniciRepostory kullaniciRepostory;

    @PostMapping
    public ResponseEntity<Kullanici> ekle(@RequestBody Kullanici kullanici)
    {
        return ResponseEntity.ok(kullaniciRepostory.save(kullanici));
    }
    @GetMapping
    public ResponseEntity<List<Kullanici>> tumunulistele(Kullanici kullanici)
    {
        return ResponseEntity.ok(kullaniciRepostory.findAll());
    }
}
