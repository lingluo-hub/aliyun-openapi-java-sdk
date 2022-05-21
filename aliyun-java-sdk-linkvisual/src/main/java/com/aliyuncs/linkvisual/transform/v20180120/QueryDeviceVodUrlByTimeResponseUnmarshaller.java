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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.QueryDeviceVodUrlByTimeResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryDeviceVodUrlByTimeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceVodUrlByTimeResponseUnmarshaller {

	public static QueryDeviceVodUrlByTimeResponse unmarshall(QueryDeviceVodUrlByTimeResponse queryDeviceVodUrlByTimeResponse, UnmarshallerContext _ctx) {
		
		queryDeviceVodUrlByTimeResponse.setRequestId(_ctx.stringValue("QueryDeviceVodUrlByTimeResponse.RequestId"));
		queryDeviceVodUrlByTimeResponse.setSuccess(_ctx.booleanValue("QueryDeviceVodUrlByTimeResponse.Success"));
		queryDeviceVodUrlByTimeResponse.setErrorMessage(_ctx.stringValue("QueryDeviceVodUrlByTimeResponse.ErrorMessage"));
		queryDeviceVodUrlByTimeResponse.setCode(_ctx.stringValue("QueryDeviceVodUrlByTimeResponse.Code"));
		queryDeviceVodUrlByTimeResponse.setDecryptKey(_ctx.stringValue("QueryDeviceVodUrlByTimeResponse.DecryptKey"));

		Data data = new Data();
		data.setVodUrl(_ctx.stringValue("QueryDeviceVodUrlByTimeResponse.Data.VodUrl"));
		data.setDecryptKey(_ctx.stringValue("QueryDeviceVodUrlByTimeResponse.Data.DecryptKey"));
		queryDeviceVodUrlByTimeResponse.setData(data);
	 
	 	return queryDeviceVodUrlByTimeResponse;
	}
}