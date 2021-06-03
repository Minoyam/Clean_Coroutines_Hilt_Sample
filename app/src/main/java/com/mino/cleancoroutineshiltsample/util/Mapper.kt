package com.mino.cleancoroutineshiltsample

import com.mino.cleancoroutineshiltsample.vo.ImageVo
import com.mino.domain.dto.ImageDto

fun ImageDto.dtoToVo() = ImageVo(
    link = link,
    sizeheight = sizeheight,
    sizewidth = sizewidth,
    thumbnail = thumbnail,
    title = title
)