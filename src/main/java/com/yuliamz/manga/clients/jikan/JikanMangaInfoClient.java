package com.yuliamz.manga.clients.jikan;

import com.yuliamz.manga.clients.jikan.dto.DataCharacter;
import com.yuliamz.manga.clients.jikan.dto.MangaInfoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;


@FeignClient(url = "https://api.jikan.moe")
public interface JikanMangaInfoClient {

    /**
     * Get the manga with the given id
     *
     * @param id The id of the manga you want to get.
     * @return The MangaInfoDto class.
     */
    @GetMapping("/v4/manga/{id}")
    MangaInfoDto getMangaById(@PathVariable Integer id);

    /**
     * Get the characters of a manga
     *
     * @param id The id of the manga you want to get the characters from.
     * @return A list of characters.
     */
    @GetMapping("/v4/manga/{id}/characters")
    List<DataCharacter> getMangaCharacters(@PathVariable Integer id);
}
