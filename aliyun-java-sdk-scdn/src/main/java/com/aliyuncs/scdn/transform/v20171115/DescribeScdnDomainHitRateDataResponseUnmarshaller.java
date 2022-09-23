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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainHitRateDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainHitRateDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainHitRateDataResponseUnmarshaller {

	public static DescribeScdnDomainHitRateDataResponse unmarshall(DescribeScdnDomainHitRateDataResponse describeScdnDomainHitRateDataResponse, UnmarshallerContext _ctx) {
		
		describeScdnDomainHitRateDataResponse.setRequestId(_ctx.stringValue("DescribeScdnDomainHitRateDataResponse.RequestId"));
		describeScdnDomainHitRateDataResponse.setEndTime(_ctx.stringValue("DescribeScdnDomainHitRateDataResponse.EndTime"));
		describeScdnDomainHitRateDataResponse.setStartTime(_ctx.stringValue("DescribeScdnDomainHitRateDataResponse.StartTime"));
		describeScdnDomainHitRateDataResponse.setDomainName(_ctx.stringValue("DescribeScdnDomainHitRateDataResponse.DomainName"));
		describeScdnDomainHitRateDataResponse.setDataInterval(_ctx.stringValue("DescribeScdnDomainHitRateDataResponse.DataInterval"));

		List<DataModule> hitRatePerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainHitRateDataResponse.HitRatePerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeScdnDomainHitRateDataResponse.HitRatePerInterval["+ i +"].TimeStamp"));
			dataModule.setByteHitRate(_ctx.stringValue("DescribeScdnDomainHitRateDataResponse.HitRatePerInterval["+ i +"].ByteHitRate"));
			dataModule.setReqHitRate(_ctx.stringValue("DescribeScdnDomainHitRateDataResponse.HitRatePerInterval["+ i +"].ReqHitRate"));

			hitRatePerInterval.add(dataModule);
		}
		describeScdnDomainHitRateDataResponse.setHitRatePerInterval(hitRatePerInterval);
	 
	 	return describeScdnDomainHitRateDataResponse;
	}
}