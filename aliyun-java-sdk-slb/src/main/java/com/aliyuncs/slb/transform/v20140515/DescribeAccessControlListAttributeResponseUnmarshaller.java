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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.DescribeAccessControlListAttributeResponse;
import com.aliyuncs.slb.model.v20140515.DescribeAccessControlListAttributeResponse.AclEntry;
import com.aliyuncs.slb.model.v20140515.DescribeAccessControlListAttributeResponse.RelatedListener;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccessControlListAttributeResponseUnmarshaller {

	public static DescribeAccessControlListAttributeResponse unmarshall(DescribeAccessControlListAttributeResponse describeAccessControlListAttributeResponse, UnmarshallerContext _ctx) {
		
		describeAccessControlListAttributeResponse.setRequestId(_ctx.stringValue("DescribeAccessControlListAttributeResponse.RequestId"));
		describeAccessControlListAttributeResponse.setServiceManagedMode(_ctx.stringValue("DescribeAccessControlListAttributeResponse.ServiceManagedMode"));
		describeAccessControlListAttributeResponse.setAclId(_ctx.stringValue("DescribeAccessControlListAttributeResponse.AclId"));
		describeAccessControlListAttributeResponse.setAddressIPVersion(_ctx.stringValue("DescribeAccessControlListAttributeResponse.AddressIPVersion"));
		describeAccessControlListAttributeResponse.setResourceGroupId(_ctx.stringValue("DescribeAccessControlListAttributeResponse.ResourceGroupId"));
		describeAccessControlListAttributeResponse.setAclName(_ctx.stringValue("DescribeAccessControlListAttributeResponse.AclName"));

		List<AclEntry> aclEntrys = new ArrayList<AclEntry>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccessControlListAttributeResponse.AclEntrys.Length"); i++) {
			AclEntry aclEntry = new AclEntry();
			aclEntry.setAclEntryComment(_ctx.stringValue("DescribeAccessControlListAttributeResponse.AclEntrys["+ i +"].AclEntryComment"));
			aclEntry.setAclEntryIP(_ctx.stringValue("DescribeAccessControlListAttributeResponse.AclEntrys["+ i +"].AclEntryIP"));

			aclEntrys.add(aclEntry);
		}
		describeAccessControlListAttributeResponse.setAclEntrys(aclEntrys);

		List<RelatedListener> relatedListeners = new ArrayList<RelatedListener>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccessControlListAttributeResponse.RelatedListeners.Length"); i++) {
			RelatedListener relatedListener = new RelatedListener();
			relatedListener.setListenerPort(_ctx.integerValue("DescribeAccessControlListAttributeResponse.RelatedListeners["+ i +"].ListenerPort"));
			relatedListener.setAclType(_ctx.stringValue("DescribeAccessControlListAttributeResponse.RelatedListeners["+ i +"].AclType"));
			relatedListener.setBizProtocol(_ctx.stringValue("DescribeAccessControlListAttributeResponse.RelatedListeners["+ i +"].Protocol"));
			relatedListener.setLoadBalancerId(_ctx.stringValue("DescribeAccessControlListAttributeResponse.RelatedListeners["+ i +"].LoadBalancerId"));

			relatedListeners.add(relatedListener);
		}
		describeAccessControlListAttributeResponse.setRelatedListeners(relatedListeners);
	 
	 	return describeAccessControlListAttributeResponse;
	}
}