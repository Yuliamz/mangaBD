package com.yuliamz.manga.clients.jikan.dto;

import lombok.Data;
import java.util.List;

@Data
public class MangaInfoDto {
    public List<PublisherDto> serializations;
}
