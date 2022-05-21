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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.DescribeDevicesResponse;
import com.aliyuncs.vcs.model.v20200515.DescribeDevicesResponse.Data;
import com.aliyuncs.vcs.model.v20200515.DescribeDevicesResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDevicesResponseUnmarshaller {

	public static DescribeDevicesResponse unmarshall(DescribeDevicesResponse describeDevicesResponse, UnmarshallerContext _ctx) {
		
		describeDevicesResponse.setRequestId(_ctx.stringValue("DescribeDevicesResponse.RequestId"));
		describeDevicesResponse.setMessage(_ctx.stringValue("DescribeDevicesResponse.Message"));
		describeDevicesResponse.setCode(_ctx.stringValue("DescribeDevicesResponse.Code"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("DescribeDevicesResponse.Data.PageNum"));
		data.setTotalPage(_ctx.integerValue("DescribeDevicesResponse.Data.TotalPage"));
		data.setPageSize(_ctx.integerValue("DescribeDevicesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("DescribeDevicesResponse.Data.TotalCount"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDevicesResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setStatus(_ctx.stringValue("DescribeDevicesResponse.Data.Records["+ i +"].Status"));
			record.setDeviceName(_ctx.stringValue("DescribeDevicesResponse.Data.Records["+ i +"].DeviceName"));
			record.setDeviceType(_ctx.stringValue("DescribeDevicesResponse.Data.Records["+ i +"].DeviceType"));
			record.setDeviceId(_ctx.stringValue("DescribeDevicesResponse.Data.Records["+ i +"].DeviceId"));
			record.setDeviceAddress(_ctx.stringValue("DescribeDevicesResponse.Data.Records["+ i +"].DeviceAddress"));
			record.setCreateTime(_ctx.stringValue("DescribeDevicesResponse.Data.Records["+ i +"].CreateTime"));
			record.setCorpId(_ctx.stringValue("DescribeDevicesResponse.Data.Records["+ i +"].CorpId"));
			record.setLongitude(_ctx.stringValue("DescribeDevicesResponse.Data.Records["+ i +"].Longitude"));
			record.setInProtocol(_ctx.stringValue("DescribeDevicesResponse.Data.Records["+ i +"].InProtocol"));
			record.setLatitude(_ctx.stringValue("DescribeDevicesResponse.Data.Records["+ i +"].Latitude"));
			record.setVendor(_ctx.stringValue("DescribeDevicesResponse.Data.Records["+ i +"].Vendor"));
			record.setCapturedPictureId(_ctx.stringValue("DescribeDevicesResponse.Data.Records["+ i +"].CapturedPictureId"));
			record.setPassword(_ctx.stringValue("DescribeDevicesResponse.Data.Records["+ i +"].Password"));

			records.add(record);
		}
		data.setRecords(records);
		describeDevicesResponse.setData(data);
	 
	 	return describeDevicesResponse;
	}
}