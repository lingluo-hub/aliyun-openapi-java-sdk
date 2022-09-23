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

import com.aliyuncs.alidns.model.v20150109.ModifyHichinaDomainDNSResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyHichinaDomainDNSResponseUnmarshaller {

	public static ModifyHichinaDomainDNSResponse unmarshall(ModifyHichinaDomainDNSResponse modifyHichinaDomainDNSResponse, UnmarshallerContext _ctx) {
		
		modifyHichinaDomainDNSResponse.setRequestId(_ctx.stringValue("ModifyHichinaDomainDNSResponse.RequestId"));

		List<String> newDnsServers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyHichinaDomainDNSResponse.NewDnsServers.Length"); i++) {
			newDnsServers.add(_ctx.stringValue("ModifyHichinaDomainDNSResponse.NewDnsServers["+ i +"]"));
		}
		modifyHichinaDomainDNSResponse.setNewDnsServers(newDnsServers);

		List<String> originalDnsServers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyHichinaDomainDNSResponse.OriginalDnsServers.Length"); i++) {
			originalDnsServers.add(_ctx.stringValue("ModifyHichinaDomainDNSResponse.OriginalDnsServers["+ i +"]"));
		}
		modifyHichinaDomainDNSResponse.setOriginalDnsServers(originalDnsServers);
	 
	 	return modifyHichinaDomainDNSResponse;
	}
}