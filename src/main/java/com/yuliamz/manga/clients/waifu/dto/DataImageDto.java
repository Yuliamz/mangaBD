package com.yuliamz.manga.clients.waifu.dto;

import lombok.Data;
import java.util.List;

@Data
public class DataImageDto {
    public int code;
    public List<ImageDto> images;
}
