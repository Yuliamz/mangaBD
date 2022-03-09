package com.yuliamz.manga.clients.animechan;

import com.yuliamz.manga.clients.animechan.dto.QuoteDto;
import com.yuliamz.manga.clients.waifu.dto.DataImageDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "https://animechan.vercel.app/")
public interface AnimechanClient {

    @GetMapping("/api/random")
    QuoteDto getRandomQuote();

}
