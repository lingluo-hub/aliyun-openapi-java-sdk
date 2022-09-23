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

package com.aliyuncs.scdn.transform.v20171115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainPvDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainPvDataResponse.UsageData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainPvDataResponseUnmarshaller {

	public static DescribeScdnDomainPvDataResponse unmarshall(DescribeScdnDomainPvDataResponse describeScdnDomainPvDataResponse, UnmarshallerContext _ctx) {
		
		describeScdnDomainPvDataResponse.setRequestId(_ctx.stringValue("DescribeScdnDomainPvDataResponse.RequestId"));
		describeScdnDomainPvDataResponse.setEndTime(_ctx.stringValue("DescribeScdnDomainPvDataResponse.EndTime"));
		describeScdnDomainPvDataResponse.setStartTime(_ctx.stringValue("DescribeScdnDomainPvDataResponse.StartTime"));
		describeScdnDomainPvDataResponse.setDomainName(_ctx.stringValue("DescribeScdnDomainPvDataResponse.DomainName"));
		describeScdnDomainPvDataResponse.setDataInterval(_ctx.stringValue("DescribeScdnDomainPvDataResponse.DataInterval"));

		List<UsageData> pvDataInterval = new ArrayList<UsageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainPvDataResponse.PvDataInterval.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setValue(_ctx.stringValue("DescribeScdnDomainPvDataResponse.PvDataInterval["+ i +"].Value"));
			usageData.setTimeStamp(_ctx.stringValue("DescribeScdnDomainPvDataResponse.PvDataInterval["+ i +"].TimeStamp"));

			pvDataInterval.add(usageData);
		}
		describeScdnDomainPvDataResponse.setPvDataInterval(pvDataInterval);
	 
	 	return describeScdnDomainPvDataResponse;
	}
}