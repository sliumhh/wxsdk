package com.kunbao.weixin.sdk.datacube.article.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;
import com.kunbao.weixin.sdk.datacube.article.domain.ArticleTotalData;
import lombok.Getter;

import java.util.List;

/**
 * Created by lemon_bar on 15/7/29.
 */
@Getter
public class WXArticleTotalGetResponse extends WXJsonResponse {
    @JsonProperty("list")
    private List<ArticleTotalData> articleTotalData;
}
