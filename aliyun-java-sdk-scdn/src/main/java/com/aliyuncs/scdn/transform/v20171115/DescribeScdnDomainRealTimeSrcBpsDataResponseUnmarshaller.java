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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainRealTimeSrcBpsDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainRealTimeSrcBpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainRealTimeSrcBpsDataResponseUnmarshaller {

	public static DescribeScdnDomainRealTimeSrcBpsDataResponse unmarshall(DescribeScdnDomainRealTimeSrcBpsDataResponse describeScdnDomainRealTimeSrcBpsDataResponse, UnmarshallerContext _ctx) {
		
		describeScdnDomainRealTimeSrcBpsDataResponse.setRequestId(_ctx.stringValue("DescribeScdnDomainRealTimeSrcBpsDataResponse.RequestId"));
		describeScdnDomainRealTimeSrcBpsDataResponse.setEndTime(_ctx.stringValue("DescribeScdnDomainRealTimeSrcBpsDataResponse.EndTime"));
		describeScdnDomainRealTimeSrcBpsDataResponse.setStartTime(_ctx.stringValue("DescribeScdnDomainRealTimeSrcBpsDataResponse.StartTime"));
		describeScdnDomainRealTimeSrcBpsDataResponse.setDomainName(_ctx.stringValue("DescribeScdnDomainRealTimeSrcBpsDataResponse.DomainName"));
		describeScdnDomainRealTimeSrcBpsDataResponse.setDataInterval(_ctx.stringValue("DescribeScdnDomainRealTimeSrcBpsDataResponse.DataInterval"));

		List<DataModule> realTimeSrcBpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainRealTimeSrcBpsDataResponse.RealTimeSrcBpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setValue(_ctx.stringValue("DescribeScdnDomainRealTimeSrcBpsDataResponse.RealTimeSrcBpsDataPerInterval["+ i +"].Value"));
			dataModule.setTimeStamp(_ctx.stringValue("DescribeScdnDomainRealTimeSrcBpsDataResponse.RealTimeSrcBpsDataPerInterval["+ i +"].TimeStamp"));

			realTimeSrcBpsDataPerInterval.add(dataModule);
		}
		describeScdnDomainRealTimeSrcBpsDataResponse.setRealTimeSrcBpsDataPerInterval(realTimeSrcBpsDataPerInterval);
	 
	 	return describeScdnDomainRealTimeSrcBpsDataResponse;
	}
}