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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeDnsProductInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDnsProductInstanceResponseUnmarshaller {

	public static DescribeDnsProductInstanceResponse unmarshall(DescribeDnsProductInstanceResponse describeDnsProductInstanceResponse, UnmarshallerContext _ctx) {
		
		describeDnsProductInstanceResponse.setRequestId(_ctx.stringValue("DescribeDnsProductInstanceResponse.RequestId"));
		describeDnsProductInstanceResponse.setMonitorNodeCount(_ctx.longValue("DescribeDnsProductInstanceResponse.MonitorNodeCount"));
		describeDnsProductInstanceResponse.setInBlackHole(_ctx.booleanValue("DescribeDnsProductInstanceResponse.InBlackHole"));
		describeDnsProductInstanceResponse.setBindDomainCount(_ctx.longValue("DescribeDnsProductInstanceResponse.BindDomainCount"));
		describeDnsProductInstanceResponse.setRegionLines(_ctx.booleanValue("DescribeDnsProductInstanceResponse.RegionLines"));
		describeDnsProductInstanceResponse.setBindCount(_ctx.longValue("DescribeDnsProductInstanceResponse.BindCount"));
		describeDnsProductInstanceResponse.setEndTime(_ctx.stringValue("DescribeDnsProductInstanceResponse.EndTime"));
		describeDnsProductInstanceResponse.setStartTimestamp(_ctx.longValue("DescribeDnsProductInstanceResponse.StartTimestamp"));
		describeDnsProductInstanceResponse.setISPLines(_ctx.stringValue("DescribeDnsProductInstanceResponse.ISPLines"));
		describeDnsProductInstanceResponse.setEndTimestamp(_ctx.longValue("DescribeDnsProductInstanceResponse.EndTimestamp"));
		describeDnsProductInstanceResponse.setDDosDefendQuery(_ctx.longValue("DescribeDnsProductInstanceResponse.DDosDefendQuery"));
		describeDnsProductInstanceResponse.setDnsSecurity(_ctx.stringValue("DescribeDnsProductInstanceResponse.DnsSecurity"));
		describeDnsProductInstanceResponse.setDomainType(_ctx.stringValue("DescribeDnsProductInstanceResponse.DomainType"));
		describeDnsProductInstanceResponse.setURLForwardCount(_ctx.longValue("DescribeDnsProductInstanceResponse.URLForwardCount"));
		describeDnsProductInstanceResponse.setTTLMinValue(_ctx.longValue("DescribeDnsProductInstanceResponse.TTLMinValue"));
		describeDnsProductInstanceResponse.setPaymentType(_ctx.stringValue("DescribeDnsProductInstanceResponse.PaymentType"));
		describeDnsProductInstanceResponse.setVersionName(_ctx.stringValue("DescribeDnsProductInstanceResponse.VersionName"));
		describeDnsProductInstanceResponse.setOverseaLine(_ctx.stringValue("DescribeDnsProductInstanceResponse.OverseaLine"));
		describeDnsProductInstanceResponse.setISPRegionLines(_ctx.stringValue("DescribeDnsProductInstanceResponse.ISPRegionLines"));
		describeDnsProductInstanceResponse.setGslb(_ctx.booleanValue("DescribeDnsProductInstanceResponse.Gslb"));
		describeDnsProductInstanceResponse.setBindUsedCount(_ctx.longValue("DescribeDnsProductInstanceResponse.BindUsedCount"));
		describeDnsProductInstanceResponse.setDnsSLBCount(_ctx.longValue("DescribeDnsProductInstanceResponse.DnsSLBCount"));
		describeDnsProductInstanceResponse.setInstanceId(_ctx.stringValue("DescribeDnsProductInstanceResponse.InstanceId"));
		describeDnsProductInstanceResponse.setMonitorTaskCount(_ctx.longValue("DescribeDnsProductInstanceResponse.MonitorTaskCount"));
		describeDnsProductInstanceResponse.setStartTime(_ctx.stringValue("DescribeDnsProductInstanceResponse.StartTime"));
		describeDnsProductInstanceResponse.setDDosDefendFlow(_ctx.longValue("DescribeDnsProductInstanceResponse.DDosDefendFlow"));
		describeDnsProductInstanceResponse.setMonitorFrequency(_ctx.longValue("DescribeDnsProductInstanceResponse.MonitorFrequency"));
		describeDnsProductInstanceResponse.setSearchEngineLines(_ctx.stringValue("DescribeDnsProductInstanceResponse.SearchEngineLines"));
		describeDnsProductInstanceResponse.setBindDomainUsedCount(_ctx.longValue("DescribeDnsProductInstanceResponse.BindDomainUsedCount"));
		describeDnsProductInstanceResponse.setVersionCode(_ctx.stringValue("DescribeDnsProductInstanceResponse.VersionCode"));
		describeDnsProductInstanceResponse.setOverseaDDosDefendFlow(_ctx.longValue("DescribeDnsProductInstanceResponse.OverseaDDosDefendFlow"));
		describeDnsProductInstanceResponse.setInClean(_ctx.booleanValue("DescribeDnsProductInstanceResponse.InClean"));
		describeDnsProductInstanceResponse.setSubDomainLevel(_ctx.longValue("DescribeDnsProductInstanceResponse.SubDomainLevel"));
		describeDnsProductInstanceResponse.setDomain(_ctx.stringValue("DescribeDnsProductInstanceResponse.Domain"));

		List<String> dnsServers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsProductInstanceResponse.DnsServers.Length"); i++) {
			dnsServers.add(_ctx.stringValue("DescribeDnsProductInstanceResponse.DnsServers["+ i +"]"));
		}
		describeDnsProductInstanceResponse.setDnsServers(dnsServers);
	 
	 	return describeDnsProductInstanceResponse;
	}
}