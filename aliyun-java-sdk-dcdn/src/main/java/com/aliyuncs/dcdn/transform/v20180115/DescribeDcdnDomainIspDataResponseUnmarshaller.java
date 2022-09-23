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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainIspDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainIspDataResponse.IspProportionData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainIspDataResponseUnmarshaller {

	public static DescribeDcdnDomainIspDataResponse unmarshall(DescribeDcdnDomainIspDataResponse describeDcdnDomainIspDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainIspDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainIspDataResponse.RequestId"));
		describeDcdnDomainIspDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnDomainIspDataResponse.EndTime"));
		describeDcdnDomainIspDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainIspDataResponse.StartTime"));
		describeDcdnDomainIspDataResponse.setDomainName(_ctx.stringValue("DescribeDcdnDomainIspDataResponse.DomainName"));
		describeDcdnDomainIspDataResponse.setDataInterval(_ctx.stringValue("DescribeDcdnDomainIspDataResponse.DataInterval"));

		List<IspProportionData> value = new ArrayList<IspProportionData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainIspDataResponse.Value.Length"); i++) {
			IspProportionData ispProportionData = new IspProportionData();
			ispProportionData.setQps(_ctx.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].Qps"));
			ispProportionData.setTotalQuery(_ctx.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].TotalQuery"));
			ispProportionData.setTotalBytes(_ctx.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].TotalBytes"));
			ispProportionData.setAvgResponseRate(_ctx.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].AvgResponseRate"));
			ispProportionData.setAvgResponseTime(_ctx.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].AvgResponseTime"));
			ispProportionData.setProportion(_ctx.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].Proportion"));
			ispProportionData.setAvgObjectSize(_ctx.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].AvgObjectSize"));
			ispProportionData.setIspEname(_ctx.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].IspEname"));
			ispProportionData.setBps(_ctx.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].Bps"));
			ispProportionData.setIsp(_ctx.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].Isp"));
			ispProportionData.setBytesProportion(_ctx.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].BytesProportion"));

			value.add(ispProportionData);
		}
		describeDcdnDomainIspDataResponse.setValue(value);
	 
	 	return describeDcdnDomainIspDataResponse;
	}
}