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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.DescribePriceResponse;
import com.aliyuncs.ehpc.model.v20180412.DescribePriceResponse.PriceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePriceResponseUnmarshaller {

	public static DescribePriceResponse unmarshall(DescribePriceResponse describePriceResponse, UnmarshallerContext _ctx) {
		
		describePriceResponse.setRequestId(_ctx.stringValue("DescribePriceResponse.RequestId"));
		describePriceResponse.setTotalTradePrice(_ctx.floatValue("DescribePriceResponse.TotalTradePrice"));

		List<PriceInfo> prices = new ArrayList<PriceInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.Prices.Length"); i++) {
			PriceInfo priceInfo = new PriceInfo();
			priceInfo.setOriginalPrice(_ctx.floatValue("DescribePriceResponse.Prices["+ i +"].OriginalPrice"));
			priceInfo.setNodeType(_ctx.stringValue("DescribePriceResponse.Prices["+ i +"].NodeType"));
			priceInfo.setCurrency(_ctx.stringValue("DescribePriceResponse.Prices["+ i +"].Currency"));
			priceInfo.setTradePrice(_ctx.floatValue("DescribePriceResponse.Prices["+ i +"].TradePrice"));

			prices.add(priceInfo);
		}
		describePriceResponse.setPrices(prices);
	 
	 	return describePriceResponse;
	}
}