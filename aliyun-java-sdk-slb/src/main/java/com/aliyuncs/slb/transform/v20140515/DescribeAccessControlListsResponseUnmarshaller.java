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

import com.aliyuncs.slb.model.v20140515.DescribeAccessControlListsResponse;
import com.aliyuncs.slb.model.v20140515.DescribeAccessControlListsResponse.Acl;
import com.aliyuncs.slb.model.v20140515.DescribeAccessControlListsResponse.Acl.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccessControlListsResponseUnmarshaller {

	public static DescribeAccessControlListsResponse unmarshall(DescribeAccessControlListsResponse describeAccessControlListsResponse, UnmarshallerContext _ctx) {
		
		describeAccessControlListsResponse.setRequestId(_ctx.stringValue("DescribeAccessControlListsResponse.RequestId"));
		describeAccessControlListsResponse.setPageNumber(_ctx.integerValue("DescribeAccessControlListsResponse.PageNumber"));
		describeAccessControlListsResponse.setPageSize(_ctx.integerValue("DescribeAccessControlListsResponse.PageSize"));
		describeAccessControlListsResponse.setTotalCount(_ctx.integerValue("DescribeAccessControlListsResponse.TotalCount"));
		describeAccessControlListsResponse.setCount(_ctx.integerValue("DescribeAccessControlListsResponse.Count"));

		List<Acl> acls = new ArrayList<Acl>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccessControlListsResponse.Acls.Length"); i++) {
			Acl acl = new Acl();
			acl.setServiceManagedMode(_ctx.stringValue("DescribeAccessControlListsResponse.Acls["+ i +"].ServiceManagedMode"));
			acl.setAclId(_ctx.stringValue("DescribeAccessControlListsResponse.Acls["+ i +"].AclId"));
			acl.setAddressIPVersion(_ctx.stringValue("DescribeAccessControlListsResponse.Acls["+ i +"].AddressIPVersion"));
			acl.setAclName(_ctx.stringValue("DescribeAccessControlListsResponse.Acls["+ i +"].AclName"));
			acl.setResourceGroupId(_ctx.stringValue("DescribeAccessControlListsResponse.Acls["+ i +"].ResourceGroupId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAccessControlListsResponse.Acls["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("DescribeAccessControlListsResponse.Acls["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("DescribeAccessControlListsResponse.Acls["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			acl.setTags(tags);

			acls.add(acl);
		}
		describeAccessControlListsResponse.setAcls(acls);
	 
	 	return describeAccessControlListsResponse;
	}
}