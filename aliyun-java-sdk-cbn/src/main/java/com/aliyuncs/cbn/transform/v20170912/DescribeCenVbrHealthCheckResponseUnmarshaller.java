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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.DescribeCenVbrHealthCheckResponse;
import com.aliyuncs.cbn.model.v20170912.DescribeCenVbrHealthCheckResponse.VbrHealthCheck;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCenVbrHealthCheckResponseUnmarshaller {

	public static DescribeCenVbrHealthCheckResponse unmarshall(DescribeCenVbrHealthCheckResponse describeCenVbrHealthCheckResponse, UnmarshallerContext _ctx) {
		
		describeCenVbrHealthCheckResponse.setRequestId(_ctx.stringValue("DescribeCenVbrHealthCheckResponse.RequestId"));
		describeCenVbrHealthCheckResponse.setPageSize(_ctx.integerValue("DescribeCenVbrHealthCheckResponse.PageSize"));
		describeCenVbrHealthCheckResponse.setPageNumber(_ctx.integerValue("DescribeCenVbrHealthCheckResponse.PageNumber"));
		describeCenVbrHealthCheckResponse.setTotalCount(_ctx.integerValue("DescribeCenVbrHealthCheckResponse.TotalCount"));

		List<VbrHealthCheck> vbrHealthChecks = new ArrayList<VbrHealthCheck>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCenVbrHealthCheckResponse.VbrHealthChecks.Length"); i++) {
			VbrHealthCheck vbrHealthCheck = new VbrHealthCheck();
			vbrHealthCheck.setHealthCheckTargetIp(_ctx.stringValue("DescribeCenVbrHealthCheckResponse.VbrHealthChecks["+ i +"].HealthCheckTargetIp"));
			vbrHealthCheck.setVbrInstanceId(_ctx.stringValue("DescribeCenVbrHealthCheckResponse.VbrHealthChecks["+ i +"].VbrInstanceId"));
			vbrHealthCheck.setVbrInstanceRegionId(_ctx.stringValue("DescribeCenVbrHealthCheckResponse.VbrHealthChecks["+ i +"].VbrInstanceRegionId"));
			vbrHealthCheck.setDelay(_ctx.longValue("DescribeCenVbrHealthCheckResponse.VbrHealthChecks["+ i +"].Delay"));
			vbrHealthCheck.setLinkStatus(_ctx.stringValue("DescribeCenVbrHealthCheckResponse.VbrHealthChecks["+ i +"].LinkStatus"));
			vbrHealthCheck.setCenId(_ctx.stringValue("DescribeCenVbrHealthCheckResponse.VbrHealthChecks["+ i +"].CenId"));
			vbrHealthCheck.setHealthyThreshold(_ctx.integerValue("DescribeCenVbrHealthCheckResponse.VbrHealthChecks["+ i +"].HealthyThreshold"));
			vbrHealthCheck.setHealthCheckInterval(_ctx.integerValue("DescribeCenVbrHealthCheckResponse.VbrHealthChecks["+ i +"].HealthCheckInterval"));
			vbrHealthCheck.setHealthCheckSourceIp(_ctx.stringValue("DescribeCenVbrHealthCheckResponse.VbrHealthChecks["+ i +"].HealthCheckSourceIp"));
			vbrHealthCheck.setPacketLoss(_ctx.longValue("DescribeCenVbrHealthCheckResponse.VbrHealthChecks["+ i +"].PacketLoss"));
			vbrHealthCheck.setHealthCheckOnly(_ctx.booleanValue("DescribeCenVbrHealthCheckResponse.VbrHealthChecks["+ i +"].HealthCheckOnly"));

			vbrHealthChecks.add(vbrHealthCheck);
		}
		describeCenVbrHealthCheckResponse.setVbrHealthChecks(vbrHealthChecks);
	 
	 	return describeCenVbrHealthCheckResponse;
	}
}