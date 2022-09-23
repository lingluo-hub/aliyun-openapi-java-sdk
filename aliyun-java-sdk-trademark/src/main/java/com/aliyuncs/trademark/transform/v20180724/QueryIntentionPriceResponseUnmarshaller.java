/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.QueryIntentionPriceResponse;
import com.aliyuncs.trademark.model.v20180724.QueryIntentionPriceResponse.TmProduces;
import com.aliyuncs.trademark.model.v20180724.QueryIntentionPriceResponse.TmProduces.FirstClassification;
import com.aliyuncs.trademark.model.v20180724.QueryIntentionPriceResponse.TmProduces.ThirdClassifications;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryIntentionPriceResponseUnmarshaller {

	public static QueryIntentionPriceResponse unmarshall(QueryIntentionPriceResponse queryIntentionPriceResponse, UnmarshallerContext _ctx) {
		
		queryIntentionPriceResponse.setRequestId(_ctx.stringValue("QueryIntentionPriceResponse.RequestId"));
		queryIntentionPriceResponse.setCurrentPageNum(_ctx.integerValue("QueryIntentionPriceResponse.CurrentPageNum"));
		queryIntentionPriceResponse.setTotalPageNum(_ctx.integerValue("QueryIntentionPriceResponse.TotalPageNum"));
		queryIntentionPriceResponse.setPageSize(_ctx.integerValue("QueryIntentionPriceResponse.PageSize"));
		queryIntentionPriceResponse.setTotalItemNum(_ctx.integerValue("QueryIntentionPriceResponse.TotalItemNum"));

		List<TmProduces> data = new ArrayList<TmProduces>();
		for (int i = 0; i < _ctx.lengthValue("QueryIntentionPriceResponse.Data.Length"); i++) {
			TmProduces tmProduces = new TmProduces();
			tmProduces.setType(_ctx.integerValue("QueryIntentionPriceResponse.Data["+ i +"].Type"));
			tmProduces.setStatus(_ctx.integerValue("QueryIntentionPriceResponse.Data["+ i +"].Status"));
			tmProduces.setOrderPrice(_ctx.floatValue("QueryIntentionPriceResponse.Data["+ i +"].OrderPrice"));
			tmProduces.setUpdateTime(_ctx.longValue("QueryIntentionPriceResponse.Data["+ i +"].UpdateTime"));
			tmProduces.setMaterialName(_ctx.stringValue("QueryIntentionPriceResponse.Data["+ i +"].MaterialName"));
			tmProduces.setCreateTime(_ctx.longValue("QueryIntentionPriceResponse.Data["+ i +"].CreateTime"));
			tmProduces.setBizId(_ctx.stringValue("QueryIntentionPriceResponse.Data["+ i +"].BizId"));
			tmProduces.setServicePrice(_ctx.floatValue("QueryIntentionPriceResponse.Data["+ i +"].ServicePrice"));
			tmProduces.setTmIcon(_ctx.stringValue("QueryIntentionPriceResponse.Data["+ i +"].TmIcon"));
			tmProduces.setTmName(_ctx.stringValue("QueryIntentionPriceResponse.Data["+ i +"].TmName"));
			tmProduces.setMaterialId(_ctx.stringValue("QueryIntentionPriceResponse.Data["+ i +"].MaterialId"));
			tmProduces.setSupplementId(_ctx.longValue("QueryIntentionPriceResponse.Data["+ i +"].SupplementId"));
			tmProduces.setLoaUrl(_ctx.stringValue("QueryIntentionPriceResponse.Data["+ i +"].LoaUrl"));
			tmProduces.setTmNumber(_ctx.stringValue("QueryIntentionPriceResponse.Data["+ i +"].TmNumber"));
			tmProduces.setNote(_ctx.stringValue("QueryIntentionPriceResponse.Data["+ i +"].Note"));
			tmProduces.setSupplementStatus(_ctx.integerValue("QueryIntentionPriceResponse.Data["+ i +"].SupplementStatus"));
			tmProduces.setTotalPrice(_ctx.floatValue("QueryIntentionPriceResponse.Data["+ i +"].TotalPrice"));

			FirstClassification firstClassification = new FirstClassification();
			firstClassification.setClassificationName(_ctx.stringValue("QueryIntentionPriceResponse.Data["+ i +"].FirstClassification.ClassificationName"));
			firstClassification.setClassificationCode(_ctx.stringValue("QueryIntentionPriceResponse.Data["+ i +"].FirstClassification.ClassificationCode"));
			tmProduces.setFirstClassification(firstClassification);

			List<ThirdClassifications> thirdClassification = new ArrayList<ThirdClassifications>();
			for (int j = 0; j < _ctx.lengthValue("QueryIntentionPriceResponse.Data["+ i +"].ThirdClassification.Length"); j++) {
				ThirdClassifications thirdClassifications = new ThirdClassifications();
				thirdClassifications.setClassificationName(_ctx.stringValue("QueryIntentionPriceResponse.Data["+ i +"].ThirdClassification["+ j +"].ClassificationName"));
				thirdClassifications.setClassificationCode(_ctx.stringValue("QueryIntentionPriceResponse.Data["+ i +"].ThirdClassification["+ j +"].ClassificationCode"));

				thirdClassification.add(thirdClassifications);
			}
			tmProduces.setThirdClassification(thirdClassification);

			data.add(tmProduces);
		}
		queryIntentionPriceResponse.setData(data);
	 
	 	return queryIntentionPriceResponse;
	}
}