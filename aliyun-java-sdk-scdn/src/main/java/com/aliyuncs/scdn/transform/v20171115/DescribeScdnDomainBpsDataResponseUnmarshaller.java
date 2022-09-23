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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainBpsDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainBpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainBpsDataResponseUnmarshaller {

	public static DescribeScdnDomainBpsDataResponse unmarshall(DescribeScdnDomainBpsDataResponse describeScdnDomainBpsDataResponse, UnmarshallerContext _ctx) {
		
		describeScdnDomainBpsDataResponse.setRequestId(_ctx.stringValue("DescribeScdnDomainBpsDataResponse.RequestId"));
		describeScdnDomainBpsDataResponse.setEndTime(_ctx.stringValue("DescribeScdnDomainBpsDataResponse.EndTime"));
		describeScdnDomainBpsDataResponse.setStartTime(_ctx.stringValue("DescribeScdnDomainBpsDataResponse.StartTime"));
		describeScdnDomainBpsDataResponse.setDomainName(_ctx.stringValue("DescribeScdnDomainBpsDataResponse.DomainName"));
		describeScdnDomainBpsDataResponse.setDataInterval(_ctx.stringValue("DescribeScdnDomainBpsDataResponse.DataInterval"));

		List<DataModule> bpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainBpsDataResponse.BpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setBpsValue(_ctx.stringValue("DescribeScdnDomainBpsDataResponse.BpsDataPerInterval["+ i +"].BpsValue"));
			dataModule.setTimeStamp(_ctx.stringValue("DescribeScdnDomainBpsDataResponse.BpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setHttpsBpsValue(_ctx.stringValue("DescribeScdnDomainBpsDataResponse.BpsDataPerInterval["+ i +"].HttpsBpsValue"));
			dataModule.setHttpBpsValue(_ctx.stringValue("DescribeScdnDomainBpsDataResponse.BpsDataPerInterval["+ i +"].HttpBpsValue"));

			bpsDataPerInterval.add(dataModule);
		}
		describeScdnDomainBpsDataResponse.setBpsDataPerInterval(bpsDataPerInterval);
	 
	 	return describeScdnDomainBpsDataResponse;
	}
}