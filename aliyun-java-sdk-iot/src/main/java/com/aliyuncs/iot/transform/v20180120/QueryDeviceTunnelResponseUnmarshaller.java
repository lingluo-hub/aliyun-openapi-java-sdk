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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.QueryDeviceTunnelResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceTunnelResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceTunnelResponseUnmarshaller {

	public static QueryDeviceTunnelResponse unmarshall(QueryDeviceTunnelResponse queryDeviceTunnelResponse, UnmarshallerContext _ctx) {
		
		queryDeviceTunnelResponse.setRequestId(_ctx.stringValue("QueryDeviceTunnelResponse.RequestId"));
		queryDeviceTunnelResponse.setSuccess(_ctx.booleanValue("QueryDeviceTunnelResponse.Success"));
		queryDeviceTunnelResponse.setCode(_ctx.stringValue("QueryDeviceTunnelResponse.Code"));
		queryDeviceTunnelResponse.setErrorMessage(_ctx.stringValue("QueryDeviceTunnelResponse.ErrorMessage"));

		Data data = new Data();
		data.setTunnelId(_ctx.stringValue("QueryDeviceTunnelResponse.Data.TunnelId"));
		data.setTunnelState(_ctx.stringValue("QueryDeviceTunnelResponse.Data.TunnelState"));
		data.setProductKey(_ctx.stringValue("QueryDeviceTunnelResponse.Data.ProductKey"));
		data.setDeviceName(_ctx.stringValue("QueryDeviceTunnelResponse.Data.DeviceName"));
		data.setIotId(_ctx.stringValue("QueryDeviceTunnelResponse.Data.IotId"));
		data.setDeviceConnState(_ctx.stringValue("QueryDeviceTunnelResponse.Data.DeviceConnState"));
		data.setSourceConnState(_ctx.stringValue("QueryDeviceTunnelResponse.Data.SourceConnState"));
		data.setUdi(_ctx.stringValue("QueryDeviceTunnelResponse.Data.Udi"));
		data.setDescription(_ctx.stringValue("QueryDeviceTunnelResponse.Data.Description"));
		data.setUtcCreated(_ctx.stringValue("QueryDeviceTunnelResponse.Data.UtcCreated"));
		data.setUtcClosed(_ctx.stringValue("QueryDeviceTunnelResponse.Data.UtcClosed"));
		data.setProductName(_ctx.stringValue("QueryDeviceTunnelResponse.Data.ProductName"));
		queryDeviceTunnelResponse.setData(data);
	 
	 	return queryDeviceTunnelResponse;
	}
}