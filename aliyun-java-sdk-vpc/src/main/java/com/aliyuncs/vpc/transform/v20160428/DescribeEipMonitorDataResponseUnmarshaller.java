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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeEipMonitorDataResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeEipMonitorDataResponse.EipMonitorData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEipMonitorDataResponseUnmarshaller {

	public static DescribeEipMonitorDataResponse unmarshall(DescribeEipMonitorDataResponse describeEipMonitorDataResponse, UnmarshallerContext _ctx) {
		
		describeEipMonitorDataResponse.setRequestId(_ctx.stringValue("DescribeEipMonitorDataResponse.RequestId"));

		List<EipMonitorData> eipMonitorDatas = new ArrayList<EipMonitorData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEipMonitorDataResponse.EipMonitorDatas.Length"); i++) {
			EipMonitorData eipMonitorData = new EipMonitorData();
			eipMonitorData.setEipTX(_ctx.longValue("DescribeEipMonitorDataResponse.EipMonitorDatas["+ i +"].EipTX"));
			eipMonitorData.setEipPackets(_ctx.integerValue("DescribeEipMonitorDataResponse.EipMonitorDatas["+ i +"].EipPackets"));
			eipMonitorData.setEipBandwidth(_ctx.integerValue("DescribeEipMonitorDataResponse.EipMonitorDatas["+ i +"].EipBandwidth"));
			eipMonitorData.setTimeStamp(_ctx.stringValue("DescribeEipMonitorDataResponse.EipMonitorDatas["+ i +"].TimeStamp"));
			eipMonitorData.setEipFlow(_ctx.integerValue("DescribeEipMonitorDataResponse.EipMonitorDatas["+ i +"].EipFlow"));
			eipMonitorData.setEipRX(_ctx.longValue("DescribeEipMonitorDataResponse.EipMonitorDatas["+ i +"].EipRX"));

			eipMonitorDatas.add(eipMonitorData);
		}
		describeEipMonitorDataResponse.setEipMonitorDatas(eipMonitorDatas);
	 
	 	return describeEipMonitorDataResponse;
	}
}