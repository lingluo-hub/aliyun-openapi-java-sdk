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

package com.aliyuncs.dt_oc_info.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20200401.GetCompanyEquityPledgeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCompanyEquityPledgeResponseUnmarshaller {

	public static GetCompanyEquityPledgeResponse unmarshall(GetCompanyEquityPledgeResponse getCompanyEquityPledgeResponse, UnmarshallerContext _ctx) {
		
		getCompanyEquityPledgeResponse.setRequestId(_ctx.stringValue("GetCompanyEquityPledgeResponse.RequestId"));
		getCompanyEquityPledgeResponse.setCode(_ctx.integerValue("GetCompanyEquityPledgeResponse.Code"));
		getCompanyEquityPledgeResponse.setMessage(_ctx.stringValue("GetCompanyEquityPledgeResponse.Message"));
		getCompanyEquityPledgeResponse.setTotal(_ctx.integerValue("GetCompanyEquityPledgeResponse.Total"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCompanyEquityPledgeResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetCompanyEquityPledgeResponse.Data["+ i +"]"));
		}
		getCompanyEquityPledgeResponse.setData(data);
	 
	 	return getCompanyEquityPledgeResponse;
	}
}