package com.yuliamz.manga.clients.waifu;

import com.yuliamz.manga.clients.waifu.dto.DataImageDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "https://api.waifu.im/")
public interface WaifuClient {

    /**
     * Get a random waifu from the database that matches the tags provided
     *
     * @param tags The tags that the user has selected.
     * @return A DataImageDto object.
     */
    @GetMapping("/random")
    DataImageDto getRandomWaifuByTag(@RequestParam(name = "selected_tags") String tags);

}
