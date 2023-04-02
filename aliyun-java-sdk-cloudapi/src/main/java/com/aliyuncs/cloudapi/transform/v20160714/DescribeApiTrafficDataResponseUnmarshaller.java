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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiTrafficDataResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiTrafficDataResponse.MonitorItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApiTrafficDataResponseUnmarshaller {

	public static DescribeApiTrafficDataResponse unmarshall(DescribeApiTrafficDataResponse describeApiTrafficDataResponse, UnmarshallerContext _ctx) {
		
		describeApiTrafficDataResponse.setRequestId(_ctx.stringValue("DescribeApiTrafficDataResponse.RequestId"));

		List<MonitorItem> callUploads = new ArrayList<MonitorItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiTrafficDataResponse.CallUploads.Length"); i++) {
			MonitorItem monitorItem = new MonitorItem();
			monitorItem.setItemValue(_ctx.stringValue("DescribeApiTrafficDataResponse.CallUploads["+ i +"].ItemValue"));
			monitorItem.setItemTime(_ctx.stringValue("DescribeApiTrafficDataResponse.CallUploads["+ i +"].ItemTime"));

			callUploads.add(monitorItem);
		}
		describeApiTrafficDataResponse.setCallUploads(callUploads);

		List<MonitorItem> callDownloads = new ArrayList<MonitorItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiTrafficDataResponse.CallDownloads.Length"); i++) {
			MonitorItem monitorItem1 = new MonitorItem();
			monitorItem1.setItemValue(_ctx.stringValue("DescribeApiTrafficDataResponse.CallDownloads["+ i +"].ItemValue"));
			monitorItem1.setItemTime(_ctx.stringValue("DescribeApiTrafficDataResponse.CallDownloads["+ i +"].ItemTime"));

			callDownloads.add(monitorItem1);
		}
		describeApiTrafficDataResponse.setCallDownloads(callDownloads);
	 
	 	return describeApiTrafficDataResponse;
	}
}