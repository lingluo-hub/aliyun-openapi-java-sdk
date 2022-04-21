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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeDevicesResponse;
import com.aliyuncs.vs.model.v20181212.DescribeDevicesResponse.Device;
import com.aliyuncs.vs.model.v20181212.DescribeDevicesResponse.Device.Directory;
import com.aliyuncs.vs.model.v20181212.DescribeDevicesResponse.Device.Stats;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDevicesResponseUnmarshaller {

	public static DescribeDevicesResponse unmarshall(DescribeDevicesResponse describeDevicesResponse, UnmarshallerContext _ctx) {
		
		describeDevicesResponse.setRequestId(_ctx.stringValue("DescribeDevicesResponse.RequestId"));
		describeDevicesResponse.setPageNum(_ctx.longValue("DescribeDevicesResponse.PageNum"));
		describeDevicesResponse.setPageSize(_ctx.longValue("DescribeDevicesResponse.PageSize"));
		describeDevicesResponse.setTotalCount(_ctx.longValue("DescribeDevicesResponse.TotalCount"));
		describeDevicesResponse.setPageCount(_ctx.longValue("DescribeDevicesResponse.PageCount"));

		List<Device> devices = new ArrayList<Device>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDevicesResponse.Devices.Length"); i++) {
			Device device = new Device();
			device.setType(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].Type"));
			device.setStatus(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].Status"));
			device.setAlarmMethod(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].AlarmMethod"));
			device.setDsn(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].Dsn"));
			device.setPort(_ctx.longValue("DescribeDevicesResponse.Devices["+ i +"].Port"));
			device.setPosInterval(_ctx.longValue("DescribeDevicesResponse.Devices["+ i +"].PosInterval"));
			device.setAutoDirectory(_ctx.booleanValue("DescribeDevicesResponse.Devices["+ i +"].AutoDirectory"));
			device.setParentId(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].ParentId"));
			device.setPassword(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].Password"));
			device.setAutoPos(_ctx.booleanValue("DescribeDevicesResponse.Devices["+ i +"].AutoPos"));
			device.setParams(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].Params"));
			device.setDescription(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].Description"));
			device.setEnabled(_ctx.booleanValue("DescribeDevicesResponse.Devices["+ i +"].Enabled"));
			device.setName(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].Name"));
			device.setChannelSyncTime(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].ChannelSyncTime"));
			device.setCreatedTime(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].CreatedTime"));
			device.setDirectoryId(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].DirectoryId"));
			device.setRegisteredTime(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].RegisteredTime"));
			device.setBizProtocol(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].Protocol"));
			device.setIp(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].Ip"));
			device.setUrl(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].Url"));
			device.setAutoStart(_ctx.booleanValue("DescribeDevicesResponse.Devices["+ i +"].AutoStart"));
			device.setVendor(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].Vendor"));
			device.setGbId(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].GbId"));
			device.setGroupId(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].GroupId"));
			device.setLongitude(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].Longitude"));
			device.setLatitude(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].Latitude"));
			device.setId(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].Id"));
			device.setUsername(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].Username"));

			Stats stats = new Stats();
			stats.setFailedNum(_ctx.longValue("DescribeDevicesResponse.Devices["+ i +"].Stats.FailedNum"));
			stats.setStreamNum(_ctx.longValue("DescribeDevicesResponse.Devices["+ i +"].Stats.StreamNum"));
			stats.setChannelNum(_ctx.longValue("DescribeDevicesResponse.Devices["+ i +"].Stats.ChannelNum"));
			stats.setOnlineNum(_ctx.longValue("DescribeDevicesResponse.Devices["+ i +"].Stats.OnlineNum"));
			stats.setOfflineNum(_ctx.longValue("DescribeDevicesResponse.Devices["+ i +"].Stats.OfflineNum"));
			device.setStats(stats);

			Directory directory = new Directory();
			directory.setParentId(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].Directory.ParentId"));
			directory.setDescription(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].Directory.Description"));
			directory.setGroupId(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].Directory.GroupId"));
			directory.setName(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].Directory.Name"));
			directory.setCreatedTime(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].Directory.CreatedTime"));
			directory.setId(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].Directory.Id"));
			device.setDirectory(directory);

			devices.add(device);
		}
		describeDevicesResponse.setDevices(devices);
	 
	 	return describeDevicesResponse;
	}
}